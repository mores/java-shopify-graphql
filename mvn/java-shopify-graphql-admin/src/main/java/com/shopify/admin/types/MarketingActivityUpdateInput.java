package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to update a marketing activity. Marketing activity app
 * extensions are deprecated and will be removed in the near future.
 */
public class MarketingActivityUpdateInput {
  /**
   * The ID of the marketing activity.
   */
  private String id;

  public MarketingActivityUpdateInput() {
  }

  /**
   * The ID of the marketing activity.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "MarketingActivityUpdateInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityUpdateInput that = (MarketingActivityUpdateInput) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the marketing activity.
     */
    private String id;

    public MarketingActivityUpdateInput build() {
      MarketingActivityUpdateInput result = new MarketingActivityUpdateInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the marketing activity.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
