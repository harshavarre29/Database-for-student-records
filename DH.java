import java.io.BufferedReader;
import java.io.FileReader;
public class DH{
  String s;
  DH(String str){
    this.s=str;
  }
  public void Read(){
  try{
    FileReader fr = new FileReader(this.s);
    BufferedReader br = new BufferedReader(fr);
    String ts="";
    myhashdh my=new myhashdh(11);
    while((ts=br.readLine())!=null) {
      String[] str=ts.split(" ");
      pair p=new pair(str[1],str[2]);
      if(str[0].equals("insert")){
        student s=new student(str[1],str[2],str[3],str[4],str[5]);
        int a=my.insert(p,s);
        System.out.println(a);
      }
      if(str[0].equals("delete")){
        int a=my.delete(p);
        System.out.println(a);
      }
      if(str[0].equals("contains")){
        if(my.contains(p)){
          System.out.println("T");
        }
        else{
          System.out.println("F");
        }
      }
      if(str[0].equals("get")){
        try{
          student st=(student)my.get(p);
          System.out.println(st.fname()+" "+st.lname()+" "+st.department()+" "+st.cgpa());
        }
        catch(NotFoundException e){
          System.out.println("e");
        }
      }
      if(str[0].equals("update")){
        System.out.println(str.length);
        student s=new student(str[1],str[2],str[3],str[4],str[5]);
        int a=my.update(p,s);
        System.out.println(a);
      }
      if(str[0].equals("address")){
        try{
          String a=my.address(p);
          System.out.println(a);
        }
        catch(NotFoundException e){
          System.out.println("e");
        }
      }
    }
  }
  catch(Exception e){
    System.out.println(e);
  }
}
}
