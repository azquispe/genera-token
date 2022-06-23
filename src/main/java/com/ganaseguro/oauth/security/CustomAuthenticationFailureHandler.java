package com.ganaseguro.oauth.security;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// OJO ESTE COMPONENTE AUN NO SE USA, HAY APRENDER MAS SOBRE ESTOS
@Component
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse httpServletResponse, AuthenticationException exception) throws IOException, ServletException {

        httpServletResponse.setContentType("application/json;charset=UTF-8");

        Map<String, Object> response = new HashMap<>();
        response.put("codigoMensaje", "Falla en la autenticqacion");
        response.put("mensaje","Falla en la autenticqacion");
        ObjectMapper mapper = new ObjectMapper();
        httpServletResponse.getWriter().write( mapper.writeValueAsString(response));
    }
}
