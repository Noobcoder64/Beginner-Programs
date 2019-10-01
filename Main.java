import java.util.Scanner;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) throws Exception {

		System.out.println("1. Hello Name");
		System.out.println("2. Sum");
		System.out.println("3. Greater Number");
		System.out.println("4. Ducky (String Equals)");
		System.out.println("5. Drive (Logical Operators)");
		System.out.println("6. Ducky to exit");
		System.out.println("7. Ducky to exit (Break)");
		System.out.println("8. More Loops");
		System.out.println("9. Lower Upper Limit");
		System.out.println("10. Operators");
		System.out.println("11. Factorial");
		System.out.println("12. Sum of the powers");
		System.out.println("13. Printing a rectangle");
		System.out.println("14. Printing a triangle");
		System.out.println("15. Random number");
		System.out.println("16. Hangman Game");
		System.out.println("17. Reverse Word");
		System.out.println("18. Match Word");
		System.out.println("19. Reverse Word (Substring)");
		System.out.println("20. ArrayList");
		System.out.println("21. Collections");
		System.out.println("22. ArrayList Remove");
		System.out.println("23. ArrayList Integers");
		System.out.println("24. Lengths");
		System.out.println("25. Greatest");
		System.out.println("26. Palindrome");
		System.out.println("27. smartCombine");
		System.out.println("28. Classes");
		System.out.println("29. Product");
		System.out.println("30. Counter");
		System.out.println("31. Menu");
		System.out.println("32. BoundedCounter");
		System.out.println("33. Statistic");
		System.out.println("34. Random Number");
		System.out.println("35. Collections addAll");
		System.out.println("36. Dice");
		System.out.println("37. PasswordRandomizer");
		System.out.println("38. Overloading Counter");
		System.out.println("39. MyDate");
		System.out.println("40. Apartment");
		System.out.println("41. ArrayList & Object");
		System.out.println("42. Clock");
		System.out.println("43. Team and Players");
		System.out.println("44. Extended MyDate");
		System.out.println("45. Extended MyDate II");
		System.out.println("46. Person Extended");
		System.out.println("47. Person Recap");
		System.out.println("48. Money");
		System.out.println("49. Array");
		System.out.println("50. Elegant printing of array");
		System.out.println("51. Reversing and copying of an array");
		System.out.println("52. Array to stars");
		System.out.println("53. Night sky");
		System.out.println("54. Book Library (Static)");
		System.out.println("55. Sorting an array");
		System.out.println("56. Guessing game");
		System.out.println("57. Changer");
		System.out.println("58. HashMap");
		System.out.println("59. Dictionary");
		System.out.println("60. Text User Interface");
		System.out.println("61. Airport");
		System.out.println("62. Registration Plate");
		System.out.println("63. Boxes and Things (Interfaces)");
		System.out.println("64. Online Shop (Collections)");
		System.out.println("65. Playing cards (Compared to)");
		System.out.println("66. UserInterface (Packages)");
		System.out.println("67. Moving (Interface Flexibility)");
		System.out.println("68. Sensors and Temperature (Exception)");
		System.out.println("69. Printer (Reading File)");
		System.out.println("70. Lines and Characters (Reading File)");
		System.out.println("71. Duplicates (Sets)");
		System.out.println("72. People (Inheritance)");
		System.out.println("73. Container (Inheritance)");
		System.out.println("74. Different Boxes (Abstract Class)");
		System.out.println("75. Writing into a file");
		System.out.println("76. Mindful Dictionary (Read/ Write File)");
		System.out.println("77. GUI Intro");
		System.out.println("78. Noticeboard (GUI)");
		System.out.println("79. Clicks (GUI)");
		System.out.println("80. Calculator (GUI)");
		System.out.println("81. Drawing (GUI)");
		System.out.println("82. Moving Figure (GUI)");
		System.out.println("83. Advanced Calculator (GUI)");
		System.out.println("84. Vowel Inspection (RegEx)");
		System.out.println("85. Clock Time (RegEx)");
		System.out.println("86. Enum and Iterator");
		System.out.println("87. Film Reference");
		System.out.println("88. Filtering");
		System.out.println("89. StringBuilder");
		System.out.println("90. Worm Game");
		System.out.println("91. MySQL Connection");
		System.out.println("92. Sum of numbers (Streams)");
		System.out.println("93. Factorial (Streams)");
		System.out.println("94. Linear Search (Streams)");
		System.out.println("95. Reverse String (Streams)");
		System.out.println("96. Max number (Streams)");
		System.out.println("97. Average (Streams)");
		System.out.println("98. Upper case (Streams)");
		System.out.println("99. Prime number (Streams)");
		System.out.println("100. Fibonacci Number (Streams)");
		System.out.println("101. Palindrome (Streams)");
		System.out.println("102. Greatest Common Divisor (Streams)");
		System.out.println("103. Filter String (Streams)");
		System.out.println("104. Comma Separated (Streams)");
		System.out.println("105. Ceaser Cipher (Streams)");
		System.out.println("106. Longest Palindrome in word (Streams)");
		System.out.println("107. Longest Common Sequence");
		System.out.println("108. Largest Prime Factor");
		System.out.println("109. BufferedWriter and BufferedReader");
		System.out.println("110. PrintWriter");
		System.out.println("111. Implement Graphs");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter program number: ");
		int number = scanner.nextInt();
		System.out.println("");
		
		switch (number) {
		default:
			new Programs().execute("Program" + number);
			break;
		case 77:
			Program77();
			break;
		case 78:
			Program78();
			break;
		case 79:
			Program79();
			break;
		case 80:
			Program80();
			break;
		case 81:
			Program81();
			break;
		case 82:
			Program82();
			break;
		case 83:
			Program83();
			break;
		case 90:
			Program90();
			break;
		}

	}
	
	static void Program77() {
		packages.classes.UserInterface ui = new packages.classes.UserInterface();
        SwingUtilities.invokeLater(ui);
	}
	
	static void Program78() {
		packages.noticeboard.NoticeboardInterface ui = new packages.noticeboard.NoticeboardInterface();
        SwingUtilities.invokeLater(ui);
	}
	
	static void Program79() {
		packages.clicks.Calculator calculator = new packages.clicks.Calculator();
		packages.clicks.UserInterface ui = new packages.clicks.UserInterface(calculator);
        SwingUtilities.invokeLater(ui);
	}
	
	static void Program80() {
		packages.calculator.Calculator calculator = new packages.calculator.Calculator();
		packages.calculator.UserInterface ui = new packages.calculator.UserInterface(calculator);
		SwingUtilities.invokeLater(ui);
	}
	
	static void Program81() {
		packages.drawing.UserInterface ui = new packages.drawing.UserInterface(new packages.drawing.Avatar(30, 30));
        SwingUtilities.invokeLater(ui);
	}
	
	static void Program82() {
		packages.movingFigure.CompoundFigure truck = new packages.movingFigure.CompoundFigure();

        truck.add(new packages.movingFigure.Box(220, 110, 75, 100));
        truck.add(new packages.movingFigure.Box(80, 120, 200, 100));
        truck.add(new packages.movingFigure.Circle(100, 200, 50));
        truck.add(new packages.movingFigure.Circle(220, 200, 50));

        packages.movingFigure.UserInterface ui = new packages.movingFigure.UserInterface(truck);
        SwingUtilities.invokeLater(ui);
	}
	
	static void Program83() {
		packages.advancedCalculator.UserInterface ui = new packages.advancedCalculator.UserInterface();
		SwingUtilities.invokeLater(ui);
	}
	
	static void Program90() {
		packages.wormgame.WormGame wormGame = new packages.wormgame.WormGame();
		packages.wormgame.UserInterface ui = new packages.wormgame.UserInterface(wormGame);
		SwingUtilities.invokeLater(ui);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wormGame.start();
	}
	
}