import java.util.Scanner;
// Class to book air tickets
public class airportReservation
{
    // main funtion
    public static void main()
    {
        homeScreen(); 
    }
    
    // Function for home page
    public static void homeScreen()
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("**********************************************");
        System.out.println("Welcome to AirTicketBooking Portal");
        System.out.println("**********************************************");
        System.out.println("Please select the menus from below");
        System.out.println("For booking enter 1");
        System.out.println("For  flight search enter 2"); 
        //accepting the options from the user
        int ent=sc.nextInt();
        if(ent == 1)
        {
            // Function to select different airlines as per the users choice
            travelSelect(ent);
        }
        else if(ent == 2)
        {
           // Function to search flights as per users choice
           airLines(); 
        }
    }

    // Function to create menus for flight selection
    public static void travelSelect(int ent)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter 1 for DOMESTIC flights");
        System.out.println("please enter 2 for INTERNATIONAL flights");
        int type=sc.nextInt();
        flightBooking(type);
    }

    public static void flightBooking(int type)
    {
        Scanner sc=new Scanner(System.in);
        switch(type)
        {
            case 1:
            //Options for the user to select a domestic flight
            System.out.println("enter choice number");
            System.out.println("IndiGo-1");
            System.out.println("AirIndia-2");
            System.out.println("SpiceJet-3");
            System.out.println("Vistara-4");
            System.out.println("GoAir-5");
            System.out.println("TruJet-6");
            System.out.println("AirIndia Express-7");
            int choice=sc.nextInt();
            domesticflight(choice);
            break;
            
            case 2:
            //Options for the user to select a International fight
            System.out.println("enter choice number");
            System.out.println("Emirates-1");
            System.out.println("Lufthansa-2");
            System.out.println("British Airways-3");
            System.out.println("SriLankan Airlines-4");
            System.out.println("Thai Airways-5");
            System.out.println("Air France-6");
            System.out.println("Cathay Pacific-7");
            int choice2=sc.nextInt();
            internationalFlight(choice2);
            break;

            default:System.out.println("Please enter a valid choice");
        }

    }

    public static void domesticflight(int choice)
    {  
        Scanner sc=new Scanner(System.in);

        switch(choice)
        {
            case 1:
            //Options for the user to pick the location
            System.out.println("for booking BLR-COK enter 1");
            System.out.println("");
            System.out.println("for booking COK-BLR enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            int num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                //loop for accepting the name of the passengers
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    String name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    String last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                }
                //calculating the total 
                int sum=ticket*12040;
                System.out.println("a ticket cost = 12040.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            //Options for the user to pick the location
            case 2:System.out.println("for booking DEL-HYD enter 1");
            System.out.println("");
            System.out.println("for booking HYD-DEL enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                //Receiving the number of tickets
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    String name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    String last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                }
                int sum=ticket*21420;
                System.out.println("a ticket cost = 21420.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            case 3:System.out.println("for booking GOA-BLR enter 1");
            System.out.println("");
            System.out.println("for booking BLR-GOA enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    String name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    String last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                }
                int sum=ticket*17840;
                System.out.println("a ticket cost = 17840.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            case 4:System.out.println("for booking DEL-TRV enter 1");
            System.out.println("");
            System.out.println("for booking TRV-DEL enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    String name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    String last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                }
                int sum=ticket*15940;
                System.out.println("a ticket cost = 15940.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            case 5:System.out.println("for booking NAG-RPR enter 1");
            System.out.println("");
            System.out.println("for booking RPR-NAG enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    String name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    String last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                }
                int sum=ticket*21020;
                System.out.println("a ticket cost = 21020.0");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
                System.out.println("Please proceed to check in counter");
            }
            break;
            case 6:System.out.println("for booking IXG-MYQ enter 1");
            System.out.println("");
            System.out.println("for booking MYQ-IXG enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    String name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    String last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                    System.out.println("");
                }
                int sum=ticket*16240;
                System.out.println("a ticket cost = 16240.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            case 7:System.out.println("for booking DEL-IXM enter 1");
            System.out.println("");
            System.out.println("for booking IXM-DEL enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    String name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    String last=sc.next();
                    System.out.println("");
                    System.out.println(name+" "+last+"-"+i);
                    System.out.println("");
                }
                int sum=ticket*18120;
                System.out.println("a ticket cost = 18120.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            default : System.out.println("wrong entry");
            homeScreen();
        } 

    }

    public static void internationalFlight(int choice2)
    {
        Scanner sc=new Scanner(System.in);
        String name;
        String last;
        int sum=0;
        switch(choice2)
        {
            case 1:System.out.println("for booking BLR-DUBAI enter 1");
            System.out.println("");
            System.out.println("for booking DUBAI-BLR enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            int num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                }
                sum=ticket*12040;
                System.out.println("a ticket cost = 12040.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            case 2:System.out.println("for booking BLR-FRA enter 1");
            System.out.println("");
            System.out.println("for booking FRA-BLR enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                }
                sum=ticket*21420;
                System.out.println("a ticket cost = 21420.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            case 3:System.out.println("for booking BLR-LON enter 1");
            System.out.println("");
            System.out.println("for booking LON-BLR enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                }
                sum=ticket*17840;
                System.out.println("a ticket cost = 17840.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            case 4:System.out.println("for booking BLR-COL enter 1");
            System.out.println("");
            System.out.println("for booking COL-BLR enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                }
                sum=ticket*15940;
                System.out.println("a ticket cost = 15940.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            case 5:System.out.println("for booking BLR-BGK enter 1");
            System.out.println("");
            System.out.println("for booking BGK-BLR enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                }
                sum=ticket*21020;
                System.out.println("a ticket cost = 21020.0");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            break;
            case 6:System.out.println("for booking BLR-PAR enter 1");
            System.out.println("");
            System.out.println("for booking PAR-BLR enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    last=sc.next();
                    System.out.println(name+" "+last+"-"+i); 
                    System.out.println("");
                }
                sum=ticket*16240;
                System.out.println("a ticket cost = 16240.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            case 7:System.out.println("for booking BLR-HKG enter 1");
            System.out.println("");
            System.out.println("for booking HKG-BLR enter 2");
            System.out.println("");
            System.out.println("Not your destination?Enter 3");
            System.out.println("");
            num=sc.nextInt();
            if (num==1||num==2)
            {
                System.out.println("enter number of tickets");
                int ticket=sc.nextInt();
                for(int i=1;i<=ticket;i++)
                {
                    System.out.println("Enter first name of passenger no."+i);
                    name=sc.next();
                    System.out.println("Enter last name of passenger no."+i);
                    last=sc.next();
                    System.out.println("");
                    System.out.println(name+" "+last+"-"+i);
                    System.out.println("");
                }
                sum=ticket*18120;
                System.out.println("a ticket cost = 18120.00");
                System.out.println("");
                System.out.println("sum to be paid in INR = "+sum);
                System.out.println("");
                System.out.println("Your booking is successful!Happy journey");
                homeScreen();
            }
            else if(num==3)
            {
                System.out.println("Sorry come back later :(, your destination is not available. You are now diverted to home page");
                homeScreen();
            }
            else
            {
                System.out.println("wrong choice please restart");
                homeScreen();
            }
            break;
            default : System.out.println("wrong entry");
            homeScreen();
        }
    }
    
    public static void airLines()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter 1 for DOMESTIC flights");
        System.out.println("please enter 2 for INTERNATIONAL flights");
        int type=sc.nextInt();
        flightStatus(type); 
    }

    public static void flightStatus(int type)
    {
        Scanner sc=new Scanner(System.in);
        switch(type)
        {
            case 1:
            System.out.println("enter choice number");
            System.out.println("IndiGo-1");
            System.out.println("AirIndia-2");
            System.out.println("SpiceJet-3");
            System.out.println("Vistara-4");
            System.out.println("GoAir-5");
            System.out.println("TruJet-6");
            System.out.println("AirIndia Express-7");
            int choice=sc.nextInt();
            domesticSearch(choice);
            break;

            case 2:
            System.out.println("enter choice number");
            System.out.println("Emirates-1");
            System.out.println("Lufthansa-2");
            System.out.println("British Airways-3");
            System.out.println("SriLankan Airlines-4");
            System.out.println("Thai Airways-5");
            System.out.println("Air France-6");
            System.out.println("Cathay Pacific-7");
            int choice2=sc.nextInt();
            internationalSearch(choice2);
            break;

            default:System.out.println("Please enter a valid choice");
        }
    }

    public static void domesticSearch(int choice)
    {
        switch(choice)
        {
            case 1:
            System.out.println("BLR to COK - ONTIME(7:30PM)");
            System.out.println("COK to BLR - DELAYED by 15 minutes(8:15PM)");
            break;

            case 2:
            System.out.println("DEL to HYD - DELAYED by 1 hour 15 minutes(12:15AM)");
            System.out.println("HYD to DEL - DELAYED by 10 minutes(3:20PM)");
            break;

            case 3:
            System.out.println("GOA to BLR - ONTIME(2:15PM)");
            System.out.println("BLR to GOA - ONTIME(6:30AM)");
            break;

            case 4:
            System.out.println("DEL to TRV - CANCELLED");
            System.out.println("TRV to DEL - ONTIME(7:30PM)");
            break;

            case 5:
            System.out.println(" NAG to RPR - ONTIME(7:30AM)");
            System.out.println("RPR to NAG - DELAYED(12:35AM)");
            break;

            case 6:
            System.out.println("IXG to MYQ - ONTIME(10:00PM)");
            System.out.println("MYQ to IXG - ONTIME(12:30PM)");
            break;

            case 7:
            System.out.println("IXM to DEL - ONTIME(2:30PM)");
            System.out.println("DEL to IXM - ONTIME(7:30PM)");
            break;

            default:
            System.out.println("Please enter a valid choice");
            airLines();
        }
    }

    public static void internationalSearch(int choice2)
    {
        switch(choice2)
        {
            case 1:
            System.out.println("BLR to DUBAI - ONTIME(7:30PM)");
            System.out.println("DUBAI to BLR - DELAYED by 15 minutes(8:15PM)");
            break;

            case 2:
            System.out.println("FRA to BLR - DELAYED by 1 hour 15 minutes(12:15AM)");
            System.out.println("BLR to FRA - DELAYED by 10 minutes(3:20PM)");
            break;

            case 3:
            System.out.println("LON to BLR - ONTIME(2:00AM)");
            System.out.println("BLR to LON - ONTIME(6:30PM)");
            break;

            case 4:
            System.out.println("BLR to COL - CANCELLED");
            System.out.println("COL to BLR - ONTIME(7:30PM)");
            break;

            case 5:
            System.out.println(" BLR to BGK - ONTIME(7:30AM)");
            System.out.println("BGK to BLR - DELAYED(12:35AM)");
            break;

            case 6:
            System.out.println("BLR to PAR - ONTIME(10:00PM)");
            System.out.println("PAR to BLR - ONTIME(12:30PM)");
            break;

            case 7:
            System.out.println("HKG to BLR - ONTIME(2:30PM)");
            System.out.println("BLR to HKG - ONTIME(7:30PM)");
            break;

            default:
            System.out.println("Please enter a valid choice");
            airLines();
        }
    }
}
