package Abstract_Class;

public class car extends vehicle{
    
    @Override
    void start() {
        System.out.println(" Car is started ! Ready steady Po");
    }
    
    @Override
    void stop (){
       System.out.println(" Car is at halt !");
    }
}
