package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReverseDeliveryTrackingInput {
  
  private String number;

  
  private String url;

  public ReverseDeliveryTrackingInput() {
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
    return "ReverseDeliveryTrackingInput{number='" + number + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryTrackingInput that = (ReverseDeliveryTrackingInput) o;
    return Objects.equals(number, that.number) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String number;

    
    private String url;

    public ReverseDeliveryTrackingInput build() {
      ReverseDeliveryTrackingInput result = new ReverseDeliveryTrackingInput();
      result.number = this.number;
      result.url = this.url;
      return result;
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
