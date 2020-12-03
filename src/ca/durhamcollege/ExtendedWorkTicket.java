/*
    Author: Domenic Catalano & Duy Tan Vu
    Date: Sunday, December 06, 2020
    Program Name: OOP 3200 Java Lab 3
 */

package ca.durhamcollege;

import java.time.LocalDate;

public class ExtendedWorkTicket extends WorkTicket
{
    // PRIVATE INSTANCE VARIABLES
    private boolean myOpen;


    // PUBLIC PROPERTIES

    // Gets the myOpen value
    public boolean getIsOpen()
    {
        return myOpen;
    }

    // Sets work ticket to open
    public boolean setOpenTicket(boolean myOpen)
    {
        this.myOpen = myOpen;
        if(myOpen == true)
        {
            return true;
        }
    }

    // Sets work ticket to closed
    public boolean setCloseTicket(boolean myOpen)
    {
        this.myOpen = myOpen;
        if(myOpen == false)
        {
            return false;
        }
    }

    // CONSTRUCTORS

    // Default Constructor
    ExtendedWorkTicket()
    {
        super();
        myOpen = true;
    }

    // Parameterized Constructor (sets inherited values and myOpen)
    ExtendedWorkTicket(int myTicketNumber, String myClientID, LocalDate myDate, String myDescription, boolean myOpen)
    {
        super(myTicketNumber, myClientID, myDate, myDescription);
        setOpenTicket(myOpen);
        setCloseTicket(myOpen);
    }

    // Parameterized Constructor (accepts WorkTicket object)



    // PRIVATE METHODS


    // PUBLIC METHODS


    @Override
    public String toString()
    {
        // Check ticket status to determine which string to display to the user
        if(myOpen == true)
        {
            return "Ticket: Open";
        }
        else
        {
            return "Ticket: Closed";
        }
    }

    // STATIC METHODS

}
