import java.util.Arrays;

public class CountingSort {

	public CountingSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count Co = new Count();
		int myarray[] = {5,6,3,4,1,2,8,9,7,2};
		
		System.out.println("The result is change from 5634128972 to");
		String tempString = Arrays.toString(Co.doSort(myarray));
		tempString=tempString.substring(1, tempString.length() - 1);
		tempString = tempString.replaceAll("\\s+", "");
		tempString = tempString.replaceAll("0", "");
		tempString = tempString.replaceAll(",", "");
			System.out.print(tempString);
		
	}
}
