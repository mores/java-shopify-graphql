package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a consolidated option on a componentized product.
 */
public class ProductBundleConsolidatedOptionInput {
  /**
   * The name of the consolidated option (e.g., 'Size', 'Color').
   */
  private String optionName;

  /**
   * The option selections that define how this consolidated option maps to component options.
   */
  private List<ProductBundleConsolidatedOptionSelectionInput> optionSelections;

  public ProductBundleConsolidatedOptionInput() {
  }

  /**
   * The name of the consolidated option (e.g., 'Size', 'Color').
   */
  public String getOptionName() {
    return optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }

  /**
   * The option selections that define how this consolidated option maps to component options.
   */
  public List<ProductBundleConsolidatedOptionSelectionInput> getOptionSelections() {
    return optionSelections;
  }

  public void setOptionSelections(
      List<ProductBundleConsolidatedOptionSelectionInput> optionSelections) {
    this.optionSelections = optionSelections;
  }

  @Override
  public String toString() {
    return "ProductBundleConsolidatedOptionInput{optionName='" + optionName + "', optionSelections='" + optionSelections + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleConsolidatedOptionInput that = (ProductBundleConsolidatedOptionInput) o;
    return Objects.equals(optionName, that.optionName) &&
        Objects.equals(optionSelections, that.optionSelections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionName, optionSelections);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the consolidated option (e.g., 'Size', 'Color').
     */
    private String optionName;

    /**
     * The option selections that define how this consolidated option maps to component options.
     */
    private List<ProductBundleConsolidatedOptionSelectionInput> optionSelections;

    public ProductBundleConsolidatedOptionInput build() {
      ProductBundleConsolidatedOptionInput result = new ProductBundleConsolidatedOptionInput();
      result.optionName = this.optionName;
      result.optionSelections = this.optionSelections;
      return result;
    }

    /**
     * The name of the consolidated option (e.g., 'Size', 'Color').
     */
    public Builder optionName(String optionName) {
      this.optionName = optionName;
      return this;
    }

    /**
     * The option selections that define how this consolidated option maps to component options.
     */
    public Builder optionSelections(
        List<ProductBundleConsolidatedOptionSelectionInput> optionSelections) {
      this.optionSelections = optionSelections;
      return this;
    }
  }
}
