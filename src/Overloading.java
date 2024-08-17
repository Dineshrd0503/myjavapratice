class Car{
    String year;
    String model;
    public Car(String year,String model){
        this.year=year;
        this.model=model;

    }
    public void display(){
        System.out.println("model is "+this.model+" "+" year is "+this.year);
    }
}
public class Overloading {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("demosntatring overloading ");
        int[] a={44,2,13,6,78,9};
        System.out.println(sum(10, 20));
        System.out.println(sum("Hello","World"));
        System.out.println(sum(10.5, 20.7));
        System.out.println(sum(a));
        System.out.println("demosntrating classes");
        Car car1=new Car("1969","mustang");
        System.out.println("car name is "+car1.model);
        System.out.println("car year is "+car1.year);
        car1.display();
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static String sum(String a,String b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];

        }
        return sum;
    }

}
