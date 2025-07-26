package day5;

import java.util.Arrays;
import java.util.Scanner;


interface NameSorter {
    void sortAndDisplay();
}

class NameSortingApp implements NameSorter {
 
    public void sortAndDisplay() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total count of names: ");
        int n = sc.nextInt();
        
        sc.nextLine(); 

        String[] names = new String[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name for person " + (i + 1) + ":");
            
            names[i] = sc.nextLine(); 
        }

       
        Arrays.sort(names);

        System.out.println("\nSorted names:");
       
        for (String str : names) {
            System.out.println(str);
        }
        
        sc.close(); 
    }
}

public class SortingNames {
    public static void main(String[] args) {
        NameSorter sorter = new NameSortingApp();
        sorter.sortAndDisplay();
    } 
}