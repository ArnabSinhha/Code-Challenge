package Inner_Class;

public class main {
   
    public static void main(String[] args) {
        
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        outer.display_outer();
        inner.inner_display();
    }

};



class Outer{
    
    void display_outer(){
        System.out.println("Welcome to outer class");
        }

    class Inner{
    
        void inner_display(){
            System.out.println("Welcome to inner class");
        }
    };
};