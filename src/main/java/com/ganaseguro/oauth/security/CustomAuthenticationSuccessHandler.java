package com.ganaseguro.oauth.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// OJO ESTE COMPONENTE AUN NO SE USA, HAY APRENDER MAS SOBRE ESTOS
@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json;charset=UTF-8");

        Map<String, Object> response = new HashMap<>();
        response.put("codigoMensaje", "todo correcto");
        response.put("mensaje","ok oko okon");
        ObjectMapper mapper = new ObjectMapper();
        httpServletResponse.getWriter().write( mapper.writeValueAsString(response));
    }
}
