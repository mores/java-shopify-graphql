package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionDraftFreeShippingDiscountAddPayload {
  
  private SubscriptionManualDiscount discountAdded;

  
  private SubscriptionDraft draft;

  
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftFreeShippingDiscountAddPayload() {
  }

  
  public SubscriptionManualDiscount getDiscountAdded() {
    return discountAdded;
  }

  public void setDiscountAdded(SubscriptionManualDiscount discountAdded) {
    this.discountAdded = discountAdded;
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
    return "SubscriptionDraftFreeShippingDiscountAddPayload{discountAdded='" + discountAdded + "', draft='" + draft + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftFreeShippingDiscountAddPayload that = (SubscriptionDraftFreeShippingDiscountAddPayload) o;
    return Objects.equals(discountAdded, that.discountAdded) &&
        Objects.equals(draft, that.draft) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAdded, draft, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionManualDiscount discountAdded;

    
    private SubscriptionDraft draft;

    
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftFreeShippingDiscountAddPayload build() {
      SubscriptionDraftFreeShippingDiscountAddPayload result = new SubscriptionDraftFreeShippingDiscountAddPayload();
      result.discountAdded = this.discountAdded;
      result.draft = this.draft;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder discountAdded(SubscriptionManualDiscount discountAdded) {
      this.discountAdded = discountAdded;
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
