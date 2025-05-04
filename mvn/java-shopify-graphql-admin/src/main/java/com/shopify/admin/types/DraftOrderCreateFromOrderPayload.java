package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `draftOrderCreateFromOrder` mutation.
 */
public class DraftOrderCreateFromOrderPayload {
  /**
   * The created draft order.
   */
  private DraftOrder draftOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public DraftOrderCreateFromOrderPayload() {
  }

  /**
   * The created draft order.
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
    return "DraftOrderCreateFromOrderPayload{draftOrder='" + draftOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderCreateFromOrderPayload that = (DraftOrderCreateFromOrderPayload) o;
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
     * The created draft order.
     */
    private DraftOrder draftOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public DraftOrderCreateFromOrderPayload build() {
      DraftOrderCreateFromOrderPayload result = new DraftOrderCreateFromOrderPayload();
      result.draftOrder = this.draftOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created draft order.
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
