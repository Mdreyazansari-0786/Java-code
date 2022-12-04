public class _2ndlargestelement_inarray {
    public static void main(String[] args) {
        int []a={10,5,6,9,3,8,7,12,99};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
                
            }
        }
        System.out.println("the second largest element in the array is "+a[1]);
    }
}
