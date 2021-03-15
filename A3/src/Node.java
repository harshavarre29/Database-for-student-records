public class Node{
  student obj;
  Node left,right;
  Node(student obj){
    this.obj=obj;
    left=right=null;
  }
  public student getval(){
    return (student)this.obj;
  }
  public Node right(){
    return this.right;
  }
  public Node left(){
    return this.left;
  }
  public void setval(student obj){
    this.obj=obj;
  }
}
