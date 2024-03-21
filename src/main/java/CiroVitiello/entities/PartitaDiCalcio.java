package CiroVitiello.entities;

import CiroVitiello.enums.TipoEvento;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class PartitaDiCalcio extends Event {
    private String squadraDiCasa;
    private String squadraOspite;
    private String SquadraVincente;
    private int goalDiCasa;
    private int goalDiOspite;

    public PartitaDiCalcio() {

    }

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, String squadraDiCasa, String squadraOspite, String squadraVincente, int goalDiCasa, int goalDiOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        SquadraVincente = squadraVincente;
        this.goalDiCasa = goalDiCasa;
        this.goalDiOspite = goalDiOspite;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return SquadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        SquadraVincente = squadraVincente;
    }

    public int getGoalDiCasa() {
        return goalDiCasa;
    }

    public void setGoalDiCasa(int goalDiCasa) {
        this.goalDiCasa = goalDiCasa;
    }

    public int getGoalDiOspite() {
        return goalDiOspite;
    }

    public void setGoalDiOspite(int goalDiOspite) {
        this.goalDiOspite = goalDiOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", SquadraVincente='" + SquadraVincente + '\'' +
                ", goalDiCasa=" + goalDiCasa +
                ", goalDiOspite=" + goalDiOspite +
                '}';
    }
}
