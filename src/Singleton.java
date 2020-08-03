public class Singleton {

   Singleton singleton = new Singleton();
    private Singleton() {
    }

    public Singleton getInstance(){
        return singleton;
    }
}
