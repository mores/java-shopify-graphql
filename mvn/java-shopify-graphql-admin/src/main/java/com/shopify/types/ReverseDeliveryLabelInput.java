package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a reverse label.
 */
public class ReverseDeliveryLabelInput {
  /**
   * The URL of the label file. If a label file was uploaded to be attached to the
   * delivery, then provide the temporary staged URL.
   */
  private String fileUrl;

  public ReverseDeliveryLabelInput() {
  }

  /**
   * The URL of the label file. If a label file was uploaded to be attached to the
   * delivery, then provide the temporary staged URL.
   */
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryLabelInput{fileUrl='" + fileUrl + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryLabelInput that = (ReverseDeliveryLabelInput) o;
    return Objects.equals(fileUrl, that.fileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The URL of the label file. If a label file was uploaded to be attached to the
     * delivery, then provide the temporary staged URL.
     */
    private String fileUrl;

    public ReverseDeliveryLabelInput build() {
      ReverseDeliveryLabelInput result = new ReverseDeliveryLabelInput();
      result.fileUrl = this.fileUrl;
      return result;
    }

    /**
     * The URL of the label file. If a label file was uploaded to be attached to the
     * delivery, then provide the temporary staged URL.
     */
    public Builder fileUrl(String fileUrl) {
      this.fileUrl = fileUrl;
      return this;
    }
  }
}
