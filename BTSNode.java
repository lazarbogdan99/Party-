/**
 * BSTNode represents a node in the binary search tree
 * BTSNode.java
 * @author Lazar Bogdan
 */
public class BSTNode {
    private BSTNode l;
    private BSTNode r;
    private Profile data;
    /**
     * Creating a BTSNode to use it in the BTS class
     * @param data reference to the profile
     */
    public BSTNode(Profile data){
        this.data=data;
    }
    /**
     * This method gets profile
     * @return the refernce
     */
    public Profile getProfile() {
        return data;
    }

    /**
     * This method sets the left node
     * @param l reference to the BSTNode
     */
    public void setL(BSTNode l) {
        this.l=l;
    }

    /**
     * This method gets the left node
     * @return a refernece
     */
    public BSTNode getL() {
        return l;
    }

    /**
     * This method sets the right node
     * @param r a reference to the BSTNode
     */
    public void setR(BSTNode r){
        this.r=r;
    }

    /**
     * This method gets the right node
     * @return a reference to BSTNode
     */
    public BSTNode getR(){
        return r;
    }

    /**
     * @param data reference to BSTNode
     */
    public void setData(Profile data) {
        this.data = data;
    }
}
