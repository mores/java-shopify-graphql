package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerDelete` mutation.
 */
public class CustomerDeletePayload {
  /**
   * The ID of the deleted customer.
   */
  private String deletedCustomerId;

  /**
   * The shop of the deleted customer.
   */
  private Shop shop;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerDeletePayload() {
  }

  /**
   * The ID of the deleted customer.
   */
  public String getDeletedCustomerId() {
    return deletedCustomerId;
  }

  public void setDeletedCustomerId(String deletedCustomerId) {
    this.deletedCustomerId = deletedCustomerId;
  }

  /**
   * The shop of the deleted customer.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerDeletePayload{deletedCustomerId='" + deletedCustomerId + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerDeletePayload that = (CustomerDeletePayload) o;
    return Objects.equals(deletedCustomerId, that.deletedCustomerId) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCustomerId, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted customer.
     */
    private String deletedCustomerId;

    /**
     * The shop of the deleted customer.
     */
    private Shop shop;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerDeletePayload build() {
      CustomerDeletePayload result = new CustomerDeletePayload();
      result.deletedCustomerId = this.deletedCustomerId;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted customer.
     */
    public Builder deletedCustomerId(String deletedCustomerId) {
      this.deletedCustomerId = deletedCustomerId;
      return this;
    }

    /**
     * The shop of the deleted customer.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
