package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FulfillmentOrderSupportedAction {
  
  private FulfillmentOrderAction action;

  
  private String externalUrl;

  public FulfillmentOrderSupportedAction() {
  }

  
  public FulfillmentOrderAction getAction() {
    return action;
  }

  public void setAction(FulfillmentOrderAction action) {
    this.action = action;
  }

  
  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderSupportedAction{action='" + action + "', externalUrl='" + externalUrl + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderSupportedAction that = (FulfillmentOrderSupportedAction) o;
    return Objects.equals(action, that.action) &&
        Objects.equals(externalUrl, that.externalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, externalUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentOrderAction action;

    
    private String externalUrl;

    public FulfillmentOrderSupportedAction build() {
      FulfillmentOrderSupportedAction result = new FulfillmentOrderSupportedAction();
      result.action = this.action;
      result.externalUrl = this.externalUrl;
      return result;
    }

    
    public Builder action(FulfillmentOrderAction action) {
      this.action = action;
      return this;
    }

    
    public Builder externalUrl(String externalUrl) {
      this.externalUrl = externalUrl;
      return this;
    }
  }
}
