import java.util.HashSet;
public class first_duplicateelement_byusinghashset {
    public static void main(String[] args) {
        int a[]={3,8,1,5,5,2,8};
        int temp=-1;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=a.length-1;i>=0;i--){
            if(hs.contains(a[i])){
                temp=i;

            }
            else{
                hs.add(a[i]);
            }
            
        }
        if(temp!=-1){
            System.out.println("the first duplicate element is:"+a[temp]);
        }
        else{
            System.out.println("no duplicate element found in the array:");
        }


        
    }
    
    
}
