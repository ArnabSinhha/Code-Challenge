package Abstract_Class;

public class football extends game{

    @Override
    void endplay() {
        System.out.println(" Terminate football game !Stop playing ");
        
    }

    @Override
    void initialize() {
        System.out.println("Intialize football game  ! Initialize playing  ");
        
    }

    @Override
    void startplaying() {
        System.out.println("Start football game ! Start playing");
        
    }
    
}
