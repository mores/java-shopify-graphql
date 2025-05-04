package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionDraftLineRemove` mutation.
 */
public class SubscriptionDraftLineRemovePayload {
  /**
   * The list of updated subscription discounts impacted by the removed line.
   */
  private List<SubscriptionManualDiscount> discountsUpdated;

  /**
   * The Subscription Contract draft object.
   */
  private SubscriptionDraft draft;

  /**
   * The removed Subscription Line.
   */
  private SubscriptionLine lineRemoved;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftLineRemovePayload() {
  }

  /**
   * The list of updated subscription discounts impacted by the removed line.
   */
  public List<SubscriptionManualDiscount> getDiscountsUpdated() {
    return discountsUpdated;
  }

  public void setDiscountsUpdated(List<SubscriptionManualDiscount> discountsUpdated) {
    this.discountsUpdated = discountsUpdated;
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
   * The removed Subscription Line.
   */
  public SubscriptionLine getLineRemoved() {
    return lineRemoved;
  }

  public void setLineRemoved(SubscriptionLine lineRemoved) {
    this.lineRemoved = lineRemoved;
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
    /**
     * The list of updated subscription discounts impacted by the removed line.
     */
    private List<SubscriptionManualDiscount> discountsUpdated;

    /**
     * The Subscription Contract draft object.
     */
    private SubscriptionDraft draft;

    /**
     * The removed Subscription Line.
     */
    private SubscriptionLine lineRemoved;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftLineRemovePayload build() {
      SubscriptionDraftLineRemovePayload result = new SubscriptionDraftLineRemovePayload();
      result.discountsUpdated = this.discountsUpdated;
      result.draft = this.draft;
      result.lineRemoved = this.lineRemoved;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The list of updated subscription discounts impacted by the removed line.
     */
    public Builder discountsUpdated(List<SubscriptionManualDiscount> discountsUpdated) {
      this.discountsUpdated = discountsUpdated;
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
     * The removed Subscription Line.
     */
    public Builder lineRemoved(SubscriptionLine lineRemoved) {
      this.lineRemoved = lineRemoved;
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
