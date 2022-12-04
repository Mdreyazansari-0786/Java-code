import java.util.Scanner;
class armstrong {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number you want to check armstrong:");
    int n=sc.nextInt();
    int t1=n,length=0;
    while(t1!=0){
        length=length+1;
        t1=t1/10;
        
    }
    int rem=0,arms=0;
    int t2=n;
    while(t2!=0){
        int mul=1;
        rem=t2%10;
        for(int i=1;i<=length;i++)
        {
            mul=mul*rem;
        }
        arms=arms+mul;
        t2=t2/10;

    }
    if(arms==n)
    {
        System.out.println("number is armstrong:");
    }
    else
    {
        System.out.println("number is not armstrong:");
    }

    

        
    }
}
