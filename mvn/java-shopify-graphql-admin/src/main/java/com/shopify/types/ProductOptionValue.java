package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductOptionValue implements com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  
  private boolean hasVariants;

  
  private String id;

  
  private String linkedMetafieldValue;

  
  private String name;

  
  private ProductOptionValueSwatch swatch;

  
  private List<Translation> translations;

  public ProductOptionValue() {
  }

  
  public boolean getHasVariants() {
    return hasVariants;
  }

  public void setHasVariants(boolean hasVariants) {
    this.hasVariants = hasVariants;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLinkedMetafieldValue() {
    return linkedMetafieldValue;
  }

  public void setLinkedMetafieldValue(String linkedMetafieldValue) {
    this.linkedMetafieldValue = linkedMetafieldValue;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public ProductOptionValueSwatch getSwatch() {
    return swatch;
  }

  public void setSwatch(ProductOptionValueSwatch swatch) {
    this.swatch = swatch;
  }

  
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "ProductOptionValue{hasVariants='" + hasVariants + "', id='" + id + "', linkedMetafieldValue='" + linkedMetafieldValue + "', name='" + name + "', swatch='" + swatch + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOptionValue that = (ProductOptionValue) o;
    return hasVariants == that.hasVariants &&
        Objects.equals(id, that.id) &&
        Objects.equals(linkedMetafieldValue, that.linkedMetafieldValue) &&
        Objects.equals(name, that.name) &&
        Objects.equals(swatch, that.swatch) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasVariants, id, linkedMetafieldValue, name, swatch, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean hasVariants;

    
    private String id;

    
    private String linkedMetafieldValue;

    
    private String name;

    
    private ProductOptionValueSwatch swatch;

    
    private List<Translation> translations;

    public ProductOptionValue build() {
      ProductOptionValue result = new ProductOptionValue();
      result.hasVariants = this.hasVariants;
      result.id = this.id;
      result.linkedMetafieldValue = this.linkedMetafieldValue;
      result.name = this.name;
      result.swatch = this.swatch;
      result.translations = this.translations;
      return result;
    }

    
    public Builder hasVariants(boolean hasVariants) {
      this.hasVariants = hasVariants;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder linkedMetafieldValue(String linkedMetafieldValue) {
      this.linkedMetafieldValue = linkedMetafieldValue;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder swatch(ProductOptionValueSwatch swatch) {
      this.swatch = swatch;
      return this;
    }

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
