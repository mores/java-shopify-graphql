package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DiscountAutomaticAppCreatePayload {
  
  private DiscountAutomaticApp automaticAppDiscount;

  
  private List<DiscountUserError> userErrors;

  public DiscountAutomaticAppCreatePayload() {
  }

  
  public DiscountAutomaticApp getAutomaticAppDiscount() {
    return automaticAppDiscount;
  }

  public void setAutomaticAppDiscount(DiscountAutomaticApp automaticAppDiscount) {
    this.automaticAppDiscount = automaticAppDiscount;
  }

  
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticAppCreatePayload{automaticAppDiscount='" + automaticAppDiscount + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticAppCreatePayload that = (DiscountAutomaticAppCreatePayload) o;
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
    
    private DiscountAutomaticApp automaticAppDiscount;

    
    private List<DiscountUserError> userErrors;

    public DiscountAutomaticAppCreatePayload build() {
      DiscountAutomaticAppCreatePayload result = new DiscountAutomaticAppCreatePayload();
      result.automaticAppDiscount = this.automaticAppDiscount;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder automaticAppDiscount(DiscountAutomaticApp automaticAppDiscount) {
      this.automaticAppDiscount = automaticAppDiscount;
      return this;
    }

    
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
