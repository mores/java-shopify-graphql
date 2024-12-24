package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetaobjectFieldDefinition {
  
  private String description;

  
  private String key;

  
  private String name;

  
  private boolean required;

  
  private MetafieldDefinitionType type;

  
  private List<MetafieldDefinitionValidation> validations;

  public MetaobjectFieldDefinition() {
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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

  
  public boolean getRequired() {
    return required;
  }

  public void setRequired(boolean required) {
    this.required = required;
  }

  
  public MetafieldDefinitionType getType() {
    return type;
  }

  public void setType(MetafieldDefinitionType type) {
    this.type = type;
  }

  
  public List<MetafieldDefinitionValidation> getValidations() {
    return validations;
  }

  public void setValidations(List<MetafieldDefinitionValidation> validations) {
    this.validations = validations;
  }

  @Override
  public String toString() {
    return "MetaobjectFieldDefinition{description='" + description + "', key='" + key + "', name='" + name + "', required='" + required + "', type='" + type + "', validations='" + validations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldDefinition that = (MetaobjectFieldDefinition) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        required == that.required &&
        Objects.equals(type, that.type) &&
        Objects.equals(validations, that.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, key, name, required, type, validations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String description;

    
    private String key;

    
    private String name;

    
    private boolean required;

    
    private MetafieldDefinitionType type;

    
    private List<MetafieldDefinitionValidation> validations;

    public MetaobjectFieldDefinition build() {
      MetaobjectFieldDefinition result = new MetaobjectFieldDefinition();
      result.description = this.description;
      result.key = this.key;
      result.name = this.name;
      result.required = this.required;
      result.type = this.type;
      result.validations = this.validations;
      return result;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder required(boolean required) {
      this.required = required;
      return this;
    }

    
    public Builder type(MetafieldDefinitionType type) {
      this.type = type;
      return this;
    }

    
    public Builder validations(List<MetafieldDefinitionValidation> validations) {
      this.validations = validations;
      return this;
    }
  }
}
