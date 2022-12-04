import java.util.Set;
import java.util.HashSet;
public class findduplicateelement_bysetinterface {
    public static void main(String[] args) {
        int arr[]={3,3,2,1,1,8,9,9};
        System.out.print("the duplicate element in the array are:");
        Set<Integer> s=new HashSet<>();
        for(int num:arr){
            boolean b=s.add(num);
            if(b==false){
                System.out.print(num+" ");
            }
            
        }
    }
}
