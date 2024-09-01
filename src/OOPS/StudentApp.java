package OOPS;

class Student
{
    //Data-Security
    private int rollNo;
    private String name;
    private String address;

    //setter methods
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    public void setName(String name){
        this.name =name;
    }

    public void setAddress(String address){
        this.address =address;
    }

    //getter methods
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}

public class StudentApp
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        //calling setter methods
        s1.setRollNo(10);
        s1.setName("sachin");
        s1.setAddress("MI");

        //calling getter methods
        System.out.println("RollNo  is :: "+s1.getRollNo());
        System.out.println("Name    is :: "+s1.getName());
        System.out.println("Address is :: "+s1.getAddress());

    }
}
