package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ImageTransformInput {
  
  private CropRegion crop;

  
  private Integer maxWidth;

  
  private Integer maxHeight;

  
  private Integer scale = 1;

  
  private ImageContentType preferredContentType;

  public ImageTransformInput() {
  }

  
  public CropRegion getCrop() {
    return crop;
  }

  public void setCrop(CropRegion crop) {
    this.crop = crop;
  }

  
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }

  
  public Integer getScale() {
    return scale;
  }

  public void setScale(Integer scale) {
    this.scale = scale;
  }

  
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
    
    private CropRegion crop;

    
    private Integer maxWidth;

    
    private Integer maxHeight;

    
    private Integer scale = 1;

    
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

    
    public Builder crop(CropRegion crop) {
      this.crop = crop;
      return this;
    }

    
    public Builder maxWidth(Integer maxWidth) {
      this.maxWidth = maxWidth;
      return this;
    }

    
    public Builder maxHeight(Integer maxHeight) {
      this.maxHeight = maxHeight;
      return this;
    }

    
    public Builder scale(Integer scale) {
      this.scale = scale;
      return this;
    }

    
    public Builder preferredContentType(ImageContentType preferredContentType) {
      this.preferredContentType = preferredContentType;
      return this;
    }
  }
}
