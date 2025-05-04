package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A list of suggested values associated with an individual segment. A
 * segment is a group of members, such as customers, that meet specific
 * criteria.
 */
public class SegmentValue {
  /**
   * The localized version of the value's name. This name is displayed to the merchant.
   */
  private String localizedValue;

  /**
   * The name of the query associated with the suggestion.
   */
  private String queryName;

  public SegmentValue() {
  }

  /**
   * The localized version of the value's name. This name is displayed to the merchant.
   */
  public String getLocalizedValue() {
    return localizedValue;
  }

  public void setLocalizedValue(String localizedValue) {
    this.localizedValue = localizedValue;
  }

  /**
   * The name of the query associated with the suggestion.
   */
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  @Override
  public String toString() {
    return "SegmentValue{localizedValue='" + localizedValue + "', queryName='" + queryName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentValue that = (SegmentValue) o;
    return Objects.equals(localizedValue, that.localizedValue) &&
        Objects.equals(queryName, that.queryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localizedValue, queryName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The localized version of the value's name. This name is displayed to the merchant.
     */
    private String localizedValue;

    /**
     * The name of the query associated with the suggestion.
     */
    private String queryName;

    public SegmentValue build() {
      SegmentValue result = new SegmentValue();
      result.localizedValue = this.localizedValue;
      result.queryName = this.queryName;
      return result;
    }

    /**
     * The localized version of the value's name. This name is displayed to the merchant.
     */
    public Builder localizedValue(String localizedValue) {
      this.localizedValue = localizedValue;
      return this;
    }

    /**
     * The name of the query associated with the suggestion.
     */
    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
