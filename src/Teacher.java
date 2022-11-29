public class Teacher {
    
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    //creates a new Teacher Object
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    //returns the id of the teacher
    public int getId(){
        return id;
    }
    //returns the name of teacher
    public String getName(){
        return name;
    }
    //returns the salary
    public int getSalary(){
        return salary;
    }
    //To update the salary of the teacher
    public void setSalary(int salary){
        this.salary = salary;
    }


    public void recieveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public  String toString(){
        return "Teachers's Name  : " + name + " "+
        " Total salary earned till now : " + salaryEarned; 
    }


}
