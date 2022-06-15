package com.renatoviana.algafood.auth.core;

import com.renatoviana.algafood.auth.domain.model.Usuario;
import lombok.Getter;
import org.springframework.security.core.userdetails.User;

import java.util.Collections;

@Getter
public class AuthUser extends User {

    private Long userId;
    private String fullName;

    public AuthUser(Usuario usuario) {
        super(usuario.getEmail(), usuario.getSenha(), Collections.emptyList());

        this.userId = usuario.getId();
        this.fullName = usuario.getNome();
    }

}
