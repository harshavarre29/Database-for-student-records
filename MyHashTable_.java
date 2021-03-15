class NotFoundException extends Exception{}

 interface MyHashTable_<K, T> {
   // Insert new object with given key
   public int insert(K key, T obj);

   // Update object for given key
   public int update(K key, T obj);

   // Delete object for given key
   public int delete(K key);

   // Does an object with this key exist?
   public boolean contains(K key);

   // Return the object with given key
   public T get(K key) throws NotFoundException;

   // Address of object with given key (explained below)
   public String address(K key) throws NotFoundException;
}
/*class myBST implements MyHashTable_<K,T>{
  Node first_ele;
  Node head=first_ele;
  int a=0;
  public  int insert(K key,T obj){
    Node temp=first_ele;
    if(temp.getval()==null){
      first_ele.setval(obj);
      a++;
      first_ele=head;
      return a;
    }
    else if(first_ele.getval().fname().compareTo(key)>0){
      first_ele=first_ele.right();
      a++;
      insert(key,obj);
    }
    else if(first_ele.getval().fname().compareTo(key)<0){
      first_ele=first_ele.left();
      a++;
      insert(key,obj);
    }
  }
  a=1;
  public int update(K key,T obj){
    Node temp=first_ele;
    if(temp.getval()==key){
      first_ele.setval(obj);
      a++;
      first_ele=head;
      return a;
    }
    else if(first_ele.getval().fname().compareTo(key)>0){
      first_ele=first_ele.right();
      a++;
      update(key,obj);
    }
    else if(first_ele.getval().fname().compareTo(key)<0){
      first_ele=first_ele.left();
      a++;
      update(key,obj);
    }
  }
  a=1;
  public int delete(K key){

  }
  public boolean contains(K key){
    Node temp=first_ele;
    if(temp.getval()==key){
      first_ele=head;
      return true;
    }
    else if(first_ele.getval().fname().compareTo(key)>0){
      first_ele=first_ele.right();
      if(first_ele.getval()!=null)
      contains(key,);
      else{
        first_ele=head;
        return false;
      }
    }
    else if(first_ele.getval().fname().compareTo(key)<0){
      first_ele=first_ele.left();
      if(first_ele.getval()!=null)
      contains(key);
      else{
        first_ele=head;
        return false;
      }
    }
  }
  public T get(K key) throws NotFoundException{
    Node temp=first_ele;
    if(temp.getval()==key){
      first_ele=head;
      return (T)temp.getval();
    }
    else if(first_ele.getval().fname().compareTo(key)>0){
      first_ele=first_ele.right();
      if(first_ele.getval()!=null)
      get(key);
      else{
        first_ele=head;
        return Exception;
      }
    }
    else if(first_ele.getval().fname().compareTo(key)<0){
      first_ele=first_ele.left();
      if(first_ele.getval()!=null)
      get(key);
      else{
        first_ele=head;
        return Exception;
      }
    }
  }
  public String address(K key) throws NotFoundException{
    Node temp=first_ele;
    if(temp.getval()==key){
      first_ele=head;
      return (T)temp.getval();
    }
    else if(first_ele.getval().fname().compareTo(key)>0){
      first_ele=first_ele.right();
      if(first_ele.getval()!=null)
      address(key);
      else{
        first_ele=head;
        return Exception;
      }
    }
    else if(first_ele.getval().fname().compareTo(key)<0){
      first_ele=first_ele.left();
      if(first_ele.getval()!=null)
      address(key);
      else{
        first_ele=head;
        return Exception;
      }
    }
  }

  private Node find(Node n,K key){

  }
}*/
