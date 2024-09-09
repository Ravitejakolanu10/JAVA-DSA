public class linear {
    public static void main(String[] args) {
        int [] arr = {12, 34, 78, 87, 74};
        int target = 87;

        int result = LinearSearch(arr, target);
        System.out.println("Element Found at : "+result + " index");
    }

    static int LinearSearch(int arr[],int target){
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }


}

