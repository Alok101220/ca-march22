package com.alok.account;
import java.time.LocalDate;
import java.util.Date;

public class CustomerInfo {

   
   private String accHolderName;
   private String accHolderPhone;
   private LocalDate dob;
   private String email;
   private Address address;

   public CustomerInfo() {
   }

   public CustomerInfo( String accHolderName, String accHolderPhone, LocalDate dob, String email, Address address) {
      
      this.accHolderName = accHolderName;
      this.accHolderPhone = accHolderPhone;
      this.dob = dob;
      this.email = email;
      this.address = address;
   }

  

   public String getAccHolderName() {
      return this.accHolderName;
   }

   public void setAccHolderName(String accHolderName) {
      this.accHolderName = accHolderName;
   }

   public String getAccHolderPhone() {
      return this.accHolderPhone;
   }

   public void setAccHolderPhone(String accHolderPhone) {
      this.accHolderPhone = accHolderPhone;
   }

   public LocalDate getDob() {
      return this.dob;
   }

   public void setDob(LocalDate dob) {
      this.dob = dob;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Address getAddress() {
      return this.address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   

   public CustomerInfo accHolderName(String accHolderName) {
      setAccHolderName(accHolderName);
      return this;
   }

   public CustomerInfo accHolderPhone(String accHolderPhone) {
      setAccHolderPhone(accHolderPhone);
      return this;
   }

   public CustomerInfo dob(LocalDate dob) {
      setDob(dob);
      return this;
   }

   public CustomerInfo email(String email) {
      setEmail(email);
      return this;
   }

   public CustomerInfo address(Address address) {
      setAddress(address);
      return this;
   }

   @Override
   public String toString() {
      return "{" +
         ", accHolderName='" + getAccHolderName() + "'" +
         ", accHolderPhone='" + getAccHolderPhone() + "'" +
         ", dob='" + getDob() + "'" +
         ", email='" + getEmail() + "'" +
         ", address='" + getAddress() + "'" +
         "}";
   }
}