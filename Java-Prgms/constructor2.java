public class constructor2 {
    public static void main(String[] args) {

    /* Caliing the constructor(car1()) with no parameters(or no values sent to the constructor) */
     car1 newcar = new car1();
 
     newcar.displayDetail();
    }
 }
 
 class car1 {
     
     private String brand;
     private String model;
     private int year; 
     
    // Defualt constructor where values have been decoded and hardcoded 
     public car1() {
         this.brand ="audi";
         this.model ="a4";
         this.year=2014;
     }
 
 
     public void displayDetail(){
         System.out.println(brand + " \n " + model + " \n " + year );
     }
 }

