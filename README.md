# E-Shop

## Description
This is my Advanced Programming course project. This README will contain the documentation and answers to the questions given in the project assignment.

## Reflection 1
After I implemented the code for edit-product and delete-product independently, I learned that I need to make sure that the 2 features works on different files. But if they ought to be coded in the same file, at least they should be coded in different functions. This is because if we code in the same function, it will be more likely to get merge conflicts. It would be better to push the shared function part first to main, then make sure for all the branch to pull from main. It is also important to keep things in our workspace synced with the main branch. Lest the other dev coded in the shared function without knowing the main branch has changed.