package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetafieldStorefrontVisibility implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private OffsetDateTime createdAt;

  
  private String id;

  
  private String key;

  
  private String legacyResourceId;

  
  private String namespace;

  
  private MetafieldOwnerType ownerType;

  
  private OffsetDateTime updatedAt;

  public MetafieldStorefrontVisibility() {
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
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

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "MetafieldStorefrontVisibility{createdAt='" + createdAt + "', id='" + id + "', key='" + key + "', legacyResourceId='" + legacyResourceId + "', namespace='" + namespace + "', ownerType='" + ownerType + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldStorefrontVisibility that = (MetafieldStorefrontVisibility) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(key, that.key) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(ownerType, that.ownerType) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, key, legacyResourceId, namespace, ownerType, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime createdAt;

    
    private String id;

    
    private String key;

    
    private String legacyResourceId;

    
    private String namespace;

    
    private MetafieldOwnerType ownerType;

    
    private OffsetDateTime updatedAt;

    public MetafieldStorefrontVisibility build() {
      MetafieldStorefrontVisibility result = new MetafieldStorefrontVisibility();
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.key = this.key;
      result.legacyResourceId = this.legacyResourceId;
      result.namespace = this.namespace;
      result.ownerType = this.ownerType;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
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

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
