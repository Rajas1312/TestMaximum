package maxnumber;

public class MaximumNumber {

    public static Integer max(Integer x,Integer y,Integer z){
        Integer max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
         printMax(x,y,z,max);
        return max;
    }
    public static Float max(Float x,Float y,Float z){
        Float max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        printMax(x,y,z,max);
        return max;
    }
    private static void printMax(Integer x, Integer y, Integer z, Integer max) {
        System.out.println("maximum is "+max);
    }
    private static void printMax(Float x, Float y, Float z, Float max) {
        System.out.println("maximum is "+max);
    }

}
