public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // Code Here
        // int largestElem = Integer.MIN_VALUE;
        // int secLargestElem = Integer.MIN_VALUE;

        int largestElem = arr[0];
        int secLargestElem = -1;

        // for(int i=0; i<arr.length;i++){
        //     if(arr[i] > largestElem){
        //         largestElem = arr[i];
        //     }
        // }

        for(int i=0; i<arr.length;i++){
            if(arr[i] > largestElem){
                secLargestElem = largestElem;
                largestElem = arr[i];
            }
            else if(arr[i] > secLargestElem && arr[i] < largestElem){
                secLargestElem = arr[i];
            }
        }

        // if(secLargestElem == Integer.MIN_VALUE){
        //     return -1;
        // }
        // else{
        return secLargestElem;
        // }

    }
}
