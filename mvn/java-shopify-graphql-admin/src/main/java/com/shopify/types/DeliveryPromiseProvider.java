package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A delivery promise provider. Currently restricted to select approved delivery promise partners.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryPromiseProvider implements com.shopify.types.Node {
  /**
   * Whether the delivery promise provider is active. Defaults to `true` when creating a provider.
   */
  private boolean active;

  /**
   * The number of seconds to add to the current time as a buffer when looking up
   * delivery promises. Represents how long the shop requires before releasing an
   * order to the fulfillment provider.
   */
  private Integer fulfillmentDelay;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The location associated with this delivery promise provider.
   */
  private Location location;

  /**
   * The time zone to be used for interpreting day of week and cutoff times in
   * delivery schedules when looking up delivery promises.
   */
  private String timeZone;

  public DeliveryPromiseProvider() {
  }

  /**
   * Whether the delivery promise provider is active. Defaults to `true` when creating a provider.
   */
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  /**
   * The number of seconds to add to the current time as a buffer when looking up
   * delivery promises. Represents how long the shop requires before releasing an
   * order to the fulfillment provider.
   */
  public Integer getFulfillmentDelay() {
    return fulfillmentDelay;
  }

  public void setFulfillmentDelay(Integer fulfillmentDelay) {
    this.fulfillmentDelay = fulfillmentDelay;
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
   * The location associated with this delivery promise provider.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The time zone to be used for interpreting day of week and cutoff times in
   * delivery schedules when looking up delivery promises.
   */
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  @Override
  public String toString() {
    return "DeliveryPromiseProvider{active='" + active + "', fulfillmentDelay='" + fulfillmentDelay + "', id='" + id + "', location='" + location + "', timeZone='" + timeZone + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryPromiseProvider that = (DeliveryPromiseProvider) o;
    return active == that.active &&
        Objects.equals(fulfillmentDelay, that.fulfillmentDelay) &&
        Objects.equals(id, that.id) &&
        Objects.equals(location, that.location) &&
        Objects.equals(timeZone, that.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, fulfillmentDelay, id, location, timeZone);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the delivery promise provider is active. Defaults to `true` when creating a provider.
     */
    private boolean active;

    /**
     * The number of seconds to add to the current time as a buffer when looking up
     * delivery promises. Represents how long the shop requires before releasing an
     * order to the fulfillment provider.
     */
    private Integer fulfillmentDelay;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The location associated with this delivery promise provider.
     */
    private Location location;

    /**
     * The time zone to be used for interpreting day of week and cutoff times in
     * delivery schedules when looking up delivery promises.
     */
    private String timeZone;

    public DeliveryPromiseProvider build() {
      DeliveryPromiseProvider result = new DeliveryPromiseProvider();
      result.active = this.active;
      result.fulfillmentDelay = this.fulfillmentDelay;
      result.id = this.id;
      result.location = this.location;
      result.timeZone = this.timeZone;
      return result;
    }

    /**
     * Whether the delivery promise provider is active. Defaults to `true` when creating a provider.
     */
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }

    /**
     * The number of seconds to add to the current time as a buffer when looking up
     * delivery promises. Represents how long the shop requires before releasing an
     * order to the fulfillment provider.
     */
    public Builder fulfillmentDelay(Integer fulfillmentDelay) {
      this.fulfillmentDelay = fulfillmentDelay;
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
     * The location associated with this delivery promise provider.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The time zone to be used for interpreting day of week and cutoff times in
     * delivery schedules when looking up delivery promises.
     */
    public Builder timeZone(String timeZone) {
      this.timeZone = timeZone;
      return this;
    }
  }
}
