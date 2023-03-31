public class Dog extends Animal{
    private String sound;
    public Dog() {
    }
    public Dog(String name, String race, String type, byte age) {
        super(name, race, type, age);
    }
    public Dog(String name, String race, String type, byte age, String sound) {
        super(name, race, type, age);
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String toString(){
        System.out.println("El nombre del perro es: " + getName());
        System.out.println("LA raza del perro es: " + getRace());
        System.out.println("El tipo de animal es: " + getType());
        System.out.println("La edad del perro es: " + getAge());
        System.out.println("Yo hago " + getSound());
        return "Soy un perro";
    }
}
