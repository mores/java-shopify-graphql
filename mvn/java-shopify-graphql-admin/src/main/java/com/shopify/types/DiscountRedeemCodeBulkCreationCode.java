package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DiscountRedeemCodeBulkCreationCode {
  
  private String code;

  
  private DiscountRedeemCode discountRedeemCode;

  
  private List<DiscountUserError> errors;

  public DiscountRedeemCodeBulkCreationCode() {
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public DiscountRedeemCode getDiscountRedeemCode() {
    return discountRedeemCode;
  }

  public void setDiscountRedeemCode(DiscountRedeemCode discountRedeemCode) {
    this.discountRedeemCode = discountRedeemCode;
  }

  
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
    
    private String code;

    
    private DiscountRedeemCode discountRedeemCode;

    
    private List<DiscountUserError> errors;

    public DiscountRedeemCodeBulkCreationCode build() {
      DiscountRedeemCodeBulkCreationCode result = new DiscountRedeemCodeBulkCreationCode();
      result.code = this.code;
      result.discountRedeemCode = this.discountRedeemCode;
      result.errors = this.errors;
      return result;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder discountRedeemCode(DiscountRedeemCode discountRedeemCode) {
      this.discountRedeemCode = discountRedeemCode;
      return this;
    }

    
    public Builder errors(List<DiscountUserError> errors) {
      this.errors = errors;
      return this;
    }
  }
}
