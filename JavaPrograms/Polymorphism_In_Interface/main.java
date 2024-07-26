package Polymorphism_In_Interface;



public class main {
    public static void main(String[] args) {
        
        animal[] pets =new animal[3];

        pets[0] = new  dog();
        pets[1] = new cat();
        pets[2] = new cow();

        pets[0].makeSound();
        pets[1].makeSound();
        pets[2].makeSound();

        };
    }



/**
 *  
 */
interface  animal {
  void makeSound();
    
}

class dog implements animal{

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class cat implements animal{
    
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}


class cow implements animal{

    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}