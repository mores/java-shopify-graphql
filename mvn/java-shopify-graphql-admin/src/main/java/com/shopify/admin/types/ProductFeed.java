package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A product feed.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductFeed implements com.shopify.admin.types.Node {
  /**
   * The country of the product feed.
   */
  private CountryCode country;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The language of the product feed.
   */
  private LanguageCode language;

  /**
   * The status of the product feed.
   */
  private ProductFeedStatus status;

  public ProductFeed() {
  }

  /**
   * The country of the product feed.
   */
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The language of the product feed.
   */
  public LanguageCode getLanguage() {
    return language;
  }

  public void setLanguage(LanguageCode language) {
    this.language = language;
  }

  /**
   * The status of the product feed.
   */
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
    /**
     * The country of the product feed.
     */
    private CountryCode country;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The language of the product feed.
     */
    private LanguageCode language;

    /**
     * The status of the product feed.
     */
    private ProductFeedStatus status;

    public ProductFeed build() {
      ProductFeed result = new ProductFeed();
      result.country = this.country;
      result.id = this.id;
      result.language = this.language;
      result.status = this.status;
      return result;
    }

    /**
     * The country of the product feed.
     */
    public Builder country(CountryCode country) {
      this.country = country;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The language of the product feed.
     */
    public Builder language(LanguageCode language) {
      this.language = language;
      return this;
    }

    /**
     * The status of the product feed.
     */
    public Builder status(ProductFeedStatus status) {
      this.status = status;
      return this;
    }
  }
}
