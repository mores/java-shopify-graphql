package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to override default customer merge rules.
 */
public class CustomerMergeOverrideFields {
  /**
   * The ID of the customer whose first name will be kept.
   */
  private String customerIdOfFirstNameToKeep;

  /**
   * The ID of the customer whose last name will be kept.
   */
  private String customerIdOfLastNameToKeep;

  /**
   * The ID of the customer whose email will be kept.
   */
  private String customerIdOfEmailToKeep;

  /**
   * The ID of the customer whose phone number will be kept.
   */
  private String customerIdOfPhoneNumberToKeep;

  /**
   * The ID of the customer whose default address will be kept.
   */
  private String customerIdOfDefaultAddressToKeep;

  /**
   * The note to keep.
   */
  private String note;

  /**
   * The tags to keep.
   */
  private List<String> tags;

  public CustomerMergeOverrideFields() {
  }

  /**
   * The ID of the customer whose first name will be kept.
   */
  public String getCustomerIdOfFirstNameToKeep() {
    return customerIdOfFirstNameToKeep;
  }

  public void setCustomerIdOfFirstNameToKeep(String customerIdOfFirstNameToKeep) {
    this.customerIdOfFirstNameToKeep = customerIdOfFirstNameToKeep;
  }

  /**
   * The ID of the customer whose last name will be kept.
   */
  public String getCustomerIdOfLastNameToKeep() {
    return customerIdOfLastNameToKeep;
  }

  public void setCustomerIdOfLastNameToKeep(String customerIdOfLastNameToKeep) {
    this.customerIdOfLastNameToKeep = customerIdOfLastNameToKeep;
  }

  /**
   * The ID of the customer whose email will be kept.
   */
  public String getCustomerIdOfEmailToKeep() {
    return customerIdOfEmailToKeep;
  }

  public void setCustomerIdOfEmailToKeep(String customerIdOfEmailToKeep) {
    this.customerIdOfEmailToKeep = customerIdOfEmailToKeep;
  }

  /**
   * The ID of the customer whose phone number will be kept.
   */
  public String getCustomerIdOfPhoneNumberToKeep() {
    return customerIdOfPhoneNumberToKeep;
  }

  public void setCustomerIdOfPhoneNumberToKeep(String customerIdOfPhoneNumberToKeep) {
    this.customerIdOfPhoneNumberToKeep = customerIdOfPhoneNumberToKeep;
  }

  /**
   * The ID of the customer whose default address will be kept.
   */
  public String getCustomerIdOfDefaultAddressToKeep() {
    return customerIdOfDefaultAddressToKeep;
  }

  public void setCustomerIdOfDefaultAddressToKeep(String customerIdOfDefaultAddressToKeep) {
    this.customerIdOfDefaultAddressToKeep = customerIdOfDefaultAddressToKeep;
  }

  /**
   * The note to keep.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The tags to keep.
   */
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
    /**
     * The ID of the customer whose first name will be kept.
     */
    private String customerIdOfFirstNameToKeep;

    /**
     * The ID of the customer whose last name will be kept.
     */
    private String customerIdOfLastNameToKeep;

    /**
     * The ID of the customer whose email will be kept.
     */
    private String customerIdOfEmailToKeep;

    /**
     * The ID of the customer whose phone number will be kept.
     */
    private String customerIdOfPhoneNumberToKeep;

    /**
     * The ID of the customer whose default address will be kept.
     */
    private String customerIdOfDefaultAddressToKeep;

    /**
     * The note to keep.
     */
    private String note;

    /**
     * The tags to keep.
     */
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

    /**
     * The ID of the customer whose first name will be kept.
     */
    public Builder customerIdOfFirstNameToKeep(String customerIdOfFirstNameToKeep) {
      this.customerIdOfFirstNameToKeep = customerIdOfFirstNameToKeep;
      return this;
    }

    /**
     * The ID of the customer whose last name will be kept.
     */
    public Builder customerIdOfLastNameToKeep(String customerIdOfLastNameToKeep) {
      this.customerIdOfLastNameToKeep = customerIdOfLastNameToKeep;
      return this;
    }

    /**
     * The ID of the customer whose email will be kept.
     */
    public Builder customerIdOfEmailToKeep(String customerIdOfEmailToKeep) {
      this.customerIdOfEmailToKeep = customerIdOfEmailToKeep;
      return this;
    }

    /**
     * The ID of the customer whose phone number will be kept.
     */
    public Builder customerIdOfPhoneNumberToKeep(String customerIdOfPhoneNumberToKeep) {
      this.customerIdOfPhoneNumberToKeep = customerIdOfPhoneNumberToKeep;
      return this;
    }

    /**
     * The ID of the customer whose default address will be kept.
     */
    public Builder customerIdOfDefaultAddressToKeep(String customerIdOfDefaultAddressToKeep) {
      this.customerIdOfDefaultAddressToKeep = customerIdOfDefaultAddressToKeep;
      return this;
    }

    /**
     * The note to keep.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The tags to keep.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }
}
