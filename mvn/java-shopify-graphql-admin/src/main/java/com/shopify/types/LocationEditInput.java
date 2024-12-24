package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class LocationEditInput {
  
  private String name;

  
  private LocationEditAddressInput address;

  
  private Boolean fulfillsOnlineOrders;

  
  private List<MetafieldInput> metafields;

  public LocationEditInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public LocationEditAddressInput getAddress() {
    return address;
  }

  public void setAddress(LocationEditAddressInput address) {
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
    return "LocationEditInput{name='" + name + "', address='" + address + "', fulfillsOnlineOrders='" + fulfillsOnlineOrders + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationEditInput that = (LocationEditInput) o;
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

    
    private LocationEditAddressInput address;

    
    private Boolean fulfillsOnlineOrders;

    
    private List<MetafieldInput> metafields;

    public LocationEditInput build() {
      LocationEditInput result = new LocationEditInput();
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

    
    public Builder address(LocationEditAddressInput address) {
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
