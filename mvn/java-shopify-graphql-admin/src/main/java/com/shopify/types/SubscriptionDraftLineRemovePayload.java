package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionDraftLineRemovePayload {
  
  private List<SubscriptionManualDiscount> discountsUpdated;

  
  private SubscriptionDraft draft;

  
  private SubscriptionLine lineRemoved;

  
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftLineRemovePayload() {
  }

  
  public List<SubscriptionManualDiscount> getDiscountsUpdated() {
    return discountsUpdated;
  }

  public void setDiscountsUpdated(List<SubscriptionManualDiscount> discountsUpdated) {
    this.discountsUpdated = discountsUpdated;
  }

  
  public SubscriptionDraft getDraft() {
    return draft;
  }

  public void setDraft(SubscriptionDraft draft) {
    this.draft = draft;
  }

  
  public SubscriptionLine getLineRemoved() {
    return lineRemoved;
  }

  public void setLineRemoved(SubscriptionLine lineRemoved) {
    this.lineRemoved = lineRemoved;
  }

  
  public List<SubscriptionDraftUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionDraftUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionDraftLineRemovePayload{discountsUpdated='" + discountsUpdated + "', draft='" + draft + "', lineRemoved='" + lineRemoved + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftLineRemovePayload that = (SubscriptionDraftLineRemovePayload) o;
    return Objects.equals(discountsUpdated, that.discountsUpdated) &&
        Objects.equals(draft, that.draft) &&
        Objects.equals(lineRemoved, that.lineRemoved) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountsUpdated, draft, lineRemoved, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<SubscriptionManualDiscount> discountsUpdated;

    
    private SubscriptionDraft draft;

    
    private SubscriptionLine lineRemoved;

    
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftLineRemovePayload build() {
      SubscriptionDraftLineRemovePayload result = new SubscriptionDraftLineRemovePayload();
      result.discountsUpdated = this.discountsUpdated;
      result.draft = this.draft;
      result.lineRemoved = this.lineRemoved;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder discountsUpdated(List<SubscriptionManualDiscount> discountsUpdated) {
      this.discountsUpdated = discountsUpdated;
      return this;
    }

    
    public Builder draft(SubscriptionDraft draft) {
      this.draft = draft;
      return this;
    }

    
    public Builder lineRemoved(SubscriptionLine lineRemoved) {
      this.lineRemoved = lineRemoved;
      return this;
    }

    
    public Builder userErrors(List<SubscriptionDraftUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
