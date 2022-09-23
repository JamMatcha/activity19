package com.zuitt.vertere;

import java.lang.reflect.Array;
import java.util.*;

public class Activity {
    public static void main(String[] args) {
        //2. create an array of fruits and print it in the console
        /*- apple
            - avocado
            - banana
            - kiwi
            - orange*/

        String fruitsArray[] = new String[5];
        fruitsArray[0] = "apple";
        fruitsArray[1] = "avocado";
        fruitsArray[2] = "banana";
        fruitsArray[3] = "kiwi";
        fruitsArray[4] = "orange";

        //print the fruits array
        System.out.println("Fruits in stock: " + Arrays.toString(fruitsArray));
        /*
        * 3. Create a new instance of the Scanner class and ask the user which fruit they would like the index of.
             - Make sure that the information is filtered even if the user input is capitalized and includes spaces.
        * */
        Scanner fruitScanner = new Scanner(System.in);
        System.out.println("Which fruit would you like to get the index of?");
        String chosenFruit = fruitScanner.nextLine().trim().toLowerCase();
        Arrays.sort(fruitsArray);
        //4. Print out a message informing the user of the index number of the fruit they are looking for.
        String searchFruit = chosenFruit;
        int result = Arrays.binarySearch(fruitsArray, searchFruit);
        System.out.println("The index of " + searchFruit + " is: " + result);

        /*
        * 5. Create two HashMaps of users with the following details:
             - firstName - String
             - lastName - String
        * */
        HashMap<String, String> userA = new HashMap<>();
        userA.put("firstName", "John");
        userA.put("lastName", "Smith");

        HashMap<String, String> userB = new HashMap<>();
        userB.put("firstName", "Jane");
        userB.put("lastName", "Doe");

        //print
        System.out.println("User A: ");
        System.out.println(userA);
        System.out.println("User B: ");
        System.out.println(userB);

//6. Create an Array List of Users then add the user Hash Maps to it.
        ArrayList<String>users = new ArrayList<>();
        users.add(userA.toString());
        users.add(userB.toString());
        System.out.println("Current Users: ");
        System.out.println(users);

        /*
        * Stretch Goal:

        1. Print out the details of the element in the users Array List using the user's input.

        - If the user inputs the number two, it should result in printing the 2nd element in the Array List and not based on the index number.
        * */
        System.out.println("What user id would you like to view the details?");
        int enterID = fruitScanner.nextInt();
        System.out.println(users.get(enterID));



    }
}
