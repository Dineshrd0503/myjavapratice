import java.util.*;
interface MathOperations{
    int operation(int a,int b);
}
interface areas{
    int area(int l,int b);
}
public class LambdaDemo {
    public static void main(String[] args) {
        MathOperations add=(a,b)->a+b;
        MathOperations sub=(a,b)->a-b;
        MathOperations mul=(a,b)->a*b;
        MathOperations div=(a,b)->{
            if(b==0){
                throw new ArithmeticException("Division by zero");
            }
            return a/b;
        };
        areas r=(l,b)->l*b;
        System.out.println("Addition: "+add.operation(8, 9));
        System.out.println("Subtraction: "+sub.operation(5, 3));
        System.out.println("Multiplication: "+mul.operation(5, 3));
        try{
            System.out.println("Division: "+div.operation(5, 2));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Area of rectangle: "+r.area(5, 3));
       List<String> names=Arrays.asList("hello","christoper","nolan");
       System.out.println("printing details using for loop");
       for(String name:names)
       {
           System.out.println(name.toUpperCase());
       }
       System.out.println("printing details using lambda expression");
       names.forEach(name -> System.out.println(name));
        
        
    }
    
}
