package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsDisputeFulfillment implements com.shopify.types.Node {
  
  private String id;

  
  private String shippingCarrier;

  
  private LocalDate shippingDate;

  
  private String shippingTrackingNumber;

  public ShopifyPaymentsDisputeFulfillment() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getShippingCarrier() {
    return shippingCarrier;
  }

  public void setShippingCarrier(String shippingCarrier) {
    this.shippingCarrier = shippingCarrier;
  }

  
  public LocalDate getShippingDate() {
    return shippingDate;
  }

  public void setShippingDate(LocalDate shippingDate) {
    this.shippingDate = shippingDate;
  }

  
  public String getShippingTrackingNumber() {
    return shippingTrackingNumber;
  }

  public void setShippingTrackingNumber(String shippingTrackingNumber) {
    this.shippingTrackingNumber = shippingTrackingNumber;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsDisputeFulfillment{id='" + id + "', shippingCarrier='" + shippingCarrier + "', shippingDate='" + shippingDate + "', shippingTrackingNumber='" + shippingTrackingNumber + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsDisputeFulfillment that = (ShopifyPaymentsDisputeFulfillment) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(shippingCarrier, that.shippingCarrier) &&
        Objects.equals(shippingDate, that.shippingDate) &&
        Objects.equals(shippingTrackingNumber, that.shippingTrackingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shippingCarrier, shippingDate, shippingTrackingNumber);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String shippingCarrier;

    
    private LocalDate shippingDate;

    
    private String shippingTrackingNumber;

    public ShopifyPaymentsDisputeFulfillment build() {
      ShopifyPaymentsDisputeFulfillment result = new ShopifyPaymentsDisputeFulfillment();
      result.id = this.id;
      result.shippingCarrier = this.shippingCarrier;
      result.shippingDate = this.shippingDate;
      result.shippingTrackingNumber = this.shippingTrackingNumber;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder shippingCarrier(String shippingCarrier) {
      this.shippingCarrier = shippingCarrier;
      return this;
    }

    
    public Builder shippingDate(LocalDate shippingDate) {
      this.shippingDate = shippingDate;
      return this;
    }

    
    public Builder shippingTrackingNumber(String shippingTrackingNumber) {
      this.shippingTrackingNumber = shippingTrackingNumber;
      return this;
    }
  }
}
