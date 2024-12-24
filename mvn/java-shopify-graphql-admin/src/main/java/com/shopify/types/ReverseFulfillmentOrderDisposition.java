package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReverseFulfillmentOrderDisposition implements com.shopify.types.Node {
  
  private String id;

  
  private Location location;

  
  private int quantity;

  
  private ReverseFulfillmentOrderDispositionType type;

  public ReverseFulfillmentOrderDisposition() {
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

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public ReverseFulfillmentOrderDispositionType getType() {
    return type;
  }

  public void setType(ReverseFulfillmentOrderDispositionType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "ReverseFulfillmentOrderDisposition{id='" + id + "', location='" + location + "', quantity='" + quantity + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrderDisposition that = (ReverseFulfillmentOrderDisposition) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(location, that.location) &&
        quantity == that.quantity &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, location, quantity, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private Location location;

    
    private int quantity;

    
    private ReverseFulfillmentOrderDispositionType type;

    public ReverseFulfillmentOrderDisposition build() {
      ReverseFulfillmentOrderDisposition result = new ReverseFulfillmentOrderDisposition();
      result.id = this.id;
      result.location = this.location;
      result.quantity = this.quantity;
      result.type = this.type;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder type(ReverseFulfillmentOrderDispositionType type) {
      this.type = type;
      return this;
    }
  }
}
