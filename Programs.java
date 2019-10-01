import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import packages.application.AverageSensor;
import packages.application.Sensor;
import packages.application.Thermometer;
import packages.classes.*;
import packages.containers.*;
import packages.filtering.*;
import packages.mooc.logic.ApplicationLogic;
import packages.mooc.ui.TextUserInterface;
import packages.mooc.ui.UserInterface;
import packages.moving.Item;
import packages.moving.Thing;
import packages.moving.logic.Packer;

public class Programs {
	
	public void execute(String handle) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// https://stackoverflow.com/questions/52207750/calling-a-method-from-user-input-in-java
		Class<? extends Programs> programs = this.getClass();
		List<Method> methods = Arrays.asList(programs.getMethods());
		Method method = programs.getDeclaredMethod(handle);
		method.invoke(this);
	}
	
	static void Program1() {
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is you name?: ");
		name = scanner.nextLine();
		
		System.out.println("Hello, " + name);
	}
	
	static void Program2() {
		Scanner scanner = new Scanner(System.in);
		
		int firstNum;
		int secondNum;
		
		System.out.println("Enter first number: ");
		firstNum = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		secondNum = scanner.nextInt();
		
		System.out.println("Sum : " + (firstNum + secondNum));
	}
	
	static void Program3() {
		Scanner scanner = new Scanner(System.in);
		
		int firstNum;
		int secondNum;
		
		System.out.println("Enter first number: ");
		firstNum = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		secondNum = scanner.nextInt();
		
		if (firstNum > secondNum) {
			System.out.println(firstNum + " is greater");
		} else {
			System.out.println(secondNum + " is greater");
		}
	}
	
	static void Program4() {
		Scanner scanner = new Scanner(System.in);
		
		String input;
		
		System.out.println("Enter 'ducky': ");
		input = scanner.nextLine();
		
		if (input.equals("ducky")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Incorrect!");
		}
	}
	
	static void Program5() {
		Scanner scanner = new Scanner(System.in);
		
		int age;
		System.out.println("Enter age: ");
		age = scanner.nextInt();
		
		if (age < 16) {
			System.out.println("You are too young to drive");
		} else if (age >= 16 && age <= 32 ) {
			System.out.println("You are old enough to drive");
		} else if (age > 32) {
			System.out.println("You need to renew your license");
		}
	}
	
	static void Program6() {
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		
		while (!input.equals("ducky")) {
			System.out.println("Enter 'ducky' to exit: ");
			input = scanner.nextLine();
		}
	}
	
	static void Program7() {
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		
		while (true) {
			System.out.println("Enter 'ducky' to exit: ");
			input = scanner.nextLine();
			
			if (input.equals("ducky")) {
				System.out.println("Correct!");
				break;
			}
		}
	}
	
	static void Program8() {
		int num = 1;
		
		while (num < 11) {
			System.out.println(num);
			num++;
		}
	}
	
	static void Program9() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lower limit: ");
		int lower = scanner.nextInt();
		
		System.out.println("Upper limit: ");
		int upper = scanner.nextInt();
		
		while (lower <= upper) {
			System.out.println(lower);
			lower++;
		}
		
	}
	
	static void Program10() {
		int length = 100;
		
		length += 50;
		length -= 50;
		length *= 10;
		length /= 100;
		length %= 50;
	}
	
	static void Program11() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		int factorial = 1;
		while (num > 1) {
			factorial *= num;
			num--;
		}
		System.out.println("Factorial: " + factorial);
	}
	
	static void Program12() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		int result = 0;
		while (num >= 0) {
			result += (int)Math.pow(2, num);
			num--;
		}
		System.out.println("Result: " + result);
	}
	
	static void Program13() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Width: ");
		int width = scanner.nextInt();
		
		System.out.print("Height: ");
		int height = scanner.nextInt();
		
		PrintRectangle(width, height);
	}
	
	static void PrintRectangle(int width, int height) {
		while(height > 0) {
			PrintWidth(width);
			System.out.println("");
			height--;
		}
	}
	
	static void PrintWidth(int width) {
		while (width > 0) {
			System.out.print("*");
			width--;
		}
	}
	
	static void Program14() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter base length: ");
		int length = scanner.nextInt();
		
		PrintTriangle(length);
	}
	
	static void PrintTriangle(int length) {
		int i = 1;
		do {
			PrintWidth(i);
			System.out.println("");
			i++;
		} while (i <= length);
	}
	
	static void Program15() {
		Random rand = new Random();
		int value = rand.nextInt(101);
		// 0 to 100 inclusive
		System.out.println(value);
	}
	
	static void Program16() {
		 Scanner reader = new Scanner(System.in);
	        Hangman hangman = new Hangman();

	        System.out.println("************");
	        System.out.println("* Hangman *");
	        System.out.println("************");
	        System.out.println("");
	        Hangman.printMenu();

	        // ADD YOUR IMPLEMENTATION HERE
	        
	        while (hangman.gameOn()) {
	        	hangman.printMan();
				hangman.printWord();
	        	System.out.println("");
	        	System.out.print("Type a command: ");
	            String command = reader.nextLine().toLowerCase();
	            
	            switch (command) {
					default:
						if (command.length() == 1) {
			            	hangman.guess(command);
			            } else {
			            	Hangman.printMenu();
			            }
					break;
					case "status":
		            	hangman.printStatus();
		            	break;
					case "quit":
						hangman.quit();
						break;
				}
	            hangman.checkGame();
	        }
	        
	    System.out.println("Thank you for playing!");
	}
	
	static void Program17() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = scanner.nextLine();
		
		int wordLength = word.length();
		
		System.out.print("Reverse: ");
		for (int i = wordLength - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}
	
	static void Program18 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first word: ");
		String firstWord = scanner.nextLine();
		
		System.out.print("Enter second word: ");
		String secondWord = scanner.nextLine();
		
		int index = firstWord.indexOf(secondWord);
		if (index == -1) {
			System.out.println("The word '" + firstWord + "' is not found in the word '" + secondWord + "'.");
		} else {
			System.out.println("The word '" + firstWord + "' is found in the word '" + secondWord + "'.");
		}
	}
	
	static void Program19 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = scanner.nextLine();
		
		int wordLength = word.length();
		
		String reverse = "";
		for (int i = 0; i < wordLength; i++) {
			reverse = word.substring(i, i + 1) + reverse;
		}
		System.out.println("Reverse: " + reverse);
	}
	
	static void Program20() {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList<String>();
		String word = "";
		
		while (true) {
			System.out.print("Enter a word: ");
			word = scanner.nextLine();
			if (words.contains(word)) break;
			words.add(word);
		}
		System.out.println("You gave the word '" + word + "' twice");
		System.out.println("");
		
		int arraySize = words.size();
		System.out.println("Array size: " + arraySize);
		
		for (String i : words) {
			System.out.println(i);
		}
	}
	
	static void Program21() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();

		while (true) {
			System.out.print("Enter a word: ");
			String word = scanner.nextLine();
			if (word.isEmpty()) break;
			words.add(word);
		}
		
		Collections.sort(words);
		
		System.out.print("Sorted: ");
		printArray(words);
		System.out.println("");
		
		Collections.reverse(words);
		
		System.out.print("Reversed: ");
		printArray(words);
		System.out.println("");
		
		Collections.shuffle(words);
		
		System.out.print("Shuffled: ");
		printArray(words);
		System.out.println("");
	}
	
	static void Program22() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();

		while (true) {
			System.out.print("Enter a word: ");
			String word = scanner.nextLine();
			if (word.isEmpty()) break;
			words.add(word);
		}
		
		System.out.print("Remove: ");
		String remove = scanner.nextLine();
		System.out.println("");
		
		int index = words.indexOf(remove);
		words.remove(index);
		
		printArray(words);
	}
	
	static void printArray(ArrayList<String> arrayList) {
		System.out.print(arrayList.get(0));
		for (int i = 1; i < arrayList.size(); i++) {
			System.out.print(", " + arrayList.get(i));
		}
	}
	
	static void Program23() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		while (true) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();
			if (number == 0) break;
			numbers.add(number);
		}
		
		System.out.print("Remove: ");
		int remove = scanner.nextInt();
		System.out.println("");
		
		numbers.remove(Integer.valueOf(remove));
		
		System.out.println(numbers);
		
		int sum = 0;
		for (int i : numbers) sum = sum + i;
		System.out.println("Sum: " + sum);
	}
	
	static void Program24() {
		ArrayList<String> list = new ArrayList<String>();
	    list.add("Hallo");
	    list.add("Moi");
	    list.add("Benvenuto!");
	    list.add("badger badger badger badger");
	    ArrayList<Integer> lengths = lengths(list);

	    System.out.println("The lengths of the Strings: " + lengths);
	}
	
	static ArrayList<Integer> lengths(ArrayList<String> arrayList) {
		ArrayList<Integer> lengths = new ArrayList<Integer>();
		
		for (String i : arrayList) {
			lengths.add(i.length());
		}
		
		return lengths;
	}
	
	static void Program25() {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		    list.add(3);
		    list.add(2);
		    list.add(7);
		    list.add(2);

		    System.out.println("The greatest number is: " + greatest(list));
	}
	
	static int greatest(ArrayList<Integer> arrayList) {
		int greatest = 0;
		
		Collections.sort(arrayList);
		Collections.reverse(arrayList);
		greatest = arrayList.get(0);
		
		return greatest;
	}
	
	static void Program26() {
		Scanner reader = new Scanner(System.in);

	    System.out.println("Type a text: ");
	    String text = reader.nextLine();
	    if (palindrome(text)) {
	       System.out.println("The text is a palindrome!");
	    } else {
	       System.out.println("The text is not a palindrome!");
	    }
	}
	
	static boolean palindrome(String text) {
		String reverse = "";
		
		for (int i = 0; i < text.length(); i++) {
			reverse = text.charAt(i) + reverse;
		}
		
		if (text.equals(reverse)) {
			return true;
		}
		
		return false;
	}
	
	static void Program27() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(4);
		list1.add(3);
		list1.add(5);
		list1.add(7);

		list2.add(5);
		list2.add(10);
		list2.add(7);

		combine(list1, list2);

		System.out.println(list1);

		System.out.println(list2);
	}
	
	static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for (Integer i: list2) {
			if (!list1.contains(i)) {
				list1.add(i);
			}
		}
	}
	
	static void Program28() {
		Reformatory eastHelsinkiReformatory = new Reformatory();

	    Person brian = new Person("Brian", 1, 110, 7);
	    Person pekka = new Person("Pekka", 33, 176, 85);

	    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

	    eastHelsinkiReformatory.weight(brian);
	    eastHelsinkiReformatory.weight(pekka);

	    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

	    eastHelsinkiReformatory.weight(brian);
	    eastHelsinkiReformatory.weight(brian);
	    eastHelsinkiReformatory.weight(brian);
	    eastHelsinkiReformatory.weight(brian);

	    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
	}
	
	// String.format( "%.2f", john.bodyMassIndex())
	
	static void Program29() {
		Product banana = new Product("Banana", 1.1, 13);
		
		banana.printProduct();
	}
	
	static void Program30() {
		DecreasingCounter counter = new DecreasingCounter(100);

		counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
	}
	
	static void Program31() {
		Menu menu = new Menu();
		
		menu.addMeal("Hamburger");
		menu.addMeal("Fish'n'Chips");
		menu.addMeal("Sauerkraut");
		menu.printMenu();
		
		System.out.println("");
		menu.clearMenu();
		menu.printMenu();
	}
	
	static void Program32() {
		Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = reader.nextInt(); // read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = reader.nextInt(); // read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = reader.nextInt();// read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        while (true) {
        	System.out.println( hours + ":" + minutes + ":" + seconds);
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            // like in previous but seconds taken into account
        	seconds.next();
        	if (seconds.getValue() == 0) {
        		minutes.next();
        		if (minutes.getValue() == 0) {
        			hours.next();
        		}
        	}
        	
        }
	}
	
	static void Program33() {
		Scanner reader = new Scanner(System.in);
		NumberStatistics allNumbers = new NumberStatistics();
		NumberStatistics evenNumbers = new NumberStatistics();
		NumberStatistics oddNumbers = new NumberStatistics();
		
        int input = 0;
		
		while (true) {
			System.out.print("Type a number: ");
			input = reader.nextInt();
			if (input == -1) break;
			allNumbers.addNumber(input);
			if (input % 2 == 0) evenNumbers.addNumber(input);
			if (input % 2 == 1) oddNumbers.addNumber(input);
		}
			
        System.out.println("sum: " + allNumbers.sum());
        System.out.println("sum of even: " + evenNumbers.sum());
        System.out.println("sum of odd: " + oddNumbers.sum());
	}
	
	static void Program34() {
		Random randomizer = new Random();
		
		int randomNumber = randomizer.nextInt(11); // 11 excluded;
		System.out.println(randomNumber);
		
		double probability = randomizer.nextDouble(); // Probability
		System.out.println(probability);
		
		int Gaussian = (int) ( 4 * randomizer.nextGaussian() - 3 ); // Normal Distribution
		System.out.println(Gaussian);
	}
	
	static void Program35() {
		 ArrayList<String> days = new ArrayList<String>();
	       Collections.addAll(days, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
	}
	
	static void Program36() {
		Dice dice = new Dice(6);

        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }
	}
	
	static void Program37() {
		PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
	}
	
	static void Program38() {
		Counter counter1 = new Counter(5, true);
		Counter counter2 = new Counter(2);
		Counter counter3 = new Counter(true);
		Counter counter4 = new Counter();
		
		System.out.println(counter1.value());
		counter1.increase(1);
		System.out.println(counter1.value());
		counter1.decrease(1);
		System.out.println(counter1.value());
	}
	
	static void Program39() {
		MyDate p1 = new MyDate(14, 2, 2011);
		MyDate p2 = new MyDate(21, 2, 2011);
		MyDate p3 = new MyDate(1, 3, 2011);
		MyDate p4 = new MyDate(31, 12, 2010);

		System.out.println( p1 + " earlier than " + p2 + ": " + p1.earlier(p2));
		System.out.println( p2 + " earlier than " + p1 + ": " + p2.earlier(p1));

	    System.out.println( p2 + " earlier than " + p3 + ": " + p2.earlier(p3));
	    System.out.println( p3 + " earlier than " + p2 + ": " + p3.earlier(p2));

	    System.out.println( p4 + " earlier than " + p1 + ": " + p4.earlier(p1));
	    System.out.println( p1 + " earlier than " + p4 + ": " + p1.earlier(p4));
	}
	
	static void Program40() {
		Apartment studioManhattan = new Apartment(1, 16, 5500);
		Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
		Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

		System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );       // false
		System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );   // true
	}
	
	static void Program41() {
		 ArrayList<Person> teachers = new ArrayList<Person>();

		    // first we can take a person into a variable
		    Person teacher = new Person("Juhana", 1, 2, 3);
		    // and then add it to the list
		    teachers.add(teacher);

		    // or we can create the object as we add it:
		    teachers.add( new Person("Matti", 3, 2, 1) );
		    teachers.add( new Person("Martin") );

		    System.out.println("teachers as newborns: ");
		    for ( Person prs : teachers ) {
		        System.out.println( prs );
		    }

		    for ( Person prs : teachers ) {
		        prs.becomeOlder( 30 );
		    }

		    System.out.println("in 30 years: ");
		    for ( Person prs : teachers ) {
		        System.out.println( prs );
		    }
	}
	
	static void Program42() {
		 Clock clock = new Clock(23, 59, 50);

	        int i = 0;
	        while( i < 20) {
	            System.out.println( clock );
	            clock.tick();
	            i++;
	        }
	}
	
	static void Program43() {
		 Team barcelona = new Team("FC Barcelona");

	        Player brian = new Player("Brian");
	        Player pekka = new Player("Pekka", 39);
	        barcelona.addPlayer(brian);
	        barcelona.addPlayer(pekka);
	        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

	        System.out.println("Total goals: " + barcelona.goals());
	}
	
	static void Program44() {
		 MyDate day = new MyDate(25, 2, 2011);
		    MyDate newDate = day.afterNumberOfDays(7);
		    for (int i = 1; i <= 7; ++i) {
		        System.out.println("Friday after  " + i + " weeks is " + newDate);
		        newDate = newDate.afterNumberOfDays(7);
		    }
		    System.out.println("This week's Friday is " + day);
		    System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));
	}
	
	static void Program45() {
		MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println( first + " and " + second + " difference in years: " + second.differenceInYears(first) );
        System.out.println( second + " and " + first + " difference in years: " + first.differenceInYears(second) );
        System.out.println( first + " and " + third + " difference in years: " + third.differenceInYears(first) );
        System.out.println( third + " and " + first + " difference in years: " + first.differenceInYears(third) );
        System.out.println( third + " and " + second + " difference in years: " + second.differenceInYears(third) );
        System.out.println( second + " and " + third + " difference in years: " + third.differenceInYears(second) );
	}
	
	static void Program46() {
		Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println( pekka );
        System.out.println( steve );
	}
	
	static void Program47() {
		Phonebook phonebook = new Phonebook();
	    phonebook.add("Pekka Mikkola", "040-123123");
	    phonebook.add("Edsger Dijkstra", "045-456123");
	    phonebook.add("Donald Knuth", "050-222333");

	    String number = phonebook.searchNumber("Pekka Mikkola");
	    System.out.println( number );

	    number = phonebook.searchNumber("Martti Tienari");
	    System.out.println( number );
	}
	
	static void Program48() {
		Money a = new Money(10,0);
		Money b = new Money(3,50);

		Money c = a.minus(b);

		System.out.println(a);  // 10.00e
		System.out.println(b);  // 3.50e
		System.out.println(c);  // 6.50e

		c = c.minus(a);         // NOTE: new Money-object is created and reference to that is assigned to variable c
		                        //       the Money object 6.50e that variable c used to hold, is not referenced anymore

		System.out.println(a);  // 10.00e
		System.out.println(b);  // 3.50e
		System.out.println(c);  // 0.00e
	}
	
	static void Program49() {
		 int[] array = {5, 1, 3, 4, 2};
		 int sum = 0;
		 
		 for (int i : array) {
			 sum += i;
		 }
		 
		 System.out.println(sum);
	}
	
	static void Program50() {
		 int[] array = {5, 1, 3, 4, 2};
		 
		 System.out.print(array[0]);
		 for (int i = 1; i < array.length; i++) {
			 System.out.print(", " + array[i]);
		}
	}
	
	static void Program51() {
		int[] original = {1, 2, 3, 4};
	    int[] reverse = reverseCopy(original);

	    // print both
	    System.out.println( "original: " +Arrays.toString(original));
	    System.out.println( "reversed: " +Arrays.toString(reverse));
	}
	
	static int[] reverseCopy(int[] original) {
		int[] reverse = new int[original.length];
		
		int j = original.length - 1;
		for (int i = 0; i < original.length; i++) {
			reverse[i] = original[j];
			j--;
		}
		
		return reverse;
	}
	
	static void Program52(){
		int[] array = {5, 1, 3, 4, 2};
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void Program53() {
		NightSky NightSky = new NightSky(8, 4);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		System.out.println("");

		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
	}
	
	static void Program54() {
		Library Library = new Library();

		Library.addBook(new Book2("Cheese Problems Solved", "Woodhead Publishing", 2007));
		Library.addBook(new Book2("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
		Library.addBook(new Book2("NHL Hockey", "Stanley Kupp", 1952));
		Library.addBook(new Book2("Battle Axes", "Tom A. Hawk", 1851));

		for (Book2 book: Library.searchByTitle("CHEESE")) {
		    System.out.println(book);
		}

		System.out.println("---");
		for (Book2 book: Library.searchByPublisher("PENGUIN  ")) {
		    System.out.println(book);
		}
	}
	
	static void Program55() {
		int[] values = {8, 3, 7, 9, 1, 2, 4};
		sort(values);
	}
	
	public static int smallest(int[] array) {
	    int smallest = array[0];
	    
		for (int i = 1; i < array.length; i++) {
			if (array[i] < smallest) smallest = array[i];
		}
		
		return smallest;
	}
	
	public static int indexOfTheSmallest(int[] array) {
	    int smallest = smallest(array);
	    
		for (int i = 0; i < array.length; i++) {
			if (array[i] == smallest) return i;
		}
		return -1;
	}
	
	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		int[] subArray = new int[array.length - index];
		
		int j = index;
		for (int i = 0; i < subArray.length; i++) {
			subArray[i] = array[j];
			j++;
		}
		
		return indexOfTheSmallest(subArray) + index;
	}
	
	public static void swap(int[] array, int index1, int index2) {
	    int temp = array[index1];
	    array[index1] = array[index2];
	    array[index2] = temp;
	}
	
	public static void sort(int[] array) {
		int j;
		for (int i = 0; i < array.length; i++) {
			j = indexOfTheSmallestStartingFrom(array, i);
			swap(array, i, j);
			System.out.println( Arrays.toString(array) );
		}
	}
	
	static void Program56() {
		GuessingGame game = new GuessingGame();
		
		game.play(1, 4);
	}
	
	static void Program57() {
		Changer scandiesAway = new Changer();
		  scandiesAway.addChange(new Change('ä', 'a'));
		  scandiesAway.addChange(new Change('ö', 'o'));
		  System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
	}
	
	static void Program58() {
		HashMap<String, String> names = new HashMap<String, String>();
		
		names.put("Matti", "Mage");
		names.put("Mikael", "Mixu");
		names.put("Arto", "Arppa");
		
		System.out.println(names.get("Mikael"));
	}
	
	static void Program59() {
		 Dictionary dictionary = new Dictionary();
		    dictionary.add("apina", "monkey");
		    dictionary.add("banaani", "banana");
		    dictionary.add("cembalo", "harpsichord");

		    ArrayList<String> translations = dictionary.translationList();
		    for(String translation: translations) {
		        System.out.println(translation);
		    }
	}
	
	static void Program60() {
		String input = "translate\n" + "monkey\n"  +
                "translate\n" + "cheese\n" +
                "add\n"  + "cheese\n" + "juusto\n" +
                "translate\n" + "cheese\n" +
                "quit\n";

		Scanner reader = new Scanner(input);
		Dictionary dictionary = new Dictionary();

		TextUserInterface2 ui = new TextUserInterface2(reader, dictionary);
		ui.start();
	}
	
	static void Program61() {
		Airport airport = new Airport();
		
		airport.airportPanel();
	}
	
	static void Program62() {
		RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        VehicleRegister register = new VehicleRegister();
        
        System.out.println(register.add(reg1, "Sasa"));
        System.out.println(register.add(reg1, "Sasa"));
        
        System.out.println(register.get(reg1));
        
        System.out.println(register.delete(reg1));
        System.out.println(register.delete(reg1));
    }
	
	static void Program63() {
		 Box box = new Box(10);

	        box.add( new Book("Fedor Dostojevski", "Crime and Punishment",2) ) ;
	        box.add( new Book("Robert Martin", "Clean Code", 1) );
	        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

	        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
	        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
	        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

	        System.out.println( box );
	}
	
	static void Program64() {
		Storehouse store = new Storehouse();
	    store.addProduct("coffee", 5, 10);
	    store.addProduct("milk", 3, 20);
	    store.addProduct("milkbutter", 2, 55);
	    store.addProduct("bread", 7, 8);

	    Shop shop = new Shop(store, new Scanner(System.in));
	    shop.manage("Pekka");
	}
	
	static void Program65() {
		  Hand hand = new Hand();

		  hand.add( new Card(12, Card.HEARTS) );
		  hand.add( new Card(4, Card.CLUBS) );
		  hand.add( new Card(2, Card.DIAMONDS) );
		  hand.add( new Card(14, Card.CLUBS) );
		  hand.add( new Card(7, Card.HEARTS) );
		  hand.add( new Card(2, Card.CLUBS) );

		  hand.sortAgainstSuit();

		  hand.print();
	}
	
	static void Program66() {
		UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
	}
	
	static void Program67() {
	    // the things we want to pack
	    List<Thing> things = new ArrayList<Thing>();
	    things.add(new Item("passport", 2));
	    things.add(new Item("toothbrash", 1));
	    things.add(new Item("book", 4));
	    things.add(new Item("circular saw", 8));

	    // we create a packer which uses boxes whose volume is 10
	    Packer packer = new Packer(10);

	    // we ask our packer to pack things into boxes
	    List<packages.moving.Box> boxes = packer.packThings( things );

	    System.out.println("number of boxes: "+boxes.size());

	    for (packages.moving.Box box : boxes) {
	        System.out.println("  things in the box: "+box.getVolume()+" dm^3");
	    }
	}
	
	static void Program68() {
	    Sensor kumpula = new Thermometer();
	    Sensor kaisaniemi = new Thermometer();
	    Sensor helsinkiVantaa = new Thermometer();

	    AverageSensor helsinkiArea = new AverageSensor();
	    helsinkiArea.addSensor(kumpula);
	    helsinkiArea.addSensor(kaisaniemi);
	    helsinkiArea.addSensor(helsinkiVantaa);

	    helsinkiArea.on();
	    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
	    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
	    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

	    System.out.println("readings: "+helsinkiArea.readings());
	}
	
	static void Program69() throws Exception {
	    Printer printer = new Printer("src/textfiles/textfile.txt");

	    printer.printLinesWhichContain("Väinämöinen");
	    System.out.println("-----");
	    printer.printLinesWhichContain("Frank Zappa");
	    System.out.println("-----");
	    printer.printLinesWhichContain("");
	    System.out.println("-----");
	}
	
	static void Program70() throws Exception {
		File file = new File("src/textfiles/testfile.txt");
	    Analysis analysis = new Analysis(file);
	    System.out.println("Lines: " + analysis.lines());
	    System.out.println("Characters: " + analysis.characters());
	}
	
	static void Program71() {
        PersonalDuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("first");
        remover.add("second");
        remover.add("first");

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        remover.add("last");
        remover.add("last");
        remover.add("new");

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
            remover.getUniqueCharacterStrings());

        remover.empty();

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
            remover.getUniqueCharacterStrings());
	}
	
	static void Program72() {
		List<packages.people.Person> people = new ArrayList<packages.people.Person>();
        people.add( new packages.people.Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new packages.people.Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
	}
	
	static void Program73() {
		ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
		juice.takeFromTheContainer(11.3);
		juice.addToTheContainer(1.0);
		//System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

		juice.printAnalysis();	
	}
	
	static void Program74() {
		packages.boxes.OneThingBox box = new packages.boxes.OneThingBox();
        box.add(new packages.boxes.Thing("Saludo", 5));
        box.add(new packages.boxes.Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new packages.boxes.Thing("Saludo")));
        System.out.println(box.isInTheBox(new packages.boxes.Thing("Pirkka")));
	}
	
	static void Program75() throws Exception {
		FileManager f = new FileManager();

        for (String line : f.read("src/textfiles/testinput1.txt")) {
            System.out.println(line);
        }
        
        ArrayList<String> texts = new ArrayList<String>();
        texts.add("hello");
        texts.add("bye");
        texts.add("ciao");
        
        f.save("src/textfiles/testinput2.txt", texts);
	}
	
	static void Program76() throws IOException {
		MindfulDictionary dict = new MindfulDictionary("src/textfiles/words.txt");
		dict.load();
		
		System.out.println(dict.translate("ciao"));
		
		dict.save();
	}
	
	static void Program84() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Give a string: ");
		String string = scanner.nextLine();
		
		if (string.matches("[aeiou]*")) {
			System.out.println("The form is correct");
		} else {
			System.out.println("The form is wrong");
		}
	}
	
	static void Program85() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Give a time: ");
		String string = scanner.nextLine();
		
		if (string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}")) {
			System.out.println("The form is correct");
		} else {
			System.out.println("The form is wrong");
		}
	}
	
	static void Program86() {
		packages.personnel.Employees university = new packages.personnel.Employees();
        university.add(new packages.personnel.Person("Matti", packages.personnel.Education.D));
        university.add(new packages.personnel.Person("Pekka", packages.personnel.Education.GRAD));
        university.add(new packages.personnel.Person("Arto", packages.personnel.Education.D));

        university.print();

        university.fire(packages.personnel.Education.GRAD);

        System.out.println("==");

        university.print();
	}
	
	static void Program87() {
		packages.reference.RatingRegister ratings = new packages.reference.RatingRegister();

		packages.reference.Film goneWithTheWind = new packages.reference.Film("Gone with the Wind");
		packages.reference.Film theBridgesOfMadisonCounty = new packages.reference.Film("The Bridges of Madison County");
		packages.reference.Film eraserhead = new packages.reference.Film("Eraserhead");
		packages.reference.Film bluesBrothers = new packages.reference.Film("Blues Brothers");

		packages.reference.Person matti = new packages.reference.Person("Matti");
		packages.reference.Person pekka = new packages.reference.Person("Pekka");
		packages.reference.Person mikke = new packages.reference.Person("Mikael");
		packages.reference.Person thomas = new packages.reference.Person("Thomas");
		packages.reference.Person arto = new packages.reference.Person("Arto");

	    ratings.addRating(matti, goneWithTheWind, packages.reference.Rating.BAD);
	    ratings.addRating(matti, theBridgesOfMadisonCounty, packages.reference.Rating.GOOD);
	    ratings.addRating(matti, eraserhead, packages.reference.Rating.FINE);

	    ratings.addRating(pekka, goneWithTheWind, packages.reference.Rating.FINE);
	    ratings.addRating(pekka, eraserhead, packages.reference.Rating.BAD);
	    ratings.addRating(pekka, bluesBrothers, packages.reference.Rating.MEDIOCRE);

	    ratings.addRating(mikke, eraserhead, packages.reference.Rating.BAD);

	    ratings.addRating(thomas, bluesBrothers, packages.reference.Rating.GOOD);
	    ratings.addRating(thomas, theBridgesOfMadisonCounty, packages.reference.Rating.GOOD);

	    packages.reference.Reference ref = new packages.reference.Reference(ratings);
	    System.out.println(thomas + " recommendation: " + ref.recommendFilm(thomas));
	    System.out.println(mikke + " recommendation: " + ref.recommendFilm(mikke));
	    System.out.println(matti + " recommendation: " + ref.recommendFilm(matti));
	    System.out.println(arto + " recommendation: " + ref.recommendFilm(arto));
	}
	
	static void Program88() throws FileNotFoundException {
	    GutenbergReader book = new GutenbergReader();

	    Criterion words = new AtLeastOne(
                new ContainsWord("beer"),
                new ContainsWord("milk"),
                new ContainsWord("oil")
            );

	    Criterion rightLength = new Both(
                     new LengthAtLeast(20),
                     new Not( new LengthAtLeast(31))
                   );

	    Criterion wanted = new Both(words, rightLength);

	    for (String line : book.linesWhichComplyWith(wanted)) {
	        System.out.println(line);
	    }
	}
	
	static void Program89() {
		int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
	}
	
	public static String build(int[] t) {
        StringBuilder str = new StringBuilder();
        
        str.append("{" + t[0]);
        for (int i = 1; i < t.length; i++) {
            str.append(", " + t[i]);
        }
        return str + "}";
    }
	
	static void Program91() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "";
		Connection conn = DriverManager.getConnection(url, username, password);
		
		int choice = 1;
		while (choice != 0) {
			Scanner reader = new Scanner(System.in);
			System.out.println("");
			System.out.println("1. Insert");
			System.out.println("2. Select");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.print("> ");
			choice = reader.nextInt();
			
			switch (choice) {
			case 1:
				Insert(conn);
				break;
			case 2:
				Select(conn);
				break;
			case 3:
				Update(conn);
				break;
			case 4:
				Delete(conn);
				break;
			}
			conn.close();
		}
	}
	
	static void Insert(Connection conn) throws SQLException {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = reader.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = reader.nextLine();
		
		String query = "INSERT INTO person (first_name, last_name) VALUES (?, ?)";
		PreparedStatement statement = conn.prepareStatement(query);
		
		statement.setString(1, firstName);
		statement.setString(2, lastName);
		
		statement.executeUpdate();
		statement.close();
	}
	
	static void Select(Connection conn) throws SQLException {
		Statement statement = conn.createStatement();
		String query = "SELECT * FROM person";
		
		ResultSet resultSet = statement.executeQuery(query);
		
		System.out.println("\nPerson Table:");
		while (resultSet.next()) {
			String firstName = resultSet.getString("first_name");
			String lastName = resultSet.getString("last_name");
			System.out.println(firstName + " " + lastName);
		}
		
		statement.close();
	}
	
	static void Update(Connection conn) throws SQLException {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Person to update: ");
		String nameToUpdate = reader.nextLine();
		
		System.out.print("Update first name: ");
		String firstName = reader.nextLine();
		
		System.out.print("Update last name: ");
		String lastName = reader.nextLine();
		
		String query = "UPDATE person SET first_name = ?, last_name = ? WHERE first_name = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		
		statement.setString(1, firstName);
		statement.setString(2, lastName);
		statement.setString(3, nameToUpdate);
		
		statement.executeUpdate();
		statement.close();
	}
	
	static void Delete(Connection conn) throws SQLException	{
		Scanner reader = new Scanner(System.in);

		System.out.print("Person to update: ");
		String nameToDelete = reader.nextLine();	
	
		String query = "DELETE FROM person WHERE first_name = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setString(1, nameToDelete);
		statement.executeUpdate();
		statement.close();
	}
	
	static void Program92() {
		int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
		
		int sum = IntStream.of(numbers).sum();
		System.out.println(sum);
	}
	
	static void Program93() {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = reader.nextInt();
		
		int factorial = IntStream.rangeClosed(1, number)
							.reduce(1, (a, b) -> a*b);
		
		System.out.println("Factorial: " + factorial);
	}
	
	static void Program94() {
		Scanner reader = new Scanner(System.in);
		List<String> fruits = Arrays.asList("banana", "apple", "orange", "melon", "kiwi");
		
		System.out.print("Enter a fruit name: ");
		String fruit = reader.nextLine();
		
		boolean found = fruits.stream().anyMatch(x -> x.equals(fruit));

		if(found) {
			System.out.println("Found!");
		} else {
			System.out.println("Not found");
		}
	}
	
	static void Program95() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = reader.nextLine();
		
		StringBuilder reverse = new StringBuilder();
//		String reverse = new StringBuilder(word).reverse().toString();
		
		IntStream.range(0, word.length()).mapToObj(x -> word.charAt(word.length() - 1 - x)).forEach(x -> reverse.append(x));
		
		System.out.println(reverse);
	}
	
	static void Program96() {
		int[] numbers = new int[] {7, 4, 45, 65, 8, 21, 67, 23, 19, 3};
		
		OptionalInt max = IntStream.of(numbers).max();
		
		System.out.println(max.getAsInt());	
	}
	
	static void Program97() {
		List<Integer> numbers = Arrays.asList(7, 4, 45, 65, 8, 21, 67, 23, 19, 3);
		
		double average = numbers.stream().mapToInt(Integer::intValue).average().getAsDouble();
		
		System.out.println(average);
	}
	
	static void Program98() {
		List<String> fruits = Arrays.asList("banana", "apple", "orange", "melon", "kiwi");
		
		fruits = fruits.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(fruits);
	}
	
	static void Program99() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = reader.nextInt();
		
		boolean notPrime = IntStream.rangeClosed(3, number / 2).map(i -> i / number).anyMatch(i -> i == 0);
	
		if (notPrime) {
			System.out.println("This is not prime number");
		} else {
			System.out.println("This is a prime number");
		}
	}
	
	static void Program100() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter nth number: ");
		int number = reader.nextInt();
		
		AtomicInteger previousNumber = new AtomicInteger(0);
		
		int nthNumber = IntStream.iterate(1, i -> i + previousNumber.get())
							.limit(number)
							.peek(i -> previousNumber.set(i))
							.skip(number - 1)
							.max().orElse(0);
		
		System.out.println(nthNumber);
	}
	
	static void Program101() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = reader.nextLine();
		
		boolean isPalindrome = IntStream.range(0, word.length() / 2)
									.allMatch(i -> word.charAt(i) == word.charAt(word.length() - i - 1));
		
		if (isPalindrome) {
			System.out.println("This word is a palindrome");
		} else {
			System.out.println("This word is not a palindrome");
		}
	}
	
	static void Program102() {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = reader.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = reader.nextInt();

		// EUCLID'S ALGORITHM
		
		AtomicInteger temp = new AtomicInteger(num1);
		int greatestCommonDivisor = IntStream.iterate(num2, i -> i = temp.get() % i)
//										.peek(i -> System.out.println(temp.get()))						
										.filter(i -> temp.getAndSet(i) % i == 0)
										.findFirst().orElse(0);
	
//		int greatestCommonDivisor = num1 - IntStream.range(num1 / 2, num1)
//										.filter(i -> num1 % (num1 - i) == 0)
//										.filter(i -> num2 % (num1 - i) == 0)
//										.findFirst().orElse(0);
		
		if (greatestCommonDivisor == 0) {
			System.out.println("No common divisors");
		} else {
			System.out.println("Greatest Common Divisor: " + greatestCommonDivisor);
		}
		
	}
	
	static void Program103() {
		 List<String> list = Arrays.asList("app", "ball", "cat", "door", "eagle", "ford", "all", "apple");
		 
		 List<String> filtered = list.stream()
				 						.map(str -> str.toLowerCase())
				 						.filter(str -> str.startsWith("a"))
				 						.filter(str -> str.length() ==3)
				 						.collect(Collectors.toList());
		 
		 System.out.println(filtered);
	}
	
	static void Program104() {
		List<Integer> numbers = Arrays.asList(7, 4, 45, 65, 8, 21, 62, 23, 16, 3);
		
		String string = numbers.stream()
								.map(i -> i % 2 == 0 ? "e" + i : "o" + i)
								.collect(Collectors.joining(", ")).toString();
		
		System.out.println(string);
	}
	
	static void Program105() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = reader.nextLine();
		
		String encrypted = word.chars()
								.map(i -> i + 1)
								.mapToObj(i -> (char) i)
								.map(String::valueOf)
							//	.collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append, StringBuilder::toString));
								.collect(Collectors.joining());
								
		System.out.println(encrypted);
	}
	
	static void Program106() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = reader.nextLine();
		
		String longestPalindrome = "";
		
		for (int i = 0; i < word.length() - 1; i++) {

			for (int j = i + 1; j < word.length(); j++) {
				
				if (word.charAt(i) == word.charAt(j)) {	
					String subStr = word.substring(i, j + 1);
					String reverse = new StringBuilder(subStr).reverse().toString();

					if (subStr.equals(reverse)) {
						if (subStr.length() > longestPalindrome.length())
						longestPalindrome = subStr;
					}
				}
			}
		}
		
		System.out.println("Longest palindrome: " + longestPalindrome);
	}
	
	static void Program107() {
		String s1 = "lkcamghtarfsa";
		String s2 = "baramcamgktarfaj";
		
		String longestCommon = "";
		
		for (int i = 0; i < s1.length() - 1; i++) {
			
			for (int j = i + 2; j < s1.length() + 1; j++) {
				String s1Sub = s1.substring(i, j);
				
				if (s2.contains(s1Sub)) {
					if (s1Sub.length() > longestCommon.length()) longestCommon = s1Sub;
				}
			}
			
		}
		
		System.out.println(longestCommon);	
	}
	
	static void Program108() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = reader.nextInt();
		
		int largestPrimeFactor = -1;
		
		while (number % 2 ==0) {
			largestPrimeFactor = 2;
			number /= 2;
		}
		
		for (int i = 3; i < Math.sqrt(number) ; i+=2) {
			while (number % i == 0) {
				largestPrimeFactor = i;
				number /= i;
			}
		}
		
		if (number > 2) largestPrimeFactor = number;
		
		System.out.println("Largest Prime Factor: " + largestPrimeFactor);
	}
	
	static void Program109() throws IOException {
		// File file = new File("buffered.txt");
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("textfiles/buffered.txt"));
		
		writer.write("Hello");
		writer.newLine();
		writer.append("A");
		writer.append("B");
		writer.append("C");
		
		writer.close();
		
		BufferedReader reader = new BufferedReader(new FileReader("textfiles/buffered.txt"));
		
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		
		reader.close();
	}
	
	static void Program110() throws FileNotFoundException {
		PrintWriter writer = new PrintWriter("textfiles/printwriter.txt");
		
		writer.println("Hello");
		writer.print("A");
		writer.print("B");
		writer.print("C");
		
		writer.close();
		
		Scanner reader = new Scanner(new File("textfiles/printwriter.txt"));
		
		while (reader.hasNext()) {
			System.out.println(reader.nextLine());
		}
		
		reader.close();
	}
}	
