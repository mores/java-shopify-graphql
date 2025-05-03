package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Product property names like "Size", "Color", and "Material" that the customers can select.
 * Variants are selected based on permutations of these options.
 * 255 characters limit each.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductOption implements com.shopify.storefront.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The product option’s name.
   */
  private String name;

  /**
   * The corresponding option value to the product option.
   */
  private List<ProductOptionValue> optionValues;

  /**
   * The corresponding value to the product option name.
   */
  private List<String> values;

  public ProductOption() {
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
   * The product option’s name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The corresponding option value to the product option.
   */
  public List<ProductOptionValue> getOptionValues() {
    return optionValues;
  }

  public void setOptionValues(List<ProductOptionValue> optionValues) {
    this.optionValues = optionValues;
  }

  /**
   * The corresponding value to the product option name.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "ProductOption{id='" + id + "', name='" + name + "', optionValues='" + optionValues + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOption that = (ProductOption) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(optionValues, that.optionValues) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, optionValues, values);
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
     * The product option’s name.
     */
    private String name;

    /**
     * The corresponding option value to the product option.
     */
    private List<ProductOptionValue> optionValues;

    /**
     * The corresponding value to the product option name.
     */
    private List<String> values;

    public ProductOption build() {
      ProductOption result = new ProductOption();
      result.id = this.id;
      result.name = this.name;
      result.optionValues = this.optionValues;
      result.values = this.values;
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
     * The product option’s name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The corresponding option value to the product option.
     */
    public Builder optionValues(List<ProductOptionValue> optionValues) {
      this.optionValues = optionValues;
      return this;
    }

    /**
     * The corresponding value to the product option name.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
