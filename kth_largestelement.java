public class kth_largestelement {
    public static void main(String[] args) {
        int a[]={1,6,39,8,47,2,23};
        int k=4;
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
            if(i==k-1){
                System.out.println(k+ " largest element is " +a[i]);
                
            }
        }
    }
}
