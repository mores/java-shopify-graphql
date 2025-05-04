package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `draftOrderInvoiceSend` mutation.
 */
public class DraftOrderInvoiceSendPayload {
  /**
   * The draft order an invoice email is sent for.
   */
  private DraftOrder draftOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public DraftOrderInvoiceSendPayload() {
  }

  /**
   * The draft order an invoice email is sent for.
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
    return "DraftOrderInvoiceSendPayload{draftOrder='" + draftOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderInvoiceSendPayload that = (DraftOrderInvoiceSendPayload) o;
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
     * The draft order an invoice email is sent for.
     */
    private DraftOrder draftOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public DraftOrderInvoiceSendPayload build() {
      DraftOrderInvoiceSendPayload result = new DraftOrderInvoiceSendPayload();
      result.draftOrder = this.draftOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The draft order an invoice email is sent for.
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
