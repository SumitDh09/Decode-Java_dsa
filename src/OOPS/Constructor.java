package OOPS;

class Me
{
    private int age;
    private String name;

    public Me()
    {
        age=12;
        name="John";
        //System.out.println("in constructor");
    }
    public int getAge(){
        return age;
    }
    public void SetAge(int age)
    {
        this.age=age;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}

public class Constructor {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Me obj=new Me();
        Me obj1=new Me();
        System.out.println(obj.getName()+" : "+obj.getAge());

        obj.SetAge(30);
        obj.setName("Sumit");


        //System.out.println(obj.getName()+" : "+obj.getAge());
    }
}