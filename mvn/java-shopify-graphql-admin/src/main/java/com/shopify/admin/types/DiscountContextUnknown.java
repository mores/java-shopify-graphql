package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The discount's eligibility is affected by something that can't be represented in this API version.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountContextUnknown implements DiscountContext {
  /**
   * The underlying discount context type.
   */
  private String contextType;

  public DiscountContextUnknown() {
  }

  /**
   * The underlying discount context type.
   */
  public String getContextType() {
    return contextType;
  }

  public void setContextType(String contextType) {
    this.contextType = contextType;
  }

  @Override
  public String toString() {
    return "DiscountContextUnknown{contextType='" + contextType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountContextUnknown that = (DiscountContextUnknown) o;
    return Objects.equals(contextType, that.contextType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The underlying discount context type.
     */
    private String contextType;

    public DiscountContextUnknown build() {
      DiscountContextUnknown result = new DiscountContextUnknown();
      result.contextType = this.contextType;
      return result;
    }

    /**
     * The underlying discount context type.
     */
    public Builder contextType(String contextType) {
      this.contextType = contextType;
      return this;
    }
  }
}
