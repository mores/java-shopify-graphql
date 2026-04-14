package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An option on the bundle parent product that is consolidated from multiple different components.
 */
public class ComponentizedProductsBundleConsolidatedOption {
  /**
   * The name of the consolidated option.
   */
  private String name;

  /**
   * The selections of the consolidated option.
   */
  private List<ComponentizedProductsBundleConsolidatedOptionSelection> selections;

  public ComponentizedProductsBundleConsolidatedOption() {
  }

  /**
   * The name of the consolidated option.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The selections of the consolidated option.
   */
  public List<ComponentizedProductsBundleConsolidatedOptionSelection> getSelections() {
    return selections;
  }

  public void setSelections(
      List<ComponentizedProductsBundleConsolidatedOptionSelection> selections) {
    this.selections = selections;
  }

  @Override
  public String toString() {
    return "ComponentizedProductsBundleConsolidatedOption{name='" + name + "', selections='" + selections + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComponentizedProductsBundleConsolidatedOption that = (ComponentizedProductsBundleConsolidatedOption) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(selections, that.selections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, selections);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the consolidated option.
     */
    private String name;

    /**
     * The selections of the consolidated option.
     */
    private List<ComponentizedProductsBundleConsolidatedOptionSelection> selections;

    public ComponentizedProductsBundleConsolidatedOption build() {
      ComponentizedProductsBundleConsolidatedOption result = new ComponentizedProductsBundleConsolidatedOption();
      result.name = this.name;
      result.selections = this.selections;
      return result;
    }

    /**
     * The name of the consolidated option.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The selections of the consolidated option.
     */
    public Builder selections(
        List<ComponentizedProductsBundleConsolidatedOptionSelection> selections) {
      this.selections = selections;
      return this;
    }
  }
}
