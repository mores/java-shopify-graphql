package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FulfillmentTrackingInfo {
  
  private String company;

  
  private String number;

  
  private String url;

  public FulfillmentTrackingInfo() {
  }

  
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
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
    return "FulfillmentTrackingInfo{company='" + company + "', number='" + number + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentTrackingInfo that = (FulfillmentTrackingInfo) o;
    return Objects.equals(company, that.company) &&
        Objects.equals(number, that.number) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, number, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String company;

    
    private String number;

    
    private String url;

    public FulfillmentTrackingInfo build() {
      FulfillmentTrackingInfo result = new FulfillmentTrackingInfo();
      result.company = this.company;
      result.number = this.number;
      result.url = this.url;
      return result;
    }

    
    public Builder company(String company) {
      this.company = company;
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
