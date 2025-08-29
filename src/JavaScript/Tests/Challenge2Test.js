const Challenge2 = require("../Challenges/Challenge2");
const TestRunner = require("./TestRunner");

class Challenge2Test{
  runTests() {
    const inputs = [3, 5, 15, 7, 9, 20, 30, 8, 11, 45];
    const expectedResults = ["Fizz", "Buzz", "FizzBuzz", "7", "Fizz", "Buzz", "FizzBuzz", "8", "11", "FizzBuzz"];

    return TestRunner.runTests(new Challenge2(), inputs, expectedResults);
  }
}

module.exports = Challenge2Test;