package co.nvqa.interview.logic;

/**
 * Please write a function to find the missing number from list asumption: 1. only 1 missing number
 * 2. array items ranging from 0 > n < ~ 3. return -1 if no missing number in the list
 **/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FindMissingNumber {

  @Test
  public void test() {

    // test
    // 1 missing number
    List<Integer> input1 = Arrays.asList(4, 1, 3, 5, 7, 6);
    System.out.println(findMissingNumber(input1));

    // no missing number
    List<Integer> input2 = Arrays.asList(4, 1, 2, 3, 5, 7, 6);
    System.out.println(findMissingNumber(input2));
  }

  public Integer findMissingNumber(List<Integer> input) {
    // todo: sort the list
    Collections.sort(input);

    // todo: find the number
    return null;
  }


}