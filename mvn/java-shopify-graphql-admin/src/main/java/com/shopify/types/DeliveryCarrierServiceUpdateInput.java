package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryCarrierServiceUpdateInput {
  
  private String id;

  
  private String name;

  
  private String callbackUrl;

  
  private Boolean supportsServiceDiscovery;

  
  private Boolean active;

  public DeliveryCarrierServiceUpdateInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  
  public Boolean getSupportsServiceDiscovery() {
    return supportsServiceDiscovery;
  }

  public void setSupportsServiceDiscovery(Boolean supportsServiceDiscovery) {
    this.supportsServiceDiscovery = supportsServiceDiscovery;
  }

  
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
    
    private String id;

    
    private String name;

    
    private String callbackUrl;

    
    private Boolean supportsServiceDiscovery;

    
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

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    
    public Builder supportsServiceDiscovery(Boolean supportsServiceDiscovery) {
      this.supportsServiceDiscovery = supportsServiceDiscovery;
      return this;
    }

    
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }
  }
}
