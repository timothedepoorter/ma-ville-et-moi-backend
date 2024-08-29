package fr.cda.tpcitoyen.DTO.Users;

import lombok.Data;

@Data
public class UserDto {
    private Integer id;

    private String firstName;

    private String lastName;

    private String mail;

    private String password;

    private boolean isResident;
}
