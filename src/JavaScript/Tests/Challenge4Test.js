const Challenge4 = require("../Challenges/Challenge4");
const TestRunner = require("./TestRunner");

class Challenge4Test{
  runTests() {
const inputs = [
      1234,
      509,
      0,
      987654,
      1001,
      24680,
      13579,
      111,
      9081726354,
      4440
    ];

    const expectedResults = [
      4321,       
      950,        
      0,          
      987654,     
      1100,       
      86420,      
      97531,      
      111,        
      9876543210,
      4440        
    ];

    return TestRunner.runTests(new Challenge4(), inputs, expectedResults);
  }
}

module.exports = Challenge4Test;