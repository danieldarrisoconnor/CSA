public class Fraction {
    private int numerator;      //attributes
    private int denominator;
   
    // constructor
    public Fraction(int n, int d)   // constructor
    {
        numerator = n;
        denominator = d;

    }
   


    public Fraction(){
        numerator = 4;
        denominator = 6;

    }
   
    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();
       
        Fraction result = new Fraction(n,d);
        return result;
    }
   
    public Fraction subtract(Fraction minuend, Fraction subtrahend)
    {
        int n = minuend.numerator * subtrahend.denominator + subtrahend.numerator * minuend.denominator;
        int d = minuend.denominator * subtrahend.denominator;

        return new Fraction(n,d);
    
        
    }
   
    public Fraction multiply(Fraction factor1, Fraction factor2){
        int n = factor1.numerator * factor2.numerator;
        int d = factor1.denominator * factor2.denominator;
        return new Fraction(n,d);

    }
   
    public String toString(Fraction other){
        return other.numerator + "/" + other.denominator;

    }
   
    public Fraction reciprocal(){
        int n = denominator;
        int d = numerator;
        return new Fraction(n,d);

    }

   
   
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);    // create an instance of fraction
        Fraction f2 = new Fraction(4,5);    
       
        Fraction f3 = f1.add(f2);           // add 2 fractions
        System.out.println("3/4 + 4/5 = " + f3);    // print the answer
           
        /*
        Fraction f4 = f1.subtract(f2);
        System.out.println(f1 + " - " + f2 + " = " + f4);
       
        Add code to multiply f1 and f2 here
       
        Add code to call reciprocal here
       
        create 2 new fractions and add them here.
       
        */  
       


    }


}


