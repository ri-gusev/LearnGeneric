import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {
    List<T> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public double getWeight(){
        double result = 0;
        for(T element : basket){
            result += element.getWeight();
        }
        return result;
    }

    public void add(T element){
        basket.add(element);
    }

    public int size(){
        return basket.size();
    }

    public int compare(Basket<?> basket){
        return Double.compare(getWeight(), basket.getWeight());
    }

    public static <E extends Fruit> void transfer(Basket<? extends E> src, Basket<? super E> dst){
        dst.basket.addAll(src.basket);
        src.basket.clear();
    }


}


