package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentOrderMovePayload {
  
  private FulfillmentOrder movedFulfillmentOrder;

  
  private FulfillmentOrder originalFulfillmentOrder;

  
  private FulfillmentOrder remainingFulfillmentOrder;

  
  private List<UserError> userErrors;

  public FulfillmentOrderMovePayload() {
  }

  
  public FulfillmentOrder getMovedFulfillmentOrder() {
    return movedFulfillmentOrder;
  }

  public void setMovedFulfillmentOrder(FulfillmentOrder movedFulfillmentOrder) {
    this.movedFulfillmentOrder = movedFulfillmentOrder;
  }

  
  public FulfillmentOrder getOriginalFulfillmentOrder() {
    return originalFulfillmentOrder;
  }

  public void setOriginalFulfillmentOrder(FulfillmentOrder originalFulfillmentOrder) {
    this.originalFulfillmentOrder = originalFulfillmentOrder;
  }

  
  public FulfillmentOrder getRemainingFulfillmentOrder() {
    return remainingFulfillmentOrder;
  }

  public void setRemainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
    this.remainingFulfillmentOrder = remainingFulfillmentOrder;
  }

  
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
    
    private FulfillmentOrder movedFulfillmentOrder;

    
    private FulfillmentOrder originalFulfillmentOrder;

    
    private FulfillmentOrder remainingFulfillmentOrder;

    
    private List<UserError> userErrors;

    public FulfillmentOrderMovePayload build() {
      FulfillmentOrderMovePayload result = new FulfillmentOrderMovePayload();
      result.movedFulfillmentOrder = this.movedFulfillmentOrder;
      result.originalFulfillmentOrder = this.originalFulfillmentOrder;
      result.remainingFulfillmentOrder = this.remainingFulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder movedFulfillmentOrder(FulfillmentOrder movedFulfillmentOrder) {
      this.movedFulfillmentOrder = movedFulfillmentOrder;
      return this;
    }

    
    public Builder originalFulfillmentOrder(FulfillmentOrder originalFulfillmentOrder) {
      this.originalFulfillmentOrder = originalFulfillmentOrder;
      return this;
    }

    
    public Builder remainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
      this.remainingFulfillmentOrder = remainingFulfillmentOrder;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
