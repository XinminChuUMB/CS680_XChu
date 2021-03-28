# CS680_XChu

## HW1

### HW 1-1: Calculator
• Implement Calculator and CalculatorTest
    – In the package: edu.umb.cs680.hw01
• Place source code files (.java files) and binary files (.class files) in different directories.
    – Follow this directory structure:
• <proj dir>/src/edu/umb/cs680/hw01/Calculator.java
• <proj dir>/src/edu/umb/cs680/hw01/CalculatorTest.java
• <proj dir>/bin/edu/umb/cs680/hw01/Calculator.class
• <proj dir>/bin/edu/umb/cs680/hw01/CalculatorTest.class
    – Your IDE has a way to set up these “src” and “bin” directories. Figure it out.

• Compile your code on your IDE
• Run test cases with JUnit on your IDE
• No need to use Ant in this HW.
  
### HW 1-2: PrimeGenerator
• Understand how this class works.
• It generates prime numbers in between two input numbers (from and to)
    – Class PrimeGenerator {
        protected long from, to;
        protected LinkedList<Long> primes;
        public void generatePrimes(){ ... }
        public LinkedList<Long> getPrimes(){ return primes };
• Client code (test case)
• PrimeGenerator gen = new PrimeGenerator(1, 10);
  gen.generatePrimes();
  Long[] expectedPrimes = {2L, 3L, 5L, 7L};
  assertArrayEquals( expectedPrimes,
  gen.getPrimes().toArray() );

Place PrimeGenerator in the package edu.umb.cs680.hw01
• Implement PrimeGeneratorTest in the package edu.umb.cs680.hw01
    – Write more than one test method
• Test a regular case (positive test)
    – Use assertArrayEquals()
• Test error cases where wrong ranges are given (negative test)
    – e.g., [-10, 10], [100, 1]
    – You can name test methods as you like. Make sure to give them specific (not vague) names.
• Place source code files and binary files in different directories.
    – <proj dir>/src/edu/umb/cs680/hw01/PrimeGenerator.java
    – <proj dir>/src/edu/umb/cs680/hw01/PrimeGeneratorTest.java
    – <proj dir>/bin/edu/umb/cs680/hw01/PrimeGenerator.class
    – <proj dir>/bin/edu/umb/cs680/hw01/PrimeGeneratorTest.class

• Compile your code on your IDE
• Run test cases with JUnit on your IDE
• No need to use Ant in this HW.
• Put your HW 1-1 and 1-2 solutions in your GitHub repo.
  
## HW2

### Step1: Run the build script hw.xml (ant -f hw.xml)
• Will send you:
    – <proj dir>/src/edu/umb/cs680/junit5intro/Calculator.java
    – <proj dir>/hw.xml
• Run the build script (on your command-line shell) in the directory where it is located (i.e., at <proj dir>).
    – Type: ant -f hw.xml
• Understand how it builds and runs Calculator
    – Set up the directory where Calculator.class is placed.
• <proj dir>/bin/edu/umb/cs680/junit5intro
    – Set up CLASSPATH
• <proj dir>/bin
    – Compile Calculator.java and generate Calculator.class to <proj dir>/bin/edu/.../junit5intro
• Use <javac> task
    – Run Calculator.class
• Use <java> task to run Calculator’s main()
• No need to do unit testing
    – No need to use JUnit and CalculatorTest
• No need to turn in anything. Just make sure that the build script runs properly.
    – At least, on your shell
    – Preferably, on your shell and IDE
  
### Step2: Use ANT to build and run Calculator and CalculatorTest
• Set up:
    – <proj dir>
• hw02.xml (You can name it as you like.)
• src [source code directory]
    – edu/umb/cs680/hw02/Calculator.java
• bin [binary code directory]
    – Calculator.class will be placed under this directory.
• test [test code directory]
    – src
      » edu/umb/cs680/hw02/CalculatorTest.java
    – bin
      » CalculatorTest.class will be placed under this directory.
• Write hw02.xml yourself.
• Use Ant to build and run Calculator and CalculatorTest
    – Set up the directory where Calculator.class is placed.
• <proj dir>/bin/edu/umb/cs680/hw02
    – Set up the directory where CalculatorTest.class is placed.
• <proj dir>/test/bin/edu/umb/cs680/hw02
    – Set up CLASSPATH
• <proj dir>/bin
• <proj dir>/test/bin
• JUnit JAR files (see the next slide)
    – Compile Calculator.java and generate Calculator.class to <proj dir>/bin/edu/.../hw02
    – Compile CalculatorTest.java and generate CalculatorTest.class to <proj dir>/test/bin/edu/.../hw02
    – Run CalculatorTest.class with JUnit
    – Run Calculator.class
  
  
## HW3

• Re-do HW 1-2 with Ant.
    – In HW 1-2, you didn’t have to use Ant.
    – Use Ant to
• Do pre-compilation configurations (e.g., directory structures, CLASSPATH settings, etc.)
• Compile PrimeGenerator and PrimeGeneratorTest
• Run test methods (test cases) in PrimeGeneratorTest
  
## HW4
  
• Complete the Student class and test its (3) static factory methods.
    – Write test cases with JUnit.
    – Optional: Implement a factory class
• Separate StudentFactory and Student

## HW5

• Define the Car class and implement its getter methods.
    – public class Car {
        private String make, model;
        private int mileage, year;
        private float price; 
      }
• Write a test class (CarTest) with JUnit
    – Include a private method carToStringArray()
    – Define a test method verifyCarEqualityWithMakeModelYear()
• Create two Car instances and check their equality with arrayto-
• array comparison
    – Use make, model and year in equality-check logic
    – String[] expected = {“Toyota”, “RAV4”, “2018”};
      Car actual = new Car(...);
      assertArrayEquals(expected,
      carToStringArray(actual) );

## HW6

• Implement the DVD example with Stateand Singleton.
• Write and run all necessary test cases. 
