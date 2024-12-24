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
public class PrivateMetafield implements com.shopify.types.Node {
  
  private OffsetDateTime createdAt;

  
  private String id;

  
  private String key;

  
  private String namespace;

  
  private OffsetDateTime updatedAt;

  
  private String value;

  
  private PrivateMetafieldValueType valueType;

  public PrivateMetafield() {
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

  
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
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

  
  public PrivateMetafieldValueType getValueType() {
    return valueType;
  }

  public void setValueType(PrivateMetafieldValueType valueType) {
    this.valueType = valueType;
  }

  @Override
  public String toString() {
    return "PrivateMetafield{createdAt='" + createdAt + "', id='" + id + "', key='" + key + "', namespace='" + namespace + "', updatedAt='" + updatedAt + "', value='" + value + "', valueType='" + valueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafield that = (PrivateMetafield) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(key, that.key) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(value, that.value) &&
        Objects.equals(valueType, that.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, key, namespace, updatedAt, value, valueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime createdAt;

    
    private String id;

    
    private String key;

    
    private String namespace;

    
    private OffsetDateTime updatedAt;

    
    private String value;

    
    private PrivateMetafieldValueType valueType;

    public PrivateMetafield build() {
      PrivateMetafield result = new PrivateMetafield();
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.key = this.key;
      result.namespace = this.namespace;
      result.updatedAt = this.updatedAt;
      result.value = this.value;
      result.valueType = this.valueType;
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

    
    public Builder namespace(String namespace) {
      this.namespace = namespace;
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

    
    public Builder valueType(PrivateMetafieldValueType valueType) {
      this.valueType = valueType;
      return this;
    }
  }
}
