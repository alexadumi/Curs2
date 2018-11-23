package OOP.vet;

public class PetOwner {
   protected WildAnimalPet firstPet;
   protected WildAnimalPet secondPet;

   public PetOwner (WildAnimalPet firstPet, WildAnimalPet secondPet)
       this firstPet = firstPet;
       this secondPet = secondPet;
}
    public void takePetstoVet (Vet Vet) {
    vet.giveShotTo (firstPet);
    vet.giveShotTo (secondPet);
    }

    public void playWithPets () {
        firstPet.play();
        secondPet.play();

    }
    }