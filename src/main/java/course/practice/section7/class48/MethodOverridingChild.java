package course.practice.section7.class48;

/****
 * Rules
 * 1. Argument list.: Arguments list in the overriding methos should be same as parent class overridden mothod
 * 2. Access modifier: Access modifier of the overriding method cannot be more restrictive than the overriding method
 * 3. Private: static and final method be overridden as they are local to the class
 */
public class MethodOverridingChild extends MethodOverridingParent{
    public static void main(String []args){
        MethodOverridingParent c1 = new MethodOverridingChild();
        c1.increaseSpeed();
        c1.engineStart(2);
    }

    @Override
    public void engineStart(int cyl){
        //super.engineStart(2);
        System.out.println("I am from the child class");
    }

    public static void overRidingExample(){
        System.out.println("I am an overriding example");
    }
}
