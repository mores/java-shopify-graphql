package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DraftOrderCalculatePayload {
  
  private CalculatedDraftOrder calculatedDraftOrder;

  
  private List<UserError> userErrors;

  public DraftOrderCalculatePayload() {
  }

  
  public CalculatedDraftOrder getCalculatedDraftOrder() {
    return calculatedDraftOrder;
  }

  public void setCalculatedDraftOrder(CalculatedDraftOrder calculatedDraftOrder) {
    this.calculatedDraftOrder = calculatedDraftOrder;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DraftOrderCalculatePayload{calculatedDraftOrder='" + calculatedDraftOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderCalculatePayload that = (DraftOrderCalculatePayload) o;
    return Objects.equals(calculatedDraftOrder, that.calculatedDraftOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedDraftOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CalculatedDraftOrder calculatedDraftOrder;

    
    private List<UserError> userErrors;

    public DraftOrderCalculatePayload build() {
      DraftOrderCalculatePayload result = new DraftOrderCalculatePayload();
      result.calculatedDraftOrder = this.calculatedDraftOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder calculatedDraftOrder(CalculatedDraftOrder calculatedDraftOrder) {
      this.calculatedDraftOrder = calculatedDraftOrder;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
