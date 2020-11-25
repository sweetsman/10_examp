package example;
//class UseBMIClass
public class e3 {
    public static void main(String[] args){
        e4 bmi1=new e4("Kim Yang",18,145,70);
        System.out.println("The BMI for " +bmi1.getName()+"is "
        +bmi1.getBMI()+" "+bmi1.getStatus());
        e4 bmi2 =new e4("Susan King",215,70);
        System.out.println("The BMI for " +bmi2.getName()+"is "
                +bmi2.getBMI()+" "+bmi2.getStatus());
    }
}
