import java.util.ArrayList;
import java.util.Scanner;

public class RadixBucket {

    public static void main(String[] args) {
        ArrayList<Integer> arrayOfInts = new ArrayList<Integer>();
        String arrayElements;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            arrayOfInts.add(number);
        }
        RadixBucketSort(arrayOfInts, arrayOfInts.size(), 10);
        for(int i = 0; i < arrayOfInts.size(); i++) {
        	arrayElements = "" + arrayOfInts.get(i);
            System.out.print(Integer.valueOf(arrayElements).toString());
            System.out.println();
        }
    }

    private static void RadixBucketSort(ArrayList<Integer> arrayOfInts, int size, int numberLength) {
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>(10);
        ArrayList<Integer> columb;
        for(int i = 0; i < 10;  i++){
            bucket.add(i, columb  = new ArrayList<>());
        }
        int sigDig = 0;
        for (int i = 1; i <= numberLength; i++) {
            for (int j = 0; j < size; j++) {
                sigDig = significantDigit((int) arrayOfInts.get(j), i - 1);
                bucket.get(sigDig).add(arrayOfInts.get(j));
            }
            arrayOfInts.clear();
            for (int j = 0; j < 10; j++) {
                arrayOfInts.addAll(bucket.get(j));
                bucket.get(j).clear();
            }
        }
    }

    private static int significantDigit(int number, int position){
        int sigDig = 0;
        if(position == 0){
            return number % 10;
        }
        for (int i = 0; i < position; i++) {
            number = number / 10;
            sigDig = number % 10;
        }
        return sigDig;
    }
}
