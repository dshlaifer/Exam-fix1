/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if age >= 16;
        system.out.println("they can drive");
        else return(age - yearOfBirth);
        
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(double Total){
        Total = (unpaidhours + hourlyWage);
        Total = Total * 0.30;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        System.out.println("has recieved a wire transfer of");
        (Fullname + "" + Total);
        unpaidhours = 0.0;
    }
}