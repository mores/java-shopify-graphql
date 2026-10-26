package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents a shipping document.
 */
public class ShippingObjectsShippingDocument {
  /**
   * The type of the shipping document.
   */
  private ShippingDocumentType documentType;

  /**
   * File format of the shipping document.
   */
  private ShippingEnumsFileFormat format;

  /**
   * The last time the document was printed.
   */
  private OffsetDateTime printedAt;

  /**
   * The shipping label associated with the shipping document.
   */
  private String shippingLabelId;

  /**
   * URL of the shipping document.
   */
  private String url;

  public ShippingObjectsShippingDocument() {
  }

  /**
   * The type of the shipping document.
   */
  public ShippingDocumentType getDocumentType() {
    return documentType;
  }

  public void setDocumentType(ShippingDocumentType documentType) {
    this.documentType = documentType;
  }

  /**
   * File format of the shipping document.
   */
  public ShippingEnumsFileFormat getFormat() {
    return format;
  }

  public void setFormat(ShippingEnumsFileFormat format) {
    this.format = format;
  }

  /**
   * The last time the document was printed.
   */
  public OffsetDateTime getPrintedAt() {
    return printedAt;
  }

  public void setPrintedAt(OffsetDateTime printedAt) {
    this.printedAt = printedAt;
  }

  /**
   * The shipping label associated with the shipping document.
   */
  public String getShippingLabelId() {
    return shippingLabelId;
  }

  public void setShippingLabelId(String shippingLabelId) {
    this.shippingLabelId = shippingLabelId;
  }

  /**
   * URL of the shipping document.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ShippingObjectsShippingDocument{documentType='" + documentType + "', format='" + format + "', printedAt='" + printedAt + "', shippingLabelId='" + shippingLabelId + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingObjectsShippingDocument that = (ShippingObjectsShippingDocument) o;
    return Objects.equals(documentType, that.documentType) &&
        Objects.equals(format, that.format) &&
        Objects.equals(printedAt, that.printedAt) &&
        Objects.equals(shippingLabelId, that.shippingLabelId) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentType, format, printedAt, shippingLabelId, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of the shipping document.
     */
    private ShippingDocumentType documentType;

    /**
     * File format of the shipping document.
     */
    private ShippingEnumsFileFormat format;

    /**
     * The last time the document was printed.
     */
    private OffsetDateTime printedAt;

    /**
     * The shipping label associated with the shipping document.
     */
    private String shippingLabelId;

    /**
     * URL of the shipping document.
     */
    private String url;

    public ShippingObjectsShippingDocument build() {
      ShippingObjectsShippingDocument result = new ShippingObjectsShippingDocument();
      result.documentType = this.documentType;
      result.format = this.format;
      result.printedAt = this.printedAt;
      result.shippingLabelId = this.shippingLabelId;
      result.url = this.url;
      return result;
    }

    /**
     * The type of the shipping document.
     */
    public Builder documentType(ShippingDocumentType documentType) {
      this.documentType = documentType;
      return this;
    }

    /**
     * File format of the shipping document.
     */
    public Builder format(ShippingEnumsFileFormat format) {
      this.format = format;
      return this;
    }

    /**
     * The last time the document was printed.
     */
    public Builder printedAt(OffsetDateTime printedAt) {
      this.printedAt = printedAt;
      return this;
    }

    /**
     * The shipping label associated with the shipping document.
     */
    public Builder shippingLabelId(String shippingLabelId) {
      this.shippingLabelId = shippingLabelId;
      return this;
    }

    /**
     * URL of the shipping document.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
