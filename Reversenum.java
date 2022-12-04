import java.util.Scanner;
class Reversenum {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you  want to reverses:");
        int num=sc.nextInt();
        int rem,rev=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        System.out.println("the reverse of the number is :"+rev);

        

    }
    
}
