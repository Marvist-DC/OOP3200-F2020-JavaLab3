/*
    Author: Domenic Catalano & Duy Tan Vu
    Date: Sunday, December 06, 2020
    Program Name: OOP 3200 Java Lab 3
 */

package ca.durhamcollege.core;

import ca.durhamcollege.utility.*;

import java.time.LocalDate;

// Main program
public class Main {
    public static void main(String[] args) {
        // Try-catch block
        try {
            // Set first work ticket with default parameter
            ExtendedWorkTicket firstNewTicket = new ExtendedWorkTicket();

            // Set second work ticket with parameterized work ticket
            ExtendedWorkTicket secondNewTicket = new ExtendedWorkTicket(1, "abc", LocalDate.of(2020, 12, 12), "something", true);

            // Pass a Workticket Object to the ExtendedWorkTicket as a param
            WorkTicket normalWorkticket = new WorkTicket(2, "def", LocalDate.of(2021, 1, 1), "another thing");
            ExtendedWorkTicket thirdNewTicket = new ExtendedWorkTicket(normalWorkticket, false);

            // Print two ticket attributes using overridden toString() method
            System.out.println(firstNewTicket.toString());
            System.out.println(secondNewTicket.toString());
            System.out.println(thirdNewTicket.toString());

            secondNewTicket.closeTicket();
            thirdNewTicket.openTicket();

            System.out.println(secondNewTicket.toString());
            System.out.println(thirdNewTicket.toString());

            // setWorkTicket method will return false if any of the input param is invalid
            if (!firstNewTicket.setWorkTicket(1, "abc", LocalDate.of(2021, 10, 10), "dhasufh", true))
                System.out.println("\nErrors! No changes to the first ticket.");
            else
                System.out.println("\nFirst work ticket are set with new attributes.");

            if (!secondNewTicket.setWorkTicket(1, "abc", LocalDate.of(2020, 10, 10), "dhasufh", false))
                System.out.println("\nErrors! No changes to the second ticket.");
            else
                System.out.println("\nSecond work ticket are set with new attributes.");

        } catch (IllegalArgumentException illegalArgumentException) {
            // Catch and print any IllegalArgumentException
            System.out.println(illegalArgumentException);
        }
    }
}

