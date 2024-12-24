package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class LinkedMetafieldUpdateInput {
  
  private String namespace;

  
  private String key;

  public LinkedMetafieldUpdateInput() {
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
    return "LinkedMetafieldUpdateInput{namespace='" + namespace + "', key='" + key + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkedMetafieldUpdateInput that = (LinkedMetafieldUpdateInput) o;
    return Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, key);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String namespace;

    
    private String key;

    public LinkedMetafieldUpdateInput build() {
      LinkedMetafieldUpdateInput result = new LinkedMetafieldUpdateInput();
      result.namespace = this.namespace;
      result.key = this.key;
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
  }
}
