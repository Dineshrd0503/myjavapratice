
import java.util.*;

class students {

    String rno, name;
    int age;

    public students(String rno, String name, int age) {
        this.rno = rno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "students [rno=" + rno + ", name=" + name + ", age=" + age + "]";
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {
        // Anonymous Comparator class
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1; 
                }else if (i % 10 < j % 10) {
                    return -1; 
                }else {
                    return 0;
                }
            }
        };

        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for (int i = 31; i < 37; i++) {
            a.add(i);
        }
        System.out.println("Sorting using Comparator");
        Collections.sort(a, com);
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("now creating classes");
        List<students> stu = new ArrayList<>();
        stu.add(new students("22kb1a05e7", "dinesh", 25));
        stu.add(new students("22kb1a05e6", "sameera", 20));
        stu.add(new students("22kb1a05e8", "sai", 23));
        for (students s : stu) {
            System.out.println(s);
        }
        System.out.println("sorting using comarator accoring to age");
        Comparator<students> com1 = (s1, s2) -> s1.age > s2.age ? 1 : -1;
        System.out.println("after sorting ");
        Collections.sort(stu, com1);
        for (students s : stu) {
            System.out.println(s);
        }
    }
}
