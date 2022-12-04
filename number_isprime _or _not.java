import java.util.*;
class primeornot{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the nuber you want to check:");
       int num=sc.nextInt();
       int temp=0;
       for(int i=2;i<num-1;i++){
        if(num%i==0){
            temp=temp+1;

        }
    }
        if(temp>0){
        System.out.println("the number is not prime");
    }
        else{
            System.out.println("the number is prime");
    }
}
}


