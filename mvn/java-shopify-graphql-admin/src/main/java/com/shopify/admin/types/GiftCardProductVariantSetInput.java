package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for specifying a gift card product variant to create or update with the
 * [`giftCardProductSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/giftCardProductSet)
 * mutation.
 *
 * Include an
 * [`id`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/GiftCardProductSetVariantInput#field-GiftCardProductSetVariantInput.fields.id)
 * to update an existing variant, or omit it to create a new one. Gift card variant defaults are
 * applied automatically, meaning variants are set to non-taxable, don't require shipping, and their inventory is untracked.
 */
public class GiftCardProductVariantSetInput {
  /**
   * Specifies the product variant to update or create a new variant if absent.
   */
  private String id;

  /**
   * The custom properties that a shop owner uses to define product variants.
   */
  private List<VariantOptionValueInput> optionValues;

  /**
   * The price of the variant.
   */
  private String price;

  /**
   * The SKU for the variant. Case-sensitive string.
   */
  private String sku;

  /**
   * The barcodes to associate with the product variant. Replaces the entire barcode set. A variant
   * accepts up to 20 barcodes, and a given
   * variant input can't set both `barcode` and `barcodes`. Refer to the
   * [`ProductVariantBarcode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariantBarcode)
   * object for how these barcodes are returned.
   *   
   * Complexity cost: 0.0114 per barcode.
   */
  private List<BarcodeInput> barcodes;

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  private Integer position;

  /**
   * The file to associate with the variant.
   *   
   * Complexity cost: 0.6 per variant file.
   *   
   * Any file specified here must also be specified in the `files` input for the product.
   */
  private FileSetInput file;

  /**
   * Additional customizable information about the product variant.
   *   
   * Complexity cost: 0.4 per variant metafield.
   */
  private List<MetafieldInput> metafields;

  /**
   * Indicates whether the product variant is created as published or unpublished.
   * This option is only available for new product variants.
   */
  private Boolean published;

  public GiftCardProductVariantSetInput() {
  }

  /**
   * Specifies the product variant to update or create a new variant if absent.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The custom properties that a shop owner uses to define product variants.
   */
  public List<VariantOptionValueInput> getOptionValues() {
    return optionValues;
  }

  public void setOptionValues(List<VariantOptionValueInput> optionValues) {
    this.optionValues = optionValues;
  }

  /**
   * The price of the variant.
   */
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * The SKU for the variant. Case-sensitive string.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * The barcodes to associate with the product variant. Replaces the entire barcode set. A variant
   * accepts up to 20 barcodes, and a given
   * variant input can't set both `barcode` and `barcodes`. Refer to the
   * [`ProductVariantBarcode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariantBarcode)
   * object for how these barcodes are returned.
   *   
   * Complexity cost: 0.0114 per barcode.
   */
  public List<BarcodeInput> getBarcodes() {
    return barcodes;
  }

  public void setBarcodes(List<BarcodeInput> barcodes) {
    this.barcodes = barcodes;
  }

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  /**
   * The file to associate with the variant.
   *   
   * Complexity cost: 0.6 per variant file.
   *   
   * Any file specified here must also be specified in the `files` input for the product.
   */
  public FileSetInput getFile() {
    return file;
  }

  public void setFile(FileSetInput file) {
    this.file = file;
  }

  /**
   * Additional customizable information about the product variant.
   *   
   * Complexity cost: 0.4 per variant metafield.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * Indicates whether the product variant is created as published or unpublished.
   * This option is only available for new product variants.
   */
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  @Override
  public String toString() {
    return "GiftCardProductVariantSetInput{id='" + id + "', optionValues='" + optionValues + "', price='" + price + "', sku='" + sku + "', barcodes='" + barcodes + "', position='" + position + "', file='" + file + "', metafields='" + metafields + "', published='" + published + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardProductVariantSetInput that = (GiftCardProductVariantSetInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(optionValues, that.optionValues) &&
        Objects.equals(price, that.price) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(barcodes, that.barcodes) &&
        Objects.equals(position, that.position) &&
        Objects.equals(file, that.file) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(published, that.published);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, optionValues, price, sku, barcodes, position, file, metafields, published);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the product variant to update or create a new variant if absent.
     */
    private String id;

    /**
     * The custom properties that a shop owner uses to define product variants.
     */
    private List<VariantOptionValueInput> optionValues;

    /**
     * The price of the variant.
     */
    private String price;

    /**
     * The SKU for the variant. Case-sensitive string.
     */
    private String sku;

    /**
     * The barcodes to associate with the product variant. Replaces the entire barcode set. A variant
     * accepts up to 20 barcodes, and a given
     * variant input can't set both `barcode` and `barcodes`. Refer to the
     * [`ProductVariantBarcode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariantBarcode)
     * object for how these barcodes are returned.
     *   
     * Complexity cost: 0.0114 per barcode.
     */
    private List<BarcodeInput> barcodes;

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    private Integer position;

    /**
     * The file to associate with the variant.
     *   
     * Complexity cost: 0.6 per variant file.
     *   
     * Any file specified here must also be specified in the `files` input for the product.
     */
    private FileSetInput file;

    /**
     * Additional customizable information about the product variant.
     *   
     * Complexity cost: 0.4 per variant metafield.
     */
    private List<MetafieldInput> metafields;

    /**
     * Indicates whether the product variant is created as published or unpublished.
     * This option is only available for new product variants.
     */
    private Boolean published;

    public GiftCardProductVariantSetInput build() {
      GiftCardProductVariantSetInput result = new GiftCardProductVariantSetInput();
      result.id = this.id;
      result.optionValues = this.optionValues;
      result.price = this.price;
      result.sku = this.sku;
      result.barcodes = this.barcodes;
      result.position = this.position;
      result.file = this.file;
      result.metafields = this.metafields;
      result.published = this.published;
      return result;
    }

    /**
     * Specifies the product variant to update or create a new variant if absent.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The custom properties that a shop owner uses to define product variants.
     */
    public Builder optionValues(List<VariantOptionValueInput> optionValues) {
      this.optionValues = optionValues;
      return this;
    }

    /**
     * The price of the variant.
     */
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    /**
     * The SKU for the variant. Case-sensitive string.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * The barcodes to associate with the product variant. Replaces the entire barcode set. A variant
     * accepts up to 20 barcodes, and a given
     * variant input can't set both `barcode` and `barcodes`. Refer to the
     * [`ProductVariantBarcode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariantBarcode)
     * object for how these barcodes are returned.
     *   
     * Complexity cost: 0.0114 per barcode.
     */
    public Builder barcodes(List<BarcodeInput> barcodes) {
      this.barcodes = barcodes;
      return this;
    }

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    /**
     * The file to associate with the variant.
     *   
     * Complexity cost: 0.6 per variant file.
     *   
     * Any file specified here must also be specified in the `files` input for the product.
     */
    public Builder file(FileSetInput file) {
      this.file = file;
      return this;
    }

    /**
     * Additional customizable information about the product variant.
     *   
     * Complexity cost: 0.4 per variant metafield.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * Indicates whether the product variant is created as published or unpublished.
     * This option is only available for new product variants.
     */
    public Builder published(Boolean published) {
      this.published = published;
      return this;
    }
  }
}
