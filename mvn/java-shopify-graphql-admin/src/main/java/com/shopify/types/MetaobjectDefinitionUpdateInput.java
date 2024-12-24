package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetaobjectDefinitionUpdateInput {
  
  private String name;

  
  private String description;

  
  private List<MetaobjectFieldDefinitionOperationInput> fieldDefinitions;

  
  private MetaobjectAccessInput access;

  
  private String displayNameKey;

  
  private Boolean resetFieldOrder = false;

  
  private MetaobjectCapabilityUpdateInput capabilities;

  public MetaobjectDefinitionUpdateInput() {
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

  
  public List<MetaobjectFieldDefinitionOperationInput> getFieldDefinitions() {
    return fieldDefinitions;
  }

  public void setFieldDefinitions(List<MetaobjectFieldDefinitionOperationInput> fieldDefinitions) {
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

  
  public Boolean getResetFieldOrder() {
    return resetFieldOrder;
  }

  public void setResetFieldOrder(Boolean resetFieldOrder) {
    this.resetFieldOrder = resetFieldOrder;
  }

  
  public MetaobjectCapabilityUpdateInput getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectCapabilityUpdateInput capabilities) {
    this.capabilities = capabilities;
  }

  @Override
  public String toString() {
    return "MetaobjectDefinitionUpdateInput{name='" + name + "', description='" + description + "', fieldDefinitions='" + fieldDefinitions + "', access='" + access + "', displayNameKey='" + displayNameKey + "', resetFieldOrder='" + resetFieldOrder + "', capabilities='" + capabilities + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectDefinitionUpdateInput that = (MetaobjectDefinitionUpdateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(fieldDefinitions, that.fieldDefinitions) &&
        Objects.equals(access, that.access) &&
        Objects.equals(displayNameKey, that.displayNameKey) &&
        Objects.equals(resetFieldOrder, that.resetFieldOrder) &&
        Objects.equals(capabilities, that.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, fieldDefinitions, access, displayNameKey, resetFieldOrder, capabilities);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String description;

    
    private List<MetaobjectFieldDefinitionOperationInput> fieldDefinitions;

    
    private MetaobjectAccessInput access;

    
    private String displayNameKey;

    
    private Boolean resetFieldOrder = false;

    
    private MetaobjectCapabilityUpdateInput capabilities;

    public MetaobjectDefinitionUpdateInput build() {
      MetaobjectDefinitionUpdateInput result = new MetaobjectDefinitionUpdateInput();
      result.name = this.name;
      result.description = this.description;
      result.fieldDefinitions = this.fieldDefinitions;
      result.access = this.access;
      result.displayNameKey = this.displayNameKey;
      result.resetFieldOrder = this.resetFieldOrder;
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

    
    public Builder fieldDefinitions(
        List<MetaobjectFieldDefinitionOperationInput> fieldDefinitions) {
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

    
    public Builder resetFieldOrder(Boolean resetFieldOrder) {
      this.resetFieldOrder = resetFieldOrder;
      return this;
    }

    
    public Builder capabilities(MetaobjectCapabilityUpdateInput capabilities) {
      this.capabilities = capabilities;
      return this;
    }
  }
}
