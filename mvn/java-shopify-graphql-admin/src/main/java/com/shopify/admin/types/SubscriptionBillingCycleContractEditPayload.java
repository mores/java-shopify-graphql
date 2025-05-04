package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionBillingCycleContractEdit` mutation.
 */
public class SubscriptionBillingCycleContractEditPayload {
  /**
   * The draft subscription contract object.
   */
  private SubscriptionDraft draft;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionBillingCycleContractEditPayload() {
  }

  /**
   * The draft subscription contract object.
   */
  public SubscriptionDraft getDraft() {
    return draft;
  }

  public void setDraft(SubscriptionDraft draft) {
    this.draft = draft;
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
    return "SubscriptionBillingCycleContractEditPayload{draft='" + draft + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleContractEditPayload that = (SubscriptionBillingCycleContractEditPayload) o;
    return Objects.equals(draft, that.draft) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draft, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The draft subscription contract object.
     */
    private SubscriptionDraft draft;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionBillingCycleContractEditPayload build() {
      SubscriptionBillingCycleContractEditPayload result = new SubscriptionBillingCycleContractEditPayload();
      result.draft = this.draft;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The draft subscription contract object.
     */
    public Builder draft(SubscriptionDraft draft) {
      this.draft = draft;
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
