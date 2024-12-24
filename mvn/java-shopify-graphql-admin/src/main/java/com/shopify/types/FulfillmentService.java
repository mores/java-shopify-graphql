package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FulfillmentService {
  
  private String callbackUrl;

  
  private boolean fulfillmentOrdersOptIn;

  
  private String handle;

  
  private String id;

  
  private boolean inventoryManagement;

  
  private Location location;

  
  private boolean permitsSkuSharing;

  
  private String serviceName;

  
  private boolean trackingSupport;

  
  private FulfillmentServiceType type;

  public FulfillmentService() {
  }

  
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  
  public boolean getFulfillmentOrdersOptIn() {
    return fulfillmentOrdersOptIn;
  }

  public void setFulfillmentOrdersOptIn(boolean fulfillmentOrdersOptIn) {
    this.fulfillmentOrdersOptIn = fulfillmentOrdersOptIn;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getInventoryManagement() {
    return inventoryManagement;
  }

  public void setInventoryManagement(boolean inventoryManagement) {
    this.inventoryManagement = inventoryManagement;
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public boolean getPermitsSkuSharing() {
    return permitsSkuSharing;
  }

  public void setPermitsSkuSharing(boolean permitsSkuSharing) {
    this.permitsSkuSharing = permitsSkuSharing;
  }

  
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  
  public boolean getTrackingSupport() {
    return trackingSupport;
  }

  public void setTrackingSupport(boolean trackingSupport) {
    this.trackingSupport = trackingSupport;
  }

  
  public FulfillmentServiceType getType() {
    return type;
  }

  public void setType(FulfillmentServiceType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "FulfillmentService{callbackUrl='" + callbackUrl + "', fulfillmentOrdersOptIn='" + fulfillmentOrdersOptIn + "', handle='" + handle + "', id='" + id + "', inventoryManagement='" + inventoryManagement + "', location='" + location + "', permitsSkuSharing='" + permitsSkuSharing + "', serviceName='" + serviceName + "', trackingSupport='" + trackingSupport + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentService that = (FulfillmentService) o;
    return Objects.equals(callbackUrl, that.callbackUrl) &&
        fulfillmentOrdersOptIn == that.fulfillmentOrdersOptIn &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        inventoryManagement == that.inventoryManagement &&
        Objects.equals(location, that.location) &&
        permitsSkuSharing == that.permitsSkuSharing &&
        Objects.equals(serviceName, that.serviceName) &&
        trackingSupport == that.trackingSupport &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, fulfillmentOrdersOptIn, handle, id, inventoryManagement, location, permitsSkuSharing, serviceName, trackingSupport, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String callbackUrl;

    
    private boolean fulfillmentOrdersOptIn;

    
    private String handle;

    
    private String id;

    
    private boolean inventoryManagement;

    
    private Location location;

    
    private boolean permitsSkuSharing;

    
    private String serviceName;

    
    private boolean trackingSupport;

    
    private FulfillmentServiceType type;

    public FulfillmentService build() {
      FulfillmentService result = new FulfillmentService();
      result.callbackUrl = this.callbackUrl;
      result.fulfillmentOrdersOptIn = this.fulfillmentOrdersOptIn;
      result.handle = this.handle;
      result.id = this.id;
      result.inventoryManagement = this.inventoryManagement;
      result.location = this.location;
      result.permitsSkuSharing = this.permitsSkuSharing;
      result.serviceName = this.serviceName;
      result.trackingSupport = this.trackingSupport;
      result.type = this.type;
      return result;
    }

    
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    
    public Builder fulfillmentOrdersOptIn(boolean fulfillmentOrdersOptIn) {
      this.fulfillmentOrdersOptIn = fulfillmentOrdersOptIn;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder inventoryManagement(boolean inventoryManagement) {
      this.inventoryManagement = inventoryManagement;
      return this;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder permitsSkuSharing(boolean permitsSkuSharing) {
      this.permitsSkuSharing = permitsSkuSharing;
      return this;
    }

    
    public Builder serviceName(String serviceName) {
      this.serviceName = serviceName;
      return this;
    }

    
    public Builder trackingSupport(boolean trackingSupport) {
      this.trackingSupport = trackingSupport;
      return this;
    }

    
    public Builder type(FulfillmentServiceType type) {
      this.type = type;
      return this;
    }
  }
}
