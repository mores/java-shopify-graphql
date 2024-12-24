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
public class ProductOption implements com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  
  private String id;

  
  private LinkedMetafield linkedMetafield;

  
  private String name;

  
  private List<ProductOptionValue> optionValues;

  
  private int position;

  
  private List<Translation> translations;

  
  private List<String> values;

  public ProductOption() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public LinkedMetafield getLinkedMetafield() {
    return linkedMetafield;
  }

  public void setLinkedMetafield(LinkedMetafield linkedMetafield) {
    this.linkedMetafield = linkedMetafield;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public List<ProductOptionValue> getOptionValues() {
    return optionValues;
  }

  public void setOptionValues(List<ProductOptionValue> optionValues) {
    this.optionValues = optionValues;
  }

  
  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "ProductOption{id='" + id + "', linkedMetafield='" + linkedMetafield + "', name='" + name + "', optionValues='" + optionValues + "', position='" + position + "', translations='" + translations + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOption that = (ProductOption) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(linkedMetafield, that.linkedMetafield) &&
        Objects.equals(name, that.name) &&
        Objects.equals(optionValues, that.optionValues) &&
        position == that.position &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedMetafield, name, optionValues, position, translations, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private LinkedMetafield linkedMetafield;

    
    private String name;

    
    private List<ProductOptionValue> optionValues;

    
    private int position;

    
    private List<Translation> translations;

    
    private List<String> values;

    public ProductOption build() {
      ProductOption result = new ProductOption();
      result.id = this.id;
      result.linkedMetafield = this.linkedMetafield;
      result.name = this.name;
      result.optionValues = this.optionValues;
      result.position = this.position;
      result.translations = this.translations;
      result.values = this.values;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder linkedMetafield(LinkedMetafield linkedMetafield) {
      this.linkedMetafield = linkedMetafield;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder optionValues(List<ProductOptionValue> optionValues) {
      this.optionValues = optionValues;
      return this;
    }

    
    public Builder position(int position) {
      this.position = position;
      return this;
    }

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
