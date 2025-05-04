package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionDraftDiscountRemove` mutation.
 */
public class SubscriptionDraftDiscountRemovePayload {
  /**
   * The removed subscription draft discount.
   */
  private SubscriptionDiscount discountRemoved;

  /**
   * The subscription contract draft object.
   */
  private SubscriptionDraft draft;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftDiscountRemovePayload() {
  }

  /**
   * The removed subscription draft discount.
   */
  public SubscriptionDiscount getDiscountRemoved() {
    return discountRemoved;
  }

  public void setDiscountRemoved(SubscriptionDiscount discountRemoved) {
    this.discountRemoved = discountRemoved;
  }

  /**
   * The subscription contract draft object.
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
    return "SubscriptionDraftDiscountRemovePayload{discountRemoved='" + discountRemoved + "', draft='" + draft + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftDiscountRemovePayload that = (SubscriptionDraftDiscountRemovePayload) o;
    return Objects.equals(discountRemoved, that.discountRemoved) &&
        Objects.equals(draft, that.draft) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountRemoved, draft, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The removed subscription draft discount.
     */
    private SubscriptionDiscount discountRemoved;

    /**
     * The subscription contract draft object.
     */
    private SubscriptionDraft draft;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftDiscountRemovePayload build() {
      SubscriptionDraftDiscountRemovePayload result = new SubscriptionDraftDiscountRemovePayload();
      result.discountRemoved = this.discountRemoved;
      result.draft = this.draft;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The removed subscription draft discount.
     */
    public Builder discountRemoved(SubscriptionDiscount discountRemoved) {
      this.discountRemoved = discountRemoved;
      return this;
    }

    /**
     * The subscription contract draft object.
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
