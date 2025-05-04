package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A filter option is one possible value in a search filter.
 */
public class FilterOption {
  /**
   * The filter option's label for display purposes.
   */
  private String label;

  /**
   * The filter option's value.
   */
  private String value;

  public FilterOption() {
  }

  /**
   * The filter option's label for display purposes.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * The filter option's value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "FilterOption{label='" + label + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FilterOption that = (FilterOption) o;
    return Objects.equals(label, that.label) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The filter option's label for display purposes.
     */
    private String label;

    /**
     * The filter option's value.
     */
    private String value;

    public FilterOption build() {
      FilterOption result = new FilterOption();
      result.label = this.label;
      result.value = this.value;
      return result;
    }

    /**
     * The filter option's label for display purposes.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * The filter option's value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
