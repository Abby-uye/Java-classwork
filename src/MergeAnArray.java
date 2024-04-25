public class MergeAnArray {

    public static int[] merge(int[] input) {
        int[] returnArray = new int[input.length*2];
        int counter = input.length;

        for (int index = input.length-1; index>=1; index--) {
            returnArray[index-1]=input[index-1];
            returnArray[(index*2)-1]=input[index]*2;

        }
    return returnArray;
    }
}
