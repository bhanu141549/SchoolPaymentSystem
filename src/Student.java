public class Student {
//  track of student details
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


// To create a new Student using the Constructor 
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 110000;
    }
// updates the grade of the student
    public void setGrade(int grade){
        this.grade = grade;
    }
// return the student Id
    public int getId(){
        return id;
    }
// return the name of the student
    public String getName(){
        return name;
    }

// return the student grade
    public int getGrade(){
    return grade;
    }
// updates the fee of the student
    public  void paysFees(int fees){
        feesPaid  += fees;
        School.updateTotalMoneyEarned(feesPaid);
    } 

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public  String toString(){
        return "Student's Name  : " + name + " "+
        " Total fee paid till now : " + feesPaid; 
    }

}