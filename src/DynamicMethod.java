class a{
    public void display(){
        System.out.println("display method of a");
    }
}

class b extends a{
    @Override
    public void display(){
        System.out.println("display method of b");
    }
}
class c extends a{
    @Override
    public void display(){
        System.out.println("display method of c");
    }
}
public class DynamicMethod {
    public static void main(String[] args) {
        System.out.println("implementing dymanic method calling");
        a obj1=new a();
        obj1.display();
        System.out.println("reassigning obj1 to class b");
        obj1=new b();
        obj1.display();
        System.out.println("reassigning obj1 to class c");
        obj1=new c();
        obj1.display();
        a obj2=new b();
        obj2.display();
        System.out.println(obj1);
        
    
}
}