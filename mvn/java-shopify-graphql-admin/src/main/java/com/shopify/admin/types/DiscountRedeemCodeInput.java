package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the redeem code to attach to a discount.
 */
public class DiscountRedeemCodeInput {
  /**
   * The code that a customer can use at checkout to receive the associated discount.
   */
  private String code;

  public DiscountRedeemCodeInput() {
  }

  /**
   * The code that a customer can use at checkout to receive the associated discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return "DiscountRedeemCodeInput{code='" + code + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountRedeemCodeInput that = (DiscountRedeemCodeInput) o;
    return Objects.equals(code, that.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code that a customer can use at checkout to receive the associated discount.
     */
    private String code;

    public DiscountRedeemCodeInput build() {
      DiscountRedeemCodeInput result = new DiscountRedeemCodeInput();
      result.code = this.code;
      return result;
    }

    /**
     * The code that a customer can use at checkout to receive the associated discount.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }
  }
}
