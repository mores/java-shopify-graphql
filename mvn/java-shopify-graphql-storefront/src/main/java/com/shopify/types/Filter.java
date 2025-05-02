package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A filter that is supported on the parent field.
 */
public class Filter {
  /**
   * A unique identifier.
   */
  private String id;

  /**
   * A human-friendly string for this filter.
   */
  private String label;

  /**
   * Describes how to present the filter values.
   * Returns a value only for filters of type `LIST`. Returns null for other types.
   */
  private FilterPresentation presentation;

  /**
   * An enumeration that denotes the type of data this filter represents.
   */
  private FilterType type;

  /**
   * The list of values for this filter.
   */
  private List<FilterValue> values;

  public Filter() {
  }

  /**
   * A unique identifier.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * A human-friendly string for this filter.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Describes how to present the filter values.
   * Returns a value only for filters of type `LIST`. Returns null for other types.
   */
  public FilterPresentation getPresentation() {
    return presentation;
  }

  public void setPresentation(FilterPresentation presentation) {
    this.presentation = presentation;
  }

  /**
   * An enumeration that denotes the type of data this filter represents.
   */
  public FilterType getType() {
    return type;
  }

  public void setType(FilterType type) {
    this.type = type;
  }

  /**
   * The list of values for this filter.
   */
  public List<FilterValue> getValues() {
    return values;
  }

  public void setValues(List<FilterValue> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "Filter{id='" + id + "', label='" + label + "', presentation='" + presentation + "', type='" + type + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Filter that = (Filter) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(label, that.label) &&
        Objects.equals(presentation, that.presentation) &&
        Objects.equals(type, that.type) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, presentation, type, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A unique identifier.
     */
    private String id;

    /**
     * A human-friendly string for this filter.
     */
    private String label;

    /**
     * Describes how to present the filter values.
     * Returns a value only for filters of type `LIST`. Returns null for other types.
     */
    private FilterPresentation presentation;

    /**
     * An enumeration that denotes the type of data this filter represents.
     */
    private FilterType type;

    /**
     * The list of values for this filter.
     */
    private List<FilterValue> values;

    public Filter build() {
      Filter result = new Filter();
      result.id = this.id;
      result.label = this.label;
      result.presentation = this.presentation;
      result.type = this.type;
      result.values = this.values;
      return result;
    }

    /**
     * A unique identifier.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * A human-friendly string for this filter.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Describes how to present the filter values.
     * Returns a value only for filters of type `LIST`. Returns null for other types.
     */
    public Builder presentation(FilterPresentation presentation) {
      this.presentation = presentation;
      return this;
    }

    /**
     * An enumeration that denotes the type of data this filter represents.
     */
    public Builder type(FilterType type) {
      this.type = type;
      return this;
    }

    /**
     * The list of values for this filter.
     */
    public Builder values(List<FilterValue> values) {
      this.values = values;
      return this;
    }
  }
}
