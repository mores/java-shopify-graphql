package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetafieldDefinitionInput {
  
  private String namespace;

  
  private String key;

  
  private String name;

  
  private String description;

  
  private MetafieldOwnerType ownerType;

  
  private String type;

  
  private List<MetafieldDefinitionValidationInput> validations;

  
  private Boolean pin = false;

  
  private MetafieldAccessInput access;

  
  private MetafieldCapabilityCreateInput capabilities;

  public MetafieldDefinitionInput() {
  }

  
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
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

  
  public MetafieldOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(MetafieldOwnerType ownerType) {
    this.ownerType = ownerType;
  }

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  
  public List<MetafieldDefinitionValidationInput> getValidations() {
    return validations;
  }

  public void setValidations(List<MetafieldDefinitionValidationInput> validations) {
    this.validations = validations;
  }

  
  public Boolean getPin() {
    return pin;
  }

  public void setPin(Boolean pin) {
    this.pin = pin;
  }

  
  public MetafieldAccessInput getAccess() {
    return access;
  }

  public void setAccess(MetafieldAccessInput access) {
    this.access = access;
  }

  
  public MetafieldCapabilityCreateInput getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetafieldCapabilityCreateInput capabilities) {
    this.capabilities = capabilities;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionInput{namespace='" + namespace + "', key='" + key + "', name='" + name + "', description='" + description + "', ownerType='" + ownerType + "', type='" + type + "', validations='" + validations + "', pin='" + pin + "', access='" + access + "', capabilities='" + capabilities + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionInput that = (MetafieldDefinitionInput) o;
    return Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(ownerType, that.ownerType) &&
        Objects.equals(type, that.type) &&
        Objects.equals(validations, that.validations) &&
        Objects.equals(pin, that.pin) &&
        Objects.equals(access, that.access) &&
        Objects.equals(capabilities, that.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, key, name, description, ownerType, type, validations, pin, access, capabilities);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String namespace;

    
    private String key;

    
    private String name;

    
    private String description;

    
    private MetafieldOwnerType ownerType;

    
    private String type;

    
    private List<MetafieldDefinitionValidationInput> validations;

    
    private Boolean pin = false;

    
    private MetafieldAccessInput access;

    
    private MetafieldCapabilityCreateInput capabilities;

    public MetafieldDefinitionInput build() {
      MetafieldDefinitionInput result = new MetafieldDefinitionInput();
      result.namespace = this.namespace;
      result.key = this.key;
      result.name = this.name;
      result.description = this.description;
      result.ownerType = this.ownerType;
      result.type = this.type;
      result.validations = this.validations;
      result.pin = this.pin;
      result.access = this.access;
      result.capabilities = this.capabilities;
      return result;
    }

    
    public Builder namespace(String namespace) {
      this.namespace = namespace;
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

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    
    public Builder validations(List<MetafieldDefinitionValidationInput> validations) {
      this.validations = validations;
      return this;
    }

    
    public Builder pin(Boolean pin) {
      this.pin = pin;
      return this;
    }

    
    public Builder access(MetafieldAccessInput access) {
      this.access = access;
      return this;
    }

    
    public Builder capabilities(MetafieldCapabilityCreateInput capabilities) {
      this.capabilities = capabilities;
      return this;
    }
  }
}
