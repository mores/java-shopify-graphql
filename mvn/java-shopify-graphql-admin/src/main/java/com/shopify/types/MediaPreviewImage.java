package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MediaPreviewImage {
  
  private Image image;

  
  private MediaPreviewImageStatus status;

  public MediaPreviewImage() {
  }

  
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  
  public MediaPreviewImageStatus getStatus() {
    return status;
  }

  public void setStatus(MediaPreviewImageStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "MediaPreviewImage{image='" + image + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MediaPreviewImage that = (MediaPreviewImage) o;
    return Objects.equals(image, that.image) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Image image;

    
    private MediaPreviewImageStatus status;

    public MediaPreviewImage build() {
      MediaPreviewImage result = new MediaPreviewImage();
      result.image = this.image;
      result.status = this.status;
      return result;
    }

    
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    
    public Builder status(MediaPreviewImageStatus status) {
      this.status = status;
      return this;
    }
  }
}
