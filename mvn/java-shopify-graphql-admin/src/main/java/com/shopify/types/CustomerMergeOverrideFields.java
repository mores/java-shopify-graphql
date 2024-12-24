package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerMergeOverrideFields {
  
  private String customerIdOfFirstNameToKeep;

  
  private String customerIdOfLastNameToKeep;

  
  private String customerIdOfEmailToKeep;

  
  private String customerIdOfPhoneNumberToKeep;

  
  private String customerIdOfDefaultAddressToKeep;

  
  private String note;

  
  private List<String> tags;

  public CustomerMergeOverrideFields() {
  }

  
  public String getCustomerIdOfFirstNameToKeep() {
    return customerIdOfFirstNameToKeep;
  }

  public void setCustomerIdOfFirstNameToKeep(String customerIdOfFirstNameToKeep) {
    this.customerIdOfFirstNameToKeep = customerIdOfFirstNameToKeep;
  }

  
  public String getCustomerIdOfLastNameToKeep() {
    return customerIdOfLastNameToKeep;
  }

  public void setCustomerIdOfLastNameToKeep(String customerIdOfLastNameToKeep) {
    this.customerIdOfLastNameToKeep = customerIdOfLastNameToKeep;
  }

  
  public String getCustomerIdOfEmailToKeep() {
    return customerIdOfEmailToKeep;
  }

  public void setCustomerIdOfEmailToKeep(String customerIdOfEmailToKeep) {
    this.customerIdOfEmailToKeep = customerIdOfEmailToKeep;
  }

  
  public String getCustomerIdOfPhoneNumberToKeep() {
    return customerIdOfPhoneNumberToKeep;
  }

  public void setCustomerIdOfPhoneNumberToKeep(String customerIdOfPhoneNumberToKeep) {
    this.customerIdOfPhoneNumberToKeep = customerIdOfPhoneNumberToKeep;
  }

  
  public String getCustomerIdOfDefaultAddressToKeep() {
    return customerIdOfDefaultAddressToKeep;
  }

  public void setCustomerIdOfDefaultAddressToKeep(String customerIdOfDefaultAddressToKeep) {
    this.customerIdOfDefaultAddressToKeep = customerIdOfDefaultAddressToKeep;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public String toString() {
    return "CustomerMergeOverrideFields{customerIdOfFirstNameToKeep='" + customerIdOfFirstNameToKeep + "', customerIdOfLastNameToKeep='" + customerIdOfLastNameToKeep + "', customerIdOfEmailToKeep='" + customerIdOfEmailToKeep + "', customerIdOfPhoneNumberToKeep='" + customerIdOfPhoneNumberToKeep + "', customerIdOfDefaultAddressToKeep='" + customerIdOfDefaultAddressToKeep + "', note='" + note + "', tags='" + tags + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerMergeOverrideFields that = (CustomerMergeOverrideFields) o;
    return Objects.equals(customerIdOfFirstNameToKeep, that.customerIdOfFirstNameToKeep) &&
        Objects.equals(customerIdOfLastNameToKeep, that.customerIdOfLastNameToKeep) &&
        Objects.equals(customerIdOfEmailToKeep, that.customerIdOfEmailToKeep) &&
        Objects.equals(customerIdOfPhoneNumberToKeep, that.customerIdOfPhoneNumberToKeep) &&
        Objects.equals(customerIdOfDefaultAddressToKeep, that.customerIdOfDefaultAddressToKeep) &&
        Objects.equals(note, that.note) &&
        Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerIdOfFirstNameToKeep, customerIdOfLastNameToKeep, customerIdOfEmailToKeep, customerIdOfPhoneNumberToKeep, customerIdOfDefaultAddressToKeep, note, tags);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerIdOfFirstNameToKeep;

    
    private String customerIdOfLastNameToKeep;

    
    private String customerIdOfEmailToKeep;

    
    private String customerIdOfPhoneNumberToKeep;

    
    private String customerIdOfDefaultAddressToKeep;

    
    private String note;

    
    private List<String> tags;

    public CustomerMergeOverrideFields build() {
      CustomerMergeOverrideFields result = new CustomerMergeOverrideFields();
      result.customerIdOfFirstNameToKeep = this.customerIdOfFirstNameToKeep;
      result.customerIdOfLastNameToKeep = this.customerIdOfLastNameToKeep;
      result.customerIdOfEmailToKeep = this.customerIdOfEmailToKeep;
      result.customerIdOfPhoneNumberToKeep = this.customerIdOfPhoneNumberToKeep;
      result.customerIdOfDefaultAddressToKeep = this.customerIdOfDefaultAddressToKeep;
      result.note = this.note;
      result.tags = this.tags;
      return result;
    }

    
    public Builder customerIdOfFirstNameToKeep(String customerIdOfFirstNameToKeep) {
      this.customerIdOfFirstNameToKeep = customerIdOfFirstNameToKeep;
      return this;
    }

    
    public Builder customerIdOfLastNameToKeep(String customerIdOfLastNameToKeep) {
      this.customerIdOfLastNameToKeep = customerIdOfLastNameToKeep;
      return this;
    }

    
    public Builder customerIdOfEmailToKeep(String customerIdOfEmailToKeep) {
      this.customerIdOfEmailToKeep = customerIdOfEmailToKeep;
      return this;
    }

    
    public Builder customerIdOfPhoneNumberToKeep(String customerIdOfPhoneNumberToKeep) {
      this.customerIdOfPhoneNumberToKeep = customerIdOfPhoneNumberToKeep;
      return this;
    }

    
    public Builder customerIdOfDefaultAddressToKeep(String customerIdOfDefaultAddressToKeep) {
      this.customerIdOfDefaultAddressToKeep = customerIdOfDefaultAddressToKeep;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }
}
