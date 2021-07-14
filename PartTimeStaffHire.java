
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Islington)
 * @version (0.1)
 */
// Class PartTimeStaffHire which is a daughter class of the parent class StaffHire
public class PartTimeStaffHire extends StaffHire
{
    //declaration of instance variables of the PartTimeStaffHire Class
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean terminated;
    private boolean joined;
    //constructor PartTimeStaffHire that accepts the variables from the user and initialized them
    public PartTimeStaffHire(int vacancyNo, String designation, String jobType, int wagesPerHour, int workingHour, String shifts){
        //calling the attributes of the parent StaffHire class   
        super(vacancyNo, designation, jobType);
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        // setting the remaining variables as null because they are initialized in the PartTimeHire Class
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined= false;
        terminated=false;
    }
    // getter methods for the different variables
    public int getWorkingHour(){
        return workingHour;
    }
    public int getWagesPerHour(){
        return wagesPerHour;
    }
    public String getStaffName(){
        return staffName;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    public String getqualification(){
        return qualification;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    public String getShifts(){
        return shifts;
    }
    public boolean getTerminated(){
        return terminated;
    }
    public boolean getJoined(){
        return joined;
    }
    //setter method that initialize the shifts if the joined variable is false 
    public void setShifts(String shifts){
        if(joined == false){
            this.shifts=shifts;
        }        
        else{
            System.out.println("Cannot change shifts");
        }
    }
    // method to initialize the attributes and change the value of joined and terminated if joined equals to false 
    public void partTimeHire(String staffName,String joiningDate, String qualification, String appointedBy){
        if(joined == false){
            this.staffName=staffName;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
            System.out.println(staffName+" Staff has been hired on " +joiningDate);
        }
        else{
            System.out.println(staffName+" has already been hired "+joiningDate+" by " +appointedBy);
        }
    }
    // method to terminate the values if the terminated equals to false
    public void terminate(){
        if(terminated==false){
            staffName="";
            joiningDate="";
            qualification="";
            appointedBy="";
            joined=false;
            terminated=true;
            System.out.println("Staff has been terminated");
        }
        else{
            System.out.println("The staff has already been terminated");
        }        
    }
    // method to display information of the attributes of this class
    public void displayInformation(){
        super.displayInformation();
        //calling the attributes of the parent StaffHire class  
        if(joined == true){
            // if joined = true display the following
            System.out.println("---*---*---*---*---*---");
            System.out.println("Staff Nme : "+staffName);
            System.out.println("Joined Date : "+joiningDate);
            System.out.println("Working Hours : "+workingHour);
            System.out.println("Wage Per Hour : "+wagesPerHour);
            System.out.println("Income per Day : "+(workingHour*wagesPerHour));
            System.out.println("Qualification : "+qualification);
            System.out.println("Appointed By : "+appointedBy);
            System.out.println("---*---*---*---*---*---");
        }
    }
}
