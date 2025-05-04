package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A filter that's used to segment customers based on the date that an event
 * occured. For example, the `product_bought` event filter allows you to segment
 * customers based on what products they've bought.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SegmentEventFilter implements com.shopify.admin.types.SegmentFilter {
  /**
   * The localized name of the filter.
   */
  private String localizedName;

  /**
   * Whether a file can have multiple values for a single customer.
   */
  private boolean multiValue;

  /**
   * The parameters for an event segment filter.
   */
  private List<SegmentEventFilterParameter> parameters;

  /**
   * The query name of the filter.
   */
  private String queryName;

  /**
   * The return value type for an event segment filter.
   */
  private String returnValueType;

  public SegmentEventFilter() {
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
   * The parameters for an event segment filter.
   */
  public List<SegmentEventFilterParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<SegmentEventFilterParameter> parameters) {
    this.parameters = parameters;
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

  /**
   * The return value type for an event segment filter.
   */
  public String getReturnValueType() {
    return returnValueType;
  }

  public void setReturnValueType(String returnValueType) {
    this.returnValueType = returnValueType;
  }

  @Override
  public String toString() {
    return "SegmentEventFilter{localizedName='" + localizedName + "', multiValue='" + multiValue + "', parameters='" + parameters + "', queryName='" + queryName + "', returnValueType='" + returnValueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentEventFilter that = (SegmentEventFilter) o;
    return Objects.equals(localizedName, that.localizedName) &&
        multiValue == that.multiValue &&
        Objects.equals(parameters, that.parameters) &&
        Objects.equals(queryName, that.queryName) &&
        Objects.equals(returnValueType, that.returnValueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localizedName, multiValue, parameters, queryName, returnValueType);
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
     * The parameters for an event segment filter.
     */
    private List<SegmentEventFilterParameter> parameters;

    /**
     * The query name of the filter.
     */
    private String queryName;

    /**
     * The return value type for an event segment filter.
     */
    private String returnValueType;

    public SegmentEventFilter build() {
      SegmentEventFilter result = new SegmentEventFilter();
      result.localizedName = this.localizedName;
      result.multiValue = this.multiValue;
      result.parameters = this.parameters;
      result.queryName = this.queryName;
      result.returnValueType = this.returnValueType;
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
     * The parameters for an event segment filter.
     */
    public Builder parameters(List<SegmentEventFilterParameter> parameters) {
      this.parameters = parameters;
      return this;
    }

    /**
     * The query name of the filter.
     */
    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }

    /**
     * The return value type for an event segment filter.
     */
    public Builder returnValueType(String returnValueType) {
      this.returnValueType = returnValueType;
      return this;
    }
  }
}
