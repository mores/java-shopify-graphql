package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionDraftDiscountRemovePayload {
  
  private SubscriptionDiscount discountRemoved;

  
  private SubscriptionDraft draft;

  
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftDiscountRemovePayload() {
  }

  
  public SubscriptionDiscount getDiscountRemoved() {
    return discountRemoved;
  }

  public void setDiscountRemoved(SubscriptionDiscount discountRemoved) {
    this.discountRemoved = discountRemoved;
  }

  
  public SubscriptionDraft getDraft() {
    return draft;
  }

  public void setDraft(SubscriptionDraft draft) {
    this.draft = draft;
  }

  
  public List<SubscriptionDraftUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionDraftUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionDraftDiscountRemovePayload{discountRemoved='" + discountRemoved + "', draft='" + draft + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftDiscountRemovePayload that = (SubscriptionDraftDiscountRemovePayload) o;
    return Objects.equals(discountRemoved, that.discountRemoved) &&
        Objects.equals(draft, that.draft) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountRemoved, draft, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionDiscount discountRemoved;

    
    private SubscriptionDraft draft;

    
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftDiscountRemovePayload build() {
      SubscriptionDraftDiscountRemovePayload result = new SubscriptionDraftDiscountRemovePayload();
      result.discountRemoved = this.discountRemoved;
      result.draft = this.draft;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder discountRemoved(SubscriptionDiscount discountRemoved) {
      this.discountRemoved = discountRemoved;
      return this;
    }

    
    public Builder draft(SubscriptionDraft draft) {
      this.draft = draft;
      return this;
    }

    
    public Builder userErrors(List<SubscriptionDraftUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
