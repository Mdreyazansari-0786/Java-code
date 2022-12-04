import java.util.ArrayList;

public class find_odd_even_numberin_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                a1.add(a[i]);
                
            }
            else{
                a2.add(a[i]);
                
            }
        }
        
            System.out.print("the even numbers are:");
            for(int num:a1){
                System.out.print(num+" ");
            
        }
        
        System.out.println("/n");
        
            System.out.println("the odd numbers are:");
            for(int num:a2){
                System.out.print(num+" ");

            }
            
        }
        
    }

