import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ticket ticket = new Ticket();
        
        System.out.println("Enter no of bookings:");
        int noofbookings = sc.nextInt();
        System.out.println("Enter the available tickets:");
        int availableTickets=sc.nextInt();
        Ticket.setAvailableTickets(availableTickets);
        
        for(int i=0;i<noofbookings;i++){
            System.out.println("Enter the ticketid:");
            int ticketid=sc.nextInt();
            System.out.println("Enter the price:");
            int price=sc.nextInt();
            System.out.println("Enter the no of tickets:");
            int nooftickets = sc.nextInt();
            
            ticket.setTicketid(ticketid);
            ticket.setPrice(price);
            ticket.setNooftickets(nooftickets);
            
            System.out.println("Available tickets: "+ticket.getAvailableTickets());
            int amount = ticket.calculateTicketCost(nooftickets);
            System.out.println("Total amount:"+amount);
            System.out.println("Available tickets after booking:"+ticket.getAvailableTickets());
        }
    }
}
