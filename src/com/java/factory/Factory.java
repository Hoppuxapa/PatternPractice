package com.java.factory;

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

    static class Bread implements Product {

        @Override
        public void produceProduct() {
            System.out.println("Produce bread");
        }
    }

    static class Milk implements Product {

        @Override
        public void produceProduct() {
            System.out.println("Produce milk");
        }

    }

    interface Product {
        void produceProduct();

    }
}
