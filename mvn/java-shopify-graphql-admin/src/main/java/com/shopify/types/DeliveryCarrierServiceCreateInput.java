package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryCarrierServiceCreateInput {
  
  private String name;

  
  private String callbackUrl;

  
  private boolean supportsServiceDiscovery;

  
  private boolean active;

  public DeliveryCarrierServiceCreateInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  
  public boolean getSupportsServiceDiscovery() {
    return supportsServiceDiscovery;
  }

  public void setSupportsServiceDiscovery(boolean supportsServiceDiscovery) {
    this.supportsServiceDiscovery = supportsServiceDiscovery;
  }

  
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
    
    private String name;

    
    private String callbackUrl;

    
    private boolean supportsServiceDiscovery;

    
    private boolean active;

    public DeliveryCarrierServiceCreateInput build() {
      DeliveryCarrierServiceCreateInput result = new DeliveryCarrierServiceCreateInput();
      result.name = this.name;
      result.callbackUrl = this.callbackUrl;
      result.supportsServiceDiscovery = this.supportsServiceDiscovery;
      result.active = this.active;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    
    public Builder supportsServiceDiscovery(boolean supportsServiceDiscovery) {
      this.supportsServiceDiscovery = supportsServiceDiscovery;
      return this;
    }

    
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }
  }
}
