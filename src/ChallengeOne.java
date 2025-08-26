public class ChallengeOne {
    //CHALLENGE 1: Is it a palindrome?
    //Write a function that recieves a String and returns boolean true only if the 
    //string has the same characters in reverse. Ex) "anna" -> true, "abcd" -> false
    //
    //      * Not case sensitive:   "aaaAAA" -> true
    //      * Ignore all spaces:    "a a a aaa" -> true
    //
    
    
    //All characters (including spaces/newlines) in the function p() below count towards your total***


    // *** START HERE ***

   boolean p(String s) { return true; }

    // *** END HERE ***


    //---SAMPLE SOLUTION---
    //TODO: DELETE THIUS BEFORE THE COMPETITION
   boolean ps(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    //TODO: DELETE THIUS BEFORE THE COMPETITION

 
    //---DO NOT MODIFY ANY CODE BELOW---
    public int runTests() {
        ChallengeOne tester = new ChallengeOne();

        String[] inputs = {
            "A man a plan a canal Panama",
            "Eva can I see bees in a cave",
            "Hello World",
            "ABRACARBA",
            "Racecar",
            "DevPro step on no pets a step on no pets orp ved",
            "Not a palindrome",
            "12321",
            "123abccba321",
            "This is definitely not"
        };
   
        boolean[] expectedResults = {
            true,
            true,
            false,
            true,
            true,
            true,
            false,
            true,
            true,
            false};


        System.out.println("\n======================================");
        System.out.println("ChallengeOne.java - Palindrome:\n");

        int testsFailed = 0;
         for (int i = 0; i < inputs.length; i++) {
             boolean r;
            try {
                r = tester.p(inputs[i]);
            } catch (Exception e) {
                testsFailed++;
                continue;
            }if (r != expectedResults[i]) {
                testsFailed++;
            }
        }
        if(testsFailed == 0)
        {
            System.out.printf("\nChallengeOne.java - Palindrome: All tests passed!");
            System.out.printf("\n======================================\n");
            return 0;
        }

        for (int i = 0; i < inputs.length; i++) 
        {
            boolean r;
            try {
                r = tester.p(inputs[i]);
            } 
            catch (Exception e) {
                System.out.printf("Test #%2d ERROR — Input: %-35s threw exception: %s%n", i + 1, inputs[i], e);
                continue;
            }
            if (r == expectedResults[i]) {
                System.out.printf("Test #%2d passed — Input: %-35s Output: %b%n", i + 1, inputs[i], r);
            } else {
                System.out.printf("Test #%2d FAILED — Input: %-35s Output: %b (Expected: %b)%n", i + 1, inputs[i], r, expectedResults[i]);
            }
        }

        System.out.printf("\nChallengeOne.java - Palindrome: %d test(s) FAILED.", testsFailed);
        System.out.printf("\n======================================\n");

        return testsFailed;
    }
}
