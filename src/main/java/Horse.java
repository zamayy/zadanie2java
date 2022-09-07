
public class Horse extends Animals{
    String podkova;
    String name;
    public Horse(String name, String food, String location, String podkova){
        super(food, location,name);
        this.podkova = podkova;
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("хахахах");
    }

    @Override
    public void eat() {
        System.out.println("лошадка трапезничает");
    }
}