package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for identifying an existing customer to associate with the order.
 */
public class OrderCreateAssociateCustomerAttributesInput {
  /**
   * The customer to associate to the order.
   */
  private String id;

  /**
   * The email of the customer to associate to the order.
   *   
   *               > Note:
   *               > If both this email input field and the email on `OrderCreateOrderInput` are provided, this field will
   *               > take precedence.
   */
  private String email;

  public OrderCreateAssociateCustomerAttributesInput() {
  }

  /**
   * The customer to associate to the order.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The email of the customer to associate to the order.
   *   
   *               > Note:
   *               > If both this email input field and the email on `OrderCreateOrderInput` are provided, this field will
   *               > take precedence.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "OrderCreateAssociateCustomerAttributesInput{id='" + id + "', email='" + email + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateAssociateCustomerAttributesInput that = (OrderCreateAssociateCustomerAttributesInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(email, that.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer to associate to the order.
     */
    private String id;

    /**
     * The email of the customer to associate to the order.
     *   
     *               > Note:
     *               > If both this email input field and the email on `OrderCreateOrderInput` are provided, this field will
     *               > take precedence.
     */
    private String email;

    public OrderCreateAssociateCustomerAttributesInput build() {
      OrderCreateAssociateCustomerAttributesInput result = new OrderCreateAssociateCustomerAttributesInput();
      result.id = this.id;
      result.email = this.email;
      return result;
    }

    /**
     * The customer to associate to the order.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The email of the customer to associate to the order.
     *   
     *               > Note:
     *               > If both this email input field and the email on `OrderCreateOrderInput` are provided, this field will
     *               > take precedence.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }
  }
}
