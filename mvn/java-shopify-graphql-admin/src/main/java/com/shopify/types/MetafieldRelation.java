package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Defines a relation between two resources via a reference metafield.
 * The referencer owns the joining field with a given namespace and key,
 * while the target is referenced by the field.
 */
public class MetafieldRelation {
  /**
   * The key of the field making the reference.
   */
  private String key;

  /**
   * The name of the field making the reference.
   */
  private String name;

  /**
   * The namespace of the metafield making the reference, or type of the metaobject.
   */
  private String namespace;

  /**
   * The resource making the reference.
   */
  private MetafieldReferencer referencer;

  /**
   * The referenced resource.
   */
  private MetafieldReference target;

  public MetafieldRelation() {
  }

  /**
   * The key of the field making the reference.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The name of the field making the reference.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The namespace of the metafield making the reference, or type of the metaobject.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The resource making the reference.
   */
  public MetafieldReferencer getReferencer() {
    return referencer;
  }

  public void setReferencer(MetafieldReferencer referencer) {
    this.referencer = referencer;
  }

  /**
   * The referenced resource.
   */
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
    /**
     * The key of the field making the reference.
     */
    private String key;

    /**
     * The name of the field making the reference.
     */
    private String name;

    /**
     * The namespace of the metafield making the reference, or type of the metaobject.
     */
    private String namespace;

    /**
     * The resource making the reference.
     */
    private MetafieldReferencer referencer;

    /**
     * The referenced resource.
     */
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

    /**
     * The key of the field making the reference.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The name of the field making the reference.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The namespace of the metafield making the reference, or type of the metaobject.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The resource making the reference.
     */
    public Builder referencer(MetafieldReferencer referencer) {
      this.referencer = referencer;
      return this;
    }

    /**
     * The referenced resource.
     */
    public Builder target(MetafieldReference target) {
      this.target = target;
      return this;
    }
  }
}
