class a  {
        public void display(){
            System.out.println("Inside anonymous inner class");
        }
    }
   
public class AnymousInnerClass {
    public static void main(String[] args) {
        a obj=new a(){
            @Override  // overriding the method in anonymous inner class
            // if we don't override the method then it will use the original method of a class
            public void display(){
                System.out.println("Inside anonymous inner class");
            }
        };
        obj.display();  // accessing the overridden method in anonymous inner class
    }
    
}
