import java.util.HashSet;
public class longest_consecutive_number {
    public static void main(String[] args) {
        int a[]={3,9,1,13,10,4,20,2,11,12};
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        int longest_length=0;
        for(int i=0;i<a.length;i++){
            if(!hs.contains(a[i]-1)){
                int no=a[i];
                while(hs.contains(no)){
                    no++;
                }
                if(longest_length<no-a[i]){
                    longest_length=no-a[i];


                }
            }
        }
        System.out.println("the longest length in the array is:"+longest_length);

    }
}
