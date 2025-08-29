const Challenge3 = require("../Challenges/Challenge3");
const TestRunner = require("./TestRunner");

class Challenge3Test{
  runTests() {
    const inputs = ["Hello", "xyz", "AEIOU", "banana", "PYTHON", "DevProPondersPoolPartyPurchases", "LaurieLikesLettuceLoads", "DalinDoesntDoDodgeball", "NickeroniNeverNeedsNinjas", ""];
    const expectedResults = [2, 0, 5, 3, 1, 10, 11, 8, 10, 0];

    return TestRunner.runTests(new Challenge3(), inputs, expectedResults);
  }
}

module.exports = Challenge3Test;