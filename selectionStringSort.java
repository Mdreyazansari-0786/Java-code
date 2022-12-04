public class selectionStringSort {
    public static void main(String[] args) {
        String []a={"reyaz","raman","ansari","pawan","hasam"};
        int min;
        String temp;
        for(int i=0;i<a.length;i++){
             min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j].compareTo(a[min])<0){
                    temp=a[j];
                    a[j]=a[min];
                    a[min]=temp;


                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        

        
    }
}
