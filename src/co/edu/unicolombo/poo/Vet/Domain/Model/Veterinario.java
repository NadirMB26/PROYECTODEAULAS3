
package co.edu.unicolombo.poo.Vet.Domain.Model;

import java.util.List;

class Veterinario extends Usuario{
    private List<Cita> citas;
    private String especialidad;
    private Horario horario;

    public Veterinario() {
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    
}
