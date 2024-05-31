package package5;

public class Handle {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass()+e.getMessage());
        }
        System.out.println("Hello world");
    }
}
