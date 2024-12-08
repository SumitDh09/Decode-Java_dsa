package AccessModifiers;

class ModifierDefault{
    String name = "Sumit";
    void display(){
        System.out.println("Hello "+name);
    }
}
public class Test {



    public static void main(String[] args) {
        ModifierDefault modifierDefault = new ModifierDefault();
        modifierDefault.display();
        System.out.println(modifierDefault.name);
    }
}
