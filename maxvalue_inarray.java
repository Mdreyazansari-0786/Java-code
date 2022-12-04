public class maxvalue_inarray {
    public static void main(String[] args) {
        int a[]={2,1,6,8,9,4,3,4,7};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                
            }
        }
        System.out.println(max);
    }
}
