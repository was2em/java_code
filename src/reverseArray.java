public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 5,7,6,9,8,10};

        for (int i=1; i< arr.length; i++) {
            int temp=arr[arr.length-i];
            int[] array= new int[arr.length];
            array[i]=temp;
            System.out.print(array[i]+" ");
        }
           System.out.print(arr[0]);
    }
}



