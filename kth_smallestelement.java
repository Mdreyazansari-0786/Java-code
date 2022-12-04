public class kth_smallestelement {
    public static void main(String[] args) {
        int a[]={1,4,8,2,5,41,9};
        int k=3;
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(k+ " the smallest element is " + a[i]);
            }
        }
    }
}
