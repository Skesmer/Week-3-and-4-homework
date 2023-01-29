import java.util.Arrays;

public class Week3And$CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Part 1
		
	   int[] ages = {3,9,23,64,2,8,28,93};
	   int lengthOfArr = ages.length;
	   int difference = Math.abs(ages[lengthOfArr - lengthOfArr] - ages[lengthOfArr - 1]);
	   
	   System.out.println(difference);
	   
	   int[] newAges = new int[ages.length];
		
	   System.arraycopy(ages,  0, newAges, 0, ages.length);
		
	   lengthOfArr = newAges.length;
	   newAges[lengthOfArr - 1] = 188;
	   difference = Math.abs(newAges[lengthOfArr - lengthOfArr] - newAges[lengthOfArr - 1]);
	   
	   System.out.println(difference);
		
	   int sum = 0;
	   for (int i = 0; i < newAges.length; i++) {
			sum += newAges[i];
	   }
	   double average = sum / lengthOfArr;
	   
	   System.out.println(average);
	   
	   //Part 2
	   
	   String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
	   sum = 0;
	   for (int i = 0; i < names.length; i++) {
		sum += names[i].length();
		   
	   }
	   
	   average = sum / names.length;
	   
	   System.out.println(average);
	   
	   String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);
		
		//Part 3
		
		System.out.println("Use array[array.length - 1]");
	  
		//Part 4
		
		System.out.println("Use array[0]");
		
		//Part 5
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		}
		
		//Part 6
		
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++)
			sum += nameLengths[i];
		
		System.out.println(sum);
		
		//Part 7
		
		System.out.println(duplicateWord("Hello", 3));
		
		
		//Part 8
	    
		String firstName = "Sanel";
		String lastName = "Kesmer";
		String fullName = useFullName(firstName, lastName);
	    
		System.out.println(fullName);
	    
	    //Part 9
	    
		int[] numbers = {5, 10, 15, 20, 25, 30};
		boolean overHundred = checkSum(numbers);
	    
		System.out.println(overHundred);
	    
	    //Part 10
	    
		double[] numbersDecimals = {1.5, 2.5, 3.5, 4.5, 5.5};
		double decimalsAverage = averageElement(numbersDecimals);
		
	    System.out.println(decimalsAverage);
	    
	    //Part 11
	    
	    double[] numbersDecimalsOne = {1.5, 2.5, 3.5, 4.5, 5.5};
	    double[] numbersDecimalsTwo = {1.3, 2.3, 3.3, 4.3, 5.3};
	    boolean oneVsTwoDecimal = averageOfDouble(numbersDecimalsOne, numbersDecimalsTwo);
	    
	    System.out.println(oneVsTwoDecimal);
	    
	    //Part 12
	    
	    boolean isHotOutside = true;
	    double moneyInPocket = 15.75;
	    boolean buyDrink = willBuyDrink(isHotOutside, moneyInPocket);
	    
	    System.out.println(buyDrink);
	    
	    //Part 13
	    //Is this person old enough to drive?
	    
	    int age = 14;
	    boolean canDrive = oldEnoughToDrive(age);
	    System.out.println(canDrive);
	    
        }    
	 
	public static String duplicateWord(String word, int n) {
		 String duplicateWord = "";
		 for (int i = 0; i < n; i++) {
			 duplicateWord += word;
		 }
		 return duplicateWord;
	 }
	 
	 public static String useFullName(String firstName, String lastName) {
		 return firstName + " " + lastName;
	 }

	 public static boolean checkSum(int[] numbers) {
		 int sum = 0;
		 for (int number : numbers) {
			 sum += number;
		 }
		 if (sum > 100) {
			 return true;
		 } else 
			 return false;
	 }
	 
	 public static double averageElement(double[] numbersDecimals) {
		 double sumDecimals = 0;
		 for (double numbersDecimal : numbersDecimals) {
			 sumDecimals += numbersDecimal;
		 }
		 
		 return sumDecimals / numbersDecimals.length;
	 }
	 
	 public static boolean averageOfDouble(double[] numbersDecimalsOne, double[] numbersDecimalsTwo) {
		 double sumDecimalsOne = 0;
		 for (double numbersDecimalOne : numbersDecimalsTwo) {
			 sumDecimalsOne += numbersDecimalOne;
		 }
		 
		 double sumDecimalsTwo = 0;
		 for (double numbersDecimalTwo : numbersDecimalsTwo) {
			 sumDecimalsTwo += numbersDecimalTwo;
		 }
		 
		 double averageTwo = sumDecimalsTwo / numbersDecimalsTwo.length;
		 double averageOne = sumDecimalsOne / numbersDecimalsOne.length;
		 
		 if (averageOne > averageTwo) {
			 return true;
		 }else
			 return false;
	 }
	 
	 public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		 if (isHotOutside == true && moneyInPocket > 10.50) {
			 return true;
		 }else
			 return false;
	 }
	 public static boolean oldEnoughToDrive(int age) {
		 if (age >= 16) {
			 return true;
		 }else
			 return false;
	 }
}

