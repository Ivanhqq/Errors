import java.util.Arrays;

public class DZ {
    
        public static void main(String[] args) {

      

            int[] array1 = new int[10];
            array1[3]=5;
            array1[6]=7;


            System.out.println(Arrays.toString(array1));

           searchingForEmptyValues(array1);
            
        }     

        public static void searchingForEmptyValues (int[] array1) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == 0) {
                    System.out.printf("Элемент с индексом %d пустой\n", i);
                }
            }

        }

      
}