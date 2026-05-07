package AnimalKingdom;

class Animal{

    public void sound(){}
}

class Dog extends Animal{

    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{

    @Override
    public void sound(){
        System.out.println("Cat Meow");
    }
}

class Bird extends Animal{

    @Override
    public void sound(){
        System.out.println("Bird Chrip");
    }
}

public class AnimalKingdom {
    

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}
