package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DiscountAutomaticDeletePayload {
  
  private String deletedAutomaticDiscountId;

  
  private List<DiscountUserError> userErrors;

  public DiscountAutomaticDeletePayload() {
  }

  
  public String getDeletedAutomaticDiscountId() {
    return deletedAutomaticDiscountId;
  }

  public void setDeletedAutomaticDiscountId(String deletedAutomaticDiscountId) {
    this.deletedAutomaticDiscountId = deletedAutomaticDiscountId;
  }

  
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticDeletePayload{deletedAutomaticDiscountId='" + deletedAutomaticDiscountId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticDeletePayload that = (DiscountAutomaticDeletePayload) o;
    return Objects.equals(deletedAutomaticDiscountId, that.deletedAutomaticDiscountId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAutomaticDiscountId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedAutomaticDiscountId;

    
    private List<DiscountUserError> userErrors;

    public DiscountAutomaticDeletePayload build() {
      DiscountAutomaticDeletePayload result = new DiscountAutomaticDeletePayload();
      result.deletedAutomaticDiscountId = this.deletedAutomaticDiscountId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedAutomaticDiscountId(String deletedAutomaticDiscountId) {
      this.deletedAutomaticDiscountId = deletedAutomaticDiscountId;
      return this;
    }

    
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
