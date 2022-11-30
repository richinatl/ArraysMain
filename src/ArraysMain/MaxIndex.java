package ArraysMain;

public class MaxIndex {
	
	
    // correct version of given code snippet
	// output is 2, the index of the largest number in the array
	
	public static void main(String[] args) {
		
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }

        }

        System.out.println(index);

	}

}
