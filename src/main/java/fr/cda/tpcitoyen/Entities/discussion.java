package fr.cda.tpcitoyen.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Discussion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class discussion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private user user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private project project;
}
