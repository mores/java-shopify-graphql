package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionDraftLineAddPayload {
  
  private SubscriptionDraft draft;

  
  private SubscriptionLine lineAdded;

  
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftLineAddPayload() {
  }

  
  public SubscriptionDraft getDraft() {
    return draft;
  }

  public void setDraft(SubscriptionDraft draft) {
    this.draft = draft;
  }

  
  public SubscriptionLine getLineAdded() {
    return lineAdded;
  }

  public void setLineAdded(SubscriptionLine lineAdded) {
    this.lineAdded = lineAdded;
  }

  
  public List<SubscriptionDraftUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionDraftUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionDraftLineAddPayload{draft='" + draft + "', lineAdded='" + lineAdded + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftLineAddPayload that = (SubscriptionDraftLineAddPayload) o;
    return Objects.equals(draft, that.draft) &&
        Objects.equals(lineAdded, that.lineAdded) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draft, lineAdded, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionDraft draft;

    
    private SubscriptionLine lineAdded;

    
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftLineAddPayload build() {
      SubscriptionDraftLineAddPayload result = new SubscriptionDraftLineAddPayload();
      result.draft = this.draft;
      result.lineAdded = this.lineAdded;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder draft(SubscriptionDraft draft) {
      this.draft = draft;
      return this;
    }

    
    public Builder lineAdded(SubscriptionLine lineAdded) {
      this.lineAdded = lineAdded;
      return this;
    }

    
    public Builder userErrors(List<SubscriptionDraftUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
