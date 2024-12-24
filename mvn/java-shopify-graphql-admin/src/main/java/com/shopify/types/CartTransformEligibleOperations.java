package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CartTransformEligibleOperations {
  
  private boolean expandOperation;

  
  private boolean mergeOperation;

  
  private boolean updateOperation;

  public CartTransformEligibleOperations() {
  }

  
  public boolean getExpandOperation() {
    return expandOperation;
  }

  public void setExpandOperation(boolean expandOperation) {
    this.expandOperation = expandOperation;
  }

  
  public boolean getMergeOperation() {
    return mergeOperation;
  }

  public void setMergeOperation(boolean mergeOperation) {
    this.mergeOperation = mergeOperation;
  }

  
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
    
    private boolean expandOperation;

    
    private boolean mergeOperation;

    
    private boolean updateOperation;

    public CartTransformEligibleOperations build() {
      CartTransformEligibleOperations result = new CartTransformEligibleOperations();
      result.expandOperation = this.expandOperation;
      result.mergeOperation = this.mergeOperation;
      result.updateOperation = this.updateOperation;
      return result;
    }

    
    public Builder expandOperation(boolean expandOperation) {
      this.expandOperation = expandOperation;
      return this;
    }

    
    public Builder mergeOperation(boolean mergeOperation) {
      this.mergeOperation = mergeOperation;
      return this;
    }

    
    public Builder updateOperation(boolean updateOperation) {
      this.updateOperation = updateOperation;
      return this;
    }
  }
}
