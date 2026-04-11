package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a componentized product.
 */
public class ProductBundleUpdateInput {
  /**
   * The ID of the componentized product to update.
   */
  private String productId;

  /**
   * The title to rename the componentized product to, if provided.
   */
  private String title;

  /**
   * The consolidated options of the componentized product to update, if provided.
   */
  private List<ProductBundleConsolidatedOptionInput> consolidatedOptions;

  /**
   * The components to update existing ones. If none provided, no changes occur.
   * Note: This replaces, not adds to, current components.
   */
  private List<ProductBundleComponentInput> components;

  public ProductBundleUpdateInput() {
  }

  /**
   * The ID of the componentized product to update.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * The title to rename the componentized product to, if provided.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The consolidated options of the componentized product to update, if provided.
   */
  public List<ProductBundleConsolidatedOptionInput> getConsolidatedOptions() {
    return consolidatedOptions;
  }

  public void setConsolidatedOptions(
      List<ProductBundleConsolidatedOptionInput> consolidatedOptions) {
    this.consolidatedOptions = consolidatedOptions;
  }

  /**
   * The components to update existing ones. If none provided, no changes occur.
   * Note: This replaces, not adds to, current components.
   */
  public List<ProductBundleComponentInput> getComponents() {
    return components;
  }

  public void setComponents(List<ProductBundleComponentInput> components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "ProductBundleUpdateInput{productId='" + productId + "', title='" + title + "', consolidatedOptions='" + consolidatedOptions + "', components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleUpdateInput that = (ProductBundleUpdateInput) o;
    return Objects.equals(productId, that.productId) &&
        Objects.equals(title, that.title) &&
        Objects.equals(consolidatedOptions, that.consolidatedOptions) &&
        Objects.equals(components, that.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, title, consolidatedOptions, components);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the componentized product to update.
     */
    private String productId;

    /**
     * The title to rename the componentized product to, if provided.
     */
    private String title;

    /**
     * The consolidated options of the componentized product to update, if provided.
     */
    private List<ProductBundleConsolidatedOptionInput> consolidatedOptions;

    /**
     * The components to update existing ones. If none provided, no changes occur.
     * Note: This replaces, not adds to, current components.
     */
    private List<ProductBundleComponentInput> components;

    public ProductBundleUpdateInput build() {
      ProductBundleUpdateInput result = new ProductBundleUpdateInput();
      result.productId = this.productId;
      result.title = this.title;
      result.consolidatedOptions = this.consolidatedOptions;
      result.components = this.components;
      return result;
    }

    /**
     * The ID of the componentized product to update.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * The title to rename the componentized product to, if provided.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The consolidated options of the componentized product to update, if provided.
     */
    public Builder consolidatedOptions(
        List<ProductBundleConsolidatedOptionInput> consolidatedOptions) {
      this.consolidatedOptions = consolidatedOptions;
      return this;
    }

    /**
     * The components to update existing ones. If none provided, no changes occur.
     * Note: This replaces, not adds to, current components.
     */
    public Builder components(List<ProductBundleComponentInput> components) {
      this.components = components;
      return this;
    }
  }
}
