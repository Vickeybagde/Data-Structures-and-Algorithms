public class FunctionOverloading {
    
    
    //sum of two num
    public static int sumof(int a, int b){
         int sum = a+b;
         return sum;
    }

    public static int sumof(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumof(5, 10));
        System.out.println(sumof(5, 10, 5));
    }
}
