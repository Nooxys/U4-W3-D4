package CiroVitiello.entities;

import CiroVitiello.enums.TipoEvento;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class GaraDiAtletica extends Event {

    @ManyToMany
    @JoinTable(name = "partecipanti-atletica", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "person_id"))
    private Set<Person> atleti;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Person vincitore;

    public GaraDiAtletica() {

    }

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, Set<Person> atleti, Person vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public Set<Person> getAtleta() {
        return atleti;
    }

    public void setAtleti(Set<Person> atleta) {
        this.atleti = atleta;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleta=" + atleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
