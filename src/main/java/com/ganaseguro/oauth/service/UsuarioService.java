package com.ganaseguro.oauth.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;


@Service
public class UsuarioService implements UserDetailsService {

    private Logger log = LoggerFactory.getLogger(UsuarioService.class);


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        List<String> lstRoles = new ArrayList<>();
        lstRoles.add("ROL");


        List<GrantedAuthority> autoAuthorities = new ArrayList<>();
        autoAuthorities = lstRoles.stream()
                .map(role -> new SimpleGrantedAuthority(role))
                .peek(authority -> log.info("Role: "+authority.getAuthority()))
                .collect(Collectors.toList());
        log.info("Usuario autenticado: "+username);

        return new User(username,
                "Contrasena",
                true,
                true,
                true,
                true,
                autoAuthorities
                );
    }
}
