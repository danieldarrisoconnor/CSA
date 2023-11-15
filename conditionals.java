    public class conditionals{

        public static boolean chimpTrouble(boolean aSmile, boolean bSmile){
            if (aSmile == bSmile)
            return true;
            else return false;
            
        }

        chimpTrouble(true, true);
        chimpTrouble(false, false);
        chimpTrouble(true, false);
        chimpTrouble(false, true);

        public boolean negPos(int a, int b, boolean c){

            if (c == false){
                if (a < 0 || b < 0)
                return true;
                else return false;
            }
            else if (c == true) {
                if (a < 0 && b < 0)
                return true;
                else return false;
            }
            else return false;
            
        }

        public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
            if (isAsleep == true){
                return false;
            }
            if (isMorning == true){
                if (isMom == true){
                    return true;
                }
                return false;
            return true;
        
            }

        public string setAlarm(int day, boolean vacation){
            if (vacation == true)


         }



        public static void main(String[] args){



          //  conditional co = new condititonal();

          //  System.out.println(co.chimpTrouble(true, true));
          //  System.out.println(co.chimpTrouble (false, false));
          //  System.out.println(co.chimpTrouble (true, false));
          //  System.out.println(co.chimpTrouble (false, true));

          //  System.out.println(co.negPos(1, -1, false));
           // System.out.println(co.negPos (-1, 1, false));
          //  System.out.println(co.negPos(1, 1, false));
          //  System.out.println(co.negPos (-1, -1, false));
          //  System.out.println(co.negPos (-4, -5, true));
          //  System.out.println(co.negPos (-4, 5, true));
          //  System.out.println(co.negPos (4, 5, true));
           // System.out.println(co.negPos (4, -5, true));

} 
    }
