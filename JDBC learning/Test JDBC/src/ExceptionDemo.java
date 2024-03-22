public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int a = 10 / 0;
            System.out.println("Hello");
        }catch (Exception err){
            System.out.println(err.getMessage());
        }
    }
}
