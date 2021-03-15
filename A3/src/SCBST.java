import java.io.BufferedReader;
import java.io.FileReader;
public class SCBST{
  String s;
  SCBST(String str){
    this.s=str;
  }
  public static long sdbm(String str, int hashtableSize) {
      long hash = 0;
      for (int i = 0; i < str.length(); i++) {
          hash = str.charAt(i) + (hash << 6) + (hash << 16) - hash;
      }
      return Math.abs(hash) % (hashtableSize - 1) + 1;
  }
  public void read(){
    try{
      FileReader fr = new FileReader(s);
      BufferedReader br = new BufferedReader(fr);
      String ts=" ";
      MYBST lof=new MYBST();
      while(!((ts=br.readLine())==null)) {
        String[] str=s.split(" ");
        pair<String,String> p=new pair<>(str[1],str[2]);
        if(str[0].equals("insert")){
          student s=new student(str[1],str[2],str[3],str[4],str[5]);
          int a=lof.insert(p,s);
        }
        if(str[0].equals("delete")){
          student s=new student(str[1],str[2],str[3],str[4],str[5]);
          int a=lof.delete(p);
        }
        if(str[0].equals("contains")){
          if(lof.contains(p)){
            System.out.println("T");
          }
          else{
            System.out.println("F");
          }
        }
        if(str[0].equals("get")){
          try{
            student st=(student)lof.get(p);
          }
          catch(Exception e){
            System.out.println("e");
          }
        }
        if(str[0].equals("update")){
          student s=new student(str[1],str[2],str[3],str[4],str[5]);
          int a=lof.update(p,s);
        }
        if(str[0].equals("address")){
          try{
            String a=lof.address(p);
          }
          catch(Exception e){
            System.out.println("e");
          }
        }
      }
    }
    catch(Exception e){
      System.out.println("e");
    }
  }
}
