const Challenge1Test = require("./JavaScript/Tests/Challenge1Test");
const Challenge2Test = require("./JavaScript/Tests/Challenge2Test");
const Challenge3Test = require("./JavaScript/Tests/Challenge3Test");
const Challenge4Test = require("./JavaScript/Tests/Challenge4Test");
const Challenge5Test = require("./JavaScript/Tests/Challenge5Test");

function main() {
  const tests = [ new Challenge1Test(), new Challenge2Test(), new Challenge3Test(), new Challenge4Test(), new Challenge5Test()  ];
  let totalFailures = 0;

  console.log("\n=== JavaScript - DevPro Code Golf Summary ===\n");

  tests.forEach((test, i) => {
    console.log(`Testing Challenge${i + 1}.js:`);
    const failed = test.runTests();
    if (failed === 0) {
      console.log(`Challenge ${i + 1}: ✅ All tests passed`);
    } else {
      console.log(`Challenge ${i + 1}: ❌ ${failed} test(s) failed`);
      totalFailures += failed;
    }
  });

  if (totalFailures === 0) {
    console.log("🏆🏆🏆 !!All JavaScript challenges passed!! 🏆🏆🏆");
    process.exit(0);
  } else {
    console.log(`\nTotal failed test cases across JavaScript challenges: ${totalFailures} (character penalty of ${totalFailures * 100})\n`);
    process.exit(totalFailures); 
  }
}

if (require.main === module) {
  main();
}