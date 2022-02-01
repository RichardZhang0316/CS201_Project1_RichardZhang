public class problem5 {
    public static void main(String[] args){
        int[] input={12,9,6,5,3,1};
        System.out.println(BinarySearch(1,input,0,5));//Your function should take the array and the number to find as inputs. Only these two?
    }

    public static int BinarySearch(int target,int[] inputArray,int lower,int upper){
        if(inputArray.length==0){
            System.out.println("The input array is blank");
            System.exit(0);
        }
        if(upper>=1) {
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
