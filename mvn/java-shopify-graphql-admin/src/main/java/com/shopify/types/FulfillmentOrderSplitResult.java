package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The result of splitting a fulfillment order.
 */
public class FulfillmentOrderSplitResult {
  /**
   * The original fulfillment order as a result of the split.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * The remaining fulfillment order as a result of the split.
   */
  private FulfillmentOrder remainingFulfillmentOrder;

  /**
   * The replacement fulfillment order if the original fulfillment order wasn't in a state to be split.
   */
  private FulfillmentOrder replacementFulfillmentOrder;

  public FulfillmentOrderSplitResult() {
  }

  /**
   * The original fulfillment order as a result of the split.
   */
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  /**
   * The remaining fulfillment order as a result of the split.
   */
  public FulfillmentOrder getRemainingFulfillmentOrder() {
    return remainingFulfillmentOrder;
  }

  public void setRemainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
    this.remainingFulfillmentOrder = remainingFulfillmentOrder;
  }

  /**
   * The replacement fulfillment order if the original fulfillment order wasn't in a state to be split.
   */
  public FulfillmentOrder getReplacementFulfillmentOrder() {
    return replacementFulfillmentOrder;
  }

  public void setReplacementFulfillmentOrder(FulfillmentOrder replacementFulfillmentOrder) {
    this.replacementFulfillmentOrder = replacementFulfillmentOrder;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderSplitResult{fulfillmentOrder='" + fulfillmentOrder + "', remainingFulfillmentOrder='" + remainingFulfillmentOrder + "', replacementFulfillmentOrder='" + replacementFulfillmentOrder + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderSplitResult that = (FulfillmentOrderSplitResult) o;
    return Objects.equals(fulfillmentOrder, that.fulfillmentOrder) &&
        Objects.equals(remainingFulfillmentOrder, that.remainingFulfillmentOrder) &&
        Objects.equals(replacementFulfillmentOrder, that.replacementFulfillmentOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder, remainingFulfillmentOrder, replacementFulfillmentOrder);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The original fulfillment order as a result of the split.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * The remaining fulfillment order as a result of the split.
     */
    private FulfillmentOrder remainingFulfillmentOrder;

    /**
     * The replacement fulfillment order if the original fulfillment order wasn't in a state to be split.
     */
    private FulfillmentOrder replacementFulfillmentOrder;

    public FulfillmentOrderSplitResult build() {
      FulfillmentOrderSplitResult result = new FulfillmentOrderSplitResult();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.remainingFulfillmentOrder = this.remainingFulfillmentOrder;
      result.replacementFulfillmentOrder = this.replacementFulfillmentOrder;
      return result;
    }

    /**
     * The original fulfillment order as a result of the split.
     */
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    /**
     * The remaining fulfillment order as a result of the split.
     */
    public Builder remainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
      this.remainingFulfillmentOrder = remainingFulfillmentOrder;
      return this;
    }

    /**
     * The replacement fulfillment order if the original fulfillment order wasn't in a state to be split.
     */
    public Builder replacementFulfillmentOrder(FulfillmentOrder replacementFulfillmentOrder) {
      this.replacementFulfillmentOrder = replacementFulfillmentOrder;
      return this;
    }
  }
}
