class a{
    int x = 10;
    public a(){
        System.out.println("parent class constructor");
    }
    public void display(){
        System.out.println("parent class method value is "+x);
    }
}
class b{
    int x = 20;
    public b(){
        System.out.println("child class constructor");
    }
    public void display1(){
        System.out.println("child class method value is "+x);
    }
}
public class TypeCastingDemo {
    public static void main(String[] args) {
        int a = 10;
        double b = (double) a; // Implicit type casting
        System.out.println("Double value: " + b);
        System.out.println("performing explict typecasting");
        a=(int)b;
        System.out.println("Integer value: " + a);
        a obj=new a();
        obj.display();
        b obj1=new b();
        obj1.display1();
        System.out.println("using type casting for classes and converitng a onj to class b");
        //downcastig
        b obj2=(b) obj;
        obj2.display1();
        //upcasting
        a obj3=(a) obj1;
        obj3.display();
    
    
}
}