import java.util.*;
public class towerOfHanoi {
    public static Scanner sc = new Scanner(System.in);
    public static void tower(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("Transfer the disc "+ n+ " from "+ source + " to " + destination);
            return;
        }
        tower(n-1,source,destination,helper);
        System.out.println("Transfer the disc "+ n+ " from "+ source + " to " + destination);
        tower(n-1,helper,source,destination);
    }
    public static void main(String args[]){
        System.out.println("Welcome! to Tower Of Hanoi");
        System.out.println("Enter the number of disc you want in the tower ");
        System.out.println("The output steps will be ------>");
        int n =sc.nextInt();
        tower(n,"Sourcre","helper","Destination");
    }
}
