
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

public class EditarUsuCommand {
 protected String cedula ;
 protected String apellido ;
 protected String nombre ;
 protected String direccion ;
 protected String correo ;
 protected String clave ;
 protected String telefono ;
 protected String Rol ;

public EditarUsuCommand (String Cedula,String apellido, String nombre,String direccion, String correo, String clave, String telefono, String Rol) throws Exception {
  if (cedula == null || cedula.trim() .isEmpty ()) {
    throw new Exception ("La cedula es requerida");
}
if (apellido == null || apellido.trim() .isEmpty ()) {
    throw new Exception ("El apellido es requerido");
}
 if (nombre == null || nombre.trim() .isEmpty ()) {
    throw new Exception ("El nombre es requerido");
}
if (direccion == null || direccion.trim().isEmpty()) {
throw new Exception ("La direccion es requerida");
}
if (correo == null || correo.trim() .isEmpty ()) {
    throw new Exception ("El correo es requerido");
}
if (clave == null || clave.trim() .isEmpty ()) {
    throw new Exception ("La clave es requerido");
}
if (telefono == null || telefono.trim() .isEmpty ()) {
    throw new Exception ("El telefono es requerido");
}
if (Rol == null || Rol.trim() .isEmpty ()) {
    throw new Exception ("El Rol es requerido");
}
this.cedula=cedula;
this.apellido=apellido;
this.nombre = nombre;
this.direccion = direccion;
this.correo=correo;
this.clave=clave;
this.telefono=telefono;
this.Rol=Rol;
}

    public String getCedula() {
        return cedula;
    }

    public String getApellido() {
        return apellido;
    }
    public String getNombre () {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRol() {
        return Rol;
    }  
}
