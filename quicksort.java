public class quicksort {
    public static void main(String args[]){
        int []arr={10,50,5,3,6,9,8,7,4};
        int len=arr.length;


    }
    int partition(int[] arr,int low,int high){
        int pivot=arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;

    }

    
}
