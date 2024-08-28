public class GenericClass <T extends Comparable<T>,V,K extends Number> {

    private T valueT;
    private V valueV;
    private K valueK;

    public GenericClass(T valueT, V valueV, K valueK){
        this.valueT = valueT;
        this.valueV = valueV;
        this.valueK = valueK;
    }

    public T getValueT(){
        return this.valueT;
    }

    public V getValueV(){
        return valueV;
    }

    public K getValueK(){
        return valueK;
    }


    public void showClass(){
        System.out.println(valueT.getClass().getName()
                + " " + valueV.getClass().getName()
                + " " + valueK.getClass().getName());
    }





}
