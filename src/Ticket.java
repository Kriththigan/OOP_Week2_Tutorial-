public class Ticket {
    private static int numTicketsSold = 0;
    private int ticketNum;

    public Ticket(){
        numTicketsSold ++;
        ticketNum = numTicketsSold;
    }
    public static int getNumberSold(){
        return numTicketsSold++;
    }
    public int getTicketNumber(){
        return ticketNum;
    }
    public String getInfo(){
        return "ticket #" + ticketNum + ";" + numTicketsSold + "ticket(s) sold.";
    }
}