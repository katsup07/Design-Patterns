package src.com.katsup.iterator;

public class Main {

    public static void main(String[] args) {
        ProductCollection pc = new ProductCollection();
        pc.push(new Product(1, "cheese"));
        pc.push(new Product(2, "milk"));
        pc.push(new Product(3, "cookies"));
        System.out.println("Popped: "+pc.pop());
        Iterator iterator = pc.createIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }


    }
}