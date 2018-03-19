package course.practice.section7.class46;

/***
 * Sequence of data type of arguments
 */
public class ClassOverloading3 {

    public static void main(String[] args){
        increaseSeatHeight("prueba1",20);
        increaseSeatHeight(10,"prueba2");

    }

    public static void increaseSeatHeight(String var1, int var2){
        System.out.println("I am the first overload ");

    }

    public static void increaseSeatHeight( int var2, String var1){
        System.out.println("I am the second overload ");

    }

}
