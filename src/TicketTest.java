public class TicketTest {
    public static void main(String[] args){
        System.out.println(Ticket.getNumberSold());

        Ticket t1 = new Ticket();
        System.out.println(t1.getTicketNumber());
        System.out.println(t1.getInfo());
        System.out.println(t1.getNumberSold());

        Ticket t2 = new Ticket();
        System.out.println(t2.getTicketNumber());
        System.out.println(t2.getInfo());
        System.out.println(t2.getInfo());

        System.out.println(t1.getInfo());

        System.out.println(Ticket.getNumberSold());

    }
}
