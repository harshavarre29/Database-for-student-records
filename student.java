interface Student_ {
   public String fname();      // Return student’s first name
   public String lname();      // Return student’s last name
   public String hostel();     // Return student’s hostel name
   public String department(); // Return student’s department name
   public String cgpa();       // Return student’s cgpa
}
class student implements Student_{
  String fname;
  String lname;
  String hostel;
  String dept;
  String cgpa;
  student(String fname,String lname,String hostel,String department,String cgpa){
    this.fname=fname;
    this.lname=lname;
    this.hostel=hostel;
    this.dept=department;
    this.cgpa=cgpa;
  }
  public String fname(){
    return this.fname;
  }
  public String lname(){
    return this.lname;
  }
  public String hostel(){
    return this.hostel;
  }
  public String department(){
    return this.dept;
  }
  public String cgpa(){
    return this.cgpa;
  }
}
