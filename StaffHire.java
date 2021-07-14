
/**
 * Write a description of class StaffHire here.
 *
 * @author (Islington)
 * @version (0.1)
 */
public class StaffHire
{
    //declaration instance variables of the staffHire 
    private int vacancyNo;
    private String designation;
    private String jobType;
    // the attributes are initialized in the constructor
    public StaffHire(int vacancyNo,String designation, String jobType ){
        this.vacancyNo=vacancyNo;
        this.designation=designation;
        this.jobType=jobType;
    }
    //getter and setter methods of the attributes
    public int getVacancyNumber(){
        return vacancyNo;    
    }
    public void setVacancyNumber(int vacancyNo){
        this.vacancyNo=vacancyNo;
    }
    public String getdesignation(){
        return designation;    
    }
    public void setdesignation(String designation){
        this.designation=designation;
    }
    public String getjobType(){
        return jobType;    
    }
    public void setjobType(String jobType){
        this.jobType=jobType;
    }
    //Display the Information of the attributes
    public void displayInformation(){
        System.out.println("---*---*---*---*---*---");
        System.out.println("Vacancy number : "+vacancyNo);
        System.out.println("Designation : "+designation);
        System.out.println("Job type : "+jobType);
        System.out.println("---*---*---*---*---*---");
    }
}

