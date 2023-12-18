public class ForLoops{
    public static int addEvens(int n){
        int sum = 0;
        for(int i = 2; i <= n; i += 2){
            sum += i;
        }
        return sum;
    }

    public static void printSquaresBack(int n){
        for(int i = n; i >= 1; i--){
            int squared = i * i;
            if (i > 1){
                System.out.print(squared + ", ");
            }
            else {
                System.out.println(squared);
            }
    
        }
    }

    public static void sillyNumbers(){
        for(int i = 1; i <= 3; i ++){
            for(int j = 0; j <= 9; j++){
                for(int n = 1; n <= 3; n ++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void sillyNumbers2(){
        for (int n = 1; n <= 4; n++){
            for(int i = 9; i >= 1; i--){
                for(int j = i;  j >= 1; j--){
                    System.out.print(i);
                }
            }
            System.out.println();
        }

    }

    public static void dollarsAndStars(){
        int dollars = 7;
        int centerStars = 14;
        int sideStars = 0;

        for(int i = 7; i >= 1; i--){
            for (int n = sideStars; n > 0; n--){
                System.out.print("*");
            }
            for (int n = dollars; n > 0; n--){
                System.out.print("$");
            }
            for (int n = centerStars; n > 0; n--){
                System.out.print("*");
            }
            for (int n = dollars; n > 0; n--){
                System.out.print("$");
            }
            for (int n = sideStars; n > 0; n--){
                System.out.print("*");
            }
    
            centerStars -= 2;
            dollars --;
            sideStars += 2;
            System.out.println();
        }


    }

    public static void main(String[] args){

        System.out.println("addEvens");
        System.out.println(addEvens(8));
        System.out.println(addEvens(13));
        System.out.println(addEvens(15));

        System.out.println("\nprintSquaresBack");
        printSquaresBack(4);
        printSquaresBack(8);
        printSquaresBack(10);


        System.out.println("\nsillyNumbers");
        sillyNumbers();

        System.out.println("\nsillyNumbers2");
        sillyNumbers2();

        System.out.println("\ndollarsAndStars");
        dollarsAndStars();
    }
}