package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectFieldDefinitionDeleteInput {
  
  private String key;

  public MetaobjectFieldDefinitionDeleteInput() {
  }

  
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  @Override
  public String toString() {
    return "MetaobjectFieldDefinitionDeleteInput{key='" + key + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldDefinitionDeleteInput that = (MetaobjectFieldDefinitionDeleteInput) o;
    return Objects.equals(key, that.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String key;

    public MetaobjectFieldDefinitionDeleteInput build() {
      MetaobjectFieldDefinitionDeleteInput result = new MetaobjectFieldDefinitionDeleteInput();
      result.key = this.key;
      return result;
    }

    
    public Builder key(String key) {
      this.key = key;
      return this;
    }
  }
}
