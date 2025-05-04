package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Details for count of elements.
 */
public class Count {
  /**
   * The count of elements.
   */
  private int count;

  /**
   * The count's precision, or the exactness of the value.
   */
  private CountPrecision precision;

  public Count() {
  }

  /**
   * The count of elements.
   */
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  /**
   * The count's precision, or the exactness of the value.
   */
  public CountPrecision getPrecision() {
    return precision;
  }

  public void setPrecision(CountPrecision precision) {
    this.precision = precision;
  }

  @Override
  public String toString() {
    return "Count{count='" + count + "', precision='" + precision + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Count that = (Count) o;
    return count == that.count &&
        Objects.equals(precision, that.precision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, precision);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The count of elements.
     */
    private int count;

    /**
     * The count's precision, or the exactness of the value.
     */
    private CountPrecision precision;

    public Count build() {
      Count result = new Count();
      result.count = this.count;
      result.precision = this.precision;
      return result;
    }

    /**
     * The count of elements.
     */
    public Builder count(int count) {
      this.count = count;
      return this;
    }

    /**
     * The count's precision, or the exactness of the value.
     */
    public Builder precision(CountPrecision precision) {
      this.precision = precision;
      return this;
    }
  }
}
