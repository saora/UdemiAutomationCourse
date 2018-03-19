package course.practice.section7.class46;

/***
 * Difference in data type of argument
 */
public class ClassOverloading2 {
    public static void main(String []args){
        increaseSeatHeight(2);
        increaseSeatHeight("dos");
    }

    public static void increaseSeatHeight(int heightToIncrease){
        System.out.println("Increased seat height by "+heightToIncrease+" inches. I am the Integer one");
    }
    public static void increaseSeatHeight(String heightToIncrease){
        System.out.println("Increased seat height by "+heightToIncrease+" inches. I am the String one");
    }
}
