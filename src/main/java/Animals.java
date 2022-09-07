public class Animals {
    String food;
    String location;
    String name;
    public Animals(String food, String location, String name){
        this.food = food;
        this.location = location;
        this.name = name;
    }
    public void makeNoise(){
        System.out.println("Шумит");
    }
    public void eat(){
        System.out.println("Ест");
    }
    public void sleep(){
        System.out.println("Спит");
    }
}