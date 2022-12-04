public class common_elementin_two_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={1,9,8,7,4,6};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
