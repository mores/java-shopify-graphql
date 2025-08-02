package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A location for in-store pickup.
 */
public class PickupInStoreLocation {
  /**
   * The code of the pickup location.
   */
  private String code;

  /**
   * Distance from the buyer to the pickup location.
   */
  private Distance distanceFromBuyer;

  /**
   * A unique identifier for this pickup location.
   */
  private String handle;

  /**
   * Pickup instructions.
   */
  private String instructions;

  /**
   * The location ID of the pickup location.
   */
  private String locationId;

  /**
   * The source of the pickup location.
   */
  private String source;

  /**
   * Title of the pickup location.
   */
  private String title;

  public PickupInStoreLocation() {
  }

  /**
   * The code of the pickup location.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Distance from the buyer to the pickup location.
   */
  public Distance getDistanceFromBuyer() {
    return distanceFromBuyer;
  }

  public void setDistanceFromBuyer(Distance distanceFromBuyer) {
    this.distanceFromBuyer = distanceFromBuyer;
  }

  /**
   * A unique identifier for this pickup location.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Pickup instructions.
   */
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * The location ID of the pickup location.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * The source of the pickup location.
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  /**
   * Title of the pickup location.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "PickupInStoreLocation{code='" + code + "', distanceFromBuyer='" + distanceFromBuyer + "', handle='" + handle + "', instructions='" + instructions + "', locationId='" + locationId + "', source='" + source + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PickupInStoreLocation that = (PickupInStoreLocation) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(distanceFromBuyer, that.distanceFromBuyer) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(instructions, that.instructions) &&
        Objects.equals(locationId, that.locationId) &&
        Objects.equals(source, that.source) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, distanceFromBuyer, handle, instructions, locationId, source, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code of the pickup location.
     */
    private String code;

    /**
     * Distance from the buyer to the pickup location.
     */
    private Distance distanceFromBuyer;

    /**
     * A unique identifier for this pickup location.
     */
    private String handle;

    /**
     * Pickup instructions.
     */
    private String instructions;

    /**
     * The location ID of the pickup location.
     */
    private String locationId;

    /**
     * The source of the pickup location.
     */
    private String source;

    /**
     * Title of the pickup location.
     */
    private String title;

    public PickupInStoreLocation build() {
      PickupInStoreLocation result = new PickupInStoreLocation();
      result.code = this.code;
      result.distanceFromBuyer = this.distanceFromBuyer;
      result.handle = this.handle;
      result.instructions = this.instructions;
      result.locationId = this.locationId;
      result.source = this.source;
      result.title = this.title;
      return result;
    }

    /**
     * The code of the pickup location.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * Distance from the buyer to the pickup location.
     */
    public Builder distanceFromBuyer(Distance distanceFromBuyer) {
      this.distanceFromBuyer = distanceFromBuyer;
      return this;
    }

    /**
     * A unique identifier for this pickup location.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Pickup instructions.
     */
    public Builder instructions(String instructions) {
      this.instructions = instructions;
      return this;
    }

    /**
     * The location ID of the pickup location.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The source of the pickup location.
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Title of the pickup location.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
