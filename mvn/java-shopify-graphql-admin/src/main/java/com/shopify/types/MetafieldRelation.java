package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldRelation {
  
  private String key;

  
  private String name;

  
  private String namespace;

  
  private MetafieldReferencer referencer;

  
  private MetafieldReference target;

  public MetafieldRelation() {
  }

  
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  
  public MetafieldReferencer getReferencer() {
    return referencer;
  }

  public void setReferencer(MetafieldReferencer referencer) {
    this.referencer = referencer;
  }

  
  public MetafieldReference getTarget() {
    return target;
  }

  public void setTarget(MetafieldReference target) {
    this.target = target;
  }

  @Override
  public String toString() {
    return "MetafieldRelation{key='" + key + "', name='" + name + "', namespace='" + namespace + "', referencer='" + referencer + "', target='" + target + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldRelation that = (MetafieldRelation) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(referencer, that.referencer) &&
        Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, namespace, referencer, target);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String key;

    
    private String name;

    
    private String namespace;

    
    private MetafieldReferencer referencer;

    
    private MetafieldReference target;

    public MetafieldRelation build() {
      MetafieldRelation result = new MetafieldRelation();
      result.key = this.key;
      result.name = this.name;
      result.namespace = this.namespace;
      result.referencer = this.referencer;
      result.target = this.target;
      return result;
    }

    
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    
    public Builder referencer(MetafieldReferencer referencer) {
      this.referencer = referencer;
      return this;
    }

    
    public Builder target(MetafieldReference target) {
      this.target = target;
      return this;
    }
  }
}
