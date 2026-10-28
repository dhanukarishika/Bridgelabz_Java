
package StacksAndQueues.Stack;

import java.util.Stack;
import java.util.Arrays;

/*
 * Q3. Stock Span Problem
 * Find the number of consecutive days with prices less than
 * or equal to the current day's stock price.
 */

public class StockSpanProblem {

    // Calculate stock span using stack
    static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Remove indices with smaller or equal prices
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span for current day
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Stock Prices: " + Arrays.toString(prices));
        System.out.println("Stock Span: " + Arrays.toString(calculateSpan(prices)));
    }
}
