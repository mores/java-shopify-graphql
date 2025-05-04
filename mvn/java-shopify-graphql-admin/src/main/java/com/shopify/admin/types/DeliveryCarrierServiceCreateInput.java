package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create a carrier service.
 */
public class DeliveryCarrierServiceCreateInput {
  /**
   * The name of the shipping service as seen by merchants and their customers.
   */
  private String name;

  /**
   * The URL endpoint that Shopify needs to retrieve shipping rates. This must be a public URL.
   */
  private String callbackUrl;

  /**
   * Whether merchants are able to send dummy data to your service through the Shopify admin to see shipping rate examples.
   */
  private boolean supportsServiceDiscovery;

  /**
   * Whether this carrier service is active. If `true`, then the service will be available to serve rates in checkout.
   */
  private boolean active;

  public DeliveryCarrierServiceCreateInput() {
  }

  /**
   * The name of the shipping service as seen by merchants and their customers.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The URL endpoint that Shopify needs to retrieve shipping rates. This must be a public URL.
   */
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  /**
   * Whether merchants are able to send dummy data to your service through the Shopify admin to see shipping rate examples.
   */
  public boolean getSupportsServiceDiscovery() {
    return supportsServiceDiscovery;
  }

  public void setSupportsServiceDiscovery(boolean supportsServiceDiscovery) {
    this.supportsServiceDiscovery = supportsServiceDiscovery;
  }

  /**
   * Whether this carrier service is active. If `true`, then the service will be available to serve rates in checkout.
   */
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  @Override
  public String toString() {
    return "DeliveryCarrierServiceCreateInput{name='" + name + "', callbackUrl='" + callbackUrl + "', supportsServiceDiscovery='" + supportsServiceDiscovery + "', active='" + active + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCarrierServiceCreateInput that = (DeliveryCarrierServiceCreateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(callbackUrl, that.callbackUrl) &&
        supportsServiceDiscovery == that.supportsServiceDiscovery &&
        active == that.active;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, callbackUrl, supportsServiceDiscovery, active);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the shipping service as seen by merchants and their customers.
     */
    private String name;

    /**
     * The URL endpoint that Shopify needs to retrieve shipping rates. This must be a public URL.
     */
    private String callbackUrl;

    /**
     * Whether merchants are able to send dummy data to your service through the Shopify admin to see shipping rate examples.
     */
    private boolean supportsServiceDiscovery;

    /**
     * Whether this carrier service is active. If `true`, then the service will be available to serve rates in checkout.
     */
    private boolean active;

    public DeliveryCarrierServiceCreateInput build() {
      DeliveryCarrierServiceCreateInput result = new DeliveryCarrierServiceCreateInput();
      result.name = this.name;
      result.callbackUrl = this.callbackUrl;
      result.supportsServiceDiscovery = this.supportsServiceDiscovery;
      result.active = this.active;
      return result;
    }

    /**
     * The name of the shipping service as seen by merchants and their customers.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The URL endpoint that Shopify needs to retrieve shipping rates. This must be a public URL.
     */
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    /**
     * Whether merchants are able to send dummy data to your service through the Shopify admin to see shipping rate examples.
     */
    public Builder supportsServiceDiscovery(boolean supportsServiceDiscovery) {
      this.supportsServiceDiscovery = supportsServiceDiscovery;
      return this;
    }

    /**
     * Whether this carrier service is active. If `true`, then the service will be available to serve rates in checkout.
     */
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }
  }
}
