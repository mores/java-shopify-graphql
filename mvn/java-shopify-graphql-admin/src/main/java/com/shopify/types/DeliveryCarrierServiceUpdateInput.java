package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update a carrier service.
 */
public class DeliveryCarrierServiceUpdateInput {
  /**
   * The global ID of the carrier service to update.
   */
  private String id;

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
  private Boolean supportsServiceDiscovery;

  /**
   * Whether this carrier service is active. If `true`, then the service will be available to serve rates in checkout.
   */
  private Boolean active;

  public DeliveryCarrierServiceUpdateInput() {
  }

  /**
   * The global ID of the carrier service to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
  public Boolean getSupportsServiceDiscovery() {
    return supportsServiceDiscovery;
  }

  public void setSupportsServiceDiscovery(Boolean supportsServiceDiscovery) {
    this.supportsServiceDiscovery = supportsServiceDiscovery;
  }

  /**
   * Whether this carrier service is active. If `true`, then the service will be available to serve rates in checkout.
   */
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  @Override
  public String toString() {
    return "DeliveryCarrierServiceUpdateInput{id='" + id + "', name='" + name + "', callbackUrl='" + callbackUrl + "', supportsServiceDiscovery='" + supportsServiceDiscovery + "', active='" + active + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCarrierServiceUpdateInput that = (DeliveryCarrierServiceUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(callbackUrl, that.callbackUrl) &&
        Objects.equals(supportsServiceDiscovery, that.supportsServiceDiscovery) &&
        Objects.equals(active, that.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, callbackUrl, supportsServiceDiscovery, active);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The global ID of the carrier service to update.
     */
    private String id;

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
    private Boolean supportsServiceDiscovery;

    /**
     * Whether this carrier service is active. If `true`, then the service will be available to serve rates in checkout.
     */
    private Boolean active;

    public DeliveryCarrierServiceUpdateInput build() {
      DeliveryCarrierServiceUpdateInput result = new DeliveryCarrierServiceUpdateInput();
      result.id = this.id;
      result.name = this.name;
      result.callbackUrl = this.callbackUrl;
      result.supportsServiceDiscovery = this.supportsServiceDiscovery;
      result.active = this.active;
      return result;
    }

    /**
     * The global ID of the carrier service to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
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
    public Builder supportsServiceDiscovery(Boolean supportsServiceDiscovery) {
      this.supportsServiceDiscovery = supportsServiceDiscovery;
      return this;
    }

    /**
     * Whether this carrier service is active. If `true`, then the service will be available to serve rates in checkout.
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }
  }
}
