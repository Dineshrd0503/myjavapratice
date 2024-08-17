class Outer{
    private int a=10;
    class Inner{
        public void display(){
            System.out.println("Inner class variable a is: "+a);
        }
    }

}
public class InnerClass{
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        inner.display();  // accessing the inner class variable a using object of outer class
        System.out.println(outer.hashCode());
        
    }
    
}
