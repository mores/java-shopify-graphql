package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A location group is a collection of locations. They share zones and delivery methods across delivery
 * profiles.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryLocationGroup implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A list of all locations that are part of this location group.
   */
  private LocationConnection locations;

  /**
   * A count of all locations that are part of this location group.
   */
  private Count locationsCount;

  public DeliveryLocationGroup() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * A list of all locations that are part of this location group.
   */
  public LocationConnection getLocations() {
    return locations;
  }

  public void setLocations(LocationConnection locations) {
    this.locations = locations;
  }

  /**
   * A count of all locations that are part of this location group.
   */
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
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A list of all locations that are part of this location group.
     */
    private LocationConnection locations;

    /**
     * A count of all locations that are part of this location group.
     */
    private Count locationsCount;

    public DeliveryLocationGroup build() {
      DeliveryLocationGroup result = new DeliveryLocationGroup();
      result.id = this.id;
      result.locations = this.locations;
      result.locationsCount = this.locationsCount;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * A list of all locations that are part of this location group.
     */
    public Builder locations(LocationConnection locations) {
      this.locations = locations;
      return this;
    }

    /**
     * A count of all locations that are part of this location group.
     */
    public Builder locationsCount(Count locationsCount) {
      this.locationsCount = locationsCount;
      return this;
    }
  }
}
