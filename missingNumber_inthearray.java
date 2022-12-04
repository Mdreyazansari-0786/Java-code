
public class missingNumber_inthearray {
    public static void main(String args[]){
        int total_sum=0;
        int missing_element=0;
        int a[]={1,2,3,4,6};
        int expected_no_element=a.length+1;
        total_sum=expected_no_element*(expected_no_element+1)/2;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            missing_element=total_sum-sum;
            }
        System.out.println("the missing element in the array is:"+missing_element);
        
        //System.out.println("the missing number is:"+(total_sum-sum));
        

        

    }
}
