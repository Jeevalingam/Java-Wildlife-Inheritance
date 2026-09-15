class Animal {
    String name, sound;

    Animal(String n, String s) {
        name = n;
        sound = s;
    }

    void show() {
        System.out.println(name + " makes " + sound);
    }
}

class Bird extends Animal {
    Bird(String n, String s) {
        super(n, s);
    }

    void fly() {
        System.out.println(name + " can fly");
    }
}

class Parrot extends Bird {
    Parrot() {
        super("Parrot", "Squawk");
    }

    void speak() {
        System.out.println(name + " can speak");
    }

    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.show();
        p.fly();
        p.speak();
    }
}
