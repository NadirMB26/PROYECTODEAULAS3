
package co.edu.unicolombo.poo.Infrastructure.Vet.Repositories;

import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;


public class UsuarioRepository implements IUsuRepository{
  private static List<Usuario> usuariosDB;
  
public UsuarioRepository(){
    if(usuariosDB==null){
        usuariosDB=new ArrayList<>(); 
    }
}  


    @Override
    public Usuario BuscarUsuPorId(String UsuID) throws Exception {
        if(usuariosDB==null||usuariosDB.isEmpty()){
            throw new Exception("El Usuario "+UsuID+"No existe");
        }
        Usuario usuEncontrado=null;
        for(Usuario usu:usuariosDB){
           if(usu.getCedula().equalsIgnoreCase(UsuID)){
               usuEncontrado=usu;
               break;
           } 
        }
        if(usuEncontrado==null){
             throw new Exception("El Usuario "+UsuID+"No existe");
        }
        return usuEncontrado;
    }

 //   @Override
  //  public Usuario BuscarRolPorName(String nombre) throws Exception {
   //     if(usuariosDB==null||usuariosDB.isEmpty()){
     //       throw new Exception("El Usuario "+nombre+"No existe");
     //   }
      //  Usuario usuFound=null;
       // for(var usu:usuariosDB){
        //   if(usu.getNombre().equalsIgnoreCase(nombre)){
       //        usuFound=usu;
       //        break;
       //     } 
       // }
     //   if(usuFound==null){
      //       throw new Exception("El Usuario "+nombre+"No existe");
     //   }
      //  return usuFound;
  //  }

    @Override
    public int GuardarUsuario(Usuario usu) throws Exception {
        if(usuariosDB.isEmpty()){
           usuariosDB.add(usu);
           return usuariosDB.size();
        }
        for(Usuario usu1:usuariosDB){
            if(usu.getCedula().equalsIgnoreCase(usu1.getCedula())){
                throw new Exception("El Usuario "+usu.getCedula()+" ya existe");
            }
        }
     
           usuariosDB.add(usu);
        return usuariosDB.size();

    }

    @Override
    public void editUsu(Usuario usu) throws Exception {
        if(usu == null){
           throw new Exception("la cedula es requerida");
        }
        if(usuariosDB.isEmpty()){
           throw new Exception("El usuario "+usu.getCedula()+" no existe");
        }
        Usuario rolEncontrado=BuscarUsuPorId(usu.getCedula());
      int pos=usuariosDB.indexOf(rolEncontrado);
      usuariosDB.set(pos, usu);
    }

    @Override
    public int deleteUsu(String usuID) throws Exception {
       if(usuariosDB.isEmpty()){
           throw new Exception("El rol "+usuID+" no existe");
        }
        
        Usuario rolEncontrado=BuscarUsuPorId(usuID);
        usuariosDB.remove(rolEncontrado);
        return usuariosDB.size();
    }

    @Override
    public List<Usuario> getUsuAll() {
      return usuariosDB;
    }

   
}
