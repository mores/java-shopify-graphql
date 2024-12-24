package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryLocationGroup implements com.shopify.types.Node {
  
  private String id;

  
  private LocationConnection locations;

  
  private Count locationsCount;

  public DeliveryLocationGroup() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public LocationConnection getLocations() {
    return locations;
  }

  public void setLocations(LocationConnection locations) {
    this.locations = locations;
  }

  
  public Count getLocationsCount() {
    return locationsCount;
  }

  public void setLocationsCount(Count locationsCount) {
    this.locationsCount = locationsCount;
  }

  @Override
  public String toString() {
    return "DeliveryLocationGroup{id='" + id + "', locations='" + locations + "', locationsCount='" + locationsCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryLocationGroup that = (DeliveryLocationGroup) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(locations, that.locations) &&
        Objects.equals(locationsCount, that.locationsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locations, locationsCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private LocationConnection locations;

    
    private Count locationsCount;

    public DeliveryLocationGroup build() {
      DeliveryLocationGroup result = new DeliveryLocationGroup();
      result.id = this.id;
      result.locations = this.locations;
      result.locationsCount = this.locationsCount;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder locations(LocationConnection locations) {
      this.locations = locations;
      return this;
    }

    
    public Builder locationsCount(Count locationsCount) {
      this.locationsCount = locationsCount;
      return this;
    }
  }
}
