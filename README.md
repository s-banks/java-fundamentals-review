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

1. Create a class named **Animal** inside of `src`.

    - The class should define two instance properties. One of type `int` named
      `numberOfLegs`, and one of type `boolean` named `isVegetarian`. These properties should not be accessible
      outside the **Animal** class.
    - Add a constructor method that takes in two parameters of the types above and sets `numberOfLegs`
      and `isVegetarian` properties based on the passed arguments.
    - If either of the passed `numberOfLegs` or `isVegetarian` arguments are `null`,
      the constructor should throw an `IllegalArgumentException`.
    - Write a getter and setter for the `numberOfLegs` property as well as a getter and setter for `isVegetarian`.

1. Create a class named **Cat** that inherits from **Animal**.

    - Add a protected instance property named `color` that is a String. This
      property represents the color of each instance of **Cat**.
    - Write the constructor on **Cat** that defines 3 parameters: the number of legs
      for the animal, a boolean indicating whether that animal is a vegetarian, and the color of the cat. The corresponding properties of the object
      should be set based on the arguments passed to the constructor.
     (Hint: use of the super constructor may be useful here)
    - Write a getter and setter on the **Cat** class for the `color` property.

1. Create an interface named **Meowable**.

    - The Meowable interface should specify an instance method named `meow`
      that accepts no arguments and is void.
    - Change your **Cat** class so that it implements the **Meowable** interface.
    - The implementation of the `meow` method on Cat class should print the following message:
      ```
      This is a meow!
      ```
    
1. On your **AssessmentReview** class create a static method named `capitalizeCatColor`.

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

You can (and are encouraged to) use the `main` method in the **TestYourMethods** class to test the code that you have written.
