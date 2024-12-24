package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PrivateMetafieldInput {
  
  private String owner;

  
  private String namespace;

  
  private String key;

  
  private PrivateMetafieldValueInput valueInput;

  public PrivateMetafieldInput() {
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

  
  public PrivateMetafieldValueInput getValueInput() {
    return valueInput;
  }

  public void setValueInput(PrivateMetafieldValueInput valueInput) {
    this.valueInput = valueInput;
  }

  @Override
  public String toString() {
    return "PrivateMetafieldInput{owner='" + owner + "', namespace='" + namespace + "', key='" + key + "', valueInput='" + valueInput + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafieldInput that = (PrivateMetafieldInput) o;
    return Objects.equals(owner, that.owner) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(valueInput, that.valueInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, namespace, key, valueInput);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String owner;

    
    private String namespace;

    
    private String key;

    
    private PrivateMetafieldValueInput valueInput;

    public PrivateMetafieldInput build() {
      PrivateMetafieldInput result = new PrivateMetafieldInput();
      result.owner = this.owner;
      result.namespace = this.namespace;
      result.key = this.key;
      result.valueInput = this.valueInput;
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

    
    public Builder valueInput(PrivateMetafieldValueInput valueInput) {
      this.valueInput = valueInput;
      return this;
    }
  }
}
