package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A result of a discount redeem code creation operation created by a bulk creation.
 */
public class DiscountRedeemCodeBulkCreationCode {
  /**
   * The code to use in the discount redeem code creation operation.
   */
  private String code;

  /**
   * The successfully created discount redeem code.
   *   
   * If the discount redeem code couldn't be created, then this field is `null``.
   */
  private DiscountRedeemCode discountRedeemCode;

  /**
   * A list of errors that occurred during the creation operation of the discount redeem code.
   */
  private List<DiscountUserError> errors;

  public DiscountRedeemCodeBulkCreationCode() {
  }

  /**
   * The code to use in the discount redeem code creation operation.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The successfully created discount redeem code.
   *   
   * If the discount redeem code couldn't be created, then this field is `null``.
   */
  public DiscountRedeemCode getDiscountRedeemCode() {
    return discountRedeemCode;
  }

  public void setDiscountRedeemCode(DiscountRedeemCode discountRedeemCode) {
    this.discountRedeemCode = discountRedeemCode;
  }

  /**
   * A list of errors that occurred during the creation operation of the discount redeem code.
   */
  public List<DiscountUserError> getErrors() {
    return errors;
  }

  public void setErrors(List<DiscountUserError> errors) {
    this.errors = errors;
  }

  @Override
  public String toString() {
    return "DiscountRedeemCodeBulkCreationCode{code='" + code + "', discountRedeemCode='" + discountRedeemCode + "', errors='" + errors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountRedeemCodeBulkCreationCode that = (DiscountRedeemCodeBulkCreationCode) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(discountRedeemCode, that.discountRedeemCode) &&
        Objects.equals(errors, that.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, discountRedeemCode, errors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code to use in the discount redeem code creation operation.
     */
    private String code;

    /**
     * The successfully created discount redeem code.
     *   
     * If the discount redeem code couldn't be created, then this field is `null``.
     */
    private DiscountRedeemCode discountRedeemCode;

    /**
     * A list of errors that occurred during the creation operation of the discount redeem code.
     */
    private List<DiscountUserError> errors;

    public DiscountRedeemCodeBulkCreationCode build() {
      DiscountRedeemCodeBulkCreationCode result = new DiscountRedeemCodeBulkCreationCode();
      result.code = this.code;
      result.discountRedeemCode = this.discountRedeemCode;
      result.errors = this.errors;
      return result;
    }

    /**
     * The code to use in the discount redeem code creation operation.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The successfully created discount redeem code.
     *   
     * If the discount redeem code couldn't be created, then this field is `null``.
     */
    public Builder discountRedeemCode(DiscountRedeemCode discountRedeemCode) {
      this.discountRedeemCode = discountRedeemCode;
      return this;
    }

    /**
     * A list of errors that occurred during the creation operation of the discount redeem code.
     */
    public Builder errors(List<DiscountUserError> errors) {
      this.errors = errors;
      return this;
    }
  }
}
