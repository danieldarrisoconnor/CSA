public class Complex{

    private double a;
    private double b;


    public Complex(double dA, double dB){
        a = dA;
        b = dB;
    }
    public Complex(double dA){
        a = dA;
        b = 0.0;
    }

    public Complex add(Complex other){
        double newA = a + other.a;
        double newB = b + other.b;
        Complex newComplex = new Complex(newA, newB);
        return newComplex;
    }

    public double abs(){
        double abs = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2)); 
        return abs;
    }
    
    public static String toString(Complex x){
        String str = x.a + " + " + x.b + " * i";
        return str;
    }

    public Complex multiply(Complex other){

    double newA = a * other.a - b * other.b;
    double newB = a * other.b + b * other.a;
    Complex newComplex = new Complex(newA, newB);
    return newComplex;
    
    }
    

    
    public Complex multiply(double x){

        double newA = a * x;
        double newB = b * x;

        Complex newComplex = new Complex(newA, newB);
        return newComplex;


    }

    public static void main(String[] arg){
        Complex complex1 = new Complex(3,4);
        System.out.println(toString(complex1));
    }

}