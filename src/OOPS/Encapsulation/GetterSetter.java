package OOPS.Encapsulation;

class men {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;

    }

    public void setName(String n) {
        name = n;
    }

}


    public class GetterSetter{
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Sumit");

        System.out.println(obj.getName()+" :"+ obj.getAge());
    }
}


