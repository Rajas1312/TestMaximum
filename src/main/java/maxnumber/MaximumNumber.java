package maxnumber;

public class MaximumNumber<T extends Comparable<T>> {
    T x;
    T y;
    T z;

    public MaximumNumber(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum(){
        return  MaximumNumber.maximum(x,y,z);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static <T> void printMax(T x,T y,T z,T max){
        System.out.println("Maximum is " +max);
    }
}
