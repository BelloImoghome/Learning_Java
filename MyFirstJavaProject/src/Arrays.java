
public class Arrays {
    public static void main(String[] args) throws Exception {
        /*
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers);
        // [I@36baf30c
        System.out.println(java.util.Arrays.toString(numbers));
        // [1, 2, 0, 0, 0]

        int[] numbers = { 2, 3, 5, 1, 4};
        System.out.println(numbers.length);
        java.util.Arrays.sort(numbers);
        System.out.println(java.util.Arrays.toString(numbers));  

        int[][] numbers = new int[2][3];    
        numbers[0][0] = 1;
        System.out.println(java.util.Arrays.toString(numbers));
        // [[I@36baf30c, [I@7a81197d]
        System.out.println(java.util.Arrays.deepToString(numbers));
        // [[1, 0, 0], [0, 0, 0]]

        int[][][] numbers = new int[2][3][5];    
        numbers[0][0][0] = 1;
        System.out.println(java.util.Arrays.deepToString(numbers));
        // [[[1, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]], [[0, 0, 0, 0, 0], [0, 
0, 0, 0, 0], [0, 0, 0, 0, 0]]]

        */

        int[][] numbers = { {1, 2, 3}, {4, 5, 6} };    
        System.out.println(java.util.Arrays.deepToString(numbers));
        // [[1, 2, 3], [4, 5, 6]]
    }
}
