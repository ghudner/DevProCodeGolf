package Java.Tests;

import Java.Challenges.Challenge2;

public class Challenge2Test implements ChallengeTest{

        @Override
        public int runTests() {
            Integer[] inputs = {
                    3, 5, 15, 7, 9, 20, 30, 8, 11, 45
            };
            String[] expectedResults = {
                    "Fizz", "Buzz", "FizzBuzz", "7", "Fizz", "Buzz", "FizzBuzz", "8", "11", "FizzBuzz"
            };

            return TestRunner.runTests(new Challenge2(), inputs, expectedResults);
        }
    }

