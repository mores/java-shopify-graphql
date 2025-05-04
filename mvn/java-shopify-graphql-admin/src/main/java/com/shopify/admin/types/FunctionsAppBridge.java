package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The App Bridge information for a Shopify Function.
 */
public class FunctionsAppBridge {
  /**
   * The relative path for creating a customization.
   */
  private String createPath;

  /**
   * The relative path for viewing a customization.
   */
  private String detailsPath;

  public FunctionsAppBridge() {
  }

  /**
   * The relative path for creating a customization.
   */
  public String getCreatePath() {
    return createPath;
  }

  public void setCreatePath(String createPath) {
    this.createPath = createPath;
  }

  /**
   * The relative path for viewing a customization.
   */
  public String getDetailsPath() {
    return detailsPath;
  }

  public void setDetailsPath(String detailsPath) {
    this.detailsPath = detailsPath;
  }

  @Override
  public String toString() {
    return "FunctionsAppBridge{createPath='" + createPath + "', detailsPath='" + detailsPath + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionsAppBridge that = (FunctionsAppBridge) o;
    return Objects.equals(createPath, that.createPath) &&
        Objects.equals(detailsPath, that.detailsPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createPath, detailsPath);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The relative path for creating a customization.
     */
    private String createPath;

    /**
     * The relative path for viewing a customization.
     */
    private String detailsPath;

    public FunctionsAppBridge build() {
      FunctionsAppBridge result = new FunctionsAppBridge();
      result.createPath = this.createPath;
      result.detailsPath = this.detailsPath;
      return result;
    }

    /**
     * The relative path for creating a customization.
     */
    public Builder createPath(String createPath) {
      this.createPath = createPath;
      return this;
    }

    /**
     * The relative path for viewing a customization.
     */
    public Builder detailsPath(String detailsPath) {
      this.detailsPath = detailsPath;
      return this;
    }
  }
}
