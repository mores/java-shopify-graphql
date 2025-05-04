package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `draftOrderComplete` mutation.
 */
public class DraftOrderCompletePayload {
  /**
   * The completed draft order.
   */
  private DraftOrder draftOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public DraftOrderCompletePayload() {
  }

  /**
   * The completed draft order.
   */
  public DraftOrder getDraftOrder() {
    return draftOrder;
  }

  public void setDraftOrder(DraftOrder draftOrder) {
    this.draftOrder = draftOrder;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DraftOrderCompletePayload{draftOrder='" + draftOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderCompletePayload that = (DraftOrderCompletePayload) o;
    return Objects.equals(draftOrder, that.draftOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draftOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The completed draft order.
     */
    private DraftOrder draftOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public DraftOrderCompletePayload build() {
      DraftOrderCompletePayload result = new DraftOrderCompletePayload();
      result.draftOrder = this.draftOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The completed draft order.
     */
    public Builder draftOrder(DraftOrder draftOrder) {
      this.draftOrder = draftOrder;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
