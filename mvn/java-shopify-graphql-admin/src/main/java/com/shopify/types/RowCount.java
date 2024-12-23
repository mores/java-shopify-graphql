package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A row count represents rows on background operation.
 */
public class RowCount {
  /**
   * Estimated number of rows contained within this background operation.
   */
  private int count;

  /**
   * Whether the operation exceeds max number of reportable rows.
   */
  private boolean exceedsMax;

  public RowCount() {
  }

  /**
   * Estimated number of rows contained within this background operation.
   */
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  /**
   * Whether the operation exceeds max number of reportable rows.
   */
  public boolean getExceedsMax() {
    return exceedsMax;
  }

  public void setExceedsMax(boolean exceedsMax) {
    this.exceedsMax = exceedsMax;
  }

  @Override
  public String toString() {
    return "RowCount{count='" + count + "', exceedsMax='" + exceedsMax + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RowCount that = (RowCount) o;
    return count == that.count &&
        exceedsMax == that.exceedsMax;
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, exceedsMax);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Estimated number of rows contained within this background operation.
     */
    private int count;

    /**
     * Whether the operation exceeds max number of reportable rows.
     */
    private boolean exceedsMax;

    public RowCount build() {
      RowCount result = new RowCount();
      result.count = this.count;
      result.exceedsMax = this.exceedsMax;
      return result;
    }

    /**
     * Estimated number of rows contained within this background operation.
     */
    public Builder count(int count) {
      this.count = count;
      return this;
    }

    /**
     * Whether the operation exceeds max number of reportable rows.
     */
    public Builder exceedsMax(boolean exceedsMax) {
      this.exceedsMax = exceedsMax;
      return this;
    }
  }
}
