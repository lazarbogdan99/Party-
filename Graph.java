
/**
 * Graph.java
 * This class is not finished
 */
import java.util.NoSuchElementException;
import java.util.List;

public class Graph {

    BST initialBst;
    List<BST> friends;

    public Graph(BST tree, String friendsFile){
        this.initialBst = tree;



        createFriendsArray(initialBst.getRoot());


        parseFriendsFile(friendsFile);
    }

    public void friendsRecommandations(){

    }

    public void parseFriendsFile(String friendsFile){


}
    /**
     * This method creats an array for friends
     * @param node is the node of the BST
     */
    public void createFriendsArray(BSTNode node){
        if (node!=null){
            createFriendsArray(node.getL());
            BST friendArray = new BST();
            friendArray.insertProfile(node.getProfile());
            friends.add(friendArray);
            createFriendsArray((node.getR()));
        }
    }
}
