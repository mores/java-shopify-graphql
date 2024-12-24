package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class LocationAddInput {
  
  private String name;

  
  private LocationAddAddressInput address;

  
  private Boolean fulfillsOnlineOrders = true;

  
  private List<MetafieldInput> metafields;

  public LocationAddInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public LocationAddAddressInput getAddress() {
    return address;
  }

  public void setAddress(LocationAddAddressInput address) {
    this.address = address;
  }

  
  public Boolean getFulfillsOnlineOrders() {
    return fulfillsOnlineOrders;
  }

  public void setFulfillsOnlineOrders(Boolean fulfillsOnlineOrders) {
    this.fulfillsOnlineOrders = fulfillsOnlineOrders;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "LocationAddInput{name='" + name + "', address='" + address + "', fulfillsOnlineOrders='" + fulfillsOnlineOrders + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationAddInput that = (LocationAddInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(address, that.address) &&
        Objects.equals(fulfillsOnlineOrders, that.fulfillsOnlineOrders) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, fulfillsOnlineOrders, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private LocationAddAddressInput address;

    
    private Boolean fulfillsOnlineOrders = true;

    
    private List<MetafieldInput> metafields;

    public LocationAddInput build() {
      LocationAddInput result = new LocationAddInput();
      result.name = this.name;
      result.address = this.address;
      result.fulfillsOnlineOrders = this.fulfillsOnlineOrders;
      result.metafields = this.metafields;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder address(LocationAddAddressInput address) {
      this.address = address;
      return this;
    }

    
    public Builder fulfillsOnlineOrders(Boolean fulfillsOnlineOrders) {
      this.fulfillsOnlineOrders = fulfillsOnlineOrders;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
