/** 
 * Write a description of class INGNepal
 * 
 * @author (Babin Adhikari) 
 * @version (0.1) 
 */ 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class INGNepal implements ActionListener 
{

    private String jobType,shifts;

    JPanel pnlHeading,pnlBody,pnlTop,pnlBottom,pnlFooter;

    JFrame mainFrame, fullTimeFrame,partTimeFrame;

    JLabel lblHeading,lblVacancyNumberApnt, lblVacancyNumber, lblDesignation,lblJobType, lblSalary, lblWorkingHour
    , lblStaffName, lblQualification, lblAppointedBy,lblWagesPerHour,lblShift,lblJoiningDate;

    JTextField txtVacancyNumber,txtVacancyNumberAppoint, txtDesignation, txtSalary, txtWorkingHour,txtStaffName,txtQualification,
    txtJoiningDate,txtAppointedBy, txtWagesPerHour,txtTerminate;

    JRadioButton rbtnDay,rbtnNight,rbtnFull,rbtnPart;

    JButton btnForFullTimeStaff, btnForPartTimeStaff, btnAddVacancy,btnAppoint,btnTerminate,btnDisplay,btnClear;

    //font
    Font heading = new Font(null,Font.PLAIN,24);

    Font button = new Font("New Courier",Font.BOLD,18);

    Font normal = new Font("Arial",Font.PLAIN,18);

    ArrayList<StaffHire> list = new ArrayList<StaffHire>();
    //main method
    public static void main(String[] args) 
    {
        new INGNepal();

    }
    
    //ING Nepal method that contains 
    private INGNepal() 
    {
        // Heading Panel

        //Main Frame 
        mainFrame = new JFrame("ING Nepal");
        mainFrame.setSize(600, 365);
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);

        //Heading Panel
        pnlHeading = new JPanel();
        pnlHeading.setBackground(Color.LIGHT_GRAY);
        pnlHeading.setLayout(null);
        pnlHeading.setSize(600,60);
        mainFrame.add(pnlHeading);

        //Body Panel
        pnlBody = new JPanel();
        pnlBody.setBackground(Color.BLUE);
        pnlBody.setLayout(null);
        pnlBody.setSize(600, 330);
        mainFrame.add(pnlBody);

        //Labels And Buttons
        lblHeading = new JLabel("ING NEPAL");
        lblHeading.setBounds(225, 10, 550, 50);
        lblHeading.setFont(heading);
        pnlHeading.add(lblHeading);

        btnForFullTimeStaff = new JButton("For Full Time Staff");
        btnForFullTimeStaff.setBounds(50,95,500, 50);
        btnForFullTimeStaff.setFont(button);
        pnlBody.add(btnForFullTimeStaff);
        btnForFullTimeStaff.addActionListener(this);

        btnForPartTimeStaff = new JButton("For Part Time Staff");
        btnForPartTimeStaff.setBounds(50,170, 500, 50);
        btnForPartTimeStaff.setFont(button);
        pnlBody.add(btnForPartTimeStaff);
        btnForPartTimeStaff.addActionListener(this);

        btnDisplay = new JButton("Display All Records");
        btnDisplay.setBounds(50,245, 500, 50);
        btnDisplay.setFont(button);
        pnlBody.add(btnDisplay);
        btnDisplay.addActionListener(this);

        mainFrame.setVisible(true);

    }
    
    //full time frame to add vacancy and appoint full time 
    public void fullTimeFormGUI()
    {
        // Full Time Frame
        fullTimeFrame = new JFrame("Staff Hire");
        fullTimeFrame.setSize(750,530);
        fullTimeFrame.setLayout(null);
        fullTimeFrame.setLocationRelativeTo(null);

        //Heading Panel
        pnlHeading = new JPanel();
        pnlHeading.setBackground(Color.LIGHT_GRAY);
        pnlHeading.setLayout(null);
        pnlHeading.setSize(750, 70);
        fullTimeFrame.add(pnlHeading);

        //Top Panel
        pnlTop = new JPanel();
        pnlTop.setBackground(Color.CYAN);
        pnlTop.setLayout(null);
        pnlTop.setSize(750,245);
        fullTimeFrame.add(pnlTop);

        //Bottom Panel
        pnlBottom = new JPanel();
        pnlBottom.setBackground(Color.ORANGE);
        pnlBottom.setLayout(null);
        pnlBottom.setSize(750,420);
        fullTimeFrame.add(pnlBottom);

        //Footer Panel
        pnlFooter = new JPanel();
        pnlFooter.setBackground(Color.YELLOW);
        pnlFooter.setLayout(null);
        pnlFooter.setSize(750,495);
        fullTimeFrame.add(pnlFooter);

        //Heading For Full Time
        lblHeading = new JLabel("For Full Time");
        lblHeading.setBounds(325,10, 200, 50);
        lblHeading.setFont(heading);
        pnlHeading.add(lblHeading);

        //Add Vacancy For Full Time
        lblVacancyNumber = new JLabel("Vacancy Number");
        lblVacancyNumber.setBounds(50,95,150,25);
        lblVacancyNumber.setFont(normal);
        pnlTop.add(lblVacancyNumber);

        txtVacancyNumber = new JTextField();
        txtVacancyNumber.setBounds(200, 95, 150, 25);
        pnlTop.add(txtVacancyNumber);

        lblDesignation = new JLabel("Designation:");
        lblDesignation.setBounds(400, 95, 150, 25);
        lblDesignation.setFont(normal);
        pnlTop.add(lblDesignation);

        txtDesignation = new JTextField();
        txtDesignation.setBounds(550, 95, 150, 25);
        pnlTop.add(txtDesignation);

        lblJobType = new JLabel("Job Type:");
        lblJobType.setBounds(50, 145, 90, 25);
        lblJobType.setFont(normal);
        pnlTop.add(lblJobType);

        //Job Type Radio Button
        rbtnFull = new JRadioButton("FullTime");
        rbtnFull.setBounds(140,145 , 100, 25);
        rbtnFull.setSelected(true);
        rbtnFull.setFont(normal);
        rbtnFull.setBackground(Color.CYAN);
        pnlTop.add(rbtnFull);

        rbtnPart = new JRadioButton("PartTime");
        rbtnPart.setBounds(240, 145, 100, 25);
        rbtnPart.setFont(normal);
        rbtnPart.setBackground(Color.CYAN);
        pnlTop.add(rbtnPart);

        ButtonGroup shift = new ButtonGroup();
        shift.add(rbtnFull);
        shift.add(rbtnPart);

        lblSalary = new JLabel("Salary:");
        lblSalary.setBounds(400, 145, 150, 25);
        lblSalary.setFont(normal);
        pnlTop.add(lblSalary);

        txtSalary = new JTextField();
        txtSalary.setBounds(550, 145, 150, 25);
        pnlTop.add(txtSalary);

        lblWorkingHour = new JLabel("Working Hour");
        lblWorkingHour.setBounds(50, 195,150, 25);
        lblWorkingHour.setFont(normal);
        pnlTop.add(lblWorkingHour);

        txtWorkingHour = new JTextField();
        txtWorkingHour.setBounds(200, 195, 150, 25);
        pnlTop.add(txtWorkingHour);

        // Button For Adding Full Time Vacancy
        btnAddVacancy = new JButton("Add Full Time Vacancy");
        btnAddVacancy.setBounds(400,195,300,25);
        btnAddVacancy.setFont(button);
        pnlTop.add(btnAddVacancy);
        btnAddVacancy.addActionListener(this);

        //Appoint For Full Time Staff Hire
        lblVacancyNumberApnt=new JLabel("Vacancy Number:");
        lblVacancyNumberApnt.setBounds(50,270,150,25);
        lblVacancyNumberApnt.setFont(normal);
        pnlBottom.add(lblVacancyNumberApnt);

        txtVacancyNumberAppoint=new JTextField();
        txtVacancyNumberAppoint.setBounds(200,270,150,25);
        pnlBottom.add(txtVacancyNumberAppoint);

        lblStaffName=new JLabel("Staff Name:");
        lblStaffName.setBounds(400,270,150,25);
        lblStaffName.setFont(normal);
        pnlBottom.add(lblStaffName);

        txtStaffName=new JTextField();
        txtStaffName.setBounds(550,270,150,25);
        pnlBottom.add(txtStaffName);

        lblJoiningDate=new JLabel("Joined Date:");
        lblJoiningDate.setBounds(50,320,150,25);
        lblJoiningDate.setFont(normal);
        pnlBottom.add(lblJoiningDate);

        txtJoiningDate=new JTextField();
        txtJoiningDate.setBounds(200,320,150,25);
        lblDesignation.setFont(normal);
        pnlBottom.add(txtJoiningDate);

        lblQualification=new JLabel("Qualification:");
        lblQualification.setBounds(400,320,150,25);
        lblQualification.setFont(normal);
        pnlBottom.add(lblQualification);

        txtQualification=new JTextField();
        txtQualification.setBounds(550,320,150,25);
        lblDesignation.setFont(normal);
        pnlBottom.add(txtQualification);

        lblAppointedBy=new JLabel("Appointed By:");
        lblAppointedBy.setBounds(50,370,150,25);
        lblAppointedBy.setFont(normal);
        pnlBottom.add(lblAppointedBy);

        txtAppointedBy=new JTextField();
        txtAppointedBy.setBounds(200,370,150,25);
        lblDesignation.setFont(normal);
        pnlBottom.add(txtAppointedBy);

        // Button to Appoint Full Time Staff
        btnAppoint=new JButton("Appoint Full Time");
        btnAppoint.setBounds(400,370,300,25);
        btnAppoint.setFont(button);
        pnlBottom.add(btnAppoint);
        btnAppoint.addActionListener(this);

        // Button To clear the Text Fields
        btnClear = new JButton("Clear");
        btnClear.setBounds(50, 445, 150, 25);
        btnClear.setFont(button);
        pnlFooter.add(btnClear);
        btnClear.addActionListener(this);

        fullTimeFrame.setVisible(true);
    }   
    
    //part time frame to add part time vacancy, appoint part time staff and terminate part time staff
    public void partTimeFormGUI()
    {

        //Part Time Frame
        partTimeFrame = new JFrame("For Part Time");
        partTimeFrame.setSize(750, 630);
        partTimeFrame.setLayout(null);
        partTimeFrame.setLocationRelativeTo(null);
        partTimeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        partTimeFrame.setLocationRelativeTo(null);

        //Heading Panel
        pnlHeading = new JPanel();
        pnlHeading.setBackground(Color.LIGHT_GRAY);
        pnlHeading.setLayout(null);
        pnlHeading.setSize(750, 70);
        partTimeFrame.add(pnlHeading);

        //Top Panel
        pnlTop = new JPanel();
        pnlTop.setBackground(Color.CYAN);
        pnlTop.setLayout(null);
        pnlTop.setSize(750,295);
        partTimeFrame.add(pnlTop);

        //Bottom Panel
        pnlBottom = new JPanel();
        pnlBottom.setBackground(Color.ORANGE);
        pnlBottom.setLayout(null);
        pnlBottom.setSize(750,470);
        partTimeFrame.add(pnlBottom);

        //Footer Panel
        pnlFooter = new JPanel();
        pnlFooter.setBackground(Color.YELLOW);
        pnlFooter.setLayout(null);
        pnlFooter.setSize(750,595);
        partTimeFrame.add(pnlFooter);

        //Heading For Part Time
        lblHeading = new JLabel("For Part Time");
        lblHeading.setBounds(325, 10, 200, 50);
        lblHeading.setFont(heading);
        pnlHeading.add(lblHeading);

        //Add Vacancy For Part Time
        lblVacancyNumber = new JLabel("Vacancy Number");
        lblVacancyNumber.setBounds(50, 95,150, 25);
        lblVacancyNumber.setFont(normal);
        pnlTop.add(lblVacancyNumber);

        txtVacancyNumber = new JTextField();
        txtVacancyNumber.setBounds(200, 95, 150, 25);
        pnlTop.add(txtVacancyNumber);

        lblDesignation =new JLabel("Designation");
        lblDesignation.setBounds(400, 95, 150, 25);
        lblDesignation.setFont(normal);
        pnlTop.add(lblDesignation);

        txtDesignation = new JTextField();
        txtDesignation.setBounds(550,95, 150,25);
        pnlTop.add(txtDesignation);

        lblJobType =new JLabel("JobType:");
        lblJobType.setBounds(50, 145, 90, 25);
        lblJobType.setFont(normal);
        pnlTop.add(lblJobType);

        //Job Type Radio Button
        rbtnFull = new JRadioButton("FullTime");
        rbtnFull.setBounds(140, 145, 100, 25);
        rbtnFull.setFont(normal);
        rbtnFull.setBackground(Color.CYAN);
        pnlTop.add(rbtnFull);

        rbtnPart = new JRadioButton("PartTime");
        rbtnPart.setBounds(240, 145, 100, 25);
        rbtnPart.setSelected(true);
        rbtnPart.setFont(normal);
        rbtnPart.setBackground(Color.CYAN);
        pnlTop.add(rbtnPart);

        ButtonGroup jType = new ButtonGroup();
        jType.add(rbtnFull);
        jType.add(rbtnPart);

        lblWorkingHour =new JLabel("Working Hour");
        lblWorkingHour.setBounds(400, 145, 150, 25);
        lblWorkingHour.setFont(normal);
        pnlTop.add(lblWorkingHour); 

        txtWorkingHour = new JTextField();
        txtWorkingHour.setBounds(550, 145, 150, 25);
        pnlTop.add(txtWorkingHour);

        lblWagesPerHour =new JLabel("Wages Per Hour");
        lblWagesPerHour.setBounds(50, 195, 150, 25);
        lblWagesPerHour.setFont(normal);
        pnlTop.add(lblWagesPerHour); 

        txtWagesPerHour = new JTextField();
        txtWagesPerHour.setBounds(200, 195, 150, 25);
        pnlTop.add(txtWagesPerHour);

        lblShift = new JLabel("Shift");
        lblShift.setBounds(400, 195, 150, 25);
        lblShift.setFont(normal);
        pnlTop.add(lblShift);

        //Radio Buttons
        rbtnDay = new JRadioButton("Day");
        rbtnDay.setBounds(550, 195, 75,25);
        rbtnDay.setFont(normal);
        rbtnDay.setBackground(Color.CYAN);
        rbtnDay.setSelected(true);
        pnlTop.add(rbtnDay);

        rbtnNight = new JRadioButton("Night");
        rbtnNight.setBounds(625,195,75,25);
        rbtnNight.setFont(normal);
        rbtnNight.setBackground(Color.CYAN);
        pnlTop.add(rbtnNight);

        ButtonGroup shift = new ButtonGroup();
        shift.add(rbtnDay);
        shift.add(rbtnNight);

        //Button to add Part Time Vacancy
        btnAddVacancy = new JButton("Add Part Time Vacancy");
        btnAddVacancy.setBounds(50,245, 300,25);
        pnlTop.add(btnAddVacancy);
        btnAddVacancy.setFont(button);
        btnAddVacancy.addActionListener(this);

        //For Part Time Staff Hire
        lblVacancyNumberApnt = new JLabel("Vacancy Number");
        lblVacancyNumberApnt.setBounds(50,320,150,25);
        lblVacancyNumberApnt.setFont(normal);
        pnlBottom.add(lblVacancyNumberApnt);

        txtVacancyNumberAppoint = new JTextField();
        txtVacancyNumberAppoint.setBounds(200, 320, 150, 25);
        partTimeFrame.add(txtVacancyNumberAppoint);

        lblStaffName = new JLabel("Staff Name");
        lblStaffName.setBounds(400,320,150,25);
        lblStaffName.setFont(normal);
        pnlBottom.add(lblStaffName);

        txtStaffName = new JTextField();
        txtStaffName.setBounds(550, 320, 150, 25);
        pnlBottom.add(txtStaffName);

        lblJoiningDate = new JLabel("Joining Date");
        lblJoiningDate.setBounds(50, 370, 150, 25);
        lblJoiningDate.setFont(normal);
        pnlBottom.add(lblJoiningDate);

        txtJoiningDate = new JTextField();
        txtJoiningDate.setBounds(200, 370, 150, 25);
        pnlBottom.add(txtJoiningDate);

        lblQualification = new JLabel("Qualification");
        lblQualification.setBounds(400, 370,150, 25);
        lblQualification.setFont(normal);
        pnlBottom.add(lblQualification);

        txtQualification = new JTextField();
        txtQualification.setBounds(550, 370, 150, 25);
        pnlBottom.add(txtQualification);

        lblAppointedBy = new JLabel("Appointed By");
        lblAppointedBy.setBounds(50, 420, 150, 25);
        lblAppointedBy.setFont(normal);
        pnlBottom.add(lblAppointedBy);

        txtAppointedBy = new JTextField();
        txtAppointedBy.setBounds(200, 420, 150, 25);
        pnlBottom.add(txtAppointedBy);

        btnAppoint = new JButton("Appoint Part Time");
        btnAppoint.setBounds(400, 420, 300, 25);
        btnAppoint.setFont(button);
        pnlBottom.add(btnAppoint);
        btnAppoint.addActionListener(this);

        //Clear Button
        btnClear = new JButton("Clear");
        btnClear.setBounds(50, 495, 150, 25);
        btnClear.setFont(button);
        pnlFooter.add(btnClear);
        btnClear.addActionListener(this);

        // BUTTON FOR terminate, Clear, Display
        btnTerminate = new JButton("Terminate Vacancy No:");
        btnTerminate.setBounds(50, 545, 300, 25);
        btnTerminate.setFont(button);
        pnlFooter.add(btnTerminate);
        btnTerminate.addActionListener(this);

        txtTerminate = new JTextField();
        txtTerminate.setBounds(400, 545, 150, 25);
        pnlFooter.add(txtTerminate);

        partTimeFrame.setVisible(true);

    }
    
    // method to add full time vacancy
    private void fullTimeAddVacancy() 
    {   
        //try and catch block for exception handling
        try {
            //Checking for valid Text Fields
            boolean present = false;
            if(txtVacancyNumber.getText().equals("")|| txtDesignation.getText().equals("") || txtWorkingHour.getText().equals("") || txtSalary.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Field Cannot be left blank");
            }
            else {
                //for each loop to access object of list arrayList to check if the vacancy is duplicate
                for(StaffHire staff : list) {
                    if(staff.getVacancyNumber()==getVacancyNumber()) {
                        present = true;
                    }
                    else {
                        present = false;
                    }
                }
                if(present==false) {
                    // Checking for invalid Data entry
                    if(getWorkingHour()<=0 || getSalary()<=0) {
                        JOptionPane.showMessageDialog(null, "Invalid Data Entry!");
                    }
                    if(getJobType()=="Full Time") {
                        //Creating a Object of FullTimeStaffHire and adding it to the ArrayList
                        StaffHire objFullTimeStaffHire = new FullTimeStaffHire(getVacancyNumber(), getJobType(), getDesigation(), getSalary(), getWorkingHour());
                        list.add(objFullTimeStaffHire);
                        JOptionPane.showMessageDialog(null, "Full Time Vacancy Added!");
                    }
                    else if(getJobType()=="Part Time"){
                        JOptionPane.showMessageDialog(null, "Invalid job Type");
                        partTimeFormGUI();
                    }
                }
                else{
                    //Printing if Duplicate vacancy Exists
                    JOptionPane.showMessageDialog(null, "Duplicate Vacancy Number!","Duplicate!",JOptionPane.ERROR_MESSAGE);
                }
            }

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Invalid Data Entry","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    // part time to add part time vacancy 
    private void partTimeAddVacancy() 
    {   
        //try and catch block for exception handling
        try {
            // Checking for valid Text Fields
            if(txtVacancyNumber.getText().equals("") || txtDesignation.getText().equals("") || txtWorkingHour.getText().equals("") || txtWagesPerHour.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Field Cannot be left Blank");
            }
            else {
                boolean present = false;
                //for each loop to access the object of ArrayList list to check if the vacancy number is duplicate
                for(StaffHire staff : list) {
                    //Checking if vacancy form array list is equal to the text Field 
                    if(staff.getVacancyNumber()==getVacancyNumber()) {
                        present = true;
                    }
                    else {
                        present = false;
                    }

                }//Accepting Data if Vacancy Number is unique
                if(present==false) {
                    if(getWorkingHour()<=0 || getWagesPerHour()<=0) {
                        JOptionPane.showMessageDialog(null, "Invalid Data Entry!");
                    }
                    if(getJobType()=="Part Time") {
                        // Creating object for Part Time
                        StaffHire objPartStaffHire = new PartTimeStaffHire(getVacancyNumber(), getDesigation(), getJobType(), getWagesPerHour(), getWorkingHour(), getShifts());
                        list.add(objPartStaffHire);
                        JOptionPane.showMessageDialog(null, "Part Time Vacancy Added");
                    }
                    else if(getJobType()=="Full Time") {
                        JOptionPane.showMessageDialog(null, "Invalid Job Type");
                        fullTimeFormGUI();
                    }

                }
                else {
                    JOptionPane.showMessageDialog(null, "Duplicate Vacacny Number!");
                }

            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Invalid Data Entry","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // full time method to appoint full time staff
    private void fullTimeAppoint() 
    {   
        //try and catch block for exception handling
        try {
            //Checking If The text fields are blank or not
            if(txtVacancyNumberAppoint.getText().equals("") || txtStaffName.getText().equals("") || txtJoiningDate.getText().trim().equals("") || txtQualification.getText().trim().equals("") || txtAppointedBy.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Empty Data Fields");
            }
            else {
                boolean present=false;
                boolean check=false;
                //For each loop for the Object staff of ArrayList list which is of Staff Hire
                for(StaffHire staff:list) {
                    //Checking if txtField vacancy matches with the object on the Array List
                    if(staff.getVacancyNumber()==getVacancyNumberAppoint()) {
                        if(staff instanceof FullTimeStaffHire) {
                            //Object Downcasting
                            FullTimeStaffHire object =(FullTimeStaffHire) staff;
                            if(getJobType()=="Full Time") {
                                if(object.getJoined()==false) {
                                    object.fullHire(getStaffName(), getJoiningDate(), getQualification(), getAppointedBy());
                                    JOptionPane.showMessageDialog(null, "Staff Has been appointed Full Time!");
                                    present=true;
                                }
                                else {
                                    JOptionPane.showMessageDialog(null, "Staff has already been appointed!");
                                    present=true;
                                }

                            }
                            else if(getJobType()=="Part Time") {
                                JOptionPane.showMessageDialog(null, "The vacacny is of Full Time Staff!");
                                
                            }

                        }
                        else if(staff instanceof PartTimeStaffHire){
                            present=true;
                            check=true;
                        }
                    }
                }
                if(present==false) {
                    JOptionPane.showMessageDialog(null, "Vacacny doesn't exist");
                }
                if(check==true){
                    JOptionPane.showMessageDialog(null, "The Vacancy is Of Part Time Staff Only");
                }
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Invalid Data Entry","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // part time method to appoint part time staff
    private void partTimeAppoint() 
    {   
        //try and catch block for exception handling
        try {
            //Checking If The text fields are blank or not
            if(txtVacancyNumberAppoint.getText().equals("") || txtStaffName.getText().equals("") || txtJoiningDate.getText().trim().equals("") || txtQualification.getText().trim().equals("") || txtAppointedBy.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Empty Data Fields");
            }
            else {
                boolean present=false;
                boolean check = false;
                //For each loop for the Object staff of ArrayList list which is of Staff Hire
                for(StaffHire staff:list) {
                    //Checking if txtField vacancy matches with the object on the Array List
                    if(staff.getVacancyNumber()==getVacancyNumberAppoint()) {
                        if(staff instanceof PartTimeStaffHire) {
                            PartTimeStaffHire object =(PartTimeStaffHire) staff;
                            if(getJobType()=="Part Time") {
                                if(object.getJoined()==false) {
                                    object.partTimeHire(getStaffName(), getJoiningDate(), getQualification(), getAppointedBy());
                                    System.out.println("Staff has been Appointed");
                                    JOptionPane.showMessageDialog(null, "Staff Has been appointed Part Time!");
                                    present=true;
                                }
                                else {
                                    JOptionPane.showMessageDialog(null, "Staff has already been appointed!");
                                    present=true;
                                }

                            }
                            else if(getJobType()=="Full Time") {
                                JOptionPane.showMessageDialog(null, "The vacacny is of Part Time Staff!");
                                fullTimeFormGUI();
                            }

                        }
                        else if(staff instanceof FullTimeStaffHire){
                            present=true;
                            check=true;
                        }
                    }
                }
                if(present==false) {
                    JOptionPane.showMessageDialog(null, "Vacacny doesn't exist");
                }
                if(check==true){
                    JOptionPane.showMessageDialog(null, "The Vacancy is Of Full Time Staff Only");
                }
            }
        }catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null,"Invalid Data Entry","ERROR",JOptionPane.ERROR_MESSAGE);

        }
    }
    
    //method to terminate part time staff
    private void terminate() 
    {
        //Try catch for error Handling
        try {
            boolean present =false;
            //For each loop to get Objects from list
            for(StaffHire staff:list) {

                //Checking if object is object of PartTimeStaffHire 
                if(staff instanceof PartTimeStaffHire) {
                    PartTimeStaffHire call =(PartTimeStaffHire) staff;
                    //Checking the Vacancy No.
                    if(staff.getVacancyNumber()==getTerminateNo()) {
                        //Checking if the staff is terminated or not 
                        //DownCasting object to call to PartTimeStaffHire to call method from PartTimeStaffHire
                        if(call.getTerminated()==false) {
                            call.terminate();
                            JOptionPane.showMessageDialog(null, "Terminated!");
                            present = true;
                        }
                        else if(call.getTerminated()==true) {
                            JOptionPane.showMessageDialog(null, "Staff Has already been terminated!");
                            present=true;
                        }
                        else {
                            present=true;
                        }
                    }
                }
            }
            if(present=false) {
                JOptionPane.showMessageDialog(null, "Vacancy Doesn't exist");
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Invalid Data Entry","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //method to display all records
    private void displayAll()
    {
        if(list.size()!=0) {
            for(StaffHire staff:list) {
                //checking if the staff is of Part Time
                if(staff instanceof PartTimeStaffHire) {
                    System.out.println("Part Time Staff");
                    StaffHire partTimeStaff = (PartTimeStaffHire) staff;
                    partTimeStaff.displayInformation();

                }
                //checking if the staff is of Full Time
                else if(staff instanceof FullTimeStaffHire){
                    System.out.println("Full Time Staff");
                    StaffHire fullTimeStaff = (FullTimeStaffHire) staff;
                    fullTimeStaff.displayInformation();
                }

            }
        }
        else {
            JOptionPane.showMessageDialog(null, "There are no records to be Displayed");
        }
    }
    
    //action listener for the functionality of buttons and GUI
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btnForFullTimeStaff){
            fullTimeFormGUI();
        }
        else if(e.getSource()==btnForPartTimeStaff){
            partTimeFormGUI();
        }
        //button for clear
        else if(e.getSource()==btnClear) {
            if(getJobType() == "Full Time") {
                txtVacancyNumber.setText("");
                txtDesignation.setText("");
                txtSalary.setText("");
                txtWorkingHour.setText("");
                txtVacancyNumberAppoint.setText("");
                txtStaffName.setText("");
                txtJoiningDate.setText("");
                txtQualification.setText("");
                txtAppointedBy.setText("");
            }
            else if (getJobType()=="Part Time"){
                txtVacancyNumber.setText("");
                txtDesignation.setText("");
                txtWorkingHour.setText("");
                txtWagesPerHour.setText("");
                txtVacancyNumberAppoint.setText("");
                txtStaffName.setText("");
                txtJoiningDate.setText("");
                txtQualification.setText("");
                txtAppointedBy.setText("");
                txtTerminate.setText("");
            }
        }
        //Button to display Records
        else if(e.getSource()==btnDisplay) {
            displayAll();   
        }
        //Button to add Vacancy
        else if(e.getSource()==btnAddVacancy) {
            if(getJobType()=="Full Time") {
                fullTimeAddVacancy();
            }
            else if(getJobType()=="Part Time") {
                partTimeAddVacancy();
            }
        }
        //button to appoint
        else if(e.getSource()==btnAppoint) {
            if(getJobType()=="Full Time") {
                fullTimeAppoint();
            }
            else if(getJobType()=="Part Time") {
                partTimeAppoint();
            }
        }
        //button to terminate part time staff
        else if(e.getSource()==btnTerminate){
            terminate();
        }
    }
    //Getter And Setter method for the Text Fields, buttons

    private int getVacancyNumber() 
    {
        int vno = Integer.parseInt(txtVacancyNumber.getText().trim());
        return vno;
    }

    private int getVacancyNumberAppoint() 
    {
        int vno = Integer.parseInt(txtVacancyNumberAppoint.getText().trim());
        return vno;
    }

    private String getDesigation() 
    {
        String designation = txtDesignation.getText().trim();
        return designation;
    }

    private String getJobType() 
    {

        if(rbtnFull.isSelected()) {
            jobType="Full Time";
        }
        else if(rbtnPart.isSelected()) {
            jobType="Part Time";
        }
        return jobType;
    }

    private int getWorkingHour() 
    {
        int hour = Integer.parseInt(txtWorkingHour.getText().trim());
        return hour;
    }

    private int getSalary() 
    {
        int salary = Integer.parseInt(txtSalary.getText().trim());
        return salary;
    }

    private int getWagesPerHour() 
    {
        int wagePerHour = Integer.parseInt(txtWagesPerHour.getText().trim());
        return wagePerHour;
    }

    private String getStaffName() 
    {
        String name = txtStaffName.getText().trim();
        return name;
    }

    private String getJoiningDate() 
    {
        String date = txtJoiningDate.getText().trim();
        return date;
    }

    private String getQualification() 
    {
        String qualification = txtQualification.getText().trim();
        return qualification;
    }

    private String getAppointedBy() 
    {
        String appointedBy = txtAppointedBy.getText().trim();
        return appointedBy;
    }

    private String getShifts() 
    {
        if(rbtnDay.isSelected()) {
            shifts="Day";
        }
        else if(rbtnNight.isSelected()) {
            shifts="Night";
        }
        return shifts;
    }

    private int getTerminateNo() 
    {
        int terminateNo = Integer.parseInt(txtTerminate.getText().trim());
        return terminateNo;
    }
}
