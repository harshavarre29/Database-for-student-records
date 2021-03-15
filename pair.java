public class pair<K,T>{
  K fname;
  T lname;
  pair(K fname,T lname){
    this.fname=fname;
    this.lname=lname;
  }
  public K getK(){
    return this.fname;
  }
  public T getT(){
    return this.lname;
  }
  public String gets(){
    String s=(String)fname+(String)lname;
    return s;
  }
  public int compareTo(pair<K,T> reference){
    return 0;
  }
}
