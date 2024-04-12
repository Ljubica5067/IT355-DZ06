package org.example.it355dz06.entiteti;
import jakarta.persistence.*;
@Entity
public class Korpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Proizvod p;
    private int kolicina;

    public Korpa() {
    }

    public Korpa(Proizvod p, int kolicina) {
        this.p = p;
        this.kolicina = kolicina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Proizvod getP() {
        return p;
    }

    public void setP(Proizvod p) {
        this.p = p;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
    public void povecajKolicinu() {
        this.kolicina++;
    }
}
