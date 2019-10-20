public class BSTNodeMain {

    public static void main(String[] args) {

        String[] interests = {"Rest", "Play Chess","Train"};
        Profile mar = new Profile("Carla","Marginean", 31, 5, 1999, "Iasi", "Romania", "Romanian","carlamars@yahoo.com", interests);
        Profile jon = new Profile("Turnner","John", 29, 5, 1999, "Liverpool", "Uninted Kingdom", "English","turnerjon@yahoo.com", interests);

        BSTNode node1 = new BSTNode(mar);
        BSTNode node2 = new BSTNode(jon);
        node1.setR(node1);
        node2.setL(node2);


        System.out.println(node1.getR().getProfile());


        System.out.println(node2.getL().getProfile());

    }
}
