package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductFeed implements com.shopify.types.Node {
  
  private CountryCode country;

  
  private String id;

  
  private LanguageCode language;

  
  private ProductFeedStatus status;

  public ProductFeed() {
  }

  
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public LanguageCode getLanguage() {
    return language;
  }

  public void setLanguage(LanguageCode language) {
    this.language = language;
  }

  
  public ProductFeedStatus getStatus() {
    return status;
  }

  public void setStatus(ProductFeedStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "ProductFeed{country='" + country + "', id='" + id + "', language='" + language + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductFeed that = (ProductFeed) o;
    return Objects.equals(country, that.country) &&
        Objects.equals(id, that.id) &&
        Objects.equals(language, that.language) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, id, language, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CountryCode country;

    
    private String id;

    
    private LanguageCode language;

    
    private ProductFeedStatus status;

    public ProductFeed build() {
      ProductFeed result = new ProductFeed();
      result.country = this.country;
      result.id = this.id;
      result.language = this.language;
      result.status = this.status;
      return result;
    }

    
    public Builder country(CountryCode country) {
      this.country = country;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder language(LanguageCode language) {
      this.language = language;
      return this;
    }

    
    public Builder status(ProductFeedStatus status) {
      this.status = status;
      return this;
    }
  }
}
