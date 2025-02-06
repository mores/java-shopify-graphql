package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for identifying a customer.
 */
public class CustomerIdentifierInput {
  /**
   * The ID of the customer.
   */
  private String id;

  /**
   * The custom ID of the customer.
   */
  private UniqueMetafieldValueInput customId;

  /**
   * The email address of the customer.
   */
  private String emailAddress;

  /**
   * The phone number of the customer.
   */
  private String phoneNumber;

  public CustomerIdentifierInput() {
  }

  /**
   * The ID of the customer.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The custom ID of the customer.
   */
  public UniqueMetafieldValueInput getCustomId() {
    return customId;
  }

  public void setCustomId(UniqueMetafieldValueInput customId) {
    this.customId = customId;
  }

  /**
   * The email address of the customer.
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * The phone number of the customer.
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "CustomerIdentifierInput{id='" + id + "', customId='" + customId + "', emailAddress='" + emailAddress + "', phoneNumber='" + phoneNumber + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerIdentifierInput that = (CustomerIdentifierInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(customId, that.customId) &&
        Objects.equals(emailAddress, that.emailAddress) &&
        Objects.equals(phoneNumber, that.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customId, emailAddress, phoneNumber);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the customer.
     */
    private String id;

    /**
     * The custom ID of the customer.
     */
    private UniqueMetafieldValueInput customId;

    /**
     * The email address of the customer.
     */
    private String emailAddress;

    /**
     * The phone number of the customer.
     */
    private String phoneNumber;

    public CustomerIdentifierInput build() {
      CustomerIdentifierInput result = new CustomerIdentifierInput();
      result.id = this.id;
      result.customId = this.customId;
      result.emailAddress = this.emailAddress;
      result.phoneNumber = this.phoneNumber;
      return result;
    }

    /**
     * The ID of the customer.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The custom ID of the customer.
     */
    public Builder customId(UniqueMetafieldValueInput customId) {
      this.customId = customId;
      return this;
    }

    /**
     * The email address of the customer.
     */
    public Builder emailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
      return this;
    }

    /**
     * The phone number of the customer.
     */
    public Builder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }
  }
}
