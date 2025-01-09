package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a Shopify product taxonomy value.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TaxonomyValue implements MetafieldReference, com.shopify.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the product taxonomy value. For example, Red.
   */
  private String name;

  public TaxonomyValue() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the product taxonomy value. For example, Red.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "TaxonomyValue{id='" + id + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxonomyValue that = (TaxonomyValue) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the product taxonomy value. For example, Red.
     */
    private String name;

    public TaxonomyValue build() {
      TaxonomyValue result = new TaxonomyValue();
      result.id = this.id;
      result.name = this.name;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the product taxonomy value. For example, Red.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
