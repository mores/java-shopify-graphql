package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the cart transform feature configuration for the shop.
 */
public class CartTransformEligibleOperations {
  /**
   * The shop is eligible for expand operations.
   */
  private boolean expandOperation;

  /**
   * The shop is eligible for merge operations.
   */
  private boolean mergeOperation;

  /**
   * The shop is eligible for update operations.
   */
  private boolean updateOperation;

  public CartTransformEligibleOperations() {
  }

  /**
   * The shop is eligible for expand operations.
   */
  public boolean getExpandOperation() {
    return expandOperation;
  }

  public void setExpandOperation(boolean expandOperation) {
    this.expandOperation = expandOperation;
  }

  /**
   * The shop is eligible for merge operations.
   */
  public boolean getMergeOperation() {
    return mergeOperation;
  }

  public void setMergeOperation(boolean mergeOperation) {
    this.mergeOperation = mergeOperation;
  }

  /**
   * The shop is eligible for update operations.
   */
  public boolean getUpdateOperation() {
    return updateOperation;
  }

  public void setUpdateOperation(boolean updateOperation) {
    this.updateOperation = updateOperation;
  }

  @Override
  public String toString() {
    return "CartTransformEligibleOperations{expandOperation='" + expandOperation + "', mergeOperation='" + mergeOperation + "', updateOperation='" + updateOperation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartTransformEligibleOperations that = (CartTransformEligibleOperations) o;
    return expandOperation == that.expandOperation &&
        mergeOperation == that.mergeOperation &&
        updateOperation == that.updateOperation;
  }

  @Override
  public int hashCode() {
    return Objects.hash(expandOperation, mergeOperation, updateOperation);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The shop is eligible for expand operations.
     */
    private boolean expandOperation;

    /**
     * The shop is eligible for merge operations.
     */
    private boolean mergeOperation;

    /**
     * The shop is eligible for update operations.
     */
    private boolean updateOperation;

    public CartTransformEligibleOperations build() {
      CartTransformEligibleOperations result = new CartTransformEligibleOperations();
      result.expandOperation = this.expandOperation;
      result.mergeOperation = this.mergeOperation;
      result.updateOperation = this.updateOperation;
      return result;
    }

    /**
     * The shop is eligible for expand operations.
     */
    public Builder expandOperation(boolean expandOperation) {
      this.expandOperation = expandOperation;
      return this;
    }

    /**
     * The shop is eligible for merge operations.
     */
    public Builder mergeOperation(boolean mergeOperation) {
      this.mergeOperation = mergeOperation;
      return this;
    }

    /**
     * The shop is eligible for update operations.
     */
    public Builder updateOperation(boolean updateOperation) {
      this.updateOperation = updateOperation;
      return this;
    }
  }
}
