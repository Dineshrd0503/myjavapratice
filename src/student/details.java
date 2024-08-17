package student;
public class details{
    String name,branch,id,phno;
    public details(String name,String branch,String id,String phno){
        this.name=name;
        this.branch=branch;
        this.id=id;
        this.phno=phno;
    }

    public void displaydetails(){
        System.out.println("Name: "+name+"\nBranch: "+branch+"\nID: "+id+"\nPhone No.: "+phno);
    }

}