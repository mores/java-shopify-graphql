package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DiscountAutomaticBxgyUpdatePayload {
  
  private DiscountAutomaticNode automaticDiscountNode;

  
  private List<DiscountUserError> userErrors;

  public DiscountAutomaticBxgyUpdatePayload() {
  }

  
  public DiscountAutomaticNode getAutomaticDiscountNode() {
    return automaticDiscountNode;
  }

  public void setAutomaticDiscountNode(DiscountAutomaticNode automaticDiscountNode) {
    this.automaticDiscountNode = automaticDiscountNode;
  }

  
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticBxgyUpdatePayload{automaticDiscountNode='" + automaticDiscountNode + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticBxgyUpdatePayload that = (DiscountAutomaticBxgyUpdatePayload) o;
    return Objects.equals(automaticDiscountNode, that.automaticDiscountNode) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticDiscountNode, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountAutomaticNode automaticDiscountNode;

    
    private List<DiscountUserError> userErrors;

    public DiscountAutomaticBxgyUpdatePayload build() {
      DiscountAutomaticBxgyUpdatePayload result = new DiscountAutomaticBxgyUpdatePayload();
      result.automaticDiscountNode = this.automaticDiscountNode;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder automaticDiscountNode(DiscountAutomaticNode automaticDiscountNode) {
      this.automaticDiscountNode = automaticDiscountNode;
      return this;
    }

    
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
