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
1. I used SonarCloud as my scanning tools. The code quality issue that I found in the code is the absence of description in my Product List Table. I think the absence of description in the Product List Table is a code quality issue because it makes the code less readable. We can solve this issue by adding a description enclosed by a `<caption>` tag in the Product List Table. The description should explain the purpose of the Product List Table and the meaning of each column in the Product List Table. After I fixed that, SonarCloud shows that the code quality is good. 

2. Yes, the current implementation has met the definition of Continuous Integration and Continuous Deployment. As the name suggest, CI/CD definition is met when our code has continuous integration and continuous deployment. The code is integrated continuously and automatically using the CI workflow. The code is deployed continuously and automatically using the Koyeb PaaS. The code is tested continuously and automatically using Scorecard and SonarCloud. Hence the current implementation has met the definition of Continuous Integration and Continuous Deployment.

## Week 3

### Reflection 1
The principles of the SOLID design that applied in my code are:
- Single Responsibility Principle: By separating each class into different files, I make sure that each class has only one responsibility. For example, the ProductController class has the responsibility to handle the product-related requests. The ProductRepository class has the responsibility to handle the product-related database operations. The Product class has the responsibility to represent the product entity. While the CarController class has the responsibility to handle the car-related requests. The CarRepository class has the responsibility to handle the car-related database operations. The Car class has the responsibility to represent the car entity.
- Open Closed Principle: By implementing the basic function on Car and Product, we don't need to add the same function on the other class inheriting them. As example if I want to make a new class called `Book`, I can just inherit the `Product` class and I don't need to add the same function again. I just need to add the new function that is not available in the `Product` class. This way my Product is open for extension but closed for modification.
- Interface Segregation Principle: By implementing the interface, I make sure that the client only knows what it needs. For example, CarServiceImpl class only knows the methods that are available in the CarService interface. ProductServiceImpl class only knows the methods that are available in the ProductService interface. This way I make sure that the client only knows what it needs.

The advantages of applying the SOLID design in my code are:
- The code is easier to maintain. 
By separating each class into different files, I make sure that each class has only one responsibility. This makes the code easier to maintain. If I want to change the behavior of a class, I only need to change the class that has the responsibility to handle the behavior. I don't need to change the other classes. For example, if I want to change the behavior of the ProductController class, I only need to change the ProductController class. I don't need to change the ProductRepository class and the Product class.
- The code is easier to test. 
By implementing the interface, I make sure that the client only knows what it needs. This makes the code easier to test. I can create a mock object that implements the interface. Then I can use the mock object to test the client. This way I can test the client without testing the other classes. For example, I can create a mock object that implements the ProductService interface. Then I can use the mock object to test the ProductController class. This way I can test the ProductController class without testing the ProductRepository class and the Product class.
- The code is easier to understand.
By implementing the basic function on Car and Product, we don't need to add the same function on the other class inheriting them. This makes the code easier to understand. If I want to understand the behavior of a class, I only need to understand the class that has the responsibility to handle the behavior. I don't need to understand the other classes. For example, if I want to understand the behavior of the ProductController class, I only need to understand the ProductController class. I don't need to understand the ProductRepository class and the Product class.

The disadvantages of applying the SOLID design in my code are:
- The code is more complex.
By separating each class into different files, I make sure that each class has only one responsibility. This makes the code more complex. If I want to understand the behavior of a class, I need to understand the class that has the responsibility to handle the behavior. I also need to understand the other classes. For example, if I want to understand the behavior of the ProductController class, I need to understand the ProductController class. I also need to understand the ProductRepository class and the Product class.
- The code is more strict.
By implementing the interface, I make sure that the client only knows what it needs. This makes the code more strict. If I want to change the behavior of a class, I need to change the class that has the responsibility to handle the behavior. I also need to change the other classes. For example, if I want to change the behavior of the ProductController class, I need to change the ProductController class. I also need to change the ProductRepository class and the Product class.