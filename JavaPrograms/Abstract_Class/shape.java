package Abstract_Class;

abstract class shape {
    
    String color;

    shape(String color){
        this.color=color;
    }

    abstract double area();
}
