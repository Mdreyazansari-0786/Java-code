public class delete_aelement_in_array {
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        int del_element=30;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(del_element==a[i]){
                for(int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                    
                }
                count=count+1;
                break;
            }
        }
        if(count==0){
            System.out.println("the element not found:");
        }
        else{
            System.out.println("the element was deleted successfully");

            for(int i=0;i<a.length-1;i++){

                System.out.print(a[i]+" ");
        }
    }
}
}

