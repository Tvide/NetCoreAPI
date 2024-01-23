import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        double a,b,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a:");
        a=sc.nextDouble();
        System.out.println("nhap b:");
        b=sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("pt vo so nghiem");
            } else{
                System.out.println("pt vo nghiem");
            }
        }else{
            x=-b / a;
            System.out.println("nghiem cur pr la:"+ x);
        }
        sc.close();
    }
}