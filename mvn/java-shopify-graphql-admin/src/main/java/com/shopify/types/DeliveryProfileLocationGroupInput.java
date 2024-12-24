package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryProfileLocationGroupInput {
  
  private String id;

  
  private List<String> locations;

  
  private List<String> locationsToAdd;

  
  private List<String> locationsToRemove;

  
  private List<DeliveryLocationGroupZoneInput> zonesToCreate;

  
  private List<DeliveryLocationGroupZoneInput> zonesToUpdate;

  public DeliveryProfileLocationGroupInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  
  public List<String> getLocationsToAdd() {
    return locationsToAdd;
  }

  public void setLocationsToAdd(List<String> locationsToAdd) {
    this.locationsToAdd = locationsToAdd;
  }

  
  public List<String> getLocationsToRemove() {
    return locationsToRemove;
  }

  public void setLocationsToRemove(List<String> locationsToRemove) {
    this.locationsToRemove = locationsToRemove;
  }

  
  public List<DeliveryLocationGroupZoneInput> getZonesToCreate() {
    return zonesToCreate;
  }

  public void setZonesToCreate(List<DeliveryLocationGroupZoneInput> zonesToCreate) {
    this.zonesToCreate = zonesToCreate;
  }

  
  public List<DeliveryLocationGroupZoneInput> getZonesToUpdate() {
    return zonesToUpdate;
  }

  public void setZonesToUpdate(List<DeliveryLocationGroupZoneInput> zonesToUpdate) {
    this.zonesToUpdate = zonesToUpdate;
  }

  @Override
  public String toString() {
    return "DeliveryProfileLocationGroupInput{id='" + id + "', locations='" + locations + "', locationsToAdd='" + locationsToAdd + "', locationsToRemove='" + locationsToRemove + "', zonesToCreate='" + zonesToCreate + "', zonesToUpdate='" + zonesToUpdate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProfileLocationGroupInput that = (DeliveryProfileLocationGroupInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(locations, that.locations) &&
        Objects.equals(locationsToAdd, that.locationsToAdd) &&
        Objects.equals(locationsToRemove, that.locationsToRemove) &&
        Objects.equals(zonesToCreate, that.zonesToCreate) &&
        Objects.equals(zonesToUpdate, that.zonesToUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locations, locationsToAdd, locationsToRemove, zonesToCreate, zonesToUpdate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private List<String> locations;

    
    private List<String> locationsToAdd;

    
    private List<String> locationsToRemove;

    
    private List<DeliveryLocationGroupZoneInput> zonesToCreate;

    
    private List<DeliveryLocationGroupZoneInput> zonesToUpdate;

    public DeliveryProfileLocationGroupInput build() {
      DeliveryProfileLocationGroupInput result = new DeliveryProfileLocationGroupInput();
      result.id = this.id;
      result.locations = this.locations;
      result.locationsToAdd = this.locationsToAdd;
      result.locationsToRemove = this.locationsToRemove;
      result.zonesToCreate = this.zonesToCreate;
      result.zonesToUpdate = this.zonesToUpdate;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder locations(List<String> locations) {
      this.locations = locations;
      return this;
    }

    
    public Builder locationsToAdd(List<String> locationsToAdd) {
      this.locationsToAdd = locationsToAdd;
      return this;
    }

    
    public Builder locationsToRemove(List<String> locationsToRemove) {
      this.locationsToRemove = locationsToRemove;
      return this;
    }

    
    public Builder zonesToCreate(List<DeliveryLocationGroupZoneInput> zonesToCreate) {
      this.zonesToCreate = zonesToCreate;
      return this;
    }

    
    public Builder zonesToUpdate(List<DeliveryLocationGroupZoneInput> zonesToUpdate) {
      this.zonesToUpdate = zonesToUpdate;
      return this;
    }
  }
}
