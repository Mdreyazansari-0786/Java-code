public class binarySearch {
    public static void main(String[] args) {
        
    
    int []a={1,2,6,7,8,9,10,17,18,25};
    int li=0;
    int hi=a.length-1;
    int mid=(li+hi)/2;
    int item=18;
    while(li<=hi){
        if(a[mid]==item){
            System.out.println("the element found at " + mid + " index position");
            break;

        }
        else if(a[mid]<item){
            li=mid+1;
        }
        else{
            hi=mid-1;
        }
        mid=(li+hi)/2;

    }
    if(li>hi){
        System.out.println("element not found in the array:");
    }
}
}
