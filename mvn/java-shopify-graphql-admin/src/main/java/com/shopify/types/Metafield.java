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
public class Metafield implements com.shopify.types.HasCompareDigest, com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private String compareDigest;

  
  private OffsetDateTime createdAt;

  
  private MetafieldDefinition definition;

  
  private String description;

  
  private String id;

  
  private String jsonValue;

  
  private String key;

  
  private String legacyResourceId;

  
  private String namespace;

  
  private HasMetafields owner;

  
  private MetafieldOwnerType ownerType;

  
  private MetafieldReference reference;

  
  private MetafieldReferenceConnection references;

  
  private String type;

  
  private OffsetDateTime updatedAt;

  
  private String value;

  public Metafield() {
  }

  
  public String getCompareDigest() {
    return compareDigest;
  }

  public void setCompareDigest(String compareDigest) {
    this.compareDigest = compareDigest;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public MetafieldDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(MetafieldDefinition definition) {
    this.definition = definition;
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

  
  public String getJsonValue() {
    return jsonValue;
  }

  public void setJsonValue(String jsonValue) {
    this.jsonValue = jsonValue;
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

  
  public HasMetafields getOwner() {
    return owner;
  }

  public void setOwner(HasMetafields owner) {
    this.owner = owner;
  }

  
  public MetafieldOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(MetafieldOwnerType ownerType) {
    this.ownerType = ownerType;
  }

  
  public MetafieldReference getReference() {
    return reference;
  }

  public void setReference(MetafieldReference reference) {
    this.reference = reference;
  }

  
  public MetafieldReferenceConnection getReferences() {
    return references;
  }

  public void setReferences(MetafieldReferenceConnection references) {
    this.references = references;
  }

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Metafield{compareDigest='" + compareDigest + "', createdAt='" + createdAt + "', definition='" + definition + "', description='" + description + "', id='" + id + "', jsonValue='" + jsonValue + "', key='" + key + "', legacyResourceId='" + legacyResourceId + "', namespace='" + namespace + "', owner='" + owner + "', ownerType='" + ownerType + "', reference='" + reference + "', references='" + references + "', type='" + type + "', updatedAt='" + updatedAt + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Metafield that = (Metafield) o;
    return Objects.equals(compareDigest, that.compareDigest) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(definition, that.definition) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(jsonValue, that.jsonValue) &&
        Objects.equals(key, that.key) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(owner, that.owner) &&
        Objects.equals(ownerType, that.ownerType) &&
        Objects.equals(reference, that.reference) &&
        Objects.equals(references, that.references) &&
        Objects.equals(type, that.type) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareDigest, createdAt, definition, description, id, jsonValue, key, legacyResourceId, namespace, owner, ownerType, reference, references, type, updatedAt, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String compareDigest;

    
    private OffsetDateTime createdAt;

    
    private MetafieldDefinition definition;

    
    private String description;

    
    private String id;

    
    private String jsonValue;

    
    private String key;

    
    private String legacyResourceId;

    
    private String namespace;

    
    private HasMetafields owner;

    
    private MetafieldOwnerType ownerType;

    
    private MetafieldReference reference;

    
    private MetafieldReferenceConnection references;

    
    private String type;

    
    private OffsetDateTime updatedAt;

    
    private String value;

    public Metafield build() {
      Metafield result = new Metafield();
      result.compareDigest = this.compareDigest;
      result.createdAt = this.createdAt;
      result.definition = this.definition;
      result.description = this.description;
      result.id = this.id;
      result.jsonValue = this.jsonValue;
      result.key = this.key;
      result.legacyResourceId = this.legacyResourceId;
      result.namespace = this.namespace;
      result.owner = this.owner;
      result.ownerType = this.ownerType;
      result.reference = this.reference;
      result.references = this.references;
      result.type = this.type;
      result.updatedAt = this.updatedAt;
      result.value = this.value;
      return result;
    }

    
    public Builder compareDigest(String compareDigest) {
      this.compareDigest = compareDigest;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder definition(MetafieldDefinition definition) {
      this.definition = definition;
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

    
    public Builder jsonValue(String jsonValue) {
      this.jsonValue = jsonValue;
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

    
    public Builder owner(HasMetafields owner) {
      this.owner = owner;
      return this;
    }

    
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }

    
    public Builder reference(MetafieldReference reference) {
      this.reference = reference;
      return this;
    }

    
    public Builder references(MetafieldReferenceConnection references) {
      this.references = references;
      return this;
    }

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
