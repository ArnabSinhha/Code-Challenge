public class constructor3 {
    public static void main(String[] args) {
       book b101 = new book("HP", "JKR", 55.99);
       book b102 =new book("One Night Stnad ", "K Kush", 29.97);
       b101.displayInfo();
       b102.displayInfo();
    }
}

class book{
  
    String bookname;
    String authorName;
    double price;

    /* Here book() is a parametarized constant  */
    public book(String bookname, String authorName , double price){
        this.bookname=bookname;
        this.authorName=authorName;
        this.price=price;
    }

    public void displayInfo(){
        System.out.println(bookname + " is written by " + authorName + " and it costs $" + price);
    }
}