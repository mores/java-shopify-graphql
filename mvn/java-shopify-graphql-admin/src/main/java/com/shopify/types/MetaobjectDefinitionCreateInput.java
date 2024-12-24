package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetaobjectDefinitionCreateInput {
  
  private String name;

  
  private String description;

  
  private String type;

  
  private List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions;

  
  private MetaobjectAccessInput access;

  
  private String displayNameKey;

  
  private MetaobjectCapabilityCreateInput capabilities;

  public MetaobjectDefinitionCreateInput() {
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

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  
  public List<MetaobjectFieldDefinitionCreateInput> getFieldDefinitions() {
    return fieldDefinitions;
  }

  public void setFieldDefinitions(List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
  }

  
  public MetaobjectAccessInput getAccess() {
    return access;
  }

  public void setAccess(MetaobjectAccessInput access) {
    this.access = access;
  }

  
  public String getDisplayNameKey() {
    return displayNameKey;
  }

  public void setDisplayNameKey(String displayNameKey) {
    this.displayNameKey = displayNameKey;
  }

  
  public MetaobjectCapabilityCreateInput getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectCapabilityCreateInput capabilities) {
    this.capabilities = capabilities;
  }

  @Override
  public String toString() {
    return "MetaobjectDefinitionCreateInput{name='" + name + "', description='" + description + "', type='" + type + "', fieldDefinitions='" + fieldDefinitions + "', access='" + access + "', displayNameKey='" + displayNameKey + "', capabilities='" + capabilities + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectDefinitionCreateInput that = (MetaobjectDefinitionCreateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(type, that.type) &&
        Objects.equals(fieldDefinitions, that.fieldDefinitions) &&
        Objects.equals(access, that.access) &&
        Objects.equals(displayNameKey, that.displayNameKey) &&
        Objects.equals(capabilities, that.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, fieldDefinitions, access, displayNameKey, capabilities);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String description;

    
    private String type;

    
    private List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions;

    
    private MetaobjectAccessInput access;

    
    private String displayNameKey;

    
    private MetaobjectCapabilityCreateInput capabilities;

    public MetaobjectDefinitionCreateInput build() {
      MetaobjectDefinitionCreateInput result = new MetaobjectDefinitionCreateInput();
      result.name = this.name;
      result.description = this.description;
      result.type = this.type;
      result.fieldDefinitions = this.fieldDefinitions;
      result.access = this.access;
      result.displayNameKey = this.displayNameKey;
      result.capabilities = this.capabilities;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    
    public Builder fieldDefinitions(List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions) {
      this.fieldDefinitions = fieldDefinitions;
      return this;
    }

    
    public Builder access(MetaobjectAccessInput access) {
      this.access = access;
      return this;
    }

    
    public Builder displayNameKey(String displayNameKey) {
      this.displayNameKey = displayNameKey;
      return this;
    }

    
    public Builder capabilities(MetaobjectCapabilityCreateInput capabilities) {
      this.capabilities = capabilities;
      return this;
    }
  }
}
