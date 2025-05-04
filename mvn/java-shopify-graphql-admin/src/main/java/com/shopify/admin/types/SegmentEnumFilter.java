package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A filter with a set of possible values that's been added to a segment query.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SegmentEnumFilter implements com.shopify.admin.types.SegmentFilter {
  /**
   * The localized name of the filter.
   */
  private String localizedName;

  /**
   * Whether a file can have multiple values for a single customer.
   */
  private boolean multiValue;

  /**
   * The query name of the filter.
   */
  private String queryName;

  public SegmentEnumFilter() {
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
    return "SegmentEnumFilter{localizedName='" + localizedName + "', multiValue='" + multiValue + "', queryName='" + queryName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentEnumFilter that = (SegmentEnumFilter) o;
    return Objects.equals(localizedName, that.localizedName) &&
        multiValue == that.multiValue &&
        Objects.equals(queryName, that.queryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localizedName, multiValue, queryName);
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
     * Whether a file can have multiple values for a single customer.
     */
    private boolean multiValue;

    /**
     * The query name of the filter.
     */
    private String queryName;

    public SegmentEnumFilter build() {
      SegmentEnumFilter result = new SegmentEnumFilter();
      result.localizedName = this.localizedName;
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
