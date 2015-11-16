package dk.skat.regelapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@Entity
public class Konto {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Integer nummer;

    @Column(nullable = false)
    private String navn;

    @Column(nullable = false)
    private Boolean debet;

    @Column(nullable = false)
    private Boolean kredit;


    protected Konto() {
    }

    public Konto(Integer nummer, String navn, Boolean debet, Boolean kredit) {
        this.nummer = nummer;
        this.navn = navn;
        this.debet = debet;
        this.kredit = kredit;
    }


    public Long getId() {
        return id;
    }

    public Integer getNummer() {
        return nummer;
    }

    public void setNummer(Integer nummer) {
        this.nummer = nummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Boolean getDebet() {
        return debet;
    }

    public void setDebet(Boolean debet) {
        this.debet = debet;
    }

    public Boolean getKredit() {
        return kredit;
    }

    public void setKredit(Boolean kredit) {
        this.kredit = kredit;
    }
}
