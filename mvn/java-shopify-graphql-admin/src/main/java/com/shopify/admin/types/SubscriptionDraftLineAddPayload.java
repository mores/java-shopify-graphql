package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionDraftLineAdd` mutation.
 */
public class SubscriptionDraftLineAddPayload {
  /**
   * The Subscription Contract draft object.
   */
  private SubscriptionDraft draft;

  /**
   * The added Subscription Line.
   */
  private SubscriptionLine lineAdded;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftLineAddPayload() {
  }

  /**
   * The Subscription Contract draft object.
   */
  public SubscriptionDraft getDraft() {
    return draft;
  }

  public void setDraft(SubscriptionDraft draft) {
    this.draft = draft;
  }

  /**
   * The added Subscription Line.
   */
  public SubscriptionLine getLineAdded() {
    return lineAdded;
  }

  public void setLineAdded(SubscriptionLine lineAdded) {
    this.lineAdded = lineAdded;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The Subscription Contract draft object.
     */
    private SubscriptionDraft draft;

    /**
     * The added Subscription Line.
     */
    private SubscriptionLine lineAdded;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftLineAddPayload build() {
      SubscriptionDraftLineAddPayload result = new SubscriptionDraftLineAddPayload();
      result.draft = this.draft;
      result.lineAdded = this.lineAdded;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The Subscription Contract draft object.
     */
    public Builder draft(SubscriptionDraft draft) {
      this.draft = draft;
      return this;
    }

    /**
     * The added Subscription Line.
     */
    public Builder lineAdded(SubscriptionLine lineAdded) {
      this.lineAdded = lineAdded;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<SubscriptionDraftUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
