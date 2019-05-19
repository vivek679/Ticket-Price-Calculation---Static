public class Ticket{

    private int nooftickets;
    private int ticketid;
    private int price;
    private static int availableTickets;
    private int amount;

    // ************************************************************************************
    public int getTicketid(){   return ticketid;    }
    public int getPrice(){      return price;       }
    public static int getAvailableTickets(){        return availableTickets;    }
    public int getNooftickets(){    return nooftickets;     }
    // ************************************************************************************
    public void setTicketid(int ticketid){
        this.ticketid=ticketid;   
    }
    public void setNooftickets(int nooftickets){
        this.nooftickets=nooftickets;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public static void setAvailableTickets( int availableTickets){
        if(availableTickets>0)
           Ticket.availableTickets=availableTickets;
    }
    // ************************************************************************************
    public int calculateTicketCost(int nooftickets){
        if(nooftickets<=availableTickets){
            availableTickets-=nooftickets;
            amount = nooftickets*price ;
            return amount;
        }
        else 
            return -1;
    }
    // *************************************************************************************
}
