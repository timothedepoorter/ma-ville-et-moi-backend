package fr.cda.tpcitoyen.DTO.Users;

import lombok.Data;

@Data
public class AuthenticationDto {
    private String mail;
    private String password;
}