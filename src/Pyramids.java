import java.util.Scanner;
public class Pyramids {
    public static void main(String[] args) {
        System.out.println("enter the no.of rows");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("1 for right for pyramid\t2 for left hlaf pyramud");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
        }
        System.out.println();
        }
        break;
        case 2:
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
        break;
        default:
       System.out.println("no opeartions are avaliable");
        
    }
    scanner.close();
}
    }
