public class MYBST<K,T> implements MyHashTable_<K,T>{
  Node root;
  MYBST(){
    root=null;
  }
  class NotFoundException extends Exception{}
  public  int insert(K key,T obj){
    String s=(String)key;
    student st=(student)obj;
    int a=0;
    return Insert(root,s,st,a);
  }
  public int update(K key,T obj){
    String s=(String)key;
    student st=(student)obj;
    int a=0;
    return Update(root,s,st,a);
  }
  public int delete(K key){
    String s=(String)key;
    int a=0;
    int b=gv(root,s,a);
    gn(root,s);
    return b;
  }
  public boolean contains(K key){
    String s=(String)key;
    return find(root,s);
  }
  public T get(K key) throws NotFoundException {
    if(this.contains(key)){
      String s=(String)key;
      return getvalue(root,s);
    }
    else{
    throw new NotFoundException();
    }
    throw new NotFoundException();
  }
  public String address(K key) throws NotFoundException {
    throw new NotFoundException();
  }
  private int Insert(Node n,String key,student obj,int a){
    if(n.getval()==null){
      n.setval(obj);
      return a;
    }
    else if(n.getval().fname().compareTo(key)>0){
      a++;
      Insert(n.right(),key,obj,a);
    }
    else if(n.getval().fname().compareTo(key)<0){
      a++;
      Insert(n.left(),key,obj,a);
    }
  }
  private int Update(Node n,String key,student obj,int a){
    if(n.getval().fname()==key){
      n.setval(obj);
      return a;
    }
    else if(n.getval().fname().compareTo(key)>0){
      a++;
      Update(n.right(),key,obj,a);
    }
    else if(n.getval().fname().compareTo(key)<0){
      a++;
      Update(n.left(),key,obj,a);
    }
  }
  private boolean find(Node n,String key){
    if(n.getval()!=null){
      if(n.getval().fname()==key){
        return true;
      }
      else if(n.getval().fname().compareTo(key)>0){
        find(n.right(),key);
      }
      else if(n.getval().fname().compareTo(key)<0){
        find(n.left(),key);
      }
    }
    else{
      return false;
    }
  }
  private T getvalue(Node n,String key){
    if(n.getval().fname()==key){
      return (T)n.getval();
    }
    else if(n.getval().fname().compareTo(key)>0){
      find(n.right(),key);
    }
    else if(n.getval().fname().compareTo(key)<0){
      find(n.left(),key);
    }
  }
  private student successor(Node n){
    if(n.left()!=null){
      successor(n.left());
    }
    else{
      student s=n.getval();
      if(n.right().getval()!=null){
        n=n.right();
      }
      else
      n=null;
      return s;
    }
  }
  private void gn(Node n,String key){
    if(n.getval().fname()==key){
      if(n.right()==null && n.left()==null){
        n=null;
        return ;
      }
      else if(n.right()==null){
        n=n.left();
        return ;
      }
      else if(n.left()==null){
        n=n.right();
        return ;
      }
      else{
        student st=successor(n);
        n.setval(st);
        return;
      }
    }
    else if(n.getval().fname().compareTo(key)>0){
      gn(n.right(),key);
    }
    else if(n.getval().fname().compareTo(key)<0){
      gn(n.left(),key);
    }
  }
  private int gv(Node n,String key,int a){
    if(n.getval().fname()==key){
      return a;
    }
    else if(n.getval().fname().compareTo(key)>0){
      a++;
      int k=gv(n.right(),key,a);
    }
    else if(n.getval().fname().compareTo(key)<0){
      a++;
      int i=gv(n.left(),key,a);
    }
  }
}
