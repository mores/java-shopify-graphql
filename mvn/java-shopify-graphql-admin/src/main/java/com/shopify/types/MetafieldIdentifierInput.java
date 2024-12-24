package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldIdentifierInput {
  
  private String ownerId;

  
  private String namespace;

  
  private String key;

  public MetafieldIdentifierInput() {
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

  @Override
  public String toString() {
    return "MetafieldIdentifierInput{ownerId='" + ownerId + "', namespace='" + namespace + "', key='" + key + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldIdentifierInput that = (MetafieldIdentifierInput) o;
    return Objects.equals(ownerId, that.ownerId) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, namespace, key);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String ownerId;

    
    private String namespace;

    
    private String key;

    public MetafieldIdentifierInput build() {
      MetafieldIdentifierInput result = new MetafieldIdentifierInput();
      result.ownerId = this.ownerId;
      result.namespace = this.namespace;
      result.key = this.key;
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
  }
}
