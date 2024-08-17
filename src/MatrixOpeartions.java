import java.util.*;
public class MatrixOpeartions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("entre rows and columns for martix1");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("entre rows and columns for martix2");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int[][] m1=new int[r1][c1];
        int[][] m2=new int[r2][c2];
        System.out.println("enter elements of matrix1");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elements of matrix2");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("displaying m1");
        print(m1);
        System.out.println("displaying m2");
        print(m2);
        System.out.println("performing matx addition");
        add(m1,m2);
        System.out.println("performing matrix multipciation");
        multiply(m1,m2);
        System.out.println("performing matrix subtraction");
        subtract(m1,m2);
        

    }
    public static void print(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void add(int[][] m1,int[][] m2) {
        if(m1.length==m2.length && m1[0].length==m2[0].length){
            int r=m1.length;
            int c=m1[0].length;
            int[][] result=new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    result[i][j]=m1[i][j]+m2[i][j];
                }
            }
            print(result);
        }
        else{
            System.out.println("matrics can't be added");
        }

        
    }
    public static void multiply(int[][] m1, int[][] m2){
        if(m1[0].length==m2.length){
            int r=m1.length;
            int c=m2[0].length;
            int[][] result=new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    for(int k=0;k<m1[0].length;k++){
                        result[i][j]+=m1[i][k]*m2[k][j];
                    }
                }
            }
            print(result);
        }
        else{
            System.out.println("matrics can't be multiplied");
        }
    }
    public static void subtract(int[][] m1, int[][] m2){
        if(m1.length==m2.length && m1[0].length==m2[0].length){
            int r=m1.length;
            int c=m1[0].length;
            int[][] result=new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    result[i][j]=m1[i][j]-m2[i][j];
                }
            }
            print(result);
        }
        else{
            System.out.println("matrics can't be subtracted");
        }
    
}
}