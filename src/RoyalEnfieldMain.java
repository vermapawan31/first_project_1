import java.util.ArrayList;

public class RoyalEnfieldMain {

    public static void main(String[] args) {
        RoyalColor rc= new RoyalColor("blue","2.90");
        RoyalColor rc1= new RoyalColor("black","2.40");
        RoyalEnfield re= new RoyalEnfield(1, "classic");
        re.addcolor(rc);
        re.addcolor(rc1);
        System.out.println(re);
    }
}
