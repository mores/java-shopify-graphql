package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ContextualPublicationContext {
  
  private CountryCode country;

  
  private String companyLocationId;

  public ContextualPublicationContext() {
  }

  
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  
  public String getCompanyLocationId() {
    return companyLocationId;
  }

  public void setCompanyLocationId(String companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  @Override
  public String toString() {
    return "ContextualPublicationContext{country='" + country + "', companyLocationId='" + companyLocationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContextualPublicationContext that = (ContextualPublicationContext) o;
    return Objects.equals(country, that.country) &&
        Objects.equals(companyLocationId, that.companyLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, companyLocationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CountryCode country;

    
    private String companyLocationId;

    public ContextualPublicationContext build() {
      ContextualPublicationContext result = new ContextualPublicationContext();
      result.country = this.country;
      result.companyLocationId = this.companyLocationId;
      return result;
    }

    
    public Builder country(CountryCode country) {
      this.country = country;
      return this;
    }

    
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      return this;
    }
  }
}
