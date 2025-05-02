package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A selectable value within a filter.
 */
public class FilterValue {
  /**
   * The number of results that match this filter value.
   */
  private int count;

  /**
   * A unique identifier.
   */
  private String id;

  /**
   * The visual representation when the filter's presentation is `IMAGE`.
   */
  private MediaImage image;

  /**
   * An input object that can be used to filter by this value on the parent field.
   *   
   * The value is provided as a helper for building dynamic filtering UI. For
   * example, if you have a list of selected `FilterValue` objects, you can combine
   * their respective `input` values to use in a subsequent query.
   */
  private String input;

  /**
   * A human-friendly string for this filter value.
   */
  private String label;

  /**
   * The visual representation when the filter's presentation is `SWATCH`.
   */
  private Swatch swatch;

  public FilterValue() {
  }

  /**
   * The number of results that match this filter value.
   */
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
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
   * The visual representation when the filter's presentation is `IMAGE`.
   */
  public MediaImage getImage() {
    return image;
  }

  public void setImage(MediaImage image) {
    this.image = image;
  }

  /**
   * An input object that can be used to filter by this value on the parent field.
   *   
   * The value is provided as a helper for building dynamic filtering UI. For
   * example, if you have a list of selected `FilterValue` objects, you can combine
   * their respective `input` values to use in a subsequent query.
   */
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  /**
   * A human-friendly string for this filter value.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * The visual representation when the filter's presentation is `SWATCH`.
   */
  public Swatch getSwatch() {
    return swatch;
  }

  public void setSwatch(Swatch swatch) {
    this.swatch = swatch;
  }

  @Override
  public String toString() {
    return "FilterValue{count='" + count + "', id='" + id + "', image='" + image + "', input='" + input + "', label='" + label + "', swatch='" + swatch + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FilterValue that = (FilterValue) o;
    return count == that.count &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(input, that.input) &&
        Objects.equals(label, that.label) &&
        Objects.equals(swatch, that.swatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, id, image, input, label, swatch);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The number of results that match this filter value.
     */
    private int count;

    /**
     * A unique identifier.
     */
    private String id;

    /**
     * The visual representation when the filter's presentation is `IMAGE`.
     */
    private MediaImage image;

    /**
     * An input object that can be used to filter by this value on the parent field.
     *   
     * The value is provided as a helper for building dynamic filtering UI. For
     * example, if you have a list of selected `FilterValue` objects, you can combine
     * their respective `input` values to use in a subsequent query.
     */
    private String input;

    /**
     * A human-friendly string for this filter value.
     */
    private String label;

    /**
     * The visual representation when the filter's presentation is `SWATCH`.
     */
    private Swatch swatch;

    public FilterValue build() {
      FilterValue result = new FilterValue();
      result.count = this.count;
      result.id = this.id;
      result.image = this.image;
      result.input = this.input;
      result.label = this.label;
      result.swatch = this.swatch;
      return result;
    }

    /**
     * The number of results that match this filter value.
     */
    public Builder count(int count) {
      this.count = count;
      return this;
    }

    /**
     * A unique identifier.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The visual representation when the filter's presentation is `IMAGE`.
     */
    public Builder image(MediaImage image) {
      this.image = image;
      return this;
    }

    /**
     * An input object that can be used to filter by this value on the parent field.
     *   
     * The value is provided as a helper for building dynamic filtering UI. For
     * example, if you have a list of selected `FilterValue` objects, you can combine
     * their respective `input` values to use in a subsequent query.
     */
    public Builder input(String input) {
      this.input = input;
      return this;
    }

    /**
     * A human-friendly string for this filter value.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * The visual representation when the filter's presentation is `SWATCH`.
     */
    public Builder swatch(Swatch swatch) {
      this.swatch = swatch;
      return this;
    }
  }
}
