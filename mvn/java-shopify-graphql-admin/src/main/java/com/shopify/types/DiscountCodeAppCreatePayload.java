package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DiscountCodeAppCreatePayload {
  
  private DiscountCodeApp codeAppDiscount;

  
  private List<DiscountUserError> userErrors;

  public DiscountCodeAppCreatePayload() {
  }

  
  public DiscountCodeApp getCodeAppDiscount() {
    return codeAppDiscount;
  }

  public void setCodeAppDiscount(DiscountCodeApp codeAppDiscount) {
    this.codeAppDiscount = codeAppDiscount;
  }

  
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
    
    private DiscountCodeApp codeAppDiscount;

    
    private List<DiscountUserError> userErrors;

    public DiscountCodeAppCreatePayload build() {
      DiscountCodeAppCreatePayload result = new DiscountCodeAppCreatePayload();
      result.codeAppDiscount = this.codeAppDiscount;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder codeAppDiscount(DiscountCodeApp codeAppDiscount) {
      this.codeAppDiscount = codeAppDiscount;
      return this;
    }

    
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
