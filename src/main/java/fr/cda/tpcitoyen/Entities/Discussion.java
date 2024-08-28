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
    private Integer id;

    @Column(name = "content")
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private Project project;
}
