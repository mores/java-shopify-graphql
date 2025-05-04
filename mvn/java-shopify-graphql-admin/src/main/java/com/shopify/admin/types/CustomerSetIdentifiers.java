package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to identify a customer.
 */
public class CustomerSetIdentifiers {
  /**
   * ID of customer to update.
   */
  private String id;

  /**
   * Email address of the customer to upsert.
   */
  private String email;

  /**
   * Phone number of the customer to upsert.
   */
  private String phone;

  /**
   * Custom ID of customer to upsert.
   */
  private UniqueMetafieldValueInput customId;

  public CustomerSetIdentifiers() {
  }

  /**
   * ID of customer to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Email address of the customer to upsert.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Phone number of the customer to upsert.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Custom ID of customer to upsert.
   */
  public UniqueMetafieldValueInput getCustomId() {
    return customId;
  }

  public void setCustomId(UniqueMetafieldValueInput customId) {
    this.customId = customId;
  }

  @Override
  public String toString() {
    return "CustomerSetIdentifiers{id='" + id + "', email='" + email + "', phone='" + phone + "', customId='" + customId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSetIdentifiers that = (CustomerSetIdentifiers) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(email, that.email) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(customId, that.customId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, phone, customId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of customer to update.
     */
    private String id;

    /**
     * Email address of the customer to upsert.
     */
    private String email;

    /**
     * Phone number of the customer to upsert.
     */
    private String phone;

    /**
     * Custom ID of customer to upsert.
     */
    private UniqueMetafieldValueInput customId;

    public CustomerSetIdentifiers build() {
      CustomerSetIdentifiers result = new CustomerSetIdentifiers();
      result.id = this.id;
      result.email = this.email;
      result.phone = this.phone;
      result.customId = this.customId;
      return result;
    }

    /**
     * ID of customer to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Email address of the customer to upsert.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * Phone number of the customer to upsert.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * Custom ID of customer to upsert.
     */
    public Builder customId(UniqueMetafieldValueInput customId) {
      this.customId = customId;
      return this;
    }
  }
}
