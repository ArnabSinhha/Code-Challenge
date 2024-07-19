public class Polymorphism {
    
    public static int add(int a , int b ){
        
        return a+b;
    };

    public static double add(double a , double b , double c ){
        return a+b+c;
    }

    public static int add(int a, int b  , int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        
        System.out.println(add(2,3));
        System.out.println(add(12.6, 12.7, 12.8));
        System.out.println(add(100, 49, 1));
    }
    
    
}






