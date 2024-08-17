class myexception extends Exception {
    public myexception(String str){
    super(str);
    }

}
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 5, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
            System.out.println("now will see array index error");
            int[] n={4,3,21,6};
            System.out.println("array elements are");
            for(int num:n)
            {
                System.out.println(num);
            }
            System.out.println("tryinf to print index at 5");
            int index=5;
            if(index>n.length)
            throw new ArrayIndexOutOfBoundsException();
            int key=99;
            for(int num:n){
                if(num==key)
                {
                    System.out.println("Found "+key+" at index ");
                    break;
                }
                
                else{
                    throw new myexception("key not found");
                }

            }
            

        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array Index Out of Bound"+e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("This code will always execute");
        }
    }
    
}
