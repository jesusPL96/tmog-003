package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    @Test
    @Ignore
    void testSolutionV1() {

        Integer[] intArray = {1,10, -9, 6, -8, 2};

        var result = Solution.maxSubArrayV1(intArray);

        assertEquals(11, result);
    }

    @Test
    void testSolutionV2() {

        Integer[] intArray = {1,10, -9, 6, -8, 2};

        var result = Solution.maxSubArrayV2(intArray);

        assertEquals(11, result);
    }

    @Test
    void testUniqueMaxArray(){

        Integer[] intArray = {2};

        var result = Solution.maxSubArrayV2(intArray);

        assertEquals(2, result);

    }

    @Test
    void testAllMaxArray(){

        Integer[] intArray = {1,10, -1, 8, 2};

        var result = Solution.maxSubArrayV2(intArray);

        assertEquals(20, result);

    }

}