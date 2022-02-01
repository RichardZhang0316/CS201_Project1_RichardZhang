import java.util.Scanner;
public class Probelm3 {
    public static void main (String[] args){

        //get an array from the user
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter one unsorted array made up of integers. Use space to separate different integers");
        String input=scnr.nextLine();

        //check whether the input is empty or only contain space
        if(input.trim().isEmpty()){
            System.out.println("The input is empty or only contain space");
            System.exit(0);
        }

        //change the type of the array from String to int
        String [] inputStringArray = input.split("\\s+");
        int []inputArray=new int[inputStringArray.length];
        for(int i=0;i<inputStringArray.length;i++){
            try {
                inputArray[i] = Integer.parseInt(inputStringArray[i]);
            }
            catch(NumberFormatException e){
                System.out.println("the input has error(s)");
                System.exit(1);
            }
        }

        //insertion sort: this is the part whoes running time wil be calculated by us.
        for(int i=0; i< inputArray.length;i++){
            int key=inputArray[i];
            for(int j=i-1;j>=0;j--){
                if(inputArray[j]<key){
                    inputArray[j+1]=inputArray[j];
                    inputArray[j]=key;
                }
            }
        }

        //print the sorted array
        for(int i=0;i< inputArray.length;i++){
            System.out.print(inputArray[i]+" ");
        }

    }
}
