public class Main {
    public static void main(String[] args) {
        Aibolit aibolit = new Aibolit();
        Animals[] animals = new Animals[3];
        animals[0] = new Cat("Mika", "Wiskas", "Vladimir", "Britain + Siamese");
        animals[1] = new Dog("Erik" ,"Pedigree", "Erik's home", "wolf");
        animals[2] = new Horse("Plotva", "sugar", "Farm", "Metallic");
        for (Animals animals1 : animals){
            aibolit.treatAnimal(animals1);
        }
    }
}