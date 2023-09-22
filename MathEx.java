public class MathEx {
    public static void main(String [] args){
       System.out.println(swap(123));
       System.out.println(swap(567));
       System.out.println(swap(384));

       timeLeft(1,15,4,36);
       timeLeft(1,34,8,20);
       timeLeft(10,2,14,6);
       
       System.out.println(dayOfWeek(5,15));
       System.out.println(dayOfWeek(0,18));
       System.out.println(dayOfWeek(1,24));

    }
        
    public static int swap(int y){
        int ones = y%10;
        int tens = y%100/10;
        int newNumber = y/100*100 + ones * 10 + tens;
        return newNumber;    
    }
    
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int curTime = curHour * 60 + curMin;
        int depTime = depHour * 60 + depMin;
        int minLeft = depTime - curTime;
        System.out.println(minLeft/60 + " hours and " + minLeft%60 + " minutes.");
    }

    public static int dayOfWeek(int startDay, int curDate){
        int day = (curDate + startDay - 1) % 7;
        return day;
    }
}
