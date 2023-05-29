public class PetStoreApp {

    public static void main(String[] args) {
        Dog dog1=new Dog("Princesa","Pitbul","Perro",(byte)2);
        dog1.setSound("Guau, Guau");
        Duck duck1=new Duck("Dinosaurio","Pato","Ganso",(byte)1);
        duck1.setSquawk("cuac, cuac, cuac");
        System.out.println("Los Datos del perro son " + dog1.toString());
        System.out.println("Los Datos del pato son " + duck1.toString());
    }
}

