package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `discountCodeAppUpdate` mutation.
 */
public class DiscountCodeAppUpdatePayload {
  /**
   * The updated discount that the app provides.
   */
  private DiscountCodeApp codeAppDiscount;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DiscountUserError> userErrors;

  public DiscountCodeAppUpdatePayload() {
  }

  /**
   * The updated discount that the app provides.
   */
  public DiscountCodeApp getCodeAppDiscount() {
    return codeAppDiscount;
  }

  public void setCodeAppDiscount(DiscountCodeApp codeAppDiscount) {
    this.codeAppDiscount = codeAppDiscount;
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
    return "DiscountCodeAppUpdatePayload{codeAppDiscount='" + codeAppDiscount + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeAppUpdatePayload that = (DiscountCodeAppUpdatePayload) o;
    return Objects.equals(codeAppDiscount, that.codeAppDiscount) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeAppDiscount, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated discount that the app provides.
     */
    private DiscountCodeApp codeAppDiscount;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DiscountUserError> userErrors;

    public DiscountCodeAppUpdatePayload build() {
      DiscountCodeAppUpdatePayload result = new DiscountCodeAppUpdatePayload();
      result.codeAppDiscount = this.codeAppDiscount;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated discount that the app provides.
     */
    public Builder codeAppDiscount(DiscountCodeApp codeAppDiscount) {
      this.codeAppDiscount = codeAppDiscount;
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
