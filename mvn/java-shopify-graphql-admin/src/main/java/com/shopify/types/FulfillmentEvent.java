package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The fulfillment event that describes the fulfilllment status at a particular time.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentEvent implements com.shopify.types.Node {
  /**
   * The street address where this fulfillment event occurred.
   */
  private String address1;

  /**
   * The city where this fulfillment event occurred.
   */
  private String city;

  /**
   * The country where this fulfillment event occurred.
   */
  private String country;

  /**
   * The date and time when the fulfillment event was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The estimated delivery date and time of the fulfillment.
   */
  private OffsetDateTime estimatedDeliveryAt;

  /**
   * The time at which this fulfillment event happened.
   */
  private OffsetDateTime happenedAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The latitude where this fulfillment event occurred.
   */
  private Double latitude;

  /**
   * The longitude where this fulfillment event occurred.
   */
  private Double longitude;

  /**
   * A message associated with this fulfillment event.
   */
  private String message;

  /**
   * The province where this fulfillment event occurred.
   */
  private String province;

  /**
   * The status of this fulfillment event.
   */
  private FulfillmentEventStatus status;

  /**
   * The zip code of the location where this fulfillment event occurred.
   */
  private String zip;

  public FulfillmentEvent() {
  }

  /**
   * The street address where this fulfillment event occurred.
   */
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * The city where this fulfillment event occurred.
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The country where this fulfillment event occurred.
   */
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The date and time when the fulfillment event was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The estimated delivery date and time of the fulfillment.
   */
  public OffsetDateTime getEstimatedDeliveryAt() {
    return estimatedDeliveryAt;
  }

  public void setEstimatedDeliveryAt(OffsetDateTime estimatedDeliveryAt) {
    this.estimatedDeliveryAt = estimatedDeliveryAt;
  }

  /**
   * The time at which this fulfillment event happened.
   */
  public OffsetDateTime getHappenedAt() {
    return happenedAt;
  }

  public void setHappenedAt(OffsetDateTime happenedAt) {
    this.happenedAt = happenedAt;
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
   * The latitude where this fulfillment event occurred.
   */
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   * The longitude where this fulfillment event occurred.
   */
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   * A message associated with this fulfillment event.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The province where this fulfillment event occurred.
   */
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * The status of this fulfillment event.
   */
  public FulfillmentEventStatus getStatus() {
    return status;
  }

  public void setStatus(FulfillmentEventStatus status) {
    this.status = status;
  }

  /**
   * The zip code of the location where this fulfillment event occurred.
   */
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "FulfillmentEvent{address1='" + address1 + "', city='" + city + "', country='" + country + "', createdAt='" + createdAt + "', estimatedDeliveryAt='" + estimatedDeliveryAt + "', happenedAt='" + happenedAt + "', id='" + id + "', latitude='" + latitude + "', longitude='" + longitude + "', message='" + message + "', province='" + province + "', status='" + status + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentEvent that = (FulfillmentEvent) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(city, that.city) &&
        Objects.equals(country, that.country) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(estimatedDeliveryAt, that.estimatedDeliveryAt) &&
        Objects.equals(happenedAt, that.happenedAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(latitude, that.latitude) &&
        Objects.equals(longitude, that.longitude) &&
        Objects.equals(message, that.message) &&
        Objects.equals(province, that.province) &&
        Objects.equals(status, that.status) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, city, country, createdAt, estimatedDeliveryAt, happenedAt, id, latitude, longitude, message, province, status, zip);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The street address where this fulfillment event occurred.
     */
    private String address1;

    /**
     * The city where this fulfillment event occurred.
     */
    private String city;

    /**
     * The country where this fulfillment event occurred.
     */
    private String country;

    /**
     * The date and time when the fulfillment event was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The estimated delivery date and time of the fulfillment.
     */
    private OffsetDateTime estimatedDeliveryAt;

    /**
     * The time at which this fulfillment event happened.
     */
    private OffsetDateTime happenedAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The latitude where this fulfillment event occurred.
     */
    private Double latitude;

    /**
     * The longitude where this fulfillment event occurred.
     */
    private Double longitude;

    /**
     * A message associated with this fulfillment event.
     */
    private String message;

    /**
     * The province where this fulfillment event occurred.
     */
    private String province;

    /**
     * The status of this fulfillment event.
     */
    private FulfillmentEventStatus status;

    /**
     * The zip code of the location where this fulfillment event occurred.
     */
    private String zip;

    public FulfillmentEvent build() {
      FulfillmentEvent result = new FulfillmentEvent();
      result.address1 = this.address1;
      result.city = this.city;
      result.country = this.country;
      result.createdAt = this.createdAt;
      result.estimatedDeliveryAt = this.estimatedDeliveryAt;
      result.happenedAt = this.happenedAt;
      result.id = this.id;
      result.latitude = this.latitude;
      result.longitude = this.longitude;
      result.message = this.message;
      result.province = this.province;
      result.status = this.status;
      result.zip = this.zip;
      return result;
    }

    /**
     * The street address where this fulfillment event occurred.
     */
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    /**
     * The city where this fulfillment event occurred.
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * The country where this fulfillment event occurred.
     */
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    /**
     * The date and time when the fulfillment event was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The estimated delivery date and time of the fulfillment.
     */
    public Builder estimatedDeliveryAt(OffsetDateTime estimatedDeliveryAt) {
      this.estimatedDeliveryAt = estimatedDeliveryAt;
      return this;
    }

    /**
     * The time at which this fulfillment event happened.
     */
    public Builder happenedAt(OffsetDateTime happenedAt) {
      this.happenedAt = happenedAt;
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
     * The latitude where this fulfillment event occurred.
     */
    public Builder latitude(Double latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * The longitude where this fulfillment event occurred.
     */
    public Builder longitude(Double longitude) {
      this.longitude = longitude;
      return this;
    }

    /**
     * A message associated with this fulfillment event.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * The province where this fulfillment event occurred.
     */
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    /**
     * The status of this fulfillment event.
     */
    public Builder status(FulfillmentEventStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The zip code of the location where this fulfillment event occurred.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}
