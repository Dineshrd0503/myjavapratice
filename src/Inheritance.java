import java.util.Scanner;

class dog {
    String name;

    public void bark() {
        System.out.println(name + " dog barks, Woof!");
    }

    public void sleep() {
        System.out.println(name + " dog sleeps, Zzz...");
    }

    public String display() {
        return name;
    }
}

class cat extends dog {
    public void bark() {
        System.out.println(name + " cat meows, Meow!");
    }

    public void sleep() {
        System.out.println(name + " cat sleeps, Grumbling...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Do you have dogs or cats? (press 0 to exit)");
            String choice = sc.next();

            if (choice.equals("0")) {
                System.out.println("Program exited");
                break;
            } else if (choice.equals("dogs")) {
                System.out.println("Enter no. of animals");
                int n = sc.nextInt();
                dog[] animals = new dog[n];
                for (int i = 0; i < n; i++) {
                    animals[i] = new dog();
                    System.out.println("Enter name of dog " + (i + 1));
                    animals[i].name = sc.next();
                }
                for (dog d1 : animals) {
                    d1.bark();
                    d1.sleep();
                    System.out.println("Name of dog is " + d1.display());
                }
            } else if (choice.equals("cats")) {
                System.out.println("Enter no. of animals");
                int n = sc.nextInt();
                cat[] animals = new cat[n];
                for (int i = 0; i < n; i++) {
                    animals[i] = new cat();
                    System.out.println("Enter name of cat " + (i + 1));
                    animals[i].name = sc.next();
                }
                for (cat c1 : animals) {
                    c1.bark();
                    c1.sleep();
                    System.out.println("Name of cat is " + c1.display());
                }
            } else {
                System.out.println("Invalid choice");
                continue;
            }
        }
    }
}