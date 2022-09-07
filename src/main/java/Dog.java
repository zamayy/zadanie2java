public class Dog extends Animals{
    String proishozdenie;
    String name;
    public Dog(String name, String food, String location, String proishozdenie){
        super(food, location, name);
        this.proishozdenie = proishozdenie;
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("гав");
    }

    @Override
    public void eat() {
        System.out.println("собэка жрет");
    }
}