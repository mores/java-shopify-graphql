package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `shippingPackageUpdate` mutation.
 */
public class ShippingPackageUpdatePayload {
  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ShippingPackageUpdatePayload() {
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
    return "ShippingPackageUpdatePayload{userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingPackageUpdatePayload that = (ShippingPackageUpdatePayload) o;
    return Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ShippingPackageUpdatePayload build() {
      ShippingPackageUpdatePayload result = new ShippingPackageUpdatePayload();
      result.userErrors = this.userErrors;
      return result;
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
