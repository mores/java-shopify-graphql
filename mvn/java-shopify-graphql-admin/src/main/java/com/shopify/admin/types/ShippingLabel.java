package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The optional shipping label for this fulfillment.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShippingLabel implements com.shopify.admin.types.Node {
  /**
   * Indicates whether the label is cancellable or not.
   */
  private boolean cancellable;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The location of the shipping origin. This will be null when the shipping origin is unknown.
   */
  private Location location;

  /**
   * Indicates whether the label was printed or not.
   */
  private boolean printed;

  /**
   * The documents for a shipping label.
   */
  private List<ShippingObjectsShippingDocument> shippingDocuments;

  /**
   * Tracking information for the shipping label.
   */
  private FulfillmentTrackingInfo trackingInfo;

  public ShippingLabel() {
  }

  /**
   * Indicates whether the label is cancellable or not.
   */
  public boolean getCancellable() {
    return cancellable;
  }

  public void setCancellable(boolean cancellable) {
    this.cancellable = cancellable;
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
   * The location of the shipping origin. This will be null when the shipping origin is unknown.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Indicates whether the label was printed or not.
   */
  public boolean getPrinted() {
    return printed;
  }

  public void setPrinted(boolean printed) {
    this.printed = printed;
  }

  /**
   * The documents for a shipping label.
   */
  public List<ShippingObjectsShippingDocument> getShippingDocuments() {
    return shippingDocuments;
  }

  public void setShippingDocuments(List<ShippingObjectsShippingDocument> shippingDocuments) {
    this.shippingDocuments = shippingDocuments;
  }

  /**
   * Tracking information for the shipping label.
   */
  public FulfillmentTrackingInfo getTrackingInfo() {
    return trackingInfo;
  }

  public void setTrackingInfo(FulfillmentTrackingInfo trackingInfo) {
    this.trackingInfo = trackingInfo;
  }

  @Override
  public String toString() {
    return "ShippingLabel{cancellable='" + cancellable + "', id='" + id + "', location='" + location + "', printed='" + printed + "', shippingDocuments='" + shippingDocuments + "', trackingInfo='" + trackingInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingLabel that = (ShippingLabel) o;
    return cancellable == that.cancellable &&
        Objects.equals(id, that.id) &&
        Objects.equals(location, that.location) &&
        printed == that.printed &&
        Objects.equals(shippingDocuments, that.shippingDocuments) &&
        Objects.equals(trackingInfo, that.trackingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellable, id, location, printed, shippingDocuments, trackingInfo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates whether the label is cancellable or not.
     */
    private boolean cancellable;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The location of the shipping origin. This will be null when the shipping origin is unknown.
     */
    private Location location;

    /**
     * Indicates whether the label was printed or not.
     */
    private boolean printed;

    /**
     * The documents for a shipping label.
     */
    private List<ShippingObjectsShippingDocument> shippingDocuments;

    /**
     * Tracking information for the shipping label.
     */
    private FulfillmentTrackingInfo trackingInfo;

    public ShippingLabel build() {
      ShippingLabel result = new ShippingLabel();
      result.cancellable = this.cancellable;
      result.id = this.id;
      result.location = this.location;
      result.printed = this.printed;
      result.shippingDocuments = this.shippingDocuments;
      result.trackingInfo = this.trackingInfo;
      return result;
    }

    /**
     * Indicates whether the label is cancellable or not.
     */
    public Builder cancellable(boolean cancellable) {
      this.cancellable = cancellable;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The location of the shipping origin. This will be null when the shipping origin is unknown.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * Indicates whether the label was printed or not.
     */
    public Builder printed(boolean printed) {
      this.printed = printed;
      return this;
    }

    /**
     * The documents for a shipping label.
     */
    public Builder shippingDocuments(List<ShippingObjectsShippingDocument> shippingDocuments) {
      this.shippingDocuments = shippingDocuments;
      return this;
    }

    /**
     * Tracking information for the shipping label.
     */
    public Builder trackingInfo(FulfillmentTrackingInfo trackingInfo) {
      this.trackingInfo = trackingInfo;
      return this;
    }
  }
}
