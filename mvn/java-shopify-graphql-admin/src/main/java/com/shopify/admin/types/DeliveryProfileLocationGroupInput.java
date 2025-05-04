package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a location group associated to a delivery profile.
 */
public class DeliveryProfileLocationGroupInput {
  /**
   * The globally-unique ID of the delivery profile location group.
   */
  private String id;

  /**
   * The list of location IDs to be moved to this location group.
   */
  private List<String> locations;

  /**
   * The list of location IDs to be added to this location group.
   *   
   * **Note:** due to API input array limits, a maximum of 250 items can be sent per each request.
   */
  private List<String> locationsToAdd;

  /**
   * The list of location IDs to be removed from this location group.
   *   
   * **Note:** due to API input array limits, a maximum of 250 items can be sent per each request.
   */
  private List<String> locationsToRemove;

  /**
   * The list of location group zones to create.
   *   
   * **Note:** due to the potential complexity of the nested data, it is
   * recommended to send no more than 5 zones per each request.
   */
  private List<DeliveryLocationGroupZoneInput> zonesToCreate;

  /**
   * The list of location group zones to update.
   *   
   * **Note:** due to the potential complexity of the nested data, it is
   * recommended to send no more than 5 zones per each request.
   */
  private List<DeliveryLocationGroupZoneInput> zonesToUpdate;

  public DeliveryProfileLocationGroupInput() {
  }

  /**
   * The globally-unique ID of the delivery profile location group.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The list of location IDs to be moved to this location group.
   */
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  /**
   * The list of location IDs to be added to this location group.
   *   
   * **Note:** due to API input array limits, a maximum of 250 items can be sent per each request.
   */
  public List<String> getLocationsToAdd() {
    return locationsToAdd;
  }

  public void setLocationsToAdd(List<String> locationsToAdd) {
    this.locationsToAdd = locationsToAdd;
  }

  /**
   * The list of location IDs to be removed from this location group.
   *   
   * **Note:** due to API input array limits, a maximum of 250 items can be sent per each request.
   */
  public List<String> getLocationsToRemove() {
    return locationsToRemove;
  }

  public void setLocationsToRemove(List<String> locationsToRemove) {
    this.locationsToRemove = locationsToRemove;
  }

  /**
   * The list of location group zones to create.
   *   
   * **Note:** due to the potential complexity of the nested data, it is
   * recommended to send no more than 5 zones per each request.
   */
  public List<DeliveryLocationGroupZoneInput> getZonesToCreate() {
    return zonesToCreate;
  }

  public void setZonesToCreate(List<DeliveryLocationGroupZoneInput> zonesToCreate) {
    this.zonesToCreate = zonesToCreate;
  }

  /**
   * The list of location group zones to update.
   *   
   * **Note:** due to the potential complexity of the nested data, it is
   * recommended to send no more than 5 zones per each request.
   */
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
    /**
     * The globally-unique ID of the delivery profile location group.
     */
    private String id;

    /**
     * The list of location IDs to be moved to this location group.
     */
    private List<String> locations;

    /**
     * The list of location IDs to be added to this location group.
     *   
     * **Note:** due to API input array limits, a maximum of 250 items can be sent per each request.
     */
    private List<String> locationsToAdd;

    /**
     * The list of location IDs to be removed from this location group.
     *   
     * **Note:** due to API input array limits, a maximum of 250 items can be sent per each request.
     */
    private List<String> locationsToRemove;

    /**
     * The list of location group zones to create.
     *   
     * **Note:** due to the potential complexity of the nested data, it is
     * recommended to send no more than 5 zones per each request.
     */
    private List<DeliveryLocationGroupZoneInput> zonesToCreate;

    /**
     * The list of location group zones to update.
     *   
     * **Note:** due to the potential complexity of the nested data, it is
     * recommended to send no more than 5 zones per each request.
     */
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

    /**
     * The globally-unique ID of the delivery profile location group.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The list of location IDs to be moved to this location group.
     */
    public Builder locations(List<String> locations) {
      this.locations = locations;
      return this;
    }

    /**
     * The list of location IDs to be added to this location group.
     *   
     * **Note:** due to API input array limits, a maximum of 250 items can be sent per each request.
     */
    public Builder locationsToAdd(List<String> locationsToAdd) {
      this.locationsToAdd = locationsToAdd;
      return this;
    }

    /**
     * The list of location IDs to be removed from this location group.
     *   
     * **Note:** due to API input array limits, a maximum of 250 items can be sent per each request.
     */
    public Builder locationsToRemove(List<String> locationsToRemove) {
      this.locationsToRemove = locationsToRemove;
      return this;
    }

    /**
     * The list of location group zones to create.
     *   
     * **Note:** due to the potential complexity of the nested data, it is
     * recommended to send no more than 5 zones per each request.
     */
    public Builder zonesToCreate(List<DeliveryLocationGroupZoneInput> zonesToCreate) {
      this.zonesToCreate = zonesToCreate;
      return this;
    }

    /**
     * The list of location group zones to update.
     *   
     * **Note:** due to the potential complexity of the nested data, it is
     * recommended to send no more than 5 zones per each request.
     */
    public Builder zonesToUpdate(List<DeliveryLocationGroupZoneInput> zonesToUpdate) {
      this.zonesToUpdate = zonesToUpdate;
      return this;
    }
  }
}
