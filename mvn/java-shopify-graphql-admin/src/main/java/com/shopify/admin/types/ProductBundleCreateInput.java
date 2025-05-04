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
    return "ProductBundleCreateInput{title='" + title + "', components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleCreateInput that = (ProductBundleCreateInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(components, that.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, components);
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
     * The component products to bundle with the bundle product.
     */
    private List<ProductBundleComponentInput> components;

    public ProductBundleCreateInput build() {
      ProductBundleCreateInput result = new ProductBundleCreateInput();
      result.title = this.title;
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
     * The component products to bundle with the bundle product.
     */
    public Builder components(List<ProductBundleComponentInput> components) {
      this.components = components;
      return this;
    }
  }
}
