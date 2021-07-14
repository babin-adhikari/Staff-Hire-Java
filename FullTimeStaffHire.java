
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Islington)
 * @version (0.1)
 */
//class FullTimeStaffHire which is a daughter class of parent class StaffHire
public class FullTimeStaffHire extends StaffHire{
    //declaration of instance variables of FullTimeStaffHire class
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    //constructor FullTimeStaffHire that accepts the variables from the user and initialized them 
    public FullTimeStaffHire(int vacancyNo, String jobType, String designation,int salary, int workingHour){
        //calling the attributes of the parent StaffHire class  
        super(vacancyNo, designation, jobType);
        this.workingHour=workingHour;     
        this.salary=salary;
        // setting the remaining variables as null because they are initialized in the fullHire Class
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
    }
    //getter method for the different variables
    public int getSalary(){
        return salary;
    }
    public String getWorkingHour(){
        return staffName;
    }
    public String getStaffName(){
        return staffName;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    public String getQualification(){
        return appointedBy;
    }
    public boolean getJoined(){
        return joined;
    }
    // setter method to initialize the salary if the joined equals to false
    public void setSalary(int salary){
        if(joined==false){
            this.salary=salary;
        }
        else{
            System.out.println("It's not possible to change the salary");
        }
    }
    // setter method to initialize the workingHour
    public void setWorkingHour(int workingHour){
        this.workingHour=workingHour;
    }
    // method to initialize the attributes and change the value of joined if joined equals to false 
    public void fullHire(String staffName, String joiningDate, String qualification, String appointedBy){
        if (joined==false){
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            System.out.println("Staff has been hired");
            joined=true;            
        }
        else{
            System.out.println(staffName+" has already been hired on date "+joiningDate);            
        }        
    }
    // method to display information about hte FullTimeStaffHire class
    public void displayInformation(){
        super.displayInformation();
        //calling the attributes of the parent StaffHire class  
        if(joined == true){
            // display information if the joined equals to true
            System.out.println("---*---*---*---*---*---");
            System.out.println("Staff name : "+staffName);
            System.out.println("Joined Date : "+joiningDate);
            System.out.println("Salary : "+salary);
            System.out.println("Working Hour's : "+workingHour);
            System.out.println("Qualification : "+qualification);
            System.out.println("---*---*---*---*---*---");
        }
    }
}