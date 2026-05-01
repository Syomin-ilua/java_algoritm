import java.util.*;

public class FitnessSort {
    
    /**
     * Вычисляет сумму цифр в числе
     * @param number число, для которого вычисляется сумма цифр
     * @return сумма цифр числа
     */
    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;  
            number /= 10;      
        }
        return sum;
    }
    
    /**
     * Сортирует массив чисел по сумме их цифр
     * @param weights массив весов посетителей
     * @return отсортированный массив
     */
    public static List<Integer> sortByDigitSum(int[] weights) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < weights.length; i++) {
            pairs.add(new int[]{weights[i], i});
        }
        
        pairs.sort((a, b) -> {
            int sumA = sumOfDigits(a[0]);
            int sumB = sumOfDigits(b[0]);
            
            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
        
        List<Integer> result = new ArrayList<>();
        for (int[] pair : pairs) {
            result.add(pair[0]);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] weights = {56, 65, 74, 100, 99, 68, 86, 180, 90};
        
        System.out.println("Исходный список: " + Arrays.toString(weights));
        
        List<Integer> sorted = sortByDigitSum(weights);
        
        System.out.print("Отсортированный список: ");
        for (int i = 0; i < sorted.size(); i++) {
            System.out.print(sorted.get(i));
            if (i < sorted.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        System.out.println("\nПроверка сумм цифр:");
        for (int num : sorted) {
            System.out.println(num + " -> " + sumOfDigits(num));
        }
    }
}
