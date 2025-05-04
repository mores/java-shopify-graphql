package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for approving a customer's return request.
 */
public class ReturnApproveRequestInput {
  /**
   * The ID of the return that's being approved.
   */
  private String id;

  /**
   * Notify the customer when a return request is approved.
   * The customer will only receive a notification if `Order.email` is present.
   */
  private Boolean notifyCustomer = false;

  public ReturnApproveRequestInput() {
  }

  /**
   * The ID of the return that's being approved.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Notify the customer when a return request is approved.
   * The customer will only receive a notification if `Order.email` is present.
   */
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  @Override
  public String toString() {
    return "ReturnApproveRequestInput{id='" + id + "', notifyCustomer='" + notifyCustomer + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnApproveRequestInput that = (ReturnApproveRequestInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(notifyCustomer, that.notifyCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, notifyCustomer);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the return that's being approved.
     */
    private String id;

    /**
     * Notify the customer when a return request is approved.
     * The customer will only receive a notification if `Order.email` is present.
     */
    private Boolean notifyCustomer = false;

    public ReturnApproveRequestInput build() {
      ReturnApproveRequestInput result = new ReturnApproveRequestInput();
      result.id = this.id;
      result.notifyCustomer = this.notifyCustomer;
      return result;
    }

    /**
     * The ID of the return that's being approved.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Notify the customer when a return request is approved.
     * The customer will only receive a notification if `Order.email` is present.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }
  }
}
