public class duplicate_elementinarray {
    public static void main(String args[]){
        int a[]={1,1,3,3,2};
        System.out.print("the duplicate elements are:");
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++)
            {
                if((a[i]==a[j]) && (i!=j));{
                    
                }
                System.out.print(a[j]+" , ");
                

            }
            
            
        }
    }
}
