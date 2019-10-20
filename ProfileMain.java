import java.util.ArrayList;
import java.util.Arrays;

public class ProfileMain {
    public static void main(String[] args) {

        Profile user  = new Profile("Bogdan","Lazar",3,5,1999,"Bucuharest","Romania","Romanian","lazarbogdan90@yahoo.com",new String[]{"gfg","dgfh","dfsg"});

        System.out.println(user.getName());
        System.out.println(user.getDateOfBirth());
        System.out.println(user.getTownOfResidence());
        System.out.println(user.getCountryOfResidence());
        System.out.println(user.getNationality());
        System.out.println(user.getE_mail());
        System.out.println(Arrays.toString(user.getIntersts()));


    }
}
