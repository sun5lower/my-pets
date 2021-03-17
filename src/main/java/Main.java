import PetInfoTypes.Pet;


public class Main {
    public static void main(String[] args) {
        Pet tiger = new Pet();

        tiger.species="Cat";
        tiger.breed = "Tabby";
        tiger.name = "Tiger";
        tiger.hair = "Short";
        tiger.legs = 4;
        tiger.gender = "Male";
        tiger.setAge(2);


        System.out.println(tiger.introducePet());

    }
}
