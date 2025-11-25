public class GymMember {
    private static int totalMembers = 1;
    private String name;
    private String membershipType;
    private int memberID;

    public GymMember(String name, String membershipType){
        this.name = name;
        this.membershipType = membershipType;
        this.memberID = totalMembers++;
    }
    public String getInfo(){
        return "Member" + memberID + ":" + name + "-" + "Type:" + membershipType;
    }
    public static int getTotalMembers(){
        return totalMembers;
    }
    public static void main(String[] args){
        GymMember g1 = new GymMember("Kriththigan", "Full");
        GymMember g2 = new GymMember("Satkunam", "Half");

        System.out.println(g1.getInfo());
        System.out.println(g2.getInfo());

        System.out.println("Total Members" + GymMember.getTotalMembers());
    }
}
