package Methods;


class computer{

    public  void playMusic()
    {
        System.out.println("Music Playing..");
    }
    public String getMePen(int cost) {
        if (cost >= 10)
            return "Pen";

        else
            return "Nothing";
    }
}

public class Demo{
    public static void main(String[] args) {
        computer  obj = new computer();
        obj.playMusic();
        String str = obj.getMePen(12);
        System.out.println(str);
    }




}
