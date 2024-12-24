package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DraftOrderDuplicatePayload {
  
  private DraftOrder draftOrder;

  
  private List<UserError> userErrors;

  public DraftOrderDuplicatePayload() {
  }

  
  public DraftOrder getDraftOrder() {
    return draftOrder;
  }

  public void setDraftOrder(DraftOrder draftOrder) {
    this.draftOrder = draftOrder;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DraftOrderDuplicatePayload{draftOrder='" + draftOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderDuplicatePayload that = (DraftOrderDuplicatePayload) o;
    return Objects.equals(draftOrder, that.draftOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draftOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DraftOrder draftOrder;

    
    private List<UserError> userErrors;

    public DraftOrderDuplicatePayload build() {
      DraftOrderDuplicatePayload result = new DraftOrderDuplicatePayload();
      result.draftOrder = this.draftOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder draftOrder(DraftOrder draftOrder) {
      this.draftOrder = draftOrder;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
