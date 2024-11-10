import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String op;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo CSV:");
        String filePath = scanner.nextLine();
        try {
            int[] array = LeitorCsv.readCSV(filePath);
            System.out.println("Caminho do arquivo: " + filePath);

            System.out.println("Array antes da ordenação:");
            System.out.println(Arrays.toString(array));

            System.out.println("Escolha o algoritmo de ordenação:");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Insertion Sort");
            System.out.println("3 - Quick Sort");
            int choice = scanner.nextInt();

            long startTime, endTime;

            switch (choice) {
                case 1:
                    startTime = System.nanoTime();
                    BubbleSort.sort(array);
                    endTime = System.nanoTime();
                    System.out.println("Tempo de execução do BubbleSort: " + ((endTime - startTime) / 1_000_000.0) + " ms");
                    break;
                case 2:
                    startTime = System.nanoTime();
                    InsertionSort.sort(array);
                    endTime = System.nanoTime();
                    System.out.println("Tempo de execução do InsertionSort: " + ((endTime - startTime) / 1_000_000.0) + " ms");
                    break;
                case 3:
                    startTime = System.nanoTime();
                    QuickSort.sort(array, 0, array.length - 1);
                    endTime = System.nanoTime();
                    System.out.println("Tempo de execução do QuickSort: " + ((endTime - startTime) / 1_000_000.0) + " ms");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    scanner.close();
                    return;
            }

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Deseja ver o array apos a ordenação? (s/n)");
            op = scanner2.nextLine();
            scanner2.close();
            if (op.equals("s")) {
                System.out.println("Array após a ordenação:");
                System.out.println(Arrays.toString(array));
            }


        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}