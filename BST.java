/**
 * BST.java
 * @author Lazar Bogdan
 */

import java.util.NoSuchElementException;

public class BST {
    private BSTNode root;

    /**
     * In this method if the name of the profile being inserted comes before or is equal to the currently selected parent it will go left.If
     * the left is null then insert a new profile in the BST,otherwise recursion.If the name of the profile being inserted comes after or is equal to the
     * currently selected parent it will go right.If right is null then insert a new profile in the BST,otherwise recursion
     * @param current The current BSTNode
     * @param inserted The BSTNode being inserted into the BST.
     */
    private void insertion(BSTNode current, BSTNode inserted) {
        if (current.getProfile().getName().compareTo(inserted.getProfile().getName())>0) {
            if (current.getL() == null) {
                current.setL(inserted);
            } else {
                insertion(current.getL(), inserted);
            }
        } else {
            if (current.getR() == null) {
                current.setR(inserted);
            } else {
                insertion(current.getR(), inserted);
            }
        }
    }

    /**
     *  Creates a BSTNode object with a reference to a profile.If the BST is empty  then the new
     *  BSTNode becomes the root ,otherwise the BSTNode is inserted in the right position
     * @param p  A reference to the profile( this is  insertProfile method from the instructions)
     */
    public void insertProfile(Profile p) {
        BSTNode profileNode = new BSTNode(p);
        if (this.root == null) {
            this.root = profileNode;
        } else {
          insertion(this.root,profileNode);
        }
    }
    /*
     NOT DONE it was ment for the stage 6
    private Profile searching(BSTNode parent, String profileName)
            throws NoSuchElementException {
        String parentName = parent.getProfile().getName();
        Profile returnProfile = parent.getProfile();
        if (profileName.compareTo(parentName)>0){
            if(parent.getR()!=null){
                returnProfile= searching(parent.getR(),profileName);
            } else{
                throw new NoSuchElementException("Profile not found: " +profileName);
            }
        }else if(profileName.compareTo(parentName)<0){
            if (parent.getL()!=null){
                returnProfile=searching(parent.getL(),profileName);
            } else {
                throw new NoSuchElementException("Profile not found: " +profileName);
            }
        }else if (profileName.equals(parentName)){
            returnProfile=parent.getProfile();
        }
        return returnProfile;
    }*/

    /**
     * Method to print out the tree in alphabetical order
     */
    public void alphabeticalOrder(BSTNode node){
        if (node!=null){
            alphabeticalOrder(node.getL());
            System.out.println(node.getProfile().getName());
            alphabeticalOrder((node.getR()));
        }

    }

    /**
     * Method to get the root
     * @return the root of the BST
     */
    public BSTNode getRoot()
    {
        return this.root;
    }
}
