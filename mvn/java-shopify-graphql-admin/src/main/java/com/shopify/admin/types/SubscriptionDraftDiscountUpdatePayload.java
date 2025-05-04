package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionDraftDiscountUpdate` mutation.
 */
public class SubscriptionDraftDiscountUpdatePayload {
  /**
   * The updated Subscription Discount.
   */
  private SubscriptionManualDiscount discountUpdated;

  /**
   * The Subscription Contract draft object.
   */
  private SubscriptionDraft draft;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftDiscountUpdatePayload() {
  }

  /**
   * The updated Subscription Discount.
   */
  public SubscriptionManualDiscount getDiscountUpdated() {
    return discountUpdated;
  }

  public void setDiscountUpdated(SubscriptionManualDiscount discountUpdated) {
    this.discountUpdated = discountUpdated;
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
    return "SubscriptionDraftDiscountUpdatePayload{discountUpdated='" + discountUpdated + "', draft='" + draft + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftDiscountUpdatePayload that = (SubscriptionDraftDiscountUpdatePayload) o;
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
    /**
     * The updated Subscription Discount.
     */
    private SubscriptionManualDiscount discountUpdated;

    /**
     * The Subscription Contract draft object.
     */
    private SubscriptionDraft draft;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftDiscountUpdatePayload build() {
      SubscriptionDraftDiscountUpdatePayload result = new SubscriptionDraftDiscountUpdatePayload();
      result.discountUpdated = this.discountUpdated;
      result.draft = this.draft;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated Subscription Discount.
     */
    public Builder discountUpdated(SubscriptionManualDiscount discountUpdated) {
      this.discountUpdated = discountUpdated;
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
