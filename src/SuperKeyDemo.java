class a1{
    a1(){
        System.out.println("parent class constructor");
    }
    int val=10;
    public void display(){
        System.out.println("parent class method value is"+val);
    }
}
class b1 extends a1{
    b1(){
        a1();
        System.out.println("child class constructor");
    }
    int val=20;
    @Override
    public void display(){
        System.out.println("child class method value is"+val);
        System.out.println("variable value using parent class "+super.val);
        System.out.println("using super to call parent method");
        super.display();
    
    }
}
public class SuperKeyDemo{
    public static void main(String[] args) {
        System.out.println("demsontrating super keyword");
        a obj=new a();
        obj.display();
        b obj1=new b();
        obj1.display();
        
    }
}