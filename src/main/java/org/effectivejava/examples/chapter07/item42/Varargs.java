// Sample uses of varargs
package org.effectivejava.examples.chapter07.item42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Varargs {

	// Simple use of varargs - Page 197
	static int sum(int... args) {
		int sum = 0;
		for (int arg : args)
			sum += arg;
		return sum;
	}

	// The WRONG way to use varargs to pass one or more arguments! - Page 197
	// static int min(int... args) {
	// if (args.length == 0)
	// throw new IllegalArgumentException("Too few arguments");
	// int min = args[0];
	// for (int i = 1; i < args.length; i++)
	// if (args[i] < min)
	// min = args[i];
	// return min;
	// }

	// The right way to use varargs to pass one or more arguments - Page 198
	static int min(int firstArg, int... remainingArgs) {
		int min = firstArg;
		for (int arg : remainingArgs)
			if (arg < min)
				min = arg;
		return min;
	}

	public static void main(String[] args) {
//		System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//		System.out.println(min(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		Set<Integer> set = new TreeSet<>();
		List<Integer> list = new ArrayList<>();
		for(int i=-3; i<3; i++) {
			set.add(i);
			list.add(i);
		}
		for(int i=0;i<3;i++) {
			set.remove(i);
			list.remove(i);
		}
		System.out.println(set + " " + list);

		int[] digits = {2,1,4,23,5,45,56};
		System.out.println(Arrays.asList(digits));
		System.out.println(Arrays.toString(digits));
	}
}
