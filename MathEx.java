public class MathEx {
    public static void main(String [] args){
        swap(648);

    }
        
    public static void swap(int y){
        int ones = y%10;
        int tens = y%100/10;
        System.out.println(ones);
        System.out.println(tens);
         
    }
}
