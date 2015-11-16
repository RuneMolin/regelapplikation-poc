package dk.skat.regelapp.domain;

import javax.persistence.*;
import java.util.List;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@Entity
public class Emne {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "emne")
    private List<Underemne> underEmner;

    @Column(nullable = false)
    private String navn;

    protected  Emne() {
    }

    public Emne(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
