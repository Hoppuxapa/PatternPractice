
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product milk = factory.produce("Milk");
        Product bread = factory.produce("Bread");
        milk.produceProduct();
        bread.produceProduct();
    }

}
