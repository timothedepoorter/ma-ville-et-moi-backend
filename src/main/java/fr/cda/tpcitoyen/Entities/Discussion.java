package fr.cda.tpcitoyen.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "discussion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Discussion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private project project;
}
