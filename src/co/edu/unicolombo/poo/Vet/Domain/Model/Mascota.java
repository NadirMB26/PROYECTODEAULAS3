
package co.edu.unicolombo.poo.Vet.Domain.Model;

import java.util.List;

/**
 *
 * @author USER
 */
public class Mascota {

    private String cedulaUsuario;
    private String nombreMascota;
    private String color;
    private String TipoSangre;
    private String especie;
    private Cliente cliente;

    public Mascota() {
    }

    public Mascota(String cedulaUsuario, String nombreMascota, String color, String TipoSangre, String especie, Cliente cliente) {
        this.cedulaUsuario = cedulaUsuario;
        this.nombreMascota = nombreMascota;
        this.color = color;
        this.TipoSangre = TipoSangre;
        this.especie = especie;
        this.cliente = cliente;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}