
package co.edu.unicolombo.poo.Vet.Domain.Model;

import java.util.Date;


class Cita {

    private int idcita;
    private String cedulacliente;
    private String mascotaNombre;
    private String horaEntrada;
    private String horaSalida;
    private String fecha;
    private String confirmar;
    private String descrip;
    private Diagnostico diagnostico;
    private HistorialCitas historialcitas;

    public Cita() {
    }

    public Cita(int idcita, String cedulacliente, String mascotaNombre, String horaEntrada, String horaSalida, String fecha, String confirmar, String descrip, Diagnostico diagnostico, HistorialCitas historialcitas) {
        this.idcita = idcita;
        this.cedulacliente = cedulacliente;
        this.mascotaNombre = mascotaNombre;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.confirmar = confirmar;
        this.descrip = descrip;
        this.diagnostico = diagnostico;
        this.historialcitas = historialcitas;
    }

    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public String getMascotaNombre() {
        return mascotaNombre;
    }

    public void setMascotaNombre(String mascotaNombre) {
        this.mascotaNombre = mascotaNombre;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConfirmar() {
        return confirmar;
    }

    public void setConfirmar(String confirmar) {
        this.confirmar = confirmar;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public HistorialCitas getHistorialcitas() {
        return historialcitas;
    }

    public void setHistorialcitas(HistorialCitas historialcitas) {
        this.historialcitas = historialcitas;
    }
    
    
        
 }
