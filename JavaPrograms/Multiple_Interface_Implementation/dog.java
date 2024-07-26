package Multiple_Interface_Implementation;

public class dog implements pet,animal{

    @Override
    public void makesound() {
        System.out.println("Bhow Bhow");
        
    }

    @Override
    public void play() {
        System.out.println("Fetch the ball");
        
    }


    
    
}
