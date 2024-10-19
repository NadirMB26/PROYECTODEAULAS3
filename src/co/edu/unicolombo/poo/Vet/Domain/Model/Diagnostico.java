
package co.edu.unicolombo.poo.Vet.Domain.Model;


class Diagnostico {
    private String sintomas;
    private String tratamiento;
    private String observaciones;
    private String idCita;
    private Veterinario veterinario;

    public Diagnostico() {
    }

    public Diagnostico(String sintomas, String tratamiento, String observaciones, String idCita, Veterinario veterinario) {
        this.sintomas = sintomas;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
        this.idCita = idCita;
        this.veterinario = veterinario;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    
}
