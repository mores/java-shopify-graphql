package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A component that's included in a bundle consolidated option selection.
 */
public class ComponentizedProductsBundleConsolidatedOptionSelectionComponent {
  /**
   * The ID of the component's option that's included in this consolidated option selection.
   */
  private String optionId;

  /**
   * The value of the component's option value that's included in this consolidated option selection.
   */
  private String value;

  public ComponentizedProductsBundleConsolidatedOptionSelectionComponent() {
  }

  /**
   * The ID of the component's option that's included in this consolidated option selection.
   */
  public String getOptionId() {
    return optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  /**
   * The value of the component's option value that's included in this consolidated option selection.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "ComponentizedProductsBundleConsolidatedOptionSelectionComponent{optionId='" + optionId + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComponentizedProductsBundleConsolidatedOptionSelectionComponent that = (ComponentizedProductsBundleConsolidatedOptionSelectionComponent) o;
    return Objects.equals(optionId, that.optionId) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionId, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the component's option that's included in this consolidated option selection.
     */
    private String optionId;

    /**
     * The value of the component's option value that's included in this consolidated option selection.
     */
    private String value;

    public ComponentizedProductsBundleConsolidatedOptionSelectionComponent build() {
      ComponentizedProductsBundleConsolidatedOptionSelectionComponent result = new ComponentizedProductsBundleConsolidatedOptionSelectionComponent();
      result.optionId = this.optionId;
      result.value = this.value;
      return result;
    }

    /**
     * The ID of the component's option that's included in this consolidated option selection.
     */
    public Builder optionId(String optionId) {
      this.optionId = optionId;
      return this;
    }

    /**
     * The value of the component's option value that's included in this consolidated option selection.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
