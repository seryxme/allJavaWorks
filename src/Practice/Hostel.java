package Practice;

public class Hostel {
   private String residentName;
   private int residentAge;
   private String phoneNumber;
   private int residentIdNumber;
   private String gender;
   private int numberOfYears;


   public Hostel(String name, int age, String phone){
       residentName = name;
       residentAge = age;
       phoneNumber = phone;
   }

    public int getResidentAge() {
        return residentAge;
    }

    public void setResidentAge(int age) {
        residentAge = age;
        System.out.println(residentAge);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getResidentIdNumber() {
        return residentIdNumber;
    }

    public void setResidentIdNumber(int residentIdNumber) {
        this.residentIdNumber = residentIdNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   public void setResidentName(String name){
       residentName = name;
       System.out.println("Resident name is " + residentName);
       int futureAge = 35;

   }
   public String getResidentName(){
       return residentName;
   }

   public int calculateFutureAge(int years){

       int futureAge = residentAge + years;

       return futureAge;

   }


}
