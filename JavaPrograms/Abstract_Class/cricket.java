package Abstract_Class;

public class cricket extends game{

    @Override
    void endplay() {
        System.out.println(" Terminate cricket game !Stop playing ");
        
    }

    @Override
    void initialize() {
        System.out.println("Intialize cricket game  ! Initialize playing  ");
        
    }

    @Override
    void startplaying() {
        System.out.println("Start cricket game ! Start playing");
        
    }
    
}
