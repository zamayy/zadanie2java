public class Cat extends Animals{
    String smes;
    String name;
    public Cat(String name, String food, String location, String smes){
        super(food, location, name);
        this.smes = smes;
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("мяу");
    }

    @Override
    public void eat() {
        System.out.println("кошка жрет");
    }
}