package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentOrderSubmitFulfillmentRequestPayload {
  
  private FulfillmentOrder originalFulfillmentOrder;

  
  private FulfillmentOrder submittedFulfillmentOrder;

  
  private FulfillmentOrder unsubmittedFulfillmentOrder;

  
  private List<UserError> userErrors;

  public FulfillmentOrderSubmitFulfillmentRequestPayload() {
  }

  
  public FulfillmentOrder getOriginalFulfillmentOrder() {
    return originalFulfillmentOrder;
  }

  public void setOriginalFulfillmentOrder(FulfillmentOrder originalFulfillmentOrder) {
    this.originalFulfillmentOrder = originalFulfillmentOrder;
  }

  
  public FulfillmentOrder getSubmittedFulfillmentOrder() {
    return submittedFulfillmentOrder;
  }

  public void setSubmittedFulfillmentOrder(FulfillmentOrder submittedFulfillmentOrder) {
    this.submittedFulfillmentOrder = submittedFulfillmentOrder;
  }

  
  public FulfillmentOrder getUnsubmittedFulfillmentOrder() {
    return unsubmittedFulfillmentOrder;
  }

  public void setUnsubmittedFulfillmentOrder(FulfillmentOrder unsubmittedFulfillmentOrder) {
    this.unsubmittedFulfillmentOrder = unsubmittedFulfillmentOrder;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderSubmitFulfillmentRequestPayload{originalFulfillmentOrder='" + originalFulfillmentOrder + "', submittedFulfillmentOrder='" + submittedFulfillmentOrder + "', unsubmittedFulfillmentOrder='" + unsubmittedFulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderSubmitFulfillmentRequestPayload that = (FulfillmentOrderSubmitFulfillmentRequestPayload) o;
    return Objects.equals(originalFulfillmentOrder, that.originalFulfillmentOrder) &&
        Objects.equals(submittedFulfillmentOrder, that.submittedFulfillmentOrder) &&
        Objects.equals(unsubmittedFulfillmentOrder, that.unsubmittedFulfillmentOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalFulfillmentOrder, submittedFulfillmentOrder, unsubmittedFulfillmentOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentOrder originalFulfillmentOrder;

    
    private FulfillmentOrder submittedFulfillmentOrder;

    
    private FulfillmentOrder unsubmittedFulfillmentOrder;

    
    private List<UserError> userErrors;

    public FulfillmentOrderSubmitFulfillmentRequestPayload build() {
      FulfillmentOrderSubmitFulfillmentRequestPayload result = new FulfillmentOrderSubmitFulfillmentRequestPayload();
      result.originalFulfillmentOrder = this.originalFulfillmentOrder;
      result.submittedFulfillmentOrder = this.submittedFulfillmentOrder;
      result.unsubmittedFulfillmentOrder = this.unsubmittedFulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder originalFulfillmentOrder(FulfillmentOrder originalFulfillmentOrder) {
      this.originalFulfillmentOrder = originalFulfillmentOrder;
      return this;
    }

    
    public Builder submittedFulfillmentOrder(FulfillmentOrder submittedFulfillmentOrder) {
      this.submittedFulfillmentOrder = submittedFulfillmentOrder;
      return this;
    }

    
    public Builder unsubmittedFulfillmentOrder(FulfillmentOrder unsubmittedFulfillmentOrder) {
      this.unsubmittedFulfillmentOrder = unsubmittedFulfillmentOrder;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
