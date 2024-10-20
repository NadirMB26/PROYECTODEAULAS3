
package co.edu.unicolombo.poo.Infrastructure.Vet.Repositories;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IMascRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import java.util.ArrayList;
import java.util.List;


public class MascotasRepository implements IMascRepository{
    private static List<Mascota> petsDB = new ArrayList<>();

    @Override
    public Mascota buscarMascotaPorId(String CCliente) throws Exception {
        if(petsDB==null||petsDB.isEmpty()){
            throw new Exception("La mascota registrada al cliente con CC "+CCliente+"No existe");
        }
        Mascota petFound = null;
        for(Mascota pet:petsDB){
           if(pet.getCedulaUsuario().equalsIgnoreCase(CCliente)){
               petFound = pet;
               break;
           } 
        }
        if(petFound == null){
             throw new Exception("La mascota registrada al cliente con CC "+CCliente+"No existe");
        }
        return petFound;
    }

    @Override
    public int guardarMascota(Mascota pet) throws Exception {
        if(petsDB.isEmpty()){
           petsDB.add(pet);
           return petsDB.size();
        }
        for(Mascota masc:petsDB){
            if(pet.getCedulaUsuario().equalsIgnoreCase(masc.getCedulaUsuario())){
                throw new Exception("El Usuario "+pet.getCedulaUsuario()+" ya existe");
            }
        }
     
           petsDB.add(pet);
        return petsDB.size();
    }

    @Override
    public void editarMascota(Mascota pet) throws Exception {
        if(pet == null){
           throw new Exception("la cedula del cliente es requerida");
        }
        if(petsDB.isEmpty()){
           throw new Exception("La mascota registrada al cliente con CC "+pet.getCedulaUsuario()+"No existe");
        }
        Mascota petFound = buscarMascotaPorId(pet.getCedulaUsuario());
      int pos = petsDB.indexOf(petFound);
      petsDB.set(pos, pet);
    }

    @Override
    public int eliminarMascota(String nameM) throws Exception {
         if(petsDB.isEmpty()){
           throw new Exception("La mascota con nombre "+nameM+"No existe");
        }
        
        Mascota petFound = buscarMascotaPorId(nameM);
        petsDB.remove(petFound);
        return petsDB.size();
    }

    @Override
    public List<Usuario> getPetsAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
