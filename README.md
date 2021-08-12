# Java Fundamentals Assessment Review

- Explore the structure of the `src` directory
- All your classes will live within the `java` directory 

## Problems

1. In the **AssessmentReview** class inside the `java` directory.

    - Write a public static method named `cubed` that accepts an integer as
      input and returns that number to the third power.
    - Write a public static method named `difference` that accepts two arguments and
      that works with both integers and doubles (use method overloading) and
      returns the result of subtracting the two passed numbers.
    - Write a public static method named `median` that takes in an array of
      `int` numbers (not a `List`, an array) and returns the median as a `double`.
      - (Hint: there are examples of how to find median of an array in Java all over the internet)
      - (Hint: the sort method on the Arrays class may be very helpful here)
      - (Hint: make sure the median of `[1, 3, 4, 2, 6, 5, 8, 7]` is `4.5`)



2. Create a class named **Pet** inside of `src`.

    - The class should define three instance properties. One of type `int` named
      `age`, one of type `boolean` named `isRescue`, and one of type `String` named `name`. These properties should not be accessible
      outside the **Pet** class.
    - Add a constructor method that takes in three parameters of the types above and sets `age`
      ,`isRescue`, and `name` properties based on the passed arguments.
    - If the passed `name` argument is `null`,
      the constructor should throw an `IllegalArgumentException`.
    - Write a getter and setter for all three properties.



3. Create a class named **Cat** that inherits from **Pet**.

    - Add a protected instance property named `color` that is a String. This
      property represents the color of each instance of **Cat**.
    - Write the constructor on **Cat** that defines 4 parameters: the age
      of the cat, a boolean indicating whether the cat is a herbivore, what the cat's name is, and the color of the cat. The corresponding properties of the object
      should be set based on the arguments passed to the constructor.
     (Hint: use of the super constructor may be useful here)
    - Write a getter and setter on the **Cat** class for the `color` property.



4. Create a class named **Dog** that also inherits from **Pet**.

   - Add a protected instance property named `breed` that is a String. This
     property represents the breed of each instance of **Dog**.
   - Write the constructor on **Dog** that defines 4 parameters: the age
     of the dog, a boolean indicating whether the dog is a herbivore, what the dog's name is, and the breed of the dog. The corresponding properties of the object
     should be set based on the arguments passed to the constructor.
     (Hint: use of the super constructor may be useful here)
   - Write a getter and setter on the **Dog** class for the `breed` property.



5. Create an interface named **Meowable**.

    - The **Meowable** interface should specify an instance method named `meow`
      that accepts no arguments and is void.
    - Change your **Cat** class so that it implements the **Meowable** interface.
    - The implementation of the `meow` method on Cat class should print the following message:
      ```
      This is a meow!
      ```



6. Create an interface named **Barkable**.

   - The **Barkable** interface should specify an instance method named `bark`
     that accepts no arguments and is void.
   - Change your **Dog** class so that it implements the **Barkable** interface.
   - The implementation of the `bark` method on the **Dog** class should print the following message:
     ```
     Bork bork!
     ```
 

   
7. On your **AssessmentReview** class create a static method named `capitalizeCatColor`.

   This method should:

    - Take in an `ArrayList` of **Cat** objects as a parameter.
    - The method should return a `ArrayList` of **Cat** objects where each cat
      object's `color` property is capitalized.

   Sample Input

     ```
     black
     orange
     white    
     ```
   Sample Output

    ```
    BLACK
    ORANGE
    WHITE
    ```

   Hints

    - Check to make sure that each **Cat**'s `color` property is capitalized
    - If they are not, **_USE THE SETTER_** to capitalize the `color` property.
    

## Testing your Code

You can (and are encouraged to) use the classes in the **test-methods** package to test the code that you have written.
You will need to uncomment the code in the main method of each class and run it. Make sure the output matches the example output in comments.
**DO NOT UNCOMMENT THE OUTPUT PORTION** 
