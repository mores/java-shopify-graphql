package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PrivateMetafieldDeleteInput {
  
  private String owner;

  
  private String namespace;

  
  private String key;

  public PrivateMetafieldDeleteInput() {
  }

  
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
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
    return "PrivateMetafieldDeleteInput{owner='" + owner + "', namespace='" + namespace + "', key='" + key + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafieldDeleteInput that = (PrivateMetafieldDeleteInput) o;
    return Objects.equals(owner, that.owner) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, namespace, key);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String owner;

    
    private String namespace;

    
    private String key;

    public PrivateMetafieldDeleteInput build() {
      PrivateMetafieldDeleteInput result = new PrivateMetafieldDeleteInput();
      result.owner = this.owner;
      result.namespace = this.namespace;
      result.key = this.key;
      return result;
    }

    
    public Builder owner(String owner) {
      this.owner = owner;
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
