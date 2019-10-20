
public class BSTMain {
    public static void main(String[] args) {
        Profile person01 = new Profile("Mike","Norman",13,12,1985,"New York","USA",
                "American","Mike1234@gmail.com",new String[]{"tennis","football"});
        Profile person02 = new Profile("Mihai","Radulescu",5,11,2003,"Bucuresti","Romania",
                "Romanian","mradulescu@yahoo.com",new String[]{"music","movies"});
        Profile person03 = new Profile("Bogdan","Lazar",3,5,1999,"Reghin","Romania",
                "Romanin","lazarbogdan@yahoo.com", new String[]{"music","dnb","sports"});
        BST tree = new BST();
        BSTNode node1 = new BSTNode(person01);
        BSTNode node2 = new BSTNode(person02);
        BSTNode node3 = new BSTNode(person03);
        tree.insertProfile(person01);
        tree.insertProfile(person02);
        tree.insertProfile(person03);

        System.out.println(tree.getRoot().getProfile());
        System.out.println(tree.getRoot().getL().getProfile());
        System.out.println(tree.getRoot().getL().getL().getProfile());

        tree.alphabeticalOrder(tree.getRoot());
    }
}
