package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetaobjectFieldDefinitionUpdateInput {
  
  private String key;

  
  private String name;

  
  private String description;

  
  private Boolean required;

  
  private List<MetafieldDefinitionValidationInput> validations;

  public MetaobjectFieldDefinitionUpdateInput() {
  }

  
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  public List<MetafieldDefinitionValidationInput> getValidations() {
    return validations;
  }

  public void setValidations(List<MetafieldDefinitionValidationInput> validations) {
    this.validations = validations;
  }

  @Override
  public String toString() {
    return "MetaobjectFieldDefinitionUpdateInput{key='" + key + "', name='" + name + "', description='" + description + "', required='" + required + "', validations='" + validations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldDefinitionUpdateInput that = (MetaobjectFieldDefinitionUpdateInput) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(required, that.required) &&
        Objects.equals(validations, that.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, description, required, validations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String key;

    
    private String name;

    
    private String description;

    
    private Boolean required;

    
    private List<MetafieldDefinitionValidationInput> validations;

    public MetaobjectFieldDefinitionUpdateInput build() {
      MetaobjectFieldDefinitionUpdateInput result = new MetaobjectFieldDefinitionUpdateInput();
      result.key = this.key;
      result.name = this.name;
      result.description = this.description;
      result.required = this.required;
      result.validations = this.validations;
      return result;
    }

    
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder required(Boolean required) {
      this.required = required;
      return this;
    }

    
    public Builder validations(List<MetafieldDefinitionValidationInput> validations) {
      this.validations = validations;
      return this;
    }
  }
}
