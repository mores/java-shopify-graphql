package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents an option on a selling plan group that's available in the drop-down list in the storefront.
 *
 * Individual selling plans contribute their options to the associated selling plan
 * group. For example, a selling plan group might have an option called `option1:
 * Delivery every`. One selling plan in that group could contribute `option1: 2
 * weeks` with the pricing for that option, and another selling plan could
 * contribute `option1: 4 weeks`, with different pricing.
 */
public class SellingPlanGroupOption {
  /**
   * The name of the option. For example, 'Delivery every'.
   */
  private String name;

  /**
   * The values for the options specified by the selling plans in the selling plan
   * group. For example, '1 week', '2 weeks', '3 weeks'.
   */
  private List<String> values;

  public SellingPlanGroupOption() {
  }

  /**
   * The name of the option. For example, 'Delivery every'.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The values for the options specified by the selling plans in the selling plan
   * group. For example, '1 week', '2 weeks', '3 weeks'.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "SellingPlanGroupOption{name='" + name + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroupOption that = (SellingPlanGroupOption) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the option. For example, 'Delivery every'.
     */
    private String name;

    /**
     * The values for the options specified by the selling plans in the selling plan
     * group. For example, '1 week', '2 weeks', '3 weeks'.
     */
    private List<String> values;

    public SellingPlanGroupOption build() {
      SellingPlanGroupOption result = new SellingPlanGroupOption();
      result.name = this.name;
      result.values = this.values;
      return result;
    }

    /**
     * The name of the option. For example, 'Delivery every'.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The values for the options specified by the selling plans in the selling plan
     * group. For example, '1 week', '2 weeks', '3 weeks'.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
