public class WhileLoops {


    public static int addOdds(int n){
        int count = 1;
        int sum = 0;
        while (count <= n){
            sum += count;
            count += 2;
        }
        System.out.println(sum);
        return sum;
    }



    public static int sumDigits(int num){
       
        
        int sumOfDigits = 0;

          while (num  > 0){
            sumOfDigits += num % 10;
            num = num / 10;
            }
        
        System.out.println(sumOfDigits);
        return sumOfDigits;
    }

    public static int howManyYears(double startpop, double endpop){
        int count = 0;
        while (startpop < endpop){
            startpop = startpop * 1.0113;
            count ++;
        }

    }

    public static void main(String[] args) {

    addOdds(12);
    addOdds(9);
    addOdds(10);

    sumDigits(5);
    sumDigits(12);
    sumDigits(123);

    howManyYears(120,150);

    }

}