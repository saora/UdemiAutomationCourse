package course.practice.section7.class51;

public class RunTimeException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        try {
            c = a / b;

            System.out.println("The result is: " + c);

        }
    catch(ArithmeticException e){
            System.out.println(e.getMessage());
           // System.out.println(e.getCause());

    }

    int numbers[]={1,2,3};
    try {
        for (int i = 0; i <= 3; i++) {
            System.out.println(numbers[i]);


        }
    }catch (Exception e){
        System.out.println("There is not index available after 2");
        System.out.println(e.getMessage());
    }

}}
