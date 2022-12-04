public class _2ndsmallestelement_inarray {
    public static void main(String[] args) {
        int a[]={1,2,6,9,88,23,6,98,4,12,8};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    
                }
            }
        }
        System.out.println("the second smallest number in the array is "+a[1]);
    }
    
}
