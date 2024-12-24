package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldIdentifier {
  
  private String key;

  
  private String namespace;

  
  private String ownerId;

  public MetafieldIdentifier() {
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

  
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  @Override
  public String toString() {
    return "MetafieldIdentifier{key='" + key + "', namespace='" + namespace + "', ownerId='" + ownerId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldIdentifier that = (MetafieldIdentifier) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(ownerId, that.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, namespace, ownerId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String key;

    
    private String namespace;

    
    private String ownerId;

    public MetafieldIdentifier build() {
      MetafieldIdentifier result = new MetafieldIdentifier();
      result.key = this.key;
      result.namespace = this.namespace;
      result.ownerId = this.ownerId;
      return result;
    }

    
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    
    public Builder ownerId(String ownerId) {
      this.ownerId = ownerId;
      return this;
    }
  }
}
