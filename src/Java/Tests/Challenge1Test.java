package Java.Tests;

import Java.Challenges.Challenge1;

public class Challenge1Test implements ChallengeTest{

        @Override
        public int runTests() {
            Integer[] inputs = {
                    123, -49, 0, 9999, 2468, -1357, 11111, 908172, -2024, 5
            };
            Integer[] expectedResults = {
                    6, 13, 0, 36, 20, 16, 5, 27, 8, 5
            };

            return TestRunner.runTests(new Challenge1(), inputs, expectedResults);
        }
    }

