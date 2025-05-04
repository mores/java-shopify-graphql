package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The parameters for an event segment filter.
 */
public class SegmentEventFilterParameter {
  /**
   * Whether the parameter accepts a list of values.
   */
  private boolean acceptsMultipleValues;

  /**
   * The localized description of the parameter.
   */
  private String localizedDescription;

  /**
   * The localized name of the parameter.
   */
  private String localizedName;

  /**
   * Whether the parameter is optional.
   */
  private boolean optional;

  /**
   * The type of the parameter.
   */
  private String parameterType;

  /**
   * The query name of the parameter.
   */
  private String queryName;

  public SegmentEventFilterParameter() {
  }

  /**
   * Whether the parameter accepts a list of values.
   */
  public boolean getAcceptsMultipleValues() {
    return acceptsMultipleValues;
  }

  public void setAcceptsMultipleValues(boolean acceptsMultipleValues) {
    this.acceptsMultipleValues = acceptsMultipleValues;
  }

  /**
   * The localized description of the parameter.
   */
  public String getLocalizedDescription() {
    return localizedDescription;
  }

  public void setLocalizedDescription(String localizedDescription) {
    this.localizedDescription = localizedDescription;
  }

  /**
   * The localized name of the parameter.
   */
  public String getLocalizedName() {
    return localizedName;
  }

  public void setLocalizedName(String localizedName) {
    this.localizedName = localizedName;
  }

  /**
   * Whether the parameter is optional.
   */
  public boolean getOptional() {
    return optional;
  }

  public void setOptional(boolean optional) {
    this.optional = optional;
  }

  /**
   * The type of the parameter.
   */
  public String getParameterType() {
    return parameterType;
  }

  public void setParameterType(String parameterType) {
    this.parameterType = parameterType;
  }

  /**
   * The query name of the parameter.
   */
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  @Override
  public String toString() {
    return "SegmentEventFilterParameter{acceptsMultipleValues='" + acceptsMultipleValues + "', localizedDescription='" + localizedDescription + "', localizedName='" + localizedName + "', optional='" + optional + "', parameterType='" + parameterType + "', queryName='" + queryName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentEventFilterParameter that = (SegmentEventFilterParameter) o;
    return acceptsMultipleValues == that.acceptsMultipleValues &&
        Objects.equals(localizedDescription, that.localizedDescription) &&
        Objects.equals(localizedName, that.localizedName) &&
        optional == that.optional &&
        Objects.equals(parameterType, that.parameterType) &&
        Objects.equals(queryName, that.queryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptsMultipleValues, localizedDescription, localizedName, optional, parameterType, queryName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the parameter accepts a list of values.
     */
    private boolean acceptsMultipleValues;

    /**
     * The localized description of the parameter.
     */
    private String localizedDescription;

    /**
     * The localized name of the parameter.
     */
    private String localizedName;

    /**
     * Whether the parameter is optional.
     */
    private boolean optional;

    /**
     * The type of the parameter.
     */
    private String parameterType;

    /**
     * The query name of the parameter.
     */
    private String queryName;

    public SegmentEventFilterParameter build() {
      SegmentEventFilterParameter result = new SegmentEventFilterParameter();
      result.acceptsMultipleValues = this.acceptsMultipleValues;
      result.localizedDescription = this.localizedDescription;
      result.localizedName = this.localizedName;
      result.optional = this.optional;
      result.parameterType = this.parameterType;
      result.queryName = this.queryName;
      return result;
    }

    /**
     * Whether the parameter accepts a list of values.
     */
    public Builder acceptsMultipleValues(boolean acceptsMultipleValues) {
      this.acceptsMultipleValues = acceptsMultipleValues;
      return this;
    }

    /**
     * The localized description of the parameter.
     */
    public Builder localizedDescription(String localizedDescription) {
      this.localizedDescription = localizedDescription;
      return this;
    }

    /**
     * The localized name of the parameter.
     */
    public Builder localizedName(String localizedName) {
      this.localizedName = localizedName;
      return this;
    }

    /**
     * Whether the parameter is optional.
     */
    public Builder optional(boolean optional) {
      this.optional = optional;
      return this;
    }

    /**
     * The type of the parameter.
     */
    public Builder parameterType(String parameterType) {
      this.parameterType = parameterType;
      return this;
    }

    /**
     * The query name of the parameter.
     */
    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
