package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `discountAutomaticAppUpdate` mutation.
 */
public class DiscountAutomaticAppUpdatePayload {
  /**
   * The updated automatic discount that the app provides.
   */
  private DiscountAutomaticApp automaticAppDiscount;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DiscountUserError> userErrors;

  public DiscountAutomaticAppUpdatePayload() {
  }

  /**
   * The updated automatic discount that the app provides.
   */
  public DiscountAutomaticApp getAutomaticAppDiscount() {
    return automaticAppDiscount;
  }

  public void setAutomaticAppDiscount(DiscountAutomaticApp automaticAppDiscount) {
    this.automaticAppDiscount = automaticAppDiscount;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticAppUpdatePayload{automaticAppDiscount='" + automaticAppDiscount + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticAppUpdatePayload that = (DiscountAutomaticAppUpdatePayload) o;
    return Objects.equals(automaticAppDiscount, that.automaticAppDiscount) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticAppDiscount, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated automatic discount that the app provides.
     */
    private DiscountAutomaticApp automaticAppDiscount;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DiscountUserError> userErrors;

    public DiscountAutomaticAppUpdatePayload build() {
      DiscountAutomaticAppUpdatePayload result = new DiscountAutomaticAppUpdatePayload();
      result.automaticAppDiscount = this.automaticAppDiscount;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated automatic discount that the app provides.
     */
    public Builder automaticAppDiscount(DiscountAutomaticApp automaticAppDiscount) {
      this.automaticAppDiscount = automaticAppDiscount;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
