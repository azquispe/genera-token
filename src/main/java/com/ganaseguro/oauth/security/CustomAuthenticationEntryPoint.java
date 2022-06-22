
package com.ganaseguro.oauth.security;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ganaseguro.oauth.utils.constantes.ConstDiccionarioMensajeFirma;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {


    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                         org.springframework.security.core.AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json;charset=UTF-8");

        Map<String, Object> response = new HashMap<>();
        response.put("error", "credenciales incorrectas");
        response.put("error_description","credenciales incorrectas");
        ObjectMapper mapper = new ObjectMapper();
        httpServletResponse.getWriter().write( mapper.writeValueAsString(response));

    }
}


