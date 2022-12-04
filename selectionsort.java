public class selectionsort {
    public static void main(String[] args) {
        int[] a={10,20,60,2,1,3};
        int min;
        int temp=0;
    for(int i=0;i<a.length;i++){
        min=i;

        for(int j=i+1;j<a.length;j++){
            if(a[j]<a[min]){
                min=j;
            }
        }
        temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    }
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    
    }

}
