package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `draftOrderCalculate` mutation.
 */
public class DraftOrderCalculatePayload {
  /**
   * The calculated properties for a draft order.
   */
  private CalculatedDraftOrder calculatedDraftOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public DraftOrderCalculatePayload() {
  }

  /**
   * The calculated properties for a draft order.
   */
  public CalculatedDraftOrder getCalculatedDraftOrder() {
    return calculatedDraftOrder;
  }

  public void setCalculatedDraftOrder(CalculatedDraftOrder calculatedDraftOrder) {
    this.calculatedDraftOrder = calculatedDraftOrder;
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
    return "DraftOrderCalculatePayload{calculatedDraftOrder='" + calculatedDraftOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderCalculatePayload that = (DraftOrderCalculatePayload) o;
    return Objects.equals(calculatedDraftOrder, that.calculatedDraftOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedDraftOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The calculated properties for a draft order.
     */
    private CalculatedDraftOrder calculatedDraftOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public DraftOrderCalculatePayload build() {
      DraftOrderCalculatePayload result = new DraftOrderCalculatePayload();
      result.calculatedDraftOrder = this.calculatedDraftOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The calculated properties for a draft order.
     */
    public Builder calculatedDraftOrder(CalculatedDraftOrder calculatedDraftOrder) {
      this.calculatedDraftOrder = calculatedDraftOrder;
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
