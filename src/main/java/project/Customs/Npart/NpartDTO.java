package project.Customs.Npart;

import javax.persistence.*;

@Table(name = "N_part")
@Entity
public class NpartDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name_part")
    private String name;
    @Column(name = "Sche_id")
    private long scheid;
}