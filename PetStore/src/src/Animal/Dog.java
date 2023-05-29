package Animal;
public class Dog extends Animal {
    public Dog() {
    }
    public Dog(String name, String color,int age,String type) {
        super(name, color, age,type);
    }
    @Override
    public String talk() {
        String s = "El animal " + this.getName() + "dice: Guauuu";
        return s;
    }

}

