package com.soe.alfano.fibonacci;

import java.util.Scanner;

public class RecursiveFibTracer {

	   public static void main(String[] args)
	   {  
	      Scanner in = new Scanner(System.in);
	      System.out.print("Enter n: ");
	      int n = in.nextInt();

	      long f = fib(n);

	      System.out.println("fib(" + n + ") = " + f);
	   }

	   /**
	      Computes a Fibonacci number.
	      @param n an integer
	      @return the nth Fibonacci number
	   */
	   public static long fib(int n)
	   {
	      System.out.println("Entering fib: n = " + n);
	      long f;
	      if (n <= 2) { f = 1; }
	      else { f = fib(n - 1) + fib(n - 2); }
	      System.out.println("Exiting fib: n = " + n
	            + " return value = " + f);
	      return f;
	   }
	   
}
