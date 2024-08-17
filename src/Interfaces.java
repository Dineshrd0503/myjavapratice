interface method1{
    public void display();
}
interface method2{
    public void show();
}
class details implements method1,method2{
    String name1,city1,phno1;
    int age1;
    protected details(String name,int age,String city,String phno){
        name1=name;
        age1=age;
        city1=city;
        phno1=phno;
    }
    public void display(){
        System.out.println("I am from method1");
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);
    }
    public void show(){
        System.out.println("I am from method2");
        System.out.println("City: " + city1);
        System.out.println("Phone Number: " + phno1);
    }
}
public class Interfaces {
    public static void main(String[] args) {
        // Interfaces are used to define the common behavior of classes
        System.out.println("displaying imterfaces");
        details d = new details("dinesh",21,"nellore","6300158172");
        d.display();
        d.show();

    }
    
}
