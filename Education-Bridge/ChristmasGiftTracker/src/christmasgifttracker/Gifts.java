package christmasgifttracker;

/**
 *
 * @author azizi
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Gifts {
    public static void main(String[] args) {
        
        String recipient, idea, url;
        Scanner in = new Scanner(System.in);
        Gift temp;
           
        ArrayList<Gift> xmaslist = new ArrayList<>();

        for( int i =0; i <5; i++){
            
            System.out.println("enter your receiptent name");
            recipient = in.next();
            
            System.out.println("enter your idea ");
            idea = in.next();
            
            System.out.println("enter your url");
            url= in.next();
            
            temp = new Gift(recipient, idea, url);
            
            xmaslist.add(temp);
        }
        
        System.out.println("empty? " + xmaslist.isEmpty());
        System.out.println("size? " + xmaslist.size());

        temp = new Gift("Ann", "test a", "www");
        xmaslist.add(2, temp);
        System.out.println("index 2: " + xmaslist.get(2));
        
        System.out.println("Display all items");
        for (Gift obj:xmaslist) {
            System.out.println(obj.toString());
        }
    }
}