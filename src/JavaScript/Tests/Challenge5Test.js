const Challenge5 = require("../Challenges/Challenge5");
const TestRunner = require("./TestRunner");

class Challenge5Test{
  runTests() {
    const inputs = ["racecar", "hello", "Madam", "noon", "abcba", "Python", "Level", "openai", "rotor", "world"];
    const expectedResults = ["true", "false", "true", "true", "true", "false", "true", "false", "true", "false"];

    return TestRunner.runTests(new Challenge5(), inputs, expectedResults);
  }
}

module.exports = Challenge5Test;