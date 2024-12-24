package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetafieldDefinition implements com.shopify.types.Node {
  
  private MetafieldAccess access;

  
  private MetafieldCapabilities capabilities;

  
  private MetafieldDefinitionConstraints constraints;

  
  private String description;

  
  private String id;

  
  private String key;

  
  private MetafieldConnection metafields;

  
  private int metafieldsCount;

  
  private String name;

  
  private String namespace;

  
  private MetafieldOwnerType ownerType;

  
  private Integer pinnedPosition;

  
  private StandardMetafieldDefinitionTemplate standardTemplate;

  
  private MetafieldDefinitionType type;

  
  private boolean useAsCollectionCondition;

  
  private MetafieldDefinitionValidationStatus validationStatus;

  
  private List<MetafieldDefinitionValidation> validations;

  
  private boolean visibleToStorefrontApi;

  public MetafieldDefinition() {
  }

  
  public MetafieldAccess getAccess() {
    return access;
  }

  public void setAccess(MetafieldAccess access) {
    this.access = access;
  }

  
  public MetafieldCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetafieldCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  
  public MetafieldDefinitionConstraints getConstraints() {
    return constraints;
  }

  public void setConstraints(MetafieldDefinitionConstraints constraints) {
    this.constraints = constraints;
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

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public int getMetafieldsCount() {
    return metafieldsCount;
  }

  public void setMetafieldsCount(int metafieldsCount) {
    this.metafieldsCount = metafieldsCount;
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

  
  public MetafieldOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(MetafieldOwnerType ownerType) {
    this.ownerType = ownerType;
  }

  
  public Integer getPinnedPosition() {
    return pinnedPosition;
  }

  public void setPinnedPosition(Integer pinnedPosition) {
    this.pinnedPosition = pinnedPosition;
  }

  
  public StandardMetafieldDefinitionTemplate getStandardTemplate() {
    return standardTemplate;
  }

  public void setStandardTemplate(StandardMetafieldDefinitionTemplate standardTemplate) {
    this.standardTemplate = standardTemplate;
  }

  
  public MetafieldDefinitionType getType() {
    return type;
  }

  public void setType(MetafieldDefinitionType type) {
    this.type = type;
  }

  
  public boolean getUseAsCollectionCondition() {
    return useAsCollectionCondition;
  }

  public void setUseAsCollectionCondition(boolean useAsCollectionCondition) {
    this.useAsCollectionCondition = useAsCollectionCondition;
  }

  
  public MetafieldDefinitionValidationStatus getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(MetafieldDefinitionValidationStatus validationStatus) {
    this.validationStatus = validationStatus;
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
    return "MetafieldDefinition{access='" + access + "', capabilities='" + capabilities + "', constraints='" + constraints + "', description='" + description + "', id='" + id + "', key='" + key + "', metafields='" + metafields + "', metafieldsCount='" + metafieldsCount + "', name='" + name + "', namespace='" + namespace + "', ownerType='" + ownerType + "', pinnedPosition='" + pinnedPosition + "', standardTemplate='" + standardTemplate + "', type='" + type + "', useAsCollectionCondition='" + useAsCollectionCondition + "', validationStatus='" + validationStatus + "', validations='" + validations + "', visibleToStorefrontApi='" + visibleToStorefrontApi + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinition that = (MetafieldDefinition) o;
    return Objects.equals(access, that.access) &&
        Objects.equals(capabilities, that.capabilities) &&
        Objects.equals(constraints, that.constraints) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(key, that.key) &&
        Objects.equals(metafields, that.metafields) &&
        metafieldsCount == that.metafieldsCount &&
        Objects.equals(name, that.name) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(ownerType, that.ownerType) &&
        Objects.equals(pinnedPosition, that.pinnedPosition) &&
        Objects.equals(standardTemplate, that.standardTemplate) &&
        Objects.equals(type, that.type) &&
        useAsCollectionCondition == that.useAsCollectionCondition &&
        Objects.equals(validationStatus, that.validationStatus) &&
        Objects.equals(validations, that.validations) &&
        visibleToStorefrontApi == that.visibleToStorefrontApi;
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, capabilities, constraints, description, id, key, metafields, metafieldsCount, name, namespace, ownerType, pinnedPosition, standardTemplate, type, useAsCollectionCondition, validationStatus, validations, visibleToStorefrontApi);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetafieldAccess access;

    
    private MetafieldCapabilities capabilities;

    
    private MetafieldDefinitionConstraints constraints;

    
    private String description;

    
    private String id;

    
    private String key;

    
    private MetafieldConnection metafields;

    
    private int metafieldsCount;

    
    private String name;

    
    private String namespace;

    
    private MetafieldOwnerType ownerType;

    
    private Integer pinnedPosition;

    
    private StandardMetafieldDefinitionTemplate standardTemplate;

    
    private MetafieldDefinitionType type;

    
    private boolean useAsCollectionCondition;

    
    private MetafieldDefinitionValidationStatus validationStatus;

    
    private List<MetafieldDefinitionValidation> validations;

    
    private boolean visibleToStorefrontApi;

    public MetafieldDefinition build() {
      MetafieldDefinition result = new MetafieldDefinition();
      result.access = this.access;
      result.capabilities = this.capabilities;
      result.constraints = this.constraints;
      result.description = this.description;
      result.id = this.id;
      result.key = this.key;
      result.metafields = this.metafields;
      result.metafieldsCount = this.metafieldsCount;
      result.name = this.name;
      result.namespace = this.namespace;
      result.ownerType = this.ownerType;
      result.pinnedPosition = this.pinnedPosition;
      result.standardTemplate = this.standardTemplate;
      result.type = this.type;
      result.useAsCollectionCondition = this.useAsCollectionCondition;
      result.validationStatus = this.validationStatus;
      result.validations = this.validations;
      result.visibleToStorefrontApi = this.visibleToStorefrontApi;
      return result;
    }

    
    public Builder access(MetafieldAccess access) {
      this.access = access;
      return this;
    }

    
    public Builder capabilities(MetafieldCapabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    
    public Builder constraints(MetafieldDefinitionConstraints constraints) {
      this.constraints = constraints;
      return this;
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

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder metafieldsCount(int metafieldsCount) {
      this.metafieldsCount = metafieldsCount;
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

    
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }

    
    public Builder pinnedPosition(Integer pinnedPosition) {
      this.pinnedPosition = pinnedPosition;
      return this;
    }

    
    public Builder standardTemplate(StandardMetafieldDefinitionTemplate standardTemplate) {
      this.standardTemplate = standardTemplate;
      return this;
    }

    
    public Builder type(MetafieldDefinitionType type) {
      this.type = type;
      return this;
    }

    
    public Builder useAsCollectionCondition(boolean useAsCollectionCondition) {
      this.useAsCollectionCondition = useAsCollectionCondition;
      return this;
    }

    
    public Builder validationStatus(MetafieldDefinitionValidationStatus validationStatus) {
      this.validationStatus = validationStatus;
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
