package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerMergePreviewAlternateFields {
  
  private MailingAddress defaultAddress;

  
  private CustomerEmailAddress email;

  
  private String firstName;

  
  private String lastName;

  
  private CustomerPhoneNumber phoneNumber;

  public CustomerMergePreviewAlternateFields() {
  }

  
  public MailingAddress getDefaultAddress() {
    return defaultAddress;
  }

  public void setDefaultAddress(MailingAddress defaultAddress) {
    this.defaultAddress = defaultAddress;
  }

  
  public CustomerEmailAddress getEmail() {
    return email;
  }

  public void setEmail(CustomerEmailAddress email) {
    this.email = email;
  }

  
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

  
  public CustomerPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(CustomerPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "CustomerMergePreviewAlternateFields{defaultAddress='" + defaultAddress + "', email='" + email + "', firstName='" + firstName + "', lastName='" + lastName + "', phoneNumber='" + phoneNumber + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerMergePreviewAlternateFields that = (CustomerMergePreviewAlternateFields) o;
    return Objects.equals(defaultAddress, that.defaultAddress) &&
        Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(phoneNumber, that.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAddress, email, firstName, lastName, phoneNumber);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MailingAddress defaultAddress;

    
    private CustomerEmailAddress email;

    
    private String firstName;

    
    private String lastName;

    
    private CustomerPhoneNumber phoneNumber;

    public CustomerMergePreviewAlternateFields build() {
      CustomerMergePreviewAlternateFields result = new CustomerMergePreviewAlternateFields();
      result.defaultAddress = this.defaultAddress;
      result.email = this.email;
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.phoneNumber = this.phoneNumber;
      return result;
    }

    
    public Builder defaultAddress(MailingAddress defaultAddress) {
      this.defaultAddress = defaultAddress;
      return this;
    }

    
    public Builder email(CustomerEmailAddress email) {
      this.email = email;
      return this;
    }

    
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    
    public Builder phoneNumber(CustomerPhoneNumber phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }
  }
}
