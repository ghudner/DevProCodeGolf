package Java.Tests;

import Java.Challenges.Challenge4;

public class Challenge4Test implements ChallengeTest{

        @Override
        public int runTests() {
            Integer[] inputs = {
                    1234,
      509,
      0,
      987654,
      1001,
      24680,
      13579,
      111,
      981726354,
      4440
            };
            Integer[] expectedResults = {
                    4321,       
      950,        
      0,          
      987654,     
      1100,       
      86420,      
      97531,      
      111,        
      987654321,
      4440     
            };

            return TestRunner.runTests(new Challenge4(), inputs, expectedResults);
        }
    }

