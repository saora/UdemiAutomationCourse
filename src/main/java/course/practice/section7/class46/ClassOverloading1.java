package course.practice.section7.class46;

/***
 * Different number of parameters in argument list
 */

public class ClassOverloading1 {

    public static void main(String[] args){
        increaseSeatHeight(10);
        increaseSeatHeight(20,false);

    }

    public static void increaseSeatHeight(int heightToIncrease){
        System.out.println("Increased seat height by "+heightToIncrease+" Inches");
    }

    public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight){
        System.out.println("Increased seat height by "+heightToIncrease+" Inches");
        if(rememberHeight){
            System.out.println("Your selection is saved");
        }else{
            System.out.println("Your selection is not saved");
        }
    }

}
