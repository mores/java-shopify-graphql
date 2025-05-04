package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The available options for transforming an image.
 *
 * All transformation options are considered best effort. Any transformation that
 * the original image type doesn't support will be ignored.
 */
public class ImageTransformInput {
  /**
   * The region of the image to remain after cropping.
   * Must be used in conjunction with the `maxWidth` and/or `maxHeight` fields,
   * where the `maxWidth` and `maxHeight` aren't equal.
   * The `crop` argument should coincide with the smaller value. A smaller `maxWidth` indicates a `LEFT` or `RIGHT` crop, while
   * a smaller `maxHeight` indicates a `TOP` or `BOTTOM` crop. For example, `{
   * maxWidth: 5, maxHeight: 10, crop: LEFT }` will result
   * in an image with a width of 5 and height of 10, where the right side of the image is removed.
   */
  private CropRegion crop;

  /**
   * Image width in pixels between 1 and 5760.
   */
  private Integer maxWidth;

  /**
   * Image height in pixels between 1 and 5760.
   */
  private Integer maxHeight;

  /**
   * Image size multiplier for high-resolution retina displays. Must be within 1..3.
   */
  private Integer scale = 1;

  /**
   * Convert the source image into the preferred content type.
   * Supported conversions: `.svg` to `.png`, any file type to `.jpg`, and any file type to `.webp`.
   */
  private ImageContentType preferredContentType;

  public ImageTransformInput() {
  }

  /**
   * The region of the image to remain after cropping.
   * Must be used in conjunction with the `maxWidth` and/or `maxHeight` fields,
   * where the `maxWidth` and `maxHeight` aren't equal.
   * The `crop` argument should coincide with the smaller value. A smaller `maxWidth` indicates a `LEFT` or `RIGHT` crop, while
   * a smaller `maxHeight` indicates a `TOP` or `BOTTOM` crop. For example, `{
   * maxWidth: 5, maxHeight: 10, crop: LEFT }` will result
   * in an image with a width of 5 and height of 10, where the right side of the image is removed.
   */
  public CropRegion getCrop() {
    return crop;
  }

  public void setCrop(CropRegion crop) {
    this.crop = crop;
  }

  /**
   * Image width in pixels between 1 and 5760.
   */
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  /**
   * Image height in pixels between 1 and 5760.
   */
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }

  /**
   * Image size multiplier for high-resolution retina displays. Must be within 1..3.
   */
  public Integer getScale() {
    return scale;
  }

  public void setScale(Integer scale) {
    this.scale = scale;
  }

  /**
   * Convert the source image into the preferred content type.
   * Supported conversions: `.svg` to `.png`, any file type to `.jpg`, and any file type to `.webp`.
   */
  public ImageContentType getPreferredContentType() {
    return preferredContentType;
  }

  public void setPreferredContentType(ImageContentType preferredContentType) {
    this.preferredContentType = preferredContentType;
  }

  @Override
  public String toString() {
    return "ImageTransformInput{crop='" + crop + "', maxWidth='" + maxWidth + "', maxHeight='" + maxHeight + "', scale='" + scale + "', preferredContentType='" + preferredContentType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ImageTransformInput that = (ImageTransformInput) o;
    return Objects.equals(crop, that.crop) &&
        Objects.equals(maxWidth, that.maxWidth) &&
        Objects.equals(maxHeight, that.maxHeight) &&
        Objects.equals(scale, that.scale) &&
        Objects.equals(preferredContentType, that.preferredContentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crop, maxWidth, maxHeight, scale, preferredContentType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The region of the image to remain after cropping.
     * Must be used in conjunction with the `maxWidth` and/or `maxHeight` fields,
     * where the `maxWidth` and `maxHeight` aren't equal.
     * The `crop` argument should coincide with the smaller value. A smaller `maxWidth` indicates a `LEFT` or `RIGHT` crop, while
     * a smaller `maxHeight` indicates a `TOP` or `BOTTOM` crop. For example, `{
     * maxWidth: 5, maxHeight: 10, crop: LEFT }` will result
     * in an image with a width of 5 and height of 10, where the right side of the image is removed.
     */
    private CropRegion crop;

    /**
     * Image width in pixels between 1 and 5760.
     */
    private Integer maxWidth;

    /**
     * Image height in pixels between 1 and 5760.
     */
    private Integer maxHeight;

    /**
     * Image size multiplier for high-resolution retina displays. Must be within 1..3.
     */
    private Integer scale = 1;

    /**
     * Convert the source image into the preferred content type.
     * Supported conversions: `.svg` to `.png`, any file type to `.jpg`, and any file type to `.webp`.
     */
    private ImageContentType preferredContentType;

    public ImageTransformInput build() {
      ImageTransformInput result = new ImageTransformInput();
      result.crop = this.crop;
      result.maxWidth = this.maxWidth;
      result.maxHeight = this.maxHeight;
      result.scale = this.scale;
      result.preferredContentType = this.preferredContentType;
      return result;
    }

    /**
     * The region of the image to remain after cropping.
     * Must be used in conjunction with the `maxWidth` and/or `maxHeight` fields,
     * where the `maxWidth` and `maxHeight` aren't equal.
     * The `crop` argument should coincide with the smaller value. A smaller `maxWidth` indicates a `LEFT` or `RIGHT` crop, while
     * a smaller `maxHeight` indicates a `TOP` or `BOTTOM` crop. For example, `{
     * maxWidth: 5, maxHeight: 10, crop: LEFT }` will result
     * in an image with a width of 5 and height of 10, where the right side of the image is removed.
     */
    public Builder crop(CropRegion crop) {
      this.crop = crop;
      return this;
    }

    /**
     * Image width in pixels between 1 and 5760.
     */
    public Builder maxWidth(Integer maxWidth) {
      this.maxWidth = maxWidth;
      return this;
    }

    /**
     * Image height in pixels between 1 and 5760.
     */
    public Builder maxHeight(Integer maxHeight) {
      this.maxHeight = maxHeight;
      return this;
    }

    /**
     * Image size multiplier for high-resolution retina displays. Must be within 1..3.
     */
    public Builder scale(Integer scale) {
      this.scale = scale;
      return this;
    }

    /**
     * Convert the source image into the preferred content type.
     * Supported conversions: `.svg` to `.png`, any file type to `.jpg`, and any file type to `.webp`.
     */
    public Builder preferredContentType(ImageContentType preferredContentType) {
      this.preferredContentType = preferredContentType;
      return this;
    }
  }
}
