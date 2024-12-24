package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetaobjectFieldDefinitionCreateInput {
  
  private String key;

  
  private String type;

  
  private String name;

  
  private String description;

  
  private Boolean required = false;

  
  private List<MetafieldDefinitionValidationInput> validations;

  public MetaobjectFieldDefinitionCreateInput() {
  }

  
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
    return "MetaobjectFieldDefinitionCreateInput{key='" + key + "', type='" + type + "', name='" + name + "', description='" + description + "', required='" + required + "', validations='" + validations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldDefinitionCreateInput that = (MetaobjectFieldDefinitionCreateInput) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(type, that.type) &&
        Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(required, that.required) &&
        Objects.equals(validations, that.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, name, description, required, validations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String key;

    
    private String type;

    
    private String name;

    
    private String description;

    
    private Boolean required = false;

    
    private List<MetafieldDefinitionValidationInput> validations;

    public MetaobjectFieldDefinitionCreateInput build() {
      MetaobjectFieldDefinitionCreateInput result = new MetaobjectFieldDefinitionCreateInput();
      result.key = this.key;
      result.type = this.type;
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

    
    public Builder type(String type) {
      this.type = type;
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
