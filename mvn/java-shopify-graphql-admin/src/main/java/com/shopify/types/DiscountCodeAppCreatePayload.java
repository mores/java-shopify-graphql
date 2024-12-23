package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `discountCodeAppCreate` mutation.
 */
public class DiscountCodeAppCreatePayload {
  /**
   * The discount that the app provides.
   */
  private DiscountCodeApp codeAppDiscount;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DiscountUserError> userErrors;

  public DiscountCodeAppCreatePayload() {
  }

  /**
   * The discount that the app provides.
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
    return "DiscountCodeAppCreatePayload{codeAppDiscount='" + codeAppDiscount + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeAppCreatePayload that = (DiscountCodeAppCreatePayload) o;
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
     * The discount that the app provides.
     */
    private DiscountCodeApp codeAppDiscount;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DiscountUserError> userErrors;

    public DiscountCodeAppCreatePayload build() {
      DiscountCodeAppCreatePayload result = new DiscountCodeAppCreatePayload();
      result.codeAppDiscount = this.codeAppDiscount;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The discount that the app provides.
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
