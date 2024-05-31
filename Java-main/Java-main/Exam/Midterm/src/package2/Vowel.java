package package2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="",s2="";
        try{
        System.out.println("Enter a name");
        s1=sc.next();}
        catch (InputMismatchException e){
            System.out.println(e.getClass()+e.getMessage());
        }
        int count=0,num=s1.length();

        for(int i=0;i<num;i++){
            char c=s1.charAt(i);
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||
                    c=='o'||c=='O'||c=='u'||c=='U'){
                count=count+1;
                s2=s2+c;
            }
        }
        System.out.println(s1+" has "+count+" vowels ");
        System.out.println("The vowels are "+s2);
    }
}
