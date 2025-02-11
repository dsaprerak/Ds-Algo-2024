package tests;
import java.util.Arrays;
import java.util.HashMap;

/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

public class P1ClimbStairs {
    public static void main(String[] args) {
        System.out.println(distinctWaysToClimb(1));
        System.out.println(distinctWaysToClimb(3));
        System.out.println(distinctWaysToClimb(5));
        System.out.println(distinctWaysToClimb(36));
    }

    public static int distinctWaysToClimb(int steps) {
        if (steps == 0) {
            return 0;
        }
//        Using Hashmap here -> to reuse the calculation used for finding the ways for same numbers of steps
        return distinctWays(steps, new HashMap<>());
    }

    //         Using recursion bcz at every step you have two options -> can climb 1 or 2 steps
    public static int distinctWays(int steps, HashMap<Integer, Integer> map) {
//        if: steps reaches 0 than that is one possible way.
//        else if: steps are -ve that means it over steps -> wrong way
        if (steps == 0) {
            return 1;
        } else if (steps < 0) {
            return 0;
        }
        int oneStep = 0;
        int twoStep = 0;
//        take one step
        if (map.containsKey(steps - 1)) {
            oneStep = map.get(steps - 1);
        } else {
            oneStep = distinctWays(steps - 1, map);
            map.put(steps - 1, oneStep);
        }
//        take two steps
        if (map.containsKey(steps - 2)) {
            twoStep = map.get(steps - 2);
        } else {
            twoStep = distinctWays(steps - 2, map);
            map.put(steps - 2, twoStep);
        }
//        Add ways by taking one step and two steps
        return oneStep + twoStep;
    }

}