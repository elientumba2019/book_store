package com.example.elie.demo.model.security;
import org.springframework.security.core.GrantedAuthority;
import java.io.Serializable;


/**
 * authority class for security features
 */
public class Authority implements GrantedAuthority , Serializable {


    private static final long  serialVersion  = 121212L;
    private final String authority;


    public Authority(String auth){
        this.authority = auth;
    }


    @Override
    public String getAuthority() {
        return this.authority;
    }
}
