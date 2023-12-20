public class triangleLoops{

    public static void eights(){

        int spaces = 0;
        for(int i = 8; i > 0; i -= 2){
            //left spaces
            for(int n = spaces; n > 0; n--){
            System.out.print(" ");
            }
            // print integers
            for(int n = i; n > 0; n--){
            System.out.print(i);
            }
            //right spaces
            for(int n = spaces; n > 0; n--){
            System.out.print(" ");
            }
            System.out.println(" ");
            spaces ++;
        }
    }
    public static void alternate(int x){
        int num = 1; 
        int alt = 1; //change from pos to neg to alternate order
        for(int i = x; i > 0; i --){
            if(alt < 0){
                for(int n = num; n > 0; n--){
                    System.out.print(n);
                }
            }
            if(alt > 0){
                for(int n = 1; n <= num; n++){
                    System.out.print(n);
                }
            }
                num ++;
                alt *= -1;
                System.out.println();
        }
    }

    public static void isosceles(int x){
        int spaces = x - 1;
        int midNum = 1;
        for(int i = x; i > 0; i --){
            for(int n = spaces; n > 0; n--){
                System.out.print(" ");
            }
            for(int n = 1; n < midNum; n ++){
                System.out.print(n);
            }
            System.out.print(midNum);
            for(int n = midNum - 1; n >= 1; n --){
                System.out.print(n);

            }
            for(int n = spaces; n > 0; n--){
                System.out.print(" ");
            }
            spaces -= 1;
            midNum += 1;
            System.out.println();
        }
    }
    public static void upSideDown(int start, int end){
        int spaces = 0;

        for(int i = start - end; i >= 0; i --){
            for(int n = spaces; n > 0; n--){
                System.out.print(" ");
            }
            for(int n = start; n >= end; n --){
                System.out.print(n);
            }
            for(int n = end + 1; n <= start; n ++){
                System.out.print(n);
            }
            for(int n = spaces; n > 0; n--){
                System.out.print(" ");
            }
            spaces ++;
            start --;
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        eights();
        alternate(3);
        alternate(6);
        alternate(8);
        isosceles(3);
        isosceles(5);
        isosceles(7);
        System.out.println();
        upSideDown(9,5);
        upSideDown(9,5);
        upSideDown(7,1);
    }

}