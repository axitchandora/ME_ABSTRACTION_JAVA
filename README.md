# ME_ABSTRACTION_JAVA
*Project Repo for the Java Abstraction Byte*


#### Debrief

-   Practical scenarios
    
    -   The Java Virtual Machine is an abstraction. Your code can use the exact same java methods irrespective of whether your code will run on Linux or Windows or any other OS. Underneath, a lot of things will change depending on the OS, which the user doesn’t need to know.
        
    -   You can use a simple API call to fetch weather data or stock prices. These API abstract out the internal complexities of how it is implemented.
        
    -   Software libraries are good examples of abstraction. They tell you the methods you can use without telling you how they are implemented.
        
-   Summary of Abstraction
    
    -   It separates the method signature from its implementation.
        
    -   Closely related classes can separate out common fields/methods into a different class and reuse that class.
        
    -   **Why** is it useful? - To the implementers of the class, it is useful since it provides them with the flexibility to change things as long as the method signatures don’t change. For the users, it keeps them from getting exposed to anything other than the method signatures they need to know, reducing complexity.
        
    -   **How** to apply? - Use a smaller set of public methods
        
    -   What is the drawback if we don’t use abstraction? - Low maintainability because responsibilities are not clearly differentiated. Higher Complexity with larger code bases because many objects interact with others and it becomes difficult to add functionality without impacting others.
        
-   Language specific notes
    
    -   In Java, `interface` classes provides total abstraction and `abstract` classes provide partial abstraction
        
    -   In C++, you can use either header files to achieve abstraction or private methods to hide implementation details.
        
    -   Python interface can be applied using the the Abstract Base Class library
        
-   General Abstraction notes
    
    -   Hides underlying complexity of data from users
        
    -   Helps avoid repetitive code
        
    -   Presents only the signature of internal functionality
        
    -   Gives flexibility to programmers to change the implementation of the abstract behaviour
        
-   Difference between Encapsulation and Abstraction
    
    -   Abstraction is a natural extension of Encapsulation. Encapsulation recommends that you create entities/objects which contain closely related fields and functionality/methods. Abstraction further recommends that the entities expose only their method signatures to external users who shouldn’t need to worry about the underlying implementation.
        
    -   Encapsulation - hide data. Abstraction - hide complexity.
        

### References

1.  [Interface vs. Abstract Class in Java](https://howtodoinjava.com/java/oops/exploring-interfaces-and-abstract-classes-in-java/)
    
2.  [Abstraction vs Encapsulation](https://www.quora.com/What-is-the-difference-between-abstraction-and-encapsulation-2)
    
3.  [OOPS Concepts Java - Abstraction](https://raygun.com/blog/oop-concepts-java/#abstraction)
    
4.  [Implementing an Interface in Python](https://realpython.com/python-interface/)
    
5.  [Abstract Base Classes in Python](https://dbader.org/blog/abstract-base-classes-in-python)
