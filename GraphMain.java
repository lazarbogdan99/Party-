
public class GraphMain {
    public static void main(String[] args) {
        Profile person01 = new Profile("Mike","Norman",13,12,1985,"New York","USA",
                "American","Mike1234@gmail.com",new String[]{"tennis","football"});
        Profile person02 = new Profile("Mihai","Radulescu",5,11,2003,"Bucuresti","Romania",
                "Romanian","mradulescu@yahoo.com",new String[]{"music","movies"});
        Profile person03 = new Profile("Bogdan","Lazar",3,5,1999,"Reghin","Romania",
                "Romanin","lazarbogdan@yahoo.com", new String[]{"music","dnb","sports"});
        Profile person04 = new Profile("Ryan","John",4,6,2008,"Dijon","France",
                "French","JohnRyan@gmail.com",new String[]{"cats","movies","singers"});
        Profile person05 = new Profile("Anne","Ford",5,7,1996,"Berlin","Germany",
                "German","anneF@yahoo.com",new String[]{"vices","animes","leag of legends"});
        Profile person06 = new Profile("Mara","Creion",29,1,1985,"Craiova","Romania",
                "Romanian","mama123@google.com",new String[]{"dogs","sports","travelling"});
        Profile person07 = new Profile("Jack","Marvel",8,04,2010,"Paris","France",
                "American","sexymama123@facebook.com",new String[]{"Music","rock","rap"});
        BST binarytree = new BST();

        binarytree.insertProfile(person01);
        binarytree.insertProfile(person02);
        binarytree.insertProfile(person03);
        binarytree.insertProfile(person04);
        binarytree.insertProfile(person05);
        binarytree.insertProfile(person06);
        binarytree.insertProfile(person07);

        Graph graph = new Graph(binarytree, "friends");
        graph.friendsRecommandations();
    }
}
