package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionDraftDiscountAdd` mutation.
 */
public class SubscriptionDraftDiscountAddPayload {
  /**
   * The added Subscription Discount.
   */
  private SubscriptionManualDiscount discountAdded;

  /**
   * The Subscription Contract draft object.
   */
  private SubscriptionDraft draft;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftDiscountAddPayload() {
  }

  /**
   * The added Subscription Discount.
   */
  public SubscriptionManualDiscount getDiscountAdded() {
    return discountAdded;
  }

  public void setDiscountAdded(SubscriptionManualDiscount discountAdded) {
    this.discountAdded = discountAdded;
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
    return "SubscriptionDraftDiscountAddPayload{discountAdded='" + discountAdded + "', draft='" + draft + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftDiscountAddPayload that = (SubscriptionDraftDiscountAddPayload) o;
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
    /**
     * The added Subscription Discount.
     */
    private SubscriptionManualDiscount discountAdded;

    /**
     * The Subscription Contract draft object.
     */
    private SubscriptionDraft draft;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftDiscountAddPayload build() {
      SubscriptionDraftDiscountAddPayload result = new SubscriptionDraftDiscountAddPayload();
      result.discountAdded = this.discountAdded;
      result.draft = this.draft;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The added Subscription Discount.
     */
    public Builder discountAdded(SubscriptionManualDiscount discountAdded) {
      this.discountAdded = discountAdded;
      return this;
    }

    /**
     * The Subscription Contract draft object.
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
