package student;
import java.util.Scanner;
class marks extends details{
   public marks(String name,String branch,String id,String phno){
    super(name,branch,id,phno);
 
   }
    public void marks(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no.of subjects");
        int n=sc.nextInt();
        float sum=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the marks of subject "+(i+1));
            float m=sc.nextFloat();
            sum+=m;
    
    }
    System.out.println("total marks="+sum);
    System.out.println("average marks are "+sum/n);
}
}

class updatedetails extends marks{
    public updatedetails(String name,String branch,String id,String phno){
    super(name,branch,id,phno);
    }
    public void updatedetails(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the new name");
        String newname=sc.nextLine();
        System.out.println("enter the new branch");
        String newbranch=sc.nextLine();
        System.out.println("enter the new id");
        String newid=sc.nextLine();
        System.out.println("enter the new phno");
        String newphno=sc.nextLine();
        super.name=newname;
        super.branch=newbranch;
        super.id=newid;
        super.phno=newphno;
        System.out.println("your details are updated");
        super.displaydetails();
    

    
}
}

public class StudentDemo {
    public static void main(String[] args) {
        System.out.println("enter your detailas");
        System.out.println("enter your name,branch,id and phno");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String branch=sc.nextLine();
        String id=sc.nextLine();
        String phno=sc.nextLine();
        marks m=new marks(name, branch, id, phno);
        m.displaydetails();
        m.marks();
        System.out.println("do you want to upadte your details(yes-1,no-0)");
        int choice=sc.nextInt();
        if(choice==1){
            updatedetails ud=new updatedetails(name, branch, id, phno);
            ud.updatedetails();
        }
        sc.close();


    }
    
}
