package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A Shopify product taxonomy measurement attribute.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TaxonomyMeasurementAttribute implements TaxonomyCategoryAttribute, com.shopify.admin.types.Node {
  /**
   * The unique ID of the TaxonomyAttribute.
   */
  private String id;

  /**
   * The name of the product taxonomy attribute. For example, Color.
   */
  private String name;

  /**
   * The product taxonomy attribute options.
   */
  private List<Attribute> options;

  public TaxonomyMeasurementAttribute() {
  }

  /**
   * The unique ID of the TaxonomyAttribute.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the product taxonomy attribute. For example, Color.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The product taxonomy attribute options.
   */
  public List<Attribute> getOptions() {
    return options;
  }

  public void setOptions(List<Attribute> options) {
    this.options = options;
  }

  @Override
  public String toString() {
    return "TaxonomyMeasurementAttribute{id='" + id + "', name='" + name + "', options='" + options + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxonomyMeasurementAttribute that = (TaxonomyMeasurementAttribute) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(options, that.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, options);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique ID of the TaxonomyAttribute.
     */
    private String id;

    /**
     * The name of the product taxonomy attribute. For example, Color.
     */
    private String name;

    /**
     * The product taxonomy attribute options.
     */
    private List<Attribute> options;

    public TaxonomyMeasurementAttribute build() {
      TaxonomyMeasurementAttribute result = new TaxonomyMeasurementAttribute();
      result.id = this.id;
      result.name = this.name;
      result.options = this.options;
      return result;
    }

    /**
     * The unique ID of the TaxonomyAttribute.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the product taxonomy attribute. For example, Color.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The product taxonomy attribute options.
     */
    public Builder options(List<Attribute> options) {
      this.options = options;
      return this;
    }
  }
}
