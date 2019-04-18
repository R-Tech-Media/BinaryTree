public class BinaryTree{
  Node root;
  public void addNode(int key, String name){
    Node newNode = new Node(key,name);
    if(root == null){
      root = newNode;
    }else{
      Node focusNode = root;
      Node parent;
      while(true){
        parent = focusNode;
        if(key < focusNode.key){
          focusNode = focusNode.leftChild;
          if(focusNode == null){
            parent.leftChild = newNode;
            return;
          }
        }else{
          focusNode = focusNode.rightChlid;
          if(focusNode == null){
            parent.rightChlid = newNode;
            return;
          }
        }
      }
    }
  }
  public void inOrderTraverseTree(Node focusNode){
    if(focusNode != null){
      inOrderTraverseTree(focusNode.leftChild);
      System.out.println(focusNode);
      inOrderTraverseTree(focusNode.rightChlid);
    }
  }
  public static void main(String[] args){
    BinaryTree theTree = new BinaryTree();
    theTree.addNode(50, " Optimus" );
    theTree.addNode(20, " Optimus" );
    theTree.addNode(30, " Optimus" );
    theTree.addNode(10, " Optimus" );
    theTree.addNode(60, " Optimus" );
    theTree.inOrderTraverseTree(theTree.root);
  }
}


class Node{
  int key;
  String name;

  Node leftChild;
  Node rightChlid;
  Node(int key, String name){
    this.key = key;
    this.name = name;
  }
  public String toString(){
    return name + " name has a key " + key;
  }
}
