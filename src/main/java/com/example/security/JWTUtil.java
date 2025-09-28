package com.example.security;

import java.util.Date;
import java.util.jar.JarException;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Component
public class JWTUtil {
	
	private final String SECRET_KEY="zidio_secret_key";
	private static final long EXPIRATION_TIME = 86400000; 


    public String generateToken(String email, String role) {
        return Jwts.builder()
                .setSubject(email)
                .claim("role", role)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }
	
    public String extractUsername(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY)
                .parseClaimsJws(token).getBody().getSubject();
    }
    public boolean validationToken(String token) throws JarException {
    	Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token);
		return true;
    }
}



