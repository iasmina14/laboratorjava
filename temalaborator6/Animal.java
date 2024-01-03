package temalaborator6;

public class Animal {
    public void eat() {
        System.out.println("Animal eats food");
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}


class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and sometimes grass");
    }

    @Override
    public void sound() {
        System.out.println("Tiger growls");
    }
}


class Panther extends Animal {
    @Override
    public void eat() {
        System.out.println("Panther eats meat");
    }

    @Override
    public void sound() {
        System.out.println("Panther purrs");
    }

}



