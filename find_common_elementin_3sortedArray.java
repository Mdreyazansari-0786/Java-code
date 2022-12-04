import java.util.ArrayList;
public class find_common_elementin_3sortedArray {
    public static void main(String[] args) {
        int a[]={2,4,8,};
        int b[]={2,3,4,8,10,16};
        int c[]={2,8,10,24};
        int x=0,y=0,z=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(x<a.length && y<b.length && z<c.length){
            if(a[x]==b[y] && b[y]==c[z]){
                al.add(a[x]);
                x++;
                y++;
                z++;


            }
            else if(a[x]<a[y]){
                x++;
            }
            else if(b[y]<c[z]){
                y++;

            }
            else{
                z++;
            }

        }
        for(int num:al){
            System.out.print(num+" ");


        }
    }
}
