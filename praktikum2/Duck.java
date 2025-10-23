package praktikum2;

public class Duck extends Animal implements Flyable, Swimmable{
    public Duck (String name){
        super(name);
    }

    public void makeSound(){
        System.out.println("kwek kwek");
    }

    public void fly(){
        System.out.println("bisa terbang");
    }

    public void swim(){
        System.out.println("bisa berenang");
    }
}
