package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * One of the actions that the fulfillment order supports in its current state.
 */
public class FulfillmentOrderSupportedAction {
  /**
   * The action value.
   */
  private FulfillmentOrderAction action;

  /**
   * The external URL to be used to initiate the fulfillment process outside Shopify.
   * Applicable only when the `action` value is `EXTERNAL`.
   */
  private String externalUrl;

  public FulfillmentOrderSupportedAction() {
  }

  /**
   * The action value.
   */
  public FulfillmentOrderAction getAction() {
    return action;
  }

  public void setAction(FulfillmentOrderAction action) {
    this.action = action;
  }

  /**
   * The external URL to be used to initiate the fulfillment process outside Shopify.
   * Applicable only when the `action` value is `EXTERNAL`.
   */
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
    /**
     * The action value.
     */
    private FulfillmentOrderAction action;

    /**
     * The external URL to be used to initiate the fulfillment process outside Shopify.
     * Applicable only when the `action` value is `EXTERNAL`.
     */
    private String externalUrl;

    public FulfillmentOrderSupportedAction build() {
      FulfillmentOrderSupportedAction result = new FulfillmentOrderSupportedAction();
      result.action = this.action;
      result.externalUrl = this.externalUrl;
      return result;
    }

    /**
     * The action value.
     */
    public Builder action(FulfillmentOrderAction action) {
      this.action = action;
      return this;
    }

    /**
     * The external URL to be used to initiate the fulfillment process outside Shopify.
     * Applicable only when the `action` value is `EXTERNAL`.
     */
    public Builder externalUrl(String externalUrl) {
      this.externalUrl = externalUrl;
      return this;
    }
  }
}
