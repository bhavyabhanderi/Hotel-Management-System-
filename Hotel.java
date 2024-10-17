 import java.util.*;
class Booking
{
        int numSingleRooms = 10;
        int numDoubleRooms = 10;
        int numSuites = 5;
        int extrabed=15;
        static  int bookedSingleRooms = 0;
        static int bookedDoubleRooms = 0;
        static int bookedSuites = 0;
        static int bookedextrabed=0;
        void catalog()
        {
            System.out.println("____________________________");
            System.out.println(" welcome to Hotel LJ 🙏🏼😊 !");
    	    System.out.println();
    	    System.out.println(" Single Bed Room : 1990/- ");
    	    System.out.println(" Double Bed Room : 3490/- ");
    	    System.out.println(" Suite : 2990/- ");
    	    System.out.println(" Extra Bed : 890/- ");
            System.out.println("____________________________");
        }
        void Booking()
        {
        	Scanner sc = new Scanner(System.in);
        	int choice;
        do
        {
            System.out.println("________________________");
            System.out.println("1. Book a single room  ");
            System.out.println("2. Book a double room");
            System.out.println("3. Book a suite");
            System.out.println("4. Book a Extra bed");
            System.out.println("5. Cancel  booking");
            System.out.println("0. Exit");
            System.out.println("________________________");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice)
             {
                case 1:
                	{
                	    System.out.print("Enter Number Of Single Room : ");
                	    int n_single =sc.nextInt();
                	    bookedSingleRooms += n_single;
        	   	        if (numSingleRooms > bookedSingleRooms)
                        {
                            System.out.println("Single room booked successfully");
                        } 
                        else 
                        {
                            bookedSingleRooms -= n_single;
                            System.out.println("Sorry, no single rooms available");
                        }
                  }
                  break;
                case 2:
                     {
                         System.out.print("Enter Number Of Double Room : ");
                	      int n_double =sc.nextInt();
                	      bookedDoubleRooms += n_double;
        	              if (numDoubleRooms > bookedDoubleRooms)
                          {
                              System.out.println("Double room booked successfully");
                          } 
                          else 
                          {
                              bookedDoubleRooms -= n_double;
                              System.out.println("Sorry, no double rooms available");
                          }
                    }
                    break;
                case 3:
                	 {
                	     System.out.print("Enter Number Of Suites Room : ");
                	     int n_suite =sc.nextInt();
                	     bookedSuites += n_suite;
        	             if (numSuites > bookedSuites)
                         {
                             System.out.println("Suite booked successfully");
                         } 
                         else 
                         {
                             bookedSuites-=n_suite;
                             System.out.println("Sorry, no suites available");
                         }
                    }
                    break;
                case 4:
                	 {
                         if(bookedSingleRooms > 0 || bookedDoubleRooms > 0)
                         {
                             System.out.print("Enter Number Of Extra Bed : ");
                             int n_bed =sc.nextInt();
                             bookedextrabed += n_bed;
                             if(extrabed >bookedextrabed)
                             {
                                 System.out.println("Extra bed booked successfully ");
                             }
                             else
                             {
                                 bookedextrabed -=n_bed;
                                 System.out.println("sorry , not available ");
                             }
                         } 
                         else
                         {
                             System.out.println("Hello , Sir Please Book First Rooms"); 
                         }
                     }
                     break;
                  case 5:
                  {
                      System.out.println("________________________");
                      System.out.println("1. Single room");
                      System.out.println("2. Double room");
                      System.out.println("3. Suite");
                      System.out.println("________________________");
                      System.out.print("Enter the type of room to cancel booking for : ");
                      int cancelChoice = sc.nextInt();
                      switch (cancelChoice) 
                      {
                          case 1:
                             System.out.print("Enter Number Of Cancel Single Room : ");
                             int nc_single =sc.nextInt();
                             if (bookedSingleRooms >=nc_single)
                             {
                                 bookedSingleRooms-=nc_single;
                                 System.out.println("Single room booking cancelled successfully");
                             }
                              else
                             {
                                 System.out.println("No single room booking found");
                             }
                            break;
                        case 2:
                            System.out.print("Enter Number Of Cancel Double Room : ");
                            int nc_double =sc.nextInt();
                            if (bookedDoubleRooms >=nc_double)
                            {
                                bookedDoubleRooms-=nc_double;
                                System.out.println("Double room booking cancelled successfully");
                            } 
                            else
                            {
                                System.out.println("No double room booking found");
                            }
                            break;
                        case 3:
                            System.out.print("Enter Number Of Cancel Suite : ");
                            int nc_suite =sc.nextInt();
                            if (bookedSuites >=nc_suite)
                            {
                                bookedSuites-=nc_suite;
                                System.out.println("Suite booking cancelled successfully");
                            } else {
                                System.out.println("No suite booking found");
                            }
                            break;
                         
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                }
                case 0:
                    System.out.println("Back to main Page ");
                    System.out.println("____________________________");
                    break;
            
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } 
        while (choice != 0);
        } 
        void show()
        {
            System.out.println(" Your Booking Status : ");
            System.out.println("_________________________________");
            if(bookedSingleRooms > 0)
            {
                System.out.println(" Single Bed Room :"+bookedSingleRooms);
            }
            if(bookedDoubleRooms > 0)
            {
                System.out.println(" Double Bed Room :"+bookedDoubleRooms);
            }
            if(bookedSuites > 0)
            {
                 System.out.println(" Suite Room :"+bookedSuites);
            }
              if(bookedextrabed > 0)
            {
                 System.out.println(" Extra Bed :"+bookedextrabed);
            }
            System.out.println("_________________________________");
        }
        void bill()
        {
            System.out.println("___________Your Bill Payment___________");
            System.out.println();
            if(bookedSingleRooms > 0)
            {
                System.out.println(" Single Bed Room_____"+bookedSingleRooms+"_____"+(bookedSingleRooms*1990)+"/-" );
            }
            if(bookedDoubleRooms > 0)
            {
                System.out.println(" Double Bed Room_____"+bookedDoubleRooms+"_____"+(bookedDoubleRooms*3490)+"/-" );
            }
            if(bookedSuites > 0)
            {
                 System.out.println(" Suites Room_________"+bookedSuites+"_____"+(bookedSuites*2990)+"/-" );
            }
            if(bookedextrabed > 0)
            {
                 System.out.println(" extra bed___________"+bookedextrabed+"_____"+(bookedextrabed*890)+"/-" );
            }
            if(bookedSingleRooms > 0 || bookedDoubleRooms > 0 || bookedSuites > 0)
            {
                System.out.println("_______________________________________" );
                int total_a=(bookedSingleRooms*1990) + (bookedDoubleRooms*3490) + (bookedSuites*2990);
                System.out.println(" Total Amount _____________"+total_a+"/-" );
            }
        }
        void feedback()
        {
            Scanner sc =new Scanner(System.in);
            System.out.print("Please feedback point out of 5 :");
            int n = sc.nextInt();
            if(n<3)
            {
                System.out.print(" Enter feedback requirements : ");
                String x=sc.next();   
            }
        }
}
class Hotel
{
    public static void main(String [] arg)
    {
            Scanner sc = new Scanner(System.in);
        	Booking B= new Booking();
        	boolean x=true;
        	while(x)
        	{
                System.out.println("1. view catalog  ");
                System.out.println("2. Booking Room ");
                System.out.println("3. Show your Booking Status ");
                System.out.println("4. your bill ");
                System.out.println("5. Give your feedback ");
                System.out.println("0. Exit");
                System.out.print("Choose an option : ");
                int n =sc.nextInt();
                switch(n)
                {
                    case 1:
                	    B.catalog();
                	    break;
                    case 2:
                        B.Booking();
                        break;
                    case 3:
                	    B.show();
                        break;
                    case 4:
                	    B.bill();
                        break;
                    case 5:
                         B.feedback();
                    case 0:
                        System.out.println("Thank you 🙏☺️ !");
                        x=false;
                    break;
                    default:
                        System.out.println("Invalid choice");
                    break;
                }
            } 
    }
}