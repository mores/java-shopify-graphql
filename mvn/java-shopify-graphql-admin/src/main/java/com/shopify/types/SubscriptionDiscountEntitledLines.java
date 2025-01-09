package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the subscription lines the discount applies on.
 */
public class SubscriptionDiscountEntitledLines {
  /**
   * Specify whether the subscription discount will apply on all subscription lines.
   */
  private boolean all;

  /**
   * The list of subscription lines associated with the subscription discount.
   */
  private SubscriptionLineConnection lines;

  public SubscriptionDiscountEntitledLines() {
  }

  /**
   * Specify whether the subscription discount will apply on all subscription lines.
   */
  public boolean getAll() {
    return all;
  }

  public void setAll(boolean all) {
    this.all = all;
  }

  /**
   * The list of subscription lines associated with the subscription discount.
   */
  public SubscriptionLineConnection getLines() {
    return lines;
  }

  public void setLines(SubscriptionLineConnection lines) {
    this.lines = lines;
  }

  @Override
  public String toString() {
    return "SubscriptionDiscountEntitledLines{all='" + all + "', lines='" + lines + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDiscountEntitledLines that = (SubscriptionDiscountEntitledLines) o;
    return all == that.all &&
        Objects.equals(lines, that.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, lines);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specify whether the subscription discount will apply on all subscription lines.
     */
    private boolean all;

    /**
     * The list of subscription lines associated with the subscription discount.
     */
    private SubscriptionLineConnection lines;

    public SubscriptionDiscountEntitledLines build() {
      SubscriptionDiscountEntitledLines result = new SubscriptionDiscountEntitledLines();
      result.all = this.all;
      result.lines = this.lines;
      return result;
    }

    /**
     * Specify whether the subscription discount will apply on all subscription lines.
     */
    public Builder all(boolean all) {
      this.all = all;
      return this;
    }

    /**
     * The list of subscription lines associated with the subscription discount.
     */
    public Builder lines(SubscriptionLineConnection lines) {
      this.lines = lines;
      return this;
    }
  }
}
