const Challenge5 = require("../Challenges/Challenge5");
const TestRunner = require("./TestRunner");

class Challenge5Test{
  runTests() {
    const inputs = [
      "A man a plan a canal Panama",
      "Eva can I see bees in a cave",
      "Hello World",
      "ABRACARBA",
      "Racecar",
      "DevPro step on no pets a step on no pets orp ved",
      "Not a palindrome",
      "12321",
      "123abccba321",
      "This is definitely not"];

    const expectedResults = [
      true,
      true,
      false,
      true,
      true,
      true,
      false,
      true,
      true,
      false];

    return TestRunner.runTests(new Challenge5(), inputs, expectedResults);
  }
}

module.exports = Challenge5Test;