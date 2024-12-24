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
public class StandardMetafieldDefinitionTemplate implements com.shopify.types.Node {
  
  private String description;

  
  private String id;

  
  private String key;

  
  private String name;

  
  private String namespace;

  
  private List<MetafieldOwnerType> ownerTypes;

  
  private MetafieldDefinitionType type;

  
  private List<MetafieldDefinitionValidation> validations;

  
  private boolean visibleToStorefrontApi;

  public StandardMetafieldDefinitionTemplate() {
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  
  public List<MetafieldOwnerType> getOwnerTypes() {
    return ownerTypes;
  }

  public void setOwnerTypes(List<MetafieldOwnerType> ownerTypes) {
    this.ownerTypes = ownerTypes;
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

  
  public boolean getVisibleToStorefrontApi() {
    return visibleToStorefrontApi;
  }

  public void setVisibleToStorefrontApi(boolean visibleToStorefrontApi) {
    this.visibleToStorefrontApi = visibleToStorefrontApi;
  }

  @Override
  public String toString() {
    return "StandardMetafieldDefinitionTemplate{description='" + description + "', id='" + id + "', key='" + key + "', name='" + name + "', namespace='" + namespace + "', ownerTypes='" + ownerTypes + "', type='" + type + "', validations='" + validations + "', visibleToStorefrontApi='" + visibleToStorefrontApi + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardMetafieldDefinitionTemplate that = (StandardMetafieldDefinitionTemplate) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(ownerTypes, that.ownerTypes) &&
        Objects.equals(type, that.type) &&
        Objects.equals(validations, that.validations) &&
        visibleToStorefrontApi == that.visibleToStorefrontApi;
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, key, name, namespace, ownerTypes, type, validations, visibleToStorefrontApi);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String description;

    
    private String id;

    
    private String key;

    
    private String name;

    
    private String namespace;

    
    private List<MetafieldOwnerType> ownerTypes;

    
    private MetafieldDefinitionType type;

    
    private List<MetafieldDefinitionValidation> validations;

    
    private boolean visibleToStorefrontApi;

    public StandardMetafieldDefinitionTemplate build() {
      StandardMetafieldDefinitionTemplate result = new StandardMetafieldDefinitionTemplate();
      result.description = this.description;
      result.id = this.id;
      result.key = this.key;
      result.name = this.name;
      result.namespace = this.namespace;
      result.ownerTypes = this.ownerTypes;
      result.type = this.type;
      result.validations = this.validations;
      result.visibleToStorefrontApi = this.visibleToStorefrontApi;
      return result;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
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

    
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    
    public Builder ownerTypes(List<MetafieldOwnerType> ownerTypes) {
      this.ownerTypes = ownerTypes;
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

    
    public Builder visibleToStorefrontApi(boolean visibleToStorefrontApi) {
      this.visibleToStorefrontApi = visibleToStorefrontApi;
      return this;
    }
  }
}
