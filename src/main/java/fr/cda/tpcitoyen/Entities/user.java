package fr.cda.tpcitoyen.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "User")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_user;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "mail")
    private String mail;

    @Column(name = "password")
    private String password;

    @Column(name = "isResident")
    private boolean isResident;

    @OneToMany(mappedBy = "discussion", cascade = CascadeType.ALL)
    private List<discussion> discussions;

}
