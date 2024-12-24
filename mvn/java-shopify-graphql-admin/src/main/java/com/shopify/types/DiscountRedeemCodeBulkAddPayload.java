package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DiscountRedeemCodeBulkAddPayload {
  
  private DiscountRedeemCodeBulkCreation bulkCreation;

  
  private List<DiscountUserError> userErrors;

  public DiscountRedeemCodeBulkAddPayload() {
  }

  
  public DiscountRedeemCodeBulkCreation getBulkCreation() {
    return bulkCreation;
  }

  public void setBulkCreation(DiscountRedeemCodeBulkCreation bulkCreation) {
    this.bulkCreation = bulkCreation;
  }

  
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountRedeemCodeBulkAddPayload{bulkCreation='" + bulkCreation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountRedeemCodeBulkAddPayload that = (DiscountRedeemCodeBulkAddPayload) o;
    return Objects.equals(bulkCreation, that.bulkCreation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkCreation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountRedeemCodeBulkCreation bulkCreation;

    
    private List<DiscountUserError> userErrors;

    public DiscountRedeemCodeBulkAddPayload build() {
      DiscountRedeemCodeBulkAddPayload result = new DiscountRedeemCodeBulkAddPayload();
      result.bulkCreation = this.bulkCreation;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder bulkCreation(DiscountRedeemCodeBulkCreation bulkCreation) {
      this.bulkCreation = bulkCreation;
      return this;
    }

    
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
