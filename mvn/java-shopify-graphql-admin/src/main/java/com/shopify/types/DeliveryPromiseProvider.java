package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryPromiseProvider implements com.shopify.types.Node {
  
  private boolean active;

  
  private Integer fulfillmentDelay;

  
  private String id;

  
  private Location location;

  
  private String timeZone;

  public DeliveryPromiseProvider() {
  }

  
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  
  public Integer getFulfillmentDelay() {
    return fulfillmentDelay;
  }

  public void setFulfillmentDelay(Integer fulfillmentDelay) {
    this.fulfillmentDelay = fulfillmentDelay;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
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
    
    private boolean active;

    
    private Integer fulfillmentDelay;

    
    private String id;

    
    private Location location;

    
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

    
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }

    
    public Builder fulfillmentDelay(Integer fulfillmentDelay) {
      this.fulfillmentDelay = fulfillmentDelay;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder timeZone(String timeZone) {
      this.timeZone = timeZone;
      return this;
    }
  }
}
