package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldDefinitionConstraints {
  
  private String key;

  
  private MetafieldDefinitionConstraintValueConnection values;

  public MetafieldDefinitionConstraints() {
  }

  
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  
  public MetafieldDefinitionConstraintValueConnection getValues() {
    return values;
  }

  public void setValues(MetafieldDefinitionConstraintValueConnection values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionConstraints{key='" + key + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionConstraints that = (MetafieldDefinitionConstraints) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String key;

    
    private MetafieldDefinitionConstraintValueConnection values;

    public MetafieldDefinitionConstraints build() {
      MetafieldDefinitionConstraints result = new MetafieldDefinitionConstraints();
      result.key = this.key;
      result.values = this.values;
      return result;
    }

    
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    
    public Builder values(MetafieldDefinitionConstraintValueConnection values) {
      this.values = values;
      return this;
    }
  }
}
