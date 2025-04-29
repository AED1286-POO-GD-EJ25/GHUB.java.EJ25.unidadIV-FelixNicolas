package interfases;
public class Dog implements Pet{
    @Override
    public void makeSound(){
        System.out.println("Guauuu");

    }
    @Override
    public void move(){
        System.out.println("El perro se mueve");

    }
    @Override
    public void play(){
        System.out.println("El perro juega");
    }

}