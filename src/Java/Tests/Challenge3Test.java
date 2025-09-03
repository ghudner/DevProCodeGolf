package Java.Tests;

import Java.Challenges.Challenge3;

public class Challenge3Test implements ChallengeTest{

        @Override
        public int runTests() {
            String[] inputs = {
                    "Hello", "xyz", "AEIOU", "banana", "PYTHON", "DevProPondersPoolPartyPurchases", "LaurieLikesLettuceLoads", "DalinDoesntDoDodgeball", "NickeroniNeverNeedsNinjas", ""
            };
            Integer[] expectedResults = {
                    2, 0, 5, 3, 1, 10, 11, 8, 10, 0
            };

            return TestRunner.runTests(new Challenge3(), inputs, expectedResults);
        }
    }

