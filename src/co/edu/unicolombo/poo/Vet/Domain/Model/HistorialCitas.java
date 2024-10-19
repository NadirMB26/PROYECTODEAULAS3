
package co.edu.unicolombo.poo.Vet.Domain.Model;

import java.util.List;


class HistorialCitas {
    
    private int contador;
    private List<Cita> citas;

    public HistorialCitas(int contador, List<Cita> citas) {
        this.contador = contador;
        this.citas = citas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    
    
}
