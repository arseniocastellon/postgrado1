package util;
public class Foo {
   private String firstName;
   // Nuevo codigo añadido en la rama 1
   private String secondName;

   private String lastName;

   public String getFirstName() {
     return firstName;
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

  // Nuevo codigo añadido en la rama 1

   public String getSecondName() {
      return secondName;
   }
   public void setLastSecondName(String secondName) {
      this.secondName = secondName;
   }

}
