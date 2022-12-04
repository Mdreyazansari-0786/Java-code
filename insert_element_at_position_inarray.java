public class insert_element_at_position_inarray {
    
    public static void main(String args[]){
        int a[]={10,20,30,40,50,60,70};
        int position=3;
        int element=100;
        for(int i=a.length-1;i>position-1;i--){
            a[i]=a[i-1];
        }
        a[position-1]=element;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
