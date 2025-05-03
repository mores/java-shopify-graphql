package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The taxonomy category for the product.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TaxonomyCategory implements com.shopify.storefront.types.Node {
  /**
   * All parent nodes of the current taxonomy category.
   */
  private List<TaxonomyCategory> ancestors;

  /**
   * A static identifier for the taxonomy category.
   */
  private String id;

  /**
   * The localized name of the taxonomy category.
   */
  private String name;

  public TaxonomyCategory() {
  }

  /**
   * All parent nodes of the current taxonomy category.
   */
  public List<TaxonomyCategory> getAncestors() {
    return ancestors;
  }

  public void setAncestors(List<TaxonomyCategory> ancestors) {
    this.ancestors = ancestors;
  }

  /**
   * A static identifier for the taxonomy category.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The localized name of the taxonomy category.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "TaxonomyCategory{ancestors='" + ancestors + "', id='" + id + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxonomyCategory that = (TaxonomyCategory) o;
    return Objects.equals(ancestors, that.ancestors) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestors, id, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * All parent nodes of the current taxonomy category.
     */
    private List<TaxonomyCategory> ancestors;

    /**
     * A static identifier for the taxonomy category.
     */
    private String id;

    /**
     * The localized name of the taxonomy category.
     */
    private String name;

    public TaxonomyCategory build() {
      TaxonomyCategory result = new TaxonomyCategory();
      result.ancestors = this.ancestors;
      result.id = this.id;
      result.name = this.name;
      return result;
    }

    /**
     * All parent nodes of the current taxonomy category.
     */
    public Builder ancestors(List<TaxonomyCategory> ancestors) {
      this.ancestors = ancestors;
      return this;
    }

    /**
     * A static identifier for the taxonomy category.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The localized name of the taxonomy category.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
