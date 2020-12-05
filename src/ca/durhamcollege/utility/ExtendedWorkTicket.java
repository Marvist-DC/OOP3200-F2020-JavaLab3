/*
    Author: Domenic Catalano & Duy Tan Vu
    Date: Sunday, December 06, 2020
    Program Name: OOP 3200 Java Lab 3
 */

package ca.durhamcollege.utility;

import ca.durhamcollege.utility.WorkTicket;

import java.time.LocalDate;

public class ExtendedWorkTicket extends WorkTicket
{
    // PRIVATE INSTANCE VARIABLES
    private boolean myOpen;


    // PUBLIC PROPERTIES

    // Accessor called isOpen() to get the myOpen value
    public boolean isOpen(boolean b)
    {
        return myOpen;
    }

    // Mutator called openTicket() that will set the myOpen attribute
    public void openTicket(boolean myOpen)
    {
        this.myOpen = myOpen;
    }

    // Mutator called closeTicket() that will set the myOpen attribute
    public void closeTicket(boolean myOpen)
    {
        this.myOpen = myOpen;
    }

    // CONSTRUCTORS

    // Default Constructor initializing all the inherited attributes using the default constructor from the base class
    ExtendedWorkTicket()
    {
        super();
        myOpen = true;
    }

    // Parameterized Constructor (sets inherited values and myOpen)
    ExtendedWorkTicket(int myTicketNumber, String myClientID, LocalDate myDate, String myDescription, boolean myOpen)
    {
        super(myTicketNumber, myClientID, myDate, myDescription);
        openTicket(myOpen);
        closeTicket(myOpen);
    }

    // Parameterized Constructor (accepts WorkTicket object)
    ExtendedWorkTicket(final WorkTicket ticket)
    {
        super();
        isOpen(true);
    }


    // PRIVATE METHODS


    // PUBLIC METHODS

    // Overload SetWorkTicket() to include an additional parameter to set the myOpen attribute
    public boolean setWorkTicket(int myTicketNumber, String myClientID, LocalDate myDate, String myDescription, boolean myOpen) {
        boolean isValid = true;
        isValid = super.setWorkTicket(myTicketNumber, myClientID, myDate, myDescription);
        if(isValid)
        {
            this.myOpen = myOpen;
        }
        return isValid;
    }

    @Override
    public String toString()
    {
        String result = super.toString();
        // Check ticket status to determine which string to display to the user
        if(myOpen)
        {
            return "\nTicket: Open";
        }
        else
        {
            return "\nTicket: Closed";
        }
    }

    // STATIC METHODS

}
