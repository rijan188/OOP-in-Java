package set;
interface A{
    public void printx();
}
interface B{
    public void printy();
}
public class Multiple implements A,B{
    @Override
    public void printx() {
        System.out.println("This is x");
    }

    @Override
    public void printy() {
        System.out.println("This is y");
    }

    public static void main(String[] args) {
        Multiple mul=new Multiple();
        mul.printx();
        mul.printy();
    }
}
