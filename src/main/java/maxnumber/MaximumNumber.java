package maxnumber;

public class MaximumNumber<T extends Comparable> {
    T element1;
    T element2;
    T element3;
    public MaximumNumber(T element1, T element2, T element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }
    public T getMaximum(T[] arrTest){
       return (T)MaximumNumber.testMaximum(element1,element2,element3,arrTest);
    }
   public static <T extends Comparable<T>> T testMaximum(T element1, T element2, T element3,T[] arrTest){
        T maximum=element1;
        arrTest[0]=maximum;
        arrTest[1]=element2;
        arrTest[2]=element3;
        if(element2.compareTo(maximum)>0){
            maximum=element2;
            arrTest[0]=maximum;
            arrTest[1]=element1;
            arrTest[2]=element3;
        }
        if(element3.compareTo(maximum)>0){
            maximum=element3;
            arrTest[0]=maximum;
            arrTest[1]=element1;
            arrTest[2]=element2;
        }
        printMax(element1,element2,element3,maximum,arrTest);
        return maximum;
    }
    public static <T> void printMax(T x,T y,T z,T max,T[] arrTest){

        System.out.println("Maximum is " +max);
        System.out.println(java.util.Arrays.toString(arrTest));
    }

}
