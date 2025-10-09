import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] namenListe = {"Leon", "Jonas", "Dominik", "Aldin", "Mamuti", "Laurent", "Amel", "Stefan", "Unejs", "Enes", "Deyyan"};

        bubbleSort(namenListe);
        System.out.print("BubbleSort: ");
        for (String name : namenListe) {
            System.out.print(name + " ");
        }

        selectionSort(namenListe);
        System.out.print("\n" + "SelectionSort: ");
        for (String name2 : namenListe) {
            System.out.print(name2 + " ");
        }

        suchen(namenListe);

    }

    public static void bubbleSort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j + 1];

                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++) {

                if (array[j].compareTo(array[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            String temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    public static void suchen(String[] arr) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n " + "Welchen Namen suchst du?");
        String name = sc.next();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (name.toLowerCase().equals(arr[i].toLowerCase())) {
                System.out.print("Ihr Name ist an der " + (i + 1) + " Stelle");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.print("Name nicht gefunden");
        }
    }
}
