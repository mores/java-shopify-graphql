package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldDefinitionValidation {
  
  private String name;

  
  private String type;

  
  private String value;

  public MetafieldDefinitionValidation() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionValidation{name='" + name + "', type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionValidation that = (MetafieldDefinitionValidation) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String type;

    
    private String value;

    public MetafieldDefinitionValidation build() {
      MetafieldDefinitionValidation result = new MetafieldDefinitionValidation();
      result.name = this.name;
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
