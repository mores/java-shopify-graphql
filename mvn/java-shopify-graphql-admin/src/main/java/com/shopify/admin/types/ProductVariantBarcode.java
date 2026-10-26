package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A barcode associated with a product variant.
 *
 * A variant supports up to 20 barcodes, each of
 * which can have a
 * [type](https://shopify.dev/docs/api/admin-graphql/latest/enums/BarcodeType).
 * Barcode types are validated against their respective format standards.
 */
public class ProductVariantBarcode {
  /**
   * The associated standard that the barcode conforms to. Barcode types are validated against their
   * respective format standards. A `null` format denotes no type provided on write and the value is
   * stored as entered.
   */
  private BarcodeType type;

  /**
   * The value of the barcode. For example, `9780262033848`. Maximum length: 255 characters.
   */
  private String value;

  public ProductVariantBarcode() {
  }

  /**
   * The associated standard that the barcode conforms to. Barcode types are validated against their
   * respective format standards. A `null` format denotes no type provided on write and the value is
   * stored as entered.
   */
  public BarcodeType getType() {
    return type;
  }

  public void setType(BarcodeType type) {
    this.type = type;
  }

  /**
   * The value of the barcode. For example, `9780262033848`. Maximum length: 255 characters.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "ProductVariantBarcode{type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantBarcode that = (ProductVariantBarcode) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The associated standard that the barcode conforms to. Barcode types are validated against their
     * respective format standards. A `null` format denotes no type provided on write and the value is
     * stored as entered.
     */
    private BarcodeType type;

    /**
     * The value of the barcode. For example, `9780262033848`. Maximum length: 255 characters.
     */
    private String value;

    public ProductVariantBarcode build() {
      ProductVariantBarcode result = new ProductVariantBarcode();
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    /**
     * The associated standard that the barcode conforms to. Barcode types are validated against their
     * respective format standards. A `null` format denotes no type provided on write and the value is
     * stored as entered.
     */
    public Builder type(BarcodeType type) {
      this.type = type;
      return this;
    }

    /**
     * The value of the barcode. For example, `9780262033848`. Maximum length: 255 characters.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
