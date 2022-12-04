public class merge_two_array {
    public static void main(String args[]){
        int a[]={1,2,3,6};
        int b[]={7,8,9,6,4};
        int a_length=a.length;
        int b_length=b.length;
        int c_length=a_length+b_length;
        int c[]=new int[c_length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];

        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+",");
        }
    }
}
