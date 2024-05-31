package package4;
import java.util.InputMismatchException;
import java.util.Scanner;
class Number {
    int x,y,z;
    public Number(int a,int b,int c){
        this.x=a;
        this.y=b;
        this.z=c;
    }
    int getMax(){
        if(x>y && x>z){
            return x;
        }else if(y>x && y>z){
            return y;
        }else{
            return z;
        }

    }
}
public class NumberDemo extends Number{
    public NumberDemo(int a, int b, int c) {
        super(a, b, c);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0;
        try {
            System.out.println("Enter a,b,c");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println(e.getClass()+e.getMessage());
        }
        if(a!=0 && b!=0 && c!=0){
            NumberDemo num= new NumberDemo(a,b,c);
            System.out.println(num.getMax()+" is the largest value");
        }else{
            System.out.println("Enter valid number!");
        }
    }
}