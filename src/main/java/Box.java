import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number & Comparable<T>> {
    private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public double avg(){
        double result = 0;
        for (T element : array){
            result += ((Number) element).doubleValue();
        }
        return result / array.length;
    }

    public static <U> void transfer(List<? extends U> src, List<? super U> dst){
        dst.addAll(src);
        src.clear();
    }

    public <U> void add(List<? extends U> list){}

    public int compare(Box<?> another){
        if (avg() > another.avg()){
            return 1;
        }else if (avg() == another.avg()){
            return 0;
        }else {
            return -1;
        }
    }

    public void setArray(T[] array) {
        this.array = array;
    }

}
