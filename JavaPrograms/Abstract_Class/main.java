package Abstract_Class;

public class main {
    public static void main(String[] args) {
        
        /* This example demonstrates a simple abstract class with an abstract method that is implemented by a subclass. 
         */
        dog jenny = new dog();
        jenny.makeSound();
        jenny.sleep();

        /*
         * This example shows an abstract class with a constructor and fields that are initialized in the subclass.
         */

         circle cap = new circle(5, "black");
         System.out.println(cap.color);
         System.out.println(cap.area());

         /**
          * This example demonstrates multiple subclasses implementing the abstract methods of a common abstract class.
          */

       
         car taigo = new car();
         bike shine = new bike();
         taigo.start();
         taigo.stop();
         shine.start();
         shine.stop();
            

        /*Example 4: Abstract Class with Interface Implementation
         This example shows an abstract class implementing an interface and providing a base implementation for some methods. */

         guitar fender = new guitar();
         fender.clean();
         fender.tune();
         fender.play();
         fender.clean();

         /*Example 5: Abstract Class with Template Method Pattern
           This example demonstrates the Template Method design pattern using an abstract class.
        */
         
        // game football = new football();
        // game cricket = new cricket();
        // football.play();
        // cricket.play();
        
    }
}
