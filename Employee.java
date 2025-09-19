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
    private double Total;
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
    private void setunpaidHours(double hoursWorked, double hoursPaid){ // question 11
        this.unpaidHours = hoursWorked - hoursPaid; 
    }
    private double getunpaidHours(){  // question 11
        return unpaidHours;
    }
    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){  //question 12
        int age = calculateAge(2025);
        if (age >= 16) {
        System.out.println("they can drive");
        return true; }
        else { 
        int yearsMissing = 16 - age;
        System.out.println("They cannot drive" + yearsMissing + "more year" + (yearsMissing > 1));
        return false;}
        
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(double Total){  // question 13
        Total = unpaidHours * hourlyWage;
        Total = Total * 0.70;
        return Total;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){  // question 14
        System.out.println("has recieved a wire transfer of");
        System.out.println(fullname + ":$" + Total);
        unpaidHours = 0.0;
    }
}