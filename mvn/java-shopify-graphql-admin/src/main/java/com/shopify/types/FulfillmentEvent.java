package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentEvent implements com.shopify.types.Node {
  
  private String address1;

  
  private String city;

  
  private String country;

  
  private OffsetDateTime createdAt;

  
  private OffsetDateTime estimatedDeliveryAt;

  
  private OffsetDateTime happenedAt;

  
  private String id;

  
  private Double latitude;

  
  private Double longitude;

  
  private String message;

  
  private String province;

  
  private FulfillmentEventStatus status;

  
  private String zip;

  public FulfillmentEvent() {
  }

  
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public OffsetDateTime getEstimatedDeliveryAt() {
    return estimatedDeliveryAt;
  }

  public void setEstimatedDeliveryAt(OffsetDateTime estimatedDeliveryAt) {
    this.estimatedDeliveryAt = estimatedDeliveryAt;
  }

  
  public OffsetDateTime getHappenedAt() {
    return happenedAt;
  }

  public void setHappenedAt(OffsetDateTime happenedAt) {
    this.happenedAt = happenedAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  
  public FulfillmentEventStatus getStatus() {
    return status;
  }

  public void setStatus(FulfillmentEventStatus status) {
    this.status = status;
  }

  
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
    
    private String address1;

    
    private String city;

    
    private String country;

    
    private OffsetDateTime createdAt;

    
    private OffsetDateTime estimatedDeliveryAt;

    
    private OffsetDateTime happenedAt;

    
    private String id;

    
    private Double latitude;

    
    private Double longitude;

    
    private String message;

    
    private String province;

    
    private FulfillmentEventStatus status;

    
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

    
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder estimatedDeliveryAt(OffsetDateTime estimatedDeliveryAt) {
      this.estimatedDeliveryAt = estimatedDeliveryAt;
      return this;
    }

    
    public Builder happenedAt(OffsetDateTime happenedAt) {
      this.happenedAt = happenedAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder latitude(Double latitude) {
      this.latitude = latitude;
      return this;
    }

    
    public Builder longitude(Double longitude) {
      this.longitude = longitude;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    
    public Builder status(FulfillmentEventStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}
