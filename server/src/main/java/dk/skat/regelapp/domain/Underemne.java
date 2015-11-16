package dk.skat.regelapp.domain;

import javax.persistence.*;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@Entity
public class Underemne {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emne_id")
    private Emne emne;

    @Column(nullable = false)
    private String navn;

    protected Underemne() {
    }

    public Underemne(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
