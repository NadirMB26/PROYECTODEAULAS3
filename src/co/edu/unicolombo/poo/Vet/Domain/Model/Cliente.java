
package co.edu.unicolombo.poo.Vet.Domain.Model;

import java.util.List;

class Cliente extends Usuario{
    private List<Mascota> mascotas;

    public Cliente() {
    }

    public Cliente(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
}
