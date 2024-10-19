
package co.edu.unicolombo.poo.Vet.Domain.Model;

import java.util.concurrent.atomic.AtomicInteger;


public class Mascotas {
 private String codigo;
 private String password;
 private String nombre;
 private String email;
 private Usuario role;
 

    public Mascotas(String codigo, String nombre, Usuario rol) throws Exception {
      
        if(codigo==null||codigo.isEmpty()){
            throw new Exception("El codigo es requerido");
        }
         if(nombre==null||nombre.isEmpty()){
            throw new Exception("El nombre es requerido");
        }
        if(role==null){
            throw new Exception("El rol es requerido");
        }
        this.codigo=codigo;
        this.nombre=nombre;
        this.role=role;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getRole() {
        return role;
    }

    public void setRole(Usuario role) {
        this.role = role;
    }
  


}
