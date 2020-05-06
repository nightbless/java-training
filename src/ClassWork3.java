public class ClassWork3 {
    public static void main(String[]args){
        int[] array = {2, 3, 6, 0, 1 ,9 ,10};

        int n = array.length;
        System.out.println("Before sorting");

        for (int element : array ) {
            System.out.print(element + ", ");
        }


        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        System.out.println("After sorting");

        for(int element : array) {
            System.out.println(element + ",");
        }

    }

}
