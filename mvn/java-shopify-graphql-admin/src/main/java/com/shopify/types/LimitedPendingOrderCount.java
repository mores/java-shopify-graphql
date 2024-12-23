package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The total number of pending orders on a shop if less then a maximum, or that maximum.
 * The atMax field indicates when this maximum has been reached.
 */
public class LimitedPendingOrderCount {
  /**
   * This is set when the number of pending orders has reached the maximum.
   */
  private boolean atMax;

  /**
   * The number of pendings orders on the shop.
   * Limited to a maximum of 10000.
   */
  private int count;

  public LimitedPendingOrderCount() {
  }

  /**
   * This is set when the number of pending orders has reached the maximum.
   */
  public boolean getAtMax() {
    return atMax;
  }

  public void setAtMax(boolean atMax) {
    this.atMax = atMax;
  }

  /**
   * The number of pendings orders on the shop.
   * Limited to a maximum of 10000.
   */
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "LimitedPendingOrderCount{atMax='" + atMax + "', count='" + count + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LimitedPendingOrderCount that = (LimitedPendingOrderCount) o;
    return atMax == that.atMax &&
        count == that.count;
  }

  @Override
  public int hashCode() {
    return Objects.hash(atMax, count);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * This is set when the number of pending orders has reached the maximum.
     */
    private boolean atMax;

    /**
     * The number of pendings orders on the shop.
     * Limited to a maximum of 10000.
     */
    private int count;

    public LimitedPendingOrderCount build() {
      LimitedPendingOrderCount result = new LimitedPendingOrderCount();
      result.atMax = this.atMax;
      result.count = this.count;
      return result;
    }

    /**
     * This is set when the number of pending orders has reached the maximum.
     */
    public Builder atMax(boolean atMax) {
      this.atMax = atMax;
      return this;
    }

    /**
     * The number of pendings orders on the shop.
     * Limited to a maximum of 10000.
     */
    public Builder count(int count) {
      this.count = count;
      return this;
    }
  }
}
