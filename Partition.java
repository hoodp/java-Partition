import java.util.Scanner;

public class Partition {

    /** integer array that stores values */
    private int[] values;

    /** size of the set */
    private int size;

    /** sum of the set */
    private int sum;

    /** scanner used to set values */
    private Scanner scan;

    public Partition() {
	
	// new scanner
	scan = new Scanner(System.in);

	// get the size of the set
	size = setSize();

	// fill the array
	values = setValues(size);

	// set the sum of the array
	sum = setSum(values);

	output();
	output(values, values);

	// close the scanner
	scan.close();
    }

    public static void main(String[] args) {
	new Partition();
    }

    /** */
    private int setSize() {
	return Integer.parseInt(scan.nextLine());
    }

    /** fill the set with integers */
    private int[] setValues(int size) {
	
	// set to return
	int[] set = new int[size];
	
	// fill the array
	for(int i = 0; i < set.length; i++) {
	    set[i] = Integer.parseInt(scan.nextLine());
	}

	return set;
    }

    /** method sets the sum of the array */
    private int setSum(int[] values) {
	int total = 0;

	// loop through each value
	for(int i : values) { 
	    total += i;
	}
	
	return total;
    }

    /** method returns a string of an integer array */
    private String setString(int[] values) {
	String set = "{ ";
	
	// loop through each value and add to string
	for(int i : values) {
	    set += i + " ";
	}
	return set + "}";
    }

    /** method prints out results */
    private void output() {
	String message = "There is no satisfying partition.";
	System.out.println(message);
    }

    /** overloaded output method that displays the two sets */
    private void output(int[] setOne, int[] setTwo) {
	
	// display two sets in the string
	System.out.println(setString(setOne) + setString(setTwo));
    }

}
