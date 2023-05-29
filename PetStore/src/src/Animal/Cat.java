
package Animal;
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color, int age, String type) {
        super(name, color, age, type);
    }

    @Override
    public String talk() {
        String s = "El animal " + this.getName() + "dice: Miauuu";
        return s;
    }
}