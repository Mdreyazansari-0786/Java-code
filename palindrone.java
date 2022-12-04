import java.util.Scanner;
class palindrone {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to print:");
        int n=sc.nextInt();
        int temp=n;
        
        int rev=0,rem=0;
        while(n!=0)
        {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
        }
        System.out.println(rev);
        if(temp==rev)
        {
            System.out.println("number is palindrone:");
        }
        else
        {
            System.out.println("number is not palindrone:");
        }

        
    }
}
