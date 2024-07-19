/* Simple Inheritance */
public class inheritance1{
    
    public static void main(String[] args) {
        
        bike pulsar = new bike();
        pulsar.brand="Bajaj";
        pulsar.handle="bar";
        pulsar.music="no";
        pulsar.seat=2;
        pulsar.type="personal";
        pulsar.tyre=2;
        System.out.println(pulsar.toString());
    }
}


class vehicle {

    protected int seat;
    protected int tyre;
    protected String music;
    protected String type;
    protected String brand;

    
}

class bike extends vehicle{
     
    protected String handle;

    @Override
    public String toString() {
        return "bike [seat=" + seat + ", tyre=" + tyre + ", music=" + music + ", type=" + type + ", brand=" + brand
                + ", handle=" + handle + "]";
    }

    
}