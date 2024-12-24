package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldsSetInput {
  
  private String ownerId;

  
  private String namespace;

  
  private String key;

  
  private String value;

  
  private String compareDigest;

  
  private String type;

  public MetafieldsSetInput() {
  }

  
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
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

  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  
  public String getCompareDigest() {
    return compareDigest;
  }

  public void setCompareDigest(String compareDigest) {
    this.compareDigest = compareDigest;
  }

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "MetafieldsSetInput{ownerId='" + ownerId + "', namespace='" + namespace + "', key='" + key + "', value='" + value + "', compareDigest='" + compareDigest + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldsSetInput that = (MetafieldsSetInput) o;
    return Objects.equals(ownerId, that.ownerId) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value) &&
        Objects.equals(compareDigest, that.compareDigest) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, namespace, key, value, compareDigest, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String ownerId;

    
    private String namespace;

    
    private String key;

    
    private String value;

    
    private String compareDigest;

    
    private String type;

    public MetafieldsSetInput build() {
      MetafieldsSetInput result = new MetafieldsSetInput();
      result.ownerId = this.ownerId;
      result.namespace = this.namespace;
      result.key = this.key;
      result.value = this.value;
      result.compareDigest = this.compareDigest;
      result.type = this.type;
      return result;
    }

    
    public Builder ownerId(String ownerId) {
      this.ownerId = ownerId;
      return this;
    }

    
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    
    public Builder compareDigest(String compareDigest) {
      this.compareDigest = compareDigest;
      return this;
    }

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
