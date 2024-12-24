package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldDefinitionSupportedValidation {
  
  private String name;

  
  private String type;

  public MetafieldDefinitionSupportedValidation() {
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

  @Override
  public String toString() {
    return "MetafieldDefinitionSupportedValidation{name='" + name + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionSupportedValidation that = (MetafieldDefinitionSupportedValidation) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String type;

    public MetafieldDefinitionSupportedValidation build() {
      MetafieldDefinitionSupportedValidation result = new MetafieldDefinitionSupportedValidation();
      result.name = this.name;
      result.type = this.type;
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
  }
}
