package PetInfoTypes;

public class Pet {
    public String species;
    public String breed;
    public String name;
    public String hair;
    public int  legs;
    private int age;
    public String gender;



    public String introducePet(){
        return "Hi this is " + species + " This cat is " + breed +
                "\nAnd he is called " +name+
        "\nHis coat is " + hair +
                " and he has " + legs +
                " legs\nHe is " + age + " and he is " +gender;
    }
    public void setAge(int ageToSet){
        age = ageToSet;
    }
}
