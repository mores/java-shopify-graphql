package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for barcodes that are associated with a product variant. A variant accepts up to
 * 20 barcodes, and a given variant input can't
 * set both `barcode` and `barcodes`. Refer to the
 * [`ProductVariantBarcode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariantBarcode)
 * object for how these barcodes are returned.
 */
public class BarcodeInput {
  /**
   * The value of the barcode. For example, `9780262033848`. Maximum length: 255 characters.
   */
  private String value;

  /**
   * The associated standard that the barcode conforms to. Barcode types are
   * validated against their respective format standards. A `null` format denotes
   * no type provided on write and the value is stored as entered.
   */
  private BarcodeType type;

  public BarcodeInput() {
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

  /**
   * The associated standard that the barcode conforms to. Barcode types are
   * validated against their respective format standards. A `null` format denotes
   * no type provided on write and the value is stored as entered.
   */
  public BarcodeType getType() {
    return type;
  }

  public void setType(BarcodeType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "BarcodeInput{value='" + value + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BarcodeInput that = (BarcodeInput) o;
    return Objects.equals(value, that.value) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value of the barcode. For example, `9780262033848`. Maximum length: 255 characters.
     */
    private String value;

    /**
     * The associated standard that the barcode conforms to. Barcode types are
     * validated against their respective format standards. A `null` format denotes
     * no type provided on write and the value is stored as entered.
     */
    private BarcodeType type;

    public BarcodeInput build() {
      BarcodeInput result = new BarcodeInput();
      result.value = this.value;
      result.type = this.type;
      return result;
    }

    /**
     * The value of the barcode. For example, `9780262033848`. Maximum length: 255 characters.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * The associated standard that the barcode conforms to. Barcode types are
     * validated against their respective format standards. A `null` format denotes
     * no type provided on write and the value is stored as entered.
     */
    public Builder type(BarcodeType type) {
      this.type = type;
      return this;
    }
  }
}
