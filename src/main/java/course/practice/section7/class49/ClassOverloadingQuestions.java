package course.practice.section7.class49;

public class ClassOverloadingQuestions {
    public static void main(String [] args){
        increaseSeatHeight("uno",1);
        increaseSeatHeight("dos","tres");

    }

    public static void increaseSeatHeight(String var1, int var2){
        System.out.println("I am the first Overload.");
    }
    public static void increaseSeatHeight(String var1, String var2){
        System.out.println("I am the second Overload.");
    }
}
