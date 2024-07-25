public class constructor4 {
    
    /**Overloaded constructor  */
    public static void main(String[] args) {
        
        emp test_object1=new emp("Arnab", "arnab08 ",87709 );
        emp test_object2=new emp("Arnab", "arnab08 " );
        emp test_object3=new emp("Arnab");
        System.out.println(test_object1.toString());
        System.out.println(test_object2.toString());
        System.out.println(test_object3.toString());
    }
}

/*error [public class class_name{}] */
class emp {
    
    @Override
    public String toString() {
        return "emp [name=" + name + ", id=" + id + ", contact_no=" + contact_no + "]";
    }

    private String name;
    private String id;
    private int contact_no;

    public emp(String name,String id,int contact_no){
           this.contact_no=contact_no;
           this.name=name;
           this.id=id;
    }
    public emp(String name,String id){
        this.id=id;
        this.name=name;
        this.contact_no=0000000000;
    }
    
    public emp(String name){
        this.id="xxxxxxx";
        this.name=name;
        this.contact_no=0000000000;
 }
}
