public class composition {
    public static void main(String[] args) {
        
        laptop l101= new laptop(4, "hp");
        System.out.println(l101.toString());
    }

}




class laptop{

    protected int ram;
    protected String display;
    protected Processor processor;
    protected graphicCard GraphicCard;
    

    
    public laptop(int ram, String display) {
        this.ram = ram;
        this.display = display;
        this.processor=new Processor("intel", 4);
        this.GraphicCard=new graphicCard("Nvidia", 4);


    }


    @Override
    public String toString() {
        return "laptop [ram=" + ram + ", display=" + display + ", processor=" + processor.toString() + ", GraphicCard="
                + GraphicCard.toString()  + "]";
    }

    
}


class Processor{

    protected String brand;
    protected int core;

    public Processor(String brand, int core) {
        this.brand = brand;
        this.core = core;
    }

    @Override
    public String toString() {
        return "Processor [brand=" + brand + ", core=" + core + "]";
    }

    

    
}

class graphicCard{

    protected String brand;
    protected int memory;

    public graphicCard(String brand, int memory) {
        this.brand = brand;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "graphicCard [brand=" + brand + ", memory=" + memory + "]";
    }
    
    
    
}