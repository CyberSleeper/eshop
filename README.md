# E-Shop

## Description
This is my Advanced Programming course project. This README will contain the documentation and answers to the questions given in the project assignment.

## Table of Contents
- [Week 1](#week-1)
- [Week 2](#week-2)

## Week 1

### Reflection 1
After I implemented the code for edit-product and delete-product independently, I learned that I need to make sure that the 2 features works on different files. But if they ought to be coded in the same file, at least they should be coded in different functions. This is because if we code in the same function, it will be more likely to get merge conflicts. It would be better to push the shared function part first to main, then make sure for all the branch to pull from main. It is also important to keep things in our workspace synced with the main branch. Lest the other dev coded in the shared function without knowing the main branch has changed.

### Reflection 2
After writing the unit test, I feel more confident about my code. I think the number of unit tests should be made in a class is at least the number of functions in the class. We should cover all the possibilities that could happen. We can make sure that our unit tests are enough to verify our program by checking the code coverage. Code coverage is a metric that can help us understand how much of our source is tested. If we have 100% code coverage, that does not mean our code has no bugs or errors. It just means that all the lines of code are executed at least once. It is possible that the code is executed but the output is not as expected.

The new functional test suite might reduce the code quality. The potential clean code issues are:
- Duplication: The new functional test suite will have the same setup procedures and instance variables. This is a duplication of code. We can solve this issue by creating a new class that contains the setup procedures and instance variables. Then we can extend the new class in the new functional test suite.
- Readability: The new functional test suite will have the same setup procedures and instance variables. This will make the code less readable. We can solve this issue by creating a new class that contains the setup procedures and instance variables. Then we can extend the new class in the new functional test suite.
- Maintainability: The new functional test suite will have the same setup procedures and instance variables. This will make the code less maintainable. We can solve this issue by creating a new class that contains the setup procedures and instance variables. Then we can extend the new class in the new functional test suite.

## Week 2

### Reflection 1
1. The code quality issue that I found in the code is the absence of description in my Product List Table. I think the absence of description in the Product List Table is a code quality issue because it makes the code less readable. We can solve this issue by adding a description enclosed by a `<caption>` tag in the Product List Table. The description should explain the purpose of the Product List Table and the meaning of each column in the Product List Table.

2. Yes, the current implementation has met the definition of Continuous Integration and Continuous Deployment. The code is integrated continuously and automatically using the CI workflow. The code is deployed continuously and automatically using the Koyeb PaaS. The code is tested continuously and automatically using Scorecard and SonarCloud.