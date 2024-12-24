package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldInput {
  
  private String id;

  
  private String namespace;

  
  private String key;

  
  private String value;

  
  private String type;

  public MetafieldInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "MetafieldInput{id='" + id + "', namespace='" + namespace + "', key='" + key + "', value='" + value + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldInput that = (MetafieldInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, namespace, key, value, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String namespace;

    
    private String key;

    
    private String value;

    
    private String type;

    public MetafieldInput build() {
      MetafieldInput result = new MetafieldInput();
      result.id = this.id;
      result.namespace = this.namespace;
      result.key = this.key;
      result.value = this.value;
      result.type = this.type;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
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

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
