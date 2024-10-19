
package co.edu.unicolombo.poo.Vet.Domain.Model;


public class Movimiento {
    private String tipo;
    private int idMovimiento;
    private String fecha;
    private double total;
    private String metodoPago;
    private Usuario tipoUsuario;

    public Movimiento(String tipo, int idMovimiento, String fecha, double total, String metodoPago, Usuario tipoUsuario) {
        this.tipo = tipo;
        this.idMovimiento = idMovimiento;
        this.fecha = fecha;
        this.total = total;
        this.metodoPago = metodoPago;
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Usuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Usuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
}
