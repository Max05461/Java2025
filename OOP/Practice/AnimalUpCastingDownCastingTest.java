package OOP.Practice;

class Animal {
    public void makesound(){
        System.out.println("Animal make a sound");
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Sleeping zzz");
    }
}

class Dog extends Animal {
    @Override
    public void makesound(){
        System.out.println("Bark bark");
    }

    public void fetch(){
        System.out.println("Dog is fetching the Balls");
    }
}

class Cat extends Animal {
   public int j = 1;
    @Override
    public void makesound(){
        System.out.println("Meow meow");
    }

    public void climb(){
        System.out.println("Cat is climbing the tree");
    }
}

public class AnimalUpCastingDownCastingTest {

    public static void main(String[] args) {
        
        Animal mydog = new Dog();
        Animal mycat = new Cat();
        mydog.eat();
        mydog.sleep();
        mydog.makesound();
        mycat.eat();
        mycat.sleep();
        mycat.makesound();



        Cat DowncastedCat = (Cat) mycat;
        DowncastedCat.climb();

        ((Dog) mydog).fetch();

    }
}

 

