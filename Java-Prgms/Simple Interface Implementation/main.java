interface animal {
    void makesound();
}

class dog implements animal {

    @Override
    public void makesound() {
        System.out.println("Bark");
    }
}

class main{

    public static void main(String[] args) {
        
        dog jenny = new dog();
        jenny.makesound();
    }
}