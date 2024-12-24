package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReverseDeliveryTrackingV2 {
  
  private String carrierName;

  
  private String number;

  
  private String url;

  public ReverseDeliveryTrackingV2() {
  }

  
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryTrackingV2{carrierName='" + carrierName + "', number='" + number + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryTrackingV2 that = (ReverseDeliveryTrackingV2) o;
    return Objects.equals(carrierName, that.carrierName) &&
        Objects.equals(number, that.number) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierName, number, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String carrierName;

    
    private String number;

    
    private String url;

    public ReverseDeliveryTrackingV2 build() {
      ReverseDeliveryTrackingV2 result = new ReverseDeliveryTrackingV2();
      result.carrierName = this.carrierName;
      result.number = this.number;
      result.url = this.url;
      return result;
    }

    
    public Builder carrierName(String carrierName) {
      this.carrierName = carrierName;
      return this;
    }

    
    public Builder number(String number) {
      this.number = number;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
