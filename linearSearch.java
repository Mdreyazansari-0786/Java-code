public class linearSearch {
    public static void main(String args[]){
        int []a={1,5,9,6,7,3,9,7,1,5,9,8};
        int item=3;
        for(int i=0;i<a.length;i++){
            if(a[i]==item){
                System.out.println("the element found at "+i+" index position");
            }
        }
    
    }
}
