package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentTrackingInput {
  
  private String number;

  
  private String url;

  
  private String company;

  
  private List<String> numbers;

  
  private List<String> urls;

  public FulfillmentTrackingInput() {
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

  
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  
  public List<String> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<String> numbers) {
    this.numbers = numbers;
  }

  
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  @Override
  public String toString() {
    return "FulfillmentTrackingInput{number='" + number + "', url='" + url + "', company='" + company + "', numbers='" + numbers + "', urls='" + urls + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentTrackingInput that = (FulfillmentTrackingInput) o;
    return Objects.equals(number, that.number) &&
        Objects.equals(url, that.url) &&
        Objects.equals(company, that.company) &&
        Objects.equals(numbers, that.numbers) &&
        Objects.equals(urls, that.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, url, company, numbers, urls);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String number;

    
    private String url;

    
    private String company;

    
    private List<String> numbers;

    
    private List<String> urls;

    public FulfillmentTrackingInput build() {
      FulfillmentTrackingInput result = new FulfillmentTrackingInput();
      result.number = this.number;
      result.url = this.url;
      result.company = this.company;
      result.numbers = this.numbers;
      result.urls = this.urls;
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

    
    public Builder company(String company) {
      this.company = company;
      return this;
    }

    
    public Builder numbers(List<String> numbers) {
      this.numbers = numbers;
      return this;
    }

    
    public Builder urls(List<String> urls) {
      this.urls = urls;
      return this;
    }
  }
}
