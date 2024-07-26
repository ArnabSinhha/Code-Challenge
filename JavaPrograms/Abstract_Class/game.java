package Abstract_Class;
abstract class game {
    abstract  void initialize();
    abstract void startplaying();
    abstract void endplay();

    // Template method 

    public final void play(){
        initialize();
        startplaying();
        endplay();
    }
}
