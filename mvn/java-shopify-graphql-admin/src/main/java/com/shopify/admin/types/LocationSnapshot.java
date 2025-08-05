package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A snapshot of location details including name and address captured at a specific
 * point in time. Refer to the parent model to know the lifecycle.
 */
public class LocationSnapshot {
  /**
   * The address details of the location as they were when the snapshot was recorded.
   */
  private LocationAddress address;

  /**
   * A reference to the live Location object, if it still exists and is accessible.
   * This provides current details of the location, which may differ from the
   * snapshotted name and address.
   */
  private Location location;

  /**
   * The name of the location as it was when the snapshot was recorded.
   */
  private String name;

  /**
   * The date and time when these snapshot details (name and address) were recorded.
   */
  private OffsetDateTime snapshottedAt;

  public LocationSnapshot() {
  }

  /**
   * The address details of the location as they were when the snapshot was recorded.
   */
  public LocationAddress getAddress() {
    return address;
  }

  public void setAddress(LocationAddress address) {
    this.address = address;
  }

  /**
   * A reference to the live Location object, if it still exists and is accessible.
   * This provides current details of the location, which may differ from the
   * snapshotted name and address.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The name of the location as it was when the snapshot was recorded.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The date and time when these snapshot details (name and address) were recorded.
   */
  public OffsetDateTime getSnapshottedAt() {
    return snapshottedAt;
  }

  public void setSnapshottedAt(OffsetDateTime snapshottedAt) {
    this.snapshottedAt = snapshottedAt;
  }

  @Override
  public String toString() {
    return "LocationSnapshot{address='" + address + "', location='" + location + "', name='" + name + "', snapshottedAt='" + snapshottedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationSnapshot that = (LocationSnapshot) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(location, that.location) &&
        Objects.equals(name, that.name) &&
        Objects.equals(snapshottedAt, that.snapshottedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, location, name, snapshottedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The address details of the location as they were when the snapshot was recorded.
     */
    private LocationAddress address;

    /**
     * A reference to the live Location object, if it still exists and is accessible.
     * This provides current details of the location, which may differ from the
     * snapshotted name and address.
     */
    private Location location;

    /**
     * The name of the location as it was when the snapshot was recorded.
     */
    private String name;

    /**
     * The date and time when these snapshot details (name and address) were recorded.
     */
    private OffsetDateTime snapshottedAt;

    public LocationSnapshot build() {
      LocationSnapshot result = new LocationSnapshot();
      result.address = this.address;
      result.location = this.location;
      result.name = this.name;
      result.snapshottedAt = this.snapshottedAt;
      return result;
    }

    /**
     * The address details of the location as they were when the snapshot was recorded.
     */
    public Builder address(LocationAddress address) {
      this.address = address;
      return this;
    }

    /**
     * A reference to the live Location object, if it still exists and is accessible.
     * This provides current details of the location, which may differ from the
     * snapshotted name and address.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The name of the location as it was when the snapshot was recorded.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The date and time when these snapshot details (name and address) were recorded.
     */
    public Builder snapshottedAt(OffsetDateTime snapshottedAt) {
      this.snapshottedAt = snapshottedAt;
      return this;
    }
  }
}
