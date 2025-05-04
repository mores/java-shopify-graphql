package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderMove` mutation.
 */
public class FulfillmentOrderMovePayload {
  /**
   * The fulfillment order which now contains the moved line items and is assigned to the destination location.
   *   
   * If the original fulfillment order doesn't have any line items which are fully
   * or partially fulfilled, the original fulfillment order will be moved to the new location.
   * However if this isn't the case, the moved fulfillment order will differ from the original one.
   */
  private FulfillmentOrder movedFulfillmentOrder;

  /**
   * The final state of the original fulfillment order.
   *   
   * As a result of the move operation, the original fulfillment order might be moved to the new location
   * or remain in the original location. The original fulfillment order might have the same status or be closed.
   */
  private FulfillmentOrder originalFulfillmentOrder;

  /**
   * This field is deprecated.
   */
  private FulfillmentOrder remainingFulfillmentOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public FulfillmentOrderMovePayload() {
  }

  /**
   * The fulfillment order which now contains the moved line items and is assigned to the destination location.
   *   
   * If the original fulfillment order doesn't have any line items which are fully
   * or partially fulfilled, the original fulfillment order will be moved to the new location.
   * However if this isn't the case, the moved fulfillment order will differ from the original one.
   */
  public FulfillmentOrder getMovedFulfillmentOrder() {
    return movedFulfillmentOrder;
  }

  public void setMovedFulfillmentOrder(FulfillmentOrder movedFulfillmentOrder) {
    this.movedFulfillmentOrder = movedFulfillmentOrder;
  }

  /**
   * The final state of the original fulfillment order.
   *   
   * As a result of the move operation, the original fulfillment order might be moved to the new location
   * or remain in the original location. The original fulfillment order might have the same status or be closed.
   */
  public FulfillmentOrder getOriginalFulfillmentOrder() {
    return originalFulfillmentOrder;
  }

  public void setOriginalFulfillmentOrder(FulfillmentOrder originalFulfillmentOrder) {
    this.originalFulfillmentOrder = originalFulfillmentOrder;
  }

  /**
   * This field is deprecated.
   */
  public FulfillmentOrder getRemainingFulfillmentOrder() {
    return remainingFulfillmentOrder;
  }

  public void setRemainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
    this.remainingFulfillmentOrder = remainingFulfillmentOrder;
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
    return "FulfillmentOrderMovePayload{movedFulfillmentOrder='" + movedFulfillmentOrder + "', originalFulfillmentOrder='" + originalFulfillmentOrder + "', remainingFulfillmentOrder='" + remainingFulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderMovePayload that = (FulfillmentOrderMovePayload) o;
    return Objects.equals(movedFulfillmentOrder, that.movedFulfillmentOrder) &&
        Objects.equals(originalFulfillmentOrder, that.originalFulfillmentOrder) &&
        Objects.equals(remainingFulfillmentOrder, that.remainingFulfillmentOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movedFulfillmentOrder, originalFulfillmentOrder, remainingFulfillmentOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment order which now contains the moved line items and is assigned to the destination location.
     *   
     * If the original fulfillment order doesn't have any line items which are fully
     * or partially fulfilled, the original fulfillment order will be moved to the new location.
     * However if this isn't the case, the moved fulfillment order will differ from the original one.
     */
    private FulfillmentOrder movedFulfillmentOrder;

    /**
     * The final state of the original fulfillment order.
     *   
     * As a result of the move operation, the original fulfillment order might be moved to the new location
     * or remain in the original location. The original fulfillment order might have the same status or be closed.
     */
    private FulfillmentOrder originalFulfillmentOrder;

    /**
     * This field is deprecated.
     */
    private FulfillmentOrder remainingFulfillmentOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public FulfillmentOrderMovePayload build() {
      FulfillmentOrderMovePayload result = new FulfillmentOrderMovePayload();
      result.movedFulfillmentOrder = this.movedFulfillmentOrder;
      result.originalFulfillmentOrder = this.originalFulfillmentOrder;
      result.remainingFulfillmentOrder = this.remainingFulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The fulfillment order which now contains the moved line items and is assigned to the destination location.
     *   
     * If the original fulfillment order doesn't have any line items which are fully
     * or partially fulfilled, the original fulfillment order will be moved to the new location.
     * However if this isn't the case, the moved fulfillment order will differ from the original one.
     */
    public Builder movedFulfillmentOrder(FulfillmentOrder movedFulfillmentOrder) {
      this.movedFulfillmentOrder = movedFulfillmentOrder;
      return this;
    }

    /**
     * The final state of the original fulfillment order.
     *   
     * As a result of the move operation, the original fulfillment order might be moved to the new location
     * or remain in the original location. The original fulfillment order might have the same status or be closed.
     */
    public Builder originalFulfillmentOrder(FulfillmentOrder originalFulfillmentOrder) {
      this.originalFulfillmentOrder = originalFulfillmentOrder;
      return this;
    }

    /**
     * This field is deprecated.
     */
    public Builder remainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
      this.remainingFulfillmentOrder = remainingFulfillmentOrder;
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
