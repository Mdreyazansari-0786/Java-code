public class findfirstduplicateelement {
    public static void main(String[] args) {
        int a[]={1,2,2,5,6,9,8,8};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]==a[j])&& (i!=j)){
                    temp=temp+1;
                    System.out.println("the first duplicate element is:"+a[i]);
                    break;


                }
            }
            if(temp>0){
                break;
            
            }
        }
        
    }
}
