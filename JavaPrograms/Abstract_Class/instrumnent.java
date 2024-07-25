package Abstract_Class;

abstract class instrumnent implements playable{
    abstract void tune();

    // Methods of interfaces can be declared in abstract classes
    
    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }
     
    void clean(){
        System.out.println(" Cleaning the instrument ");
    }
}
