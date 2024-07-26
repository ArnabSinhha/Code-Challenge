package Inner_Class;

public class StaticNestedClass {
    
    public static void main(String[] args) {
        
        NestedOuter.StaticInnerClass nested = new NestedOuter.StaticInnerClass();
        nested.inner_display();
        
    }

}

class NestedOuter{

    void outer_display(){
        System.out.println("Outer class not static method ");
    }

    static class StaticInnerClass{
        void inner_display(){
            System.out.println("Static Innner Classs Static Method Access Statically ");
        }
    }
}
