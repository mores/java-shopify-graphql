package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DiscountCodeBxgyUpdatePayload {
  
  private DiscountCodeNode codeDiscountNode;

  
  private List<DiscountUserError> userErrors;

  public DiscountCodeBxgyUpdatePayload() {
  }

  
  public DiscountCodeNode getCodeDiscountNode() {
    return codeDiscountNode;
  }

  public void setCodeDiscountNode(DiscountCodeNode codeDiscountNode) {
    this.codeDiscountNode = codeDiscountNode;
  }

  
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountCodeBxgyUpdatePayload{codeDiscountNode='" + codeDiscountNode + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeBxgyUpdatePayload that = (DiscountCodeBxgyUpdatePayload) o;
    return Objects.equals(codeDiscountNode, that.codeDiscountNode) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeDiscountNode, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountCodeNode codeDiscountNode;

    
    private List<DiscountUserError> userErrors;

    public DiscountCodeBxgyUpdatePayload build() {
      DiscountCodeBxgyUpdatePayload result = new DiscountCodeBxgyUpdatePayload();
      result.codeDiscountNode = this.codeDiscountNode;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder codeDiscountNode(DiscountCodeNode codeDiscountNode) {
      this.codeDiscountNode = codeDiscountNode;
      return this;
    }

    
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
