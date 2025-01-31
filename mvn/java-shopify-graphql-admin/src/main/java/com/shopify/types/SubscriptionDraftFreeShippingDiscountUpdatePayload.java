package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionDraftFreeShippingDiscountUpdatePayload {
  
  private SubscriptionManualDiscount discountUpdated;

  
  private SubscriptionDraft draft;

  
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftFreeShippingDiscountUpdatePayload() {
  }

  
  public SubscriptionManualDiscount getDiscountUpdated() {
    return discountUpdated;
  }

  public void setDiscountUpdated(SubscriptionManualDiscount discountUpdated) {
    this.discountUpdated = discountUpdated;
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
    return "SubscriptionDraftFreeShippingDiscountUpdatePayload{discountUpdated='" + discountUpdated + "', draft='" + draft + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftFreeShippingDiscountUpdatePayload that = (SubscriptionDraftFreeShippingDiscountUpdatePayload) o;
    return Objects.equals(discountUpdated, that.discountUpdated) &&
        Objects.equals(draft, that.draft) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountUpdated, draft, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionManualDiscount discountUpdated;

    
    private SubscriptionDraft draft;

    
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftFreeShippingDiscountUpdatePayload build() {
      SubscriptionDraftFreeShippingDiscountUpdatePayload result = new SubscriptionDraftFreeShippingDiscountUpdatePayload();
      result.discountUpdated = this.discountUpdated;
      result.draft = this.draft;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder discountUpdated(SubscriptionManualDiscount discountUpdated) {
      this.discountUpdated = discountUpdated;
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
