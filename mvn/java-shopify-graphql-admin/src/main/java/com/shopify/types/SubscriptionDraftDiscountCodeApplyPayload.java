package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionDraftDiscountCodeApplyPayload {
  
  private SubscriptionAppliedCodeDiscount appliedDiscount;

  
  private SubscriptionDraft draft;

  
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftDiscountCodeApplyPayload() {
  }

  
  public SubscriptionAppliedCodeDiscount getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(SubscriptionAppliedCodeDiscount appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
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
    return "SubscriptionDraftDiscountCodeApplyPayload{appliedDiscount='" + appliedDiscount + "', draft='" + draft + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftDiscountCodeApplyPayload that = (SubscriptionDraftDiscountCodeApplyPayload) o;
    return Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(draft, that.draft) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDiscount, draft, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionAppliedCodeDiscount appliedDiscount;

    
    private SubscriptionDraft draft;

    
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftDiscountCodeApplyPayload build() {
      SubscriptionDraftDiscountCodeApplyPayload result = new SubscriptionDraftDiscountCodeApplyPayload();
      result.appliedDiscount = this.appliedDiscount;
      result.draft = this.draft;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder appliedDiscount(SubscriptionAppliedCodeDiscount appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
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
