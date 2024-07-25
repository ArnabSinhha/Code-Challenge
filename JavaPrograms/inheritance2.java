/* Program to demostrate the use of super keyword and method override */
public class inheritance2 {
    public static void main(String[] args) {
        
        electronic heater = new electronic("30", "2001");
        heater.display();
        mobile xiomi = new mobile("60", "2022", "mobile");
        xiomi.display();
    }
}  


class electronic {

    protected String watt;
    protected String yom;
    
    protected void display(){
        System.out.println(watt + " " + yom );
    }
    
    
    public electronic(String watt, String yom) {
        this.watt = watt;
        this.yom = yom;
    }

    
}


class mobile extends electronic{
    
    protected String type;
    public mobile(String watt, String yom,String type){
        super(watt, yom);
        this.type=type;
    }
    @Override
    protected void display(){ 
        System.out.println(type + " " + yom + " " + type);
    }
}


