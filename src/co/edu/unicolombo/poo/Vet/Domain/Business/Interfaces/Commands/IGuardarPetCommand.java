
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarPetCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarUsuCommand;


public interface IGuardarPetCommand {
    public int createPet(GuardarPetCommand comando)throws Exception; 
}
