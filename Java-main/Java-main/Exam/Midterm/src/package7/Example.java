package package7;

class Finalize {
    int mirror(int a){
        return a;
    }
}

public class Example extends Finalize{
    int mirror(int a){
        return a*2;
    }

    public static void main(String[] args) {
        Example f1= new Example();
        System.out.println(f1.mirror(10));;
    }
}