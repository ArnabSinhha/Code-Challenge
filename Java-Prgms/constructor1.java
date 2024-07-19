/*Program to display, values allocated to diiferent dts by default constructor */


public class constructor1{
    public static void main(String[] args) {

      /*Format to create new object 
        datatype/classname  objectname = new constructor() */  
        car newcar = new car();

        newcar.displayDetail();
    }
}

class car {
    
    private String brand;
    private String model;
    private int year; 
    
    
    public void displayDetail(){
        System.out.println(brand + " " + model + " " + year );
    }
}