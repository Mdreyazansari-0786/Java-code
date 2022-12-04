public class single_element_inthearray {
    public static void main(String[] args) {
        
        int a[]={1,1,2,2,3,6,6};
        int res=a[0];
        for(int i=1;i<a.length;i++){
            res=res^a[i];
        }
        System.out.println("the single element in the array is :"+res);
    }
}
