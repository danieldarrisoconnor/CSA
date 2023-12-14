public class Factorial {

    public static long calcFactorial(int factorial){
        long product = 1;
        for (int i = 1; i <= factorial; i ++){
            product *= i;
        }
        return product;
    }

    public static double calcE(){
        double e = 1;
        double olde = 0;
        int x = 1;
    
        while(e - olde > 0.001){
            olde = e;
            e += 1.0/calcFactorial(x);
            x ++;
        }
        return e;
    }

    public static double calcEX(int x){
        double e = 1.0;
        double olde = 0.0;
        int y = 1;
    
        while(e - olde > 0.001){
            olde = e;
            e += (Math.pow(x, y))/calcFactorial(y);
            y ++;
        }
        return e;

    }

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i ++) {
            System.out.println(calcFactorial(i));
        }

       System.out.printf("e is %2.3f \n", calcE());
       for(int i = 1; i <= 5; i ++){
       System.out.printf("e is %2.3f \n", calcEX(i));
       }

    }
}

    