package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetafieldDefinitionType {
  
  private String category;

  
  private String name;

  
  private List<MetafieldDefinitionSupportedValidation> supportedValidations;

  
  private boolean supportsDefinitionMigrations;

  
  private MetafieldValueType valueType;

  public MetafieldDefinitionType() {
  }

  
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public List<MetafieldDefinitionSupportedValidation> getSupportedValidations() {
    return supportedValidations;
  }

  public void setSupportedValidations(
      List<MetafieldDefinitionSupportedValidation> supportedValidations) {
    this.supportedValidations = supportedValidations;
  }

  
  public boolean getSupportsDefinitionMigrations() {
    return supportsDefinitionMigrations;
  }

  public void setSupportsDefinitionMigrations(boolean supportsDefinitionMigrations) {
    this.supportsDefinitionMigrations = supportsDefinitionMigrations;
  }

  
  public MetafieldValueType getValueType() {
    return valueType;
  }

  public void setValueType(MetafieldValueType valueType) {
    this.valueType = valueType;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionType{category='" + category + "', name='" + name + "', supportedValidations='" + supportedValidations + "', supportsDefinitionMigrations='" + supportsDefinitionMigrations + "', valueType='" + valueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionType that = (MetafieldDefinitionType) o;
    return Objects.equals(category, that.category) &&
        Objects.equals(name, that.name) &&
        Objects.equals(supportedValidations, that.supportedValidations) &&
        supportsDefinitionMigrations == that.supportsDefinitionMigrations &&
        Objects.equals(valueType, that.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, name, supportedValidations, supportsDefinitionMigrations, valueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String category;

    
    private String name;

    
    private List<MetafieldDefinitionSupportedValidation> supportedValidations;

    
    private boolean supportsDefinitionMigrations;

    
    private MetafieldValueType valueType;

    public MetafieldDefinitionType build() {
      MetafieldDefinitionType result = new MetafieldDefinitionType();
      result.category = this.category;
      result.name = this.name;
      result.supportedValidations = this.supportedValidations;
      result.supportsDefinitionMigrations = this.supportsDefinitionMigrations;
      result.valueType = this.valueType;
      return result;
    }

    
    public Builder category(String category) {
      this.category = category;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder supportedValidations(
        List<MetafieldDefinitionSupportedValidation> supportedValidations) {
      this.supportedValidations = supportedValidations;
      return this;
    }

    
    public Builder supportsDefinitionMigrations(boolean supportsDefinitionMigrations) {
      this.supportsDefinitionMigrations = supportsDefinitionMigrations;
      return this;
    }

    
    public Builder valueType(MetafieldValueType valueType) {
      this.valueType = valueType;
      return this;
    }
  }
}
