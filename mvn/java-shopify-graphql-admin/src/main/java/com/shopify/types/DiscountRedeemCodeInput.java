package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountRedeemCodeInput {
  
  private String code;

  public DiscountRedeemCodeInput() {
  }

  
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
    
    private String code;

    public DiscountRedeemCodeInput build() {
      DiscountRedeemCodeInput result = new DiscountRedeemCodeInput();
      result.code = this.code;
      return result;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }
  }
}
