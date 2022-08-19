package FunctionalPrograms;

public class SumOfThreeInteger {

	public static void main(String[] args) {
		int integers[] = { 1, 2, -3, 1, 0 };
        int sizeOfArray = integers.length;
        int count = 0;
        for (int index1 = 0; index1 < sizeOfArray - 2; index1++) {
            for (int index2 = index1 + 1; index2 < sizeOfArray - 1; index2++) {
                for (int index3 = index2 + 1; index3 < sizeOfArray; index3++) {
                    if (integers[index1] + integers[index2] + integers[index3] == 0) {
                        System.out.println(integers[index1] + " " + integers[index2] + " "+integers[index3]);
                        count++;

                    }
                }
            }
        }
        System.out.println("The total number of triplets that add to 0 are: " + count);

	}

}
