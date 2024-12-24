package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionDraftLineUpdatePayload {
  
  private SubscriptionDraft draft;

  
  private SubscriptionLine lineUpdated;

  
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftLineUpdatePayload() {
  }

  
  public SubscriptionDraft getDraft() {
    return draft;
  }

  public void setDraft(SubscriptionDraft draft) {
    this.draft = draft;
  }

  
  public SubscriptionLine getLineUpdated() {
    return lineUpdated;
  }

  public void setLineUpdated(SubscriptionLine lineUpdated) {
    this.lineUpdated = lineUpdated;
  }

  
  public List<SubscriptionDraftUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionDraftUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionDraftLineUpdatePayload{draft='" + draft + "', lineUpdated='" + lineUpdated + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftLineUpdatePayload that = (SubscriptionDraftLineUpdatePayload) o;
    return Objects.equals(draft, that.draft) &&
        Objects.equals(lineUpdated, that.lineUpdated) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draft, lineUpdated, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionDraft draft;

    
    private SubscriptionLine lineUpdated;

    
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftLineUpdatePayload build() {
      SubscriptionDraftLineUpdatePayload result = new SubscriptionDraftLineUpdatePayload();
      result.draft = this.draft;
      result.lineUpdated = this.lineUpdated;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder draft(SubscriptionDraft draft) {
      this.draft = draft;
      return this;
    }

    
    public Builder lineUpdated(SubscriptionLine lineUpdated) {
      this.lineUpdated = lineUpdated;
      return this;
    }

    
    public Builder userErrors(List<SubscriptionDraftUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
