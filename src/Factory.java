
public class Factory {

    public Product produce(String typeOfProduct) {
        switch (typeOfProduct) {

            default:
                return null;
            case "Milk":
                return new Milk();
            case "Bread":
                return new Bread();
        }
    }
}

interface Product {
    void produceProduct();

}
class Milk implements Product {

    @Override
    public void produceProduct() {
        System.out.println("Produce milk");
    }

}

class Bread implements Product {

    @Override
    public void produceProduct() {
        System.out.println("Produce bread");
    }
}
