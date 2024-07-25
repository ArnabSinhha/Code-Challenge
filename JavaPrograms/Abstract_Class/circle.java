package Abstract_Class;

public class circle extends shape{
    
    double redius;
    circle( double redius , String color){
        super(color);
        this.redius=redius;

    };

    double area (){

        return Math.PI * redius * redius;
    }
}
