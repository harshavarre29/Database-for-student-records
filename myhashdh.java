import java.lang.Math;
//  interface MyHashTable_<K, T> {
//    // Insert new object with given key
//    public int insert(K key, T obj);
//
//    // Update object for given key
//    public int update(K key, T obj);
//
//    // Delete object for given key
//    public int delete(K key);
//
//    // Does an object with this key exist?
//    public boolean contains(K key);
//
//    // Return the object with given key
//    public T get(K key) throws NotFoundException;
//
//    public String address(K key) throws NotFoundException;
// }
class myhashdh<K,T> implements MyHashTable_<K, T>{
  int size;
  int x=0;
  student[] hashtable;

  //T[] hashtable;
  myhashdh(int size){
    this.size=size;
    hashtable=new student[size];
  }
  public static long djb2(String str, int hashtableSize) {
      long hash = 5381;
      for (int i = 0; i < str.length(); i++) {
          hash = ((hash << 5) + hash) + str.charAt(i);
      }
      return Math.abs(hash) % hashtableSize;
  }
  public static long sdbm(String str, int hashtableSize) {
      long hash = 0;
      for (int i = 0; i < str.length(); i++) {
          hash = str.charAt(i) + (hash << 6) + (hash << 16) - hash;
      }
      return Math.abs(hash) % (hashtableSize - 1)+1;
  }
  public int insert(K key,T obj){
    int b=0;
    pair k=(pair)key;
    int a=(int)myhashdh.djb2(k.gets(),size)%size;
    b++;
    System.out.println(a);
    student o=(student) obj;
    while(true){
      if(hashtable[a]==null){
        hashtable[a]=o;
        if(b>x){
          x=b;
        }
        return b;
      }
      else{
        int l=(int)myhashdh.sdbm(k.gets(),size);
        a+=b*l;
        a=a%size;
        b++;
      }
      System.out.println("str.length");
    }
  }
  public int update(K key,T obj){
    int b=0;
    pair k=(pair)key;
    int a=(int)myhashdh.djb2(k.gets(),size)%size;
    b++;
    student o=(student)obj;
    while(true){
      if(hashtable[a].fname().equals(k.getK())){
        hashtable[a]=o;
        return b;
      }
      else{
        a+=b*((int)myhashdh.sdbm(k.gets(),size));
        a=a%size;
      }
    }
  }
  public int delete(K key){
    int b=0;
    pair k=(pair)key;
    int a=(int)myhashdh.djb2(k.gets(),size)%size;
    b++;
    while(true){
      if(hashtable[a].fname().equals(k.getK())){
        hashtable[a]=null;
        return b;
      }
      else{
        a+=b*((int)myhashdh.sdbm(k.gets(),size));
        a=a%size;
      }
    }
  }
  public boolean contains(K key){
    int a=1;
    pair k=(pair)key;
    int b=(int)myhashdh.djb2(k.gets(),size)%size;
    for(int i=1;i<=x;i++){
      if(hashtable[b].fname().equals(k.getK())){
        return true;
      }
      else{
        b+=i*((int)myhashdh.sdbm(k.gets(),size));
        b=b%size;
      }
      return false;
    }
    return false;
  }
  public T get(K key) throws NotFoundException{
    try{
      pair k=(pair)key;
      if(this.contains(key)){
        int a=1;
        int b=(int)myhashdh.djb2(k.gets(),size)%size;
        for(int i=1;i<=x;i++){
          if(hashtable[b].fname().equals(k.getK())){
            return (T)hashtable[b];
          }
          else{
            b+=i*((int)myhashdh.sdbm(k.gets(),size));
            b=b%size;
          }
        }
      }
    }
    catch(Exception e){
      throw new NotFoundException();
    }
    return null;
  }
  public String address(K key) throws NotFoundException{
    try{
      if(this.contains(key)){
        int a=1;
        pair k=(pair)key;
        int b=(int)myhashdh.djb2(k.gets(),size)%size;
        for(int i=1;i<=x;i++){
          if(hashtable[b].fname().equals(k.getK())){
            String s=Integer.toString((int) b)+"-";
            return s;
          }
          else{
            b+=i*((int)myhashdh.sdbm(k.gets(),size));
            b=b%size;
          }
        }
      }
    }
    catch(Exception e){
      throw new NotFoundException( );
    }
    return " " ;
  }
}
