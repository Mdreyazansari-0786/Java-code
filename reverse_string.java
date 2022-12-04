import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string you want to reverse:");
        String str=sc.nextLine();
        int len=str.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        System.out.println("the reverse of string is:"+rev);

        
    }
    
    
    
}
