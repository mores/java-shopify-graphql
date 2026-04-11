package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An option selection for a bundle consolidated option.
 */
public class ComponentizedProductsBundleConsolidatedOptionSelection {
  /**
   * The component values that are included in the consolidated option selection.
   */
  private List<ComponentizedProductsBundleConsolidatedOptionSelectionComponent> components;

  /**
   * The value of the consolidated option on the bundle parent.
   */
  private String value;

  public ComponentizedProductsBundleConsolidatedOptionSelection() {
  }

  /**
   * The component values that are included in the consolidated option selection.
   */
  public List<ComponentizedProductsBundleConsolidatedOptionSelectionComponent> getComponents() {
    return components;
  }

  public void setComponents(
      List<ComponentizedProductsBundleConsolidatedOptionSelectionComponent> components) {
    this.components = components;
  }

  /**
   * The value of the consolidated option on the bundle parent.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "ComponentizedProductsBundleConsolidatedOptionSelection{components='" + components + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComponentizedProductsBundleConsolidatedOptionSelection that = (ComponentizedProductsBundleConsolidatedOptionSelection) o;
    return Objects.equals(components, that.components) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The component values that are included in the consolidated option selection.
     */
    private List<ComponentizedProductsBundleConsolidatedOptionSelectionComponent> components;

    /**
     * The value of the consolidated option on the bundle parent.
     */
    private String value;

    public ComponentizedProductsBundleConsolidatedOptionSelection build() {
      ComponentizedProductsBundleConsolidatedOptionSelection result = new ComponentizedProductsBundleConsolidatedOptionSelection();
      result.components = this.components;
      result.value = this.value;
      return result;
    }

    /**
     * The component values that are included in the consolidated option selection.
     */
    public Builder components(
        List<ComponentizedProductsBundleConsolidatedOptionSelectionComponent> components) {
      this.components = components;
      return this;
    }

    /**
     * The value of the consolidated option on the bundle parent.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
