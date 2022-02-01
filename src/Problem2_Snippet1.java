public class Problem2_Snippet1 {
    public static void main (String[] args){
        int[] inputSize={10,20,30,40,50,100,200,400,600};
        int n=0;
        long startTime=0;
        long estimatedTime=0;

        for(int j=0;j<inputSize.length;j++) {
            n=inputSize[j];

            //The actual running time of the following code will be measured
            startTime = System.nanoTime();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + i;
            }
            //the code to be measured ends here

            estimatedTime = System.nanoTime() - startTime;
            System.out.println("input size: "+n+" actual running time: "+estimatedTime);
        }

    }
}
