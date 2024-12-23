package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the subscription lines the discount applies on.
 */
public class SubscriptionManualDiscountEntitledLinesInput {
  /**
   * Specify whether the subscription discount will apply on all subscription lines.
   */
  private Boolean all;

  /**
   * The ID of the lines to add to or remove from the subscription discount.
   */
  private SubscriptionManualDiscountLinesInput lines;

  public SubscriptionManualDiscountEntitledLinesInput() {
  }

  /**
   * Specify whether the subscription discount will apply on all subscription lines.
   */
  public Boolean getAll() {
    return all;
  }

  public void setAll(Boolean all) {
    this.all = all;
  }

  /**
   * The ID of the lines to add to or remove from the subscription discount.
   */
  public SubscriptionManualDiscountLinesInput getLines() {
    return lines;
  }

  public void setLines(SubscriptionManualDiscountLinesInput lines) {
    this.lines = lines;
  }

  @Override
  public String toString() {
    return "SubscriptionManualDiscountEntitledLinesInput{all='" + all + "', lines='" + lines + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionManualDiscountEntitledLinesInput that = (SubscriptionManualDiscountEntitledLinesInput) o;
    return Objects.equals(all, that.all) &&
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
    private Boolean all;

    /**
     * The ID of the lines to add to or remove from the subscription discount.
     */
    private SubscriptionManualDiscountLinesInput lines;

    public SubscriptionManualDiscountEntitledLinesInput build() {
      SubscriptionManualDiscountEntitledLinesInput result = new SubscriptionManualDiscountEntitledLinesInput();
      result.all = this.all;
      result.lines = this.lines;
      return result;
    }

    /**
     * Specify whether the subscription discount will apply on all subscription lines.
     */
    public Builder all(Boolean all) {
      this.all = all;
      return this;
    }

    /**
     * The ID of the lines to add to or remove from the subscription discount.
     */
    public Builder lines(SubscriptionManualDiscountLinesInput lines) {
      this.lines = lines;
      return this;
    }
  }
}
