public class ScopeDemo {
    // Global variables with different access modifiers
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    final int a=90;
    int defaultVar = 40; // default (package-private) access

    public void methodWithLocalVars() {
        int localVar = 60; // local variable
        System.out.println("Local variable in methodWithLocalVars: " + localVar);
    }

    // Method with parameters
    public void methodWithParams(int paramVar) {
        System.out.println("Parameter variable in methodWithParams: " + paramVar);
    }

    public static void main(String[] args) {
        ScopeDemo obj = new ScopeDemo();

        // Accessing variables from main method
        System.out.println("Accessing variables from main method:");
        System.out.println("publicVar: " + obj.publicVar);
        System.out.println("privateVar: " + obj.privateVar); // Error: privateVar is not accessible
        System.out.println("protectedVar: " + obj.protectedVar);
        System.out.println("defaultVar: " + obj.defaultVar);
        System.out.println("final varaible is "+obj.a);
        System.out.println("changing vale of final varaible");
        System.out.println(obj.a);

        // Method with local variables
        obj.methodWithLocalVars();

        // Method with parameters
        obj.methodWithParams(50);
    }

    // Method with local variables
    

    // Inner class with access to outer class variables
    public class InnerClass {
        public void accessOuterClassVars() {
            System.out.println("Accessing outer class variables from InnerClass:");
            System.out.println("publicVar: " + publicVar);
            System.out.println("privateVar: " + privateVar);
            System.out.println("protectedVar: " + protectedVar);
            System.out.println("defaultVar: " + defaultVar);
        }
    }
}