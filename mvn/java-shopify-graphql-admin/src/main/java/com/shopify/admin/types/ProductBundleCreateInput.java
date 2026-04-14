package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating a componentized product.
 */
public class ProductBundleCreateInput {
  /**
   * The title of the product to create.
   */
  private String title;

  /**
   * The consolidated options of the componentized product to create, if provided.
   */
  private List<ProductBundleConsolidatedOptionInput> consolidatedOptions;

  /**
   * The component products to bundle with the bundle product.
   */
  private List<ProductBundleComponentInput> components;

  public ProductBundleCreateInput() {
  }

  /**
   * The title of the product to create.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The consolidated options of the componentized product to create, if provided.
   */
  public List<ProductBundleConsolidatedOptionInput> getConsolidatedOptions() {
    return consolidatedOptions;
  }

  public void setConsolidatedOptions(
      List<ProductBundleConsolidatedOptionInput> consolidatedOptions) {
    this.consolidatedOptions = consolidatedOptions;
  }

  /**
   * The component products to bundle with the bundle product.
   */
  public List<ProductBundleComponentInput> getComponents() {
    return components;
  }

  public void setComponents(List<ProductBundleComponentInput> components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "ProductBundleCreateInput{title='" + title + "', consolidatedOptions='" + consolidatedOptions + "', components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleCreateInput that = (ProductBundleCreateInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(consolidatedOptions, that.consolidatedOptions) &&
        Objects.equals(components, that.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, consolidatedOptions, components);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The title of the product to create.
     */
    private String title;

    /**
     * The consolidated options of the componentized product to create, if provided.
     */
    private List<ProductBundleConsolidatedOptionInput> consolidatedOptions;

    /**
     * The component products to bundle with the bundle product.
     */
    private List<ProductBundleComponentInput> components;

    public ProductBundleCreateInput build() {
      ProductBundleCreateInput result = new ProductBundleCreateInput();
      result.title = this.title;
      result.consolidatedOptions = this.consolidatedOptions;
      result.components = this.components;
      return result;
    }

    /**
     * The title of the product to create.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The consolidated options of the componentized product to create, if provided.
     */
    public Builder consolidatedOptions(
        List<ProductBundleConsolidatedOptionInput> consolidatedOptions) {
      this.consolidatedOptions = consolidatedOptions;
      return this;
    }

    /**
     * The component products to bundle with the bundle product.
     */
    public Builder components(List<ProductBundleComponentInput> components) {
      this.components = components;
      return this;
    }
  }
}
