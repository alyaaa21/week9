package praktikum2;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void makeSound();

    public void eat(){
        System.out.println("suka makan");
    }
}
