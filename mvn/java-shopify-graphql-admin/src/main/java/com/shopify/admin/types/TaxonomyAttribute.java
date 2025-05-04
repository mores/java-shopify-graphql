package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A Shopify product taxonomy attribute.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TaxonomyAttribute implements TaxonomyCategoryAttribute, com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  public TaxonomyAttribute() {
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

  @Override
  public String toString() {
    return "TaxonomyAttribute{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxonomyAttribute that = (TaxonomyAttribute) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    public TaxonomyAttribute build() {
      TaxonomyAttribute result = new TaxonomyAttribute();
      result.id = this.id;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
