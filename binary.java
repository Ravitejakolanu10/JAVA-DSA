public class binary {
    public static void main(String[] args) {
        int [] arr = {12, 34, 78, 87, 74};
        int target = 87;

        int result = BinarySearch(arr, target);
        System.out.println("Element Found at : "+result + " index");
    }

    static int BinarySearch(int arr[],int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end)
        {
            int mid = (start+end)/2;
            
            if(target > arr[mid])
            {
                start=mid+1;
            }
            else if (target < arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }

        return -1;
    }
}
