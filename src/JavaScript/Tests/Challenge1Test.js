const Challenge1 = require("../Challenges/Challenge1");
const TestRunner = require("./TestRunner");

class Challenge1Test{
  runTests() {
    const inputs = [123, -49, 0, 9999, 2468, -1357, 11111, 908172, -2024, 5];
    const expectedResults = [6, 13, 0, 36, 20, 16, 5, 27, 8, 5];

    return TestRunner.runTests(new Challenge1(), inputs, expectedResults);
  }
}

module.exports = Challenge1Test;