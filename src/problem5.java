public class problem5 {
    public static void main(String[] args){
        int[] input={15,14,12,9,6,5,3,1};
        System.out.println(sortArray(input,14));
    }

    public static int sortArray(int[] inputArray,int target){
        return BinarySearch(target,inputArray,0,inputArray.length-1);
    }

    public static int BinarySearch(int target,int[] inputArray,int lower,int upper){
        if(inputArray.length==0){
            System.out.println("The input array is blank");
            System.exit(0);
        }
        if(upper>=0) {
            int mid = (upper+lower) / 2;
            if(inputArray[mid]==target){
                return mid;
            }
            else if(inputArray[mid]>target){
                return (BinarySearch(target,inputArray,mid+1,upper));
            }
            else{
                //when inputArray[mid]<target
                return (BinarySearch(target,inputArray,lower,mid-1));
            }

        }
        return -1;
    }
}
