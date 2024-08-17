
import java.util.*;
import java.lang.Math;

public class Example {
    public static void main(String[] args) {
        final int a = 9;
        System.out.println("final integer is" + a);
        System.out.println(3 + 3);
        float f = 9.999887f;
        boolean b1 = true;
        System.out.println("this is float value" + f);
        double d = 9.56353653295739573d;
        System.out.println("this is double value" + d);
        System.out.println(a + f + d);
        System.out.println("calculating area of rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length and width");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("area of rectangle is" + area(l, b));
        System.out.println("performing wide casting");
        int i = 10;
        float l1 = i;
        System.out.println("long value is" + l1);
        System.out.println("performing narrow cast");
        int j = (int) l1;
        System.out.println("new integer value is" + j);
        String s = "dinesh";
        System.out.println("length if string is:" + s.length());
        System.out.println("in upper case " + s.toUpperCase());
        System.out.println("to lower case" + s.toLowerCase());
        System.out.println("location of i in " +s+ "IS " + s.indexOf('i'));
        System.out.println("my full name is"+s.concat("Rajasekhar"));
        System.out.println("max of values is"+Math.max(2,5));
        System.out.println("min of value sis "+Math.min(9,4));
        System.out.println("printning random number"+Math.random());
        System.out.println("printing random integer number"+((int)(Math.random()*101)));
        System.out.println("printing random number b/w 1 to 100"+((int)(Math.random()*101)));
        System.out.println("boolean value is"+(10>9));
        System.out.println("using teerneray opearator instead of if else");
        String r1= (10< 18) ? "18 is gretare" : "10 is greater";
        System.out.println(r1); 
        System.out.println("working with arrays");
        String[] cars={"bently","ferrari","rolls royce","MUstang"};
        for(String i1:cars)
        {
            if(i1=="rolls royce")
            continue;
            System.out.println(i1);
        }
        System.out.println("lenth of list is"+cars.length);
        System.out.println("working with multidimesional arrays");
        int m[][]={{4,5,6,7},{1,2,3,4}};
        System.out.println("element at 2nd position"+m[0][1]);
        System.out.println("printing each elemnt");
        for(int i2=0;i2<m.length;i++){
            for(int j1=0;j1<m[i].length;j1++){
                System.out.println(m[i2][j1]);
            }
        }
        sc.close();

    }

    public static int area(int l, int b) {
        return l * b;

    }
}
