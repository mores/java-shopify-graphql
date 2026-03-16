package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A filter with a double-precision, floating-point value that's been added to a segment query.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SegmentFloatFilter implements com.shopify.admin.types.SegmentFilter {
  /**
   * The localized name of the filter.
   */
  private String localizedName;

  /**
   * The maximum range a filter can have.
   */
  private Double maxRange;

  /**
   * The minimum range a filter can have.
   */
  private Double minRange;

  /**
   * Whether a file can have multiple values for a single customer.
   */
  private boolean multiValue;

  /**
   * The query name of the filter.
   */
  private String queryName;

  public SegmentFloatFilter() {
  }

  /**
   * The localized name of the filter.
   */
  public String getLocalizedName() {
    return localizedName;
  }

  public void setLocalizedName(String localizedName) {
    this.localizedName = localizedName;
  }

  /**
   * The maximum range a filter can have.
   */
  public Double getMaxRange() {
    return maxRange;
  }

  public void setMaxRange(Double maxRange) {
    this.maxRange = maxRange;
  }

  /**
   * The minimum range a filter can have.
   */
  public Double getMinRange() {
    return minRange;
  }

  public void setMinRange(Double minRange) {
    this.minRange = minRange;
  }

  /**
   * Whether a file can have multiple values for a single customer.
   */
  public boolean getMultiValue() {
    return multiValue;
  }

  public void setMultiValue(boolean multiValue) {
    this.multiValue = multiValue;
  }

  /**
   * The query name of the filter.
   */
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  @Override
  public String toString() {
    return "SegmentFloatFilter{localizedName='" + localizedName + "', maxRange='" + maxRange + "', minRange='" + minRange + "', multiValue='" + multiValue + "', queryName='" + queryName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentFloatFilter that = (SegmentFloatFilter) o;
    return Objects.equals(localizedName, that.localizedName) &&
        Objects.equals(maxRange, that.maxRange) &&
        Objects.equals(minRange, that.minRange) &&
        multiValue == that.multiValue &&
        Objects.equals(queryName, that.queryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localizedName, maxRange, minRange, multiValue, queryName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The localized name of the filter.
     */
    private String localizedName;

    /**
     * The maximum range a filter can have.
     */
    private Double maxRange;

    /**
     * The minimum range a filter can have.
     */
    private Double minRange;

    /**
     * Whether a file can have multiple values for a single customer.
     */
    private boolean multiValue;

    /**
     * The query name of the filter.
     */
    private String queryName;

    public SegmentFloatFilter build() {
      SegmentFloatFilter result = new SegmentFloatFilter();
      result.localizedName = this.localizedName;
      result.maxRange = this.maxRange;
      result.minRange = this.minRange;
      result.multiValue = this.multiValue;
      result.queryName = this.queryName;
      return result;
    }

    /**
     * The localized name of the filter.
     */
    public Builder localizedName(String localizedName) {
      this.localizedName = localizedName;
      return this;
    }

    /**
     * The maximum range a filter can have.
     */
    public Builder maxRange(Double maxRange) {
      this.maxRange = maxRange;
      return this;
    }

    /**
     * The minimum range a filter can have.
     */
    public Builder minRange(Double minRange) {
      this.minRange = minRange;
      return this;
    }

    /**
     * Whether a file can have multiple values for a single customer.
     */
    public Builder multiValue(boolean multiValue) {
      this.multiValue = multiValue;
      return this;
    }

    /**
     * The query name of the filter.
     */
    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
