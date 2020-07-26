package calculator;
import java.util.*;

class Calculator implements MathOperations{
	
    public double add(double x,double y){
        return x+y;
    }
    public double sub(double x,double y){
        return x-y;
    }
    public double mul(double x,double y){
        return x*y;
    }
    public double div(double x,double y){
        try{
            return x/y;
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero not possible");
            return 0;
        }
    }
   
}
