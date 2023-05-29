public class Duck extends Animal{
    private String Squawk;
    public Duck() {
    }
    public Duck(String name, String race, String type, byte age) {
        super(name, race, type, age);
    }

    public Duck(String name, String race, String type, byte age, String squawk) {
        super(name, race, type, age);
        Squawk = squawk;
    }

    public String getSquawk() {
        return Squawk;
    }

    public void setSquawk(String squawk) {
        Squawk = squawk;
    }
    public String toString(){
        System.out.println("El nombre del pato es: " + getName());
        System.out.println("LA raza del pato es: " + getRace());
        System.out.println("El tipo de animal es: " + getType());
        System.out.println("La edad del pato es: " + getAge());
        System.out.println("Yo hago " + getSquawk());
        return "Soy un pato";
    }
}
