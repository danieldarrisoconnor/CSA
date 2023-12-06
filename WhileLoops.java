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
        double curpop = startpop;
        int count = 0;
        while (curpop < endpop){
            curpop *= 1.0113;
            count ++;
        }

        System.out.println(count);
        return count;
    
    }

    public static void printSum(int n){
        int sum = 0;
        while (n > 0){
            sum += n;
            n --;
        }
        System.out.println(sum);
    }

    public static boolean isPerfectSquare(int n){
        int curSquare = 1;
        while (curSquare < n){
            curSquare = curSquare * 2 + 2;
        }
        if (curSquare == n) return true;
        else return false;

    }

    public static void main(String[] args) {

    addOdds(12);
    addOdds(9);
    addOdds(10);

    sumDigits(5);
    sumDigits(12);
    sumDigits(123);

    howManyYears(111.2,120);
    howManyYears(111.2,150);

    printSum(6);
    printSum(8);

    System.out.println(isPerfectSquare(1));
    System.out.println(isPerfectSquare(9));
    System.out.println(isPerfectSquare(18));
    System.out.println(isPerfectSquare(36));

    }

}