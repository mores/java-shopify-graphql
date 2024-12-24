package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductUpdateMediaPayload {
  
  private List<Media> media;

  
  private List<MediaUserError> mediaUserErrors;

  
  private Product product;

  
  private List<UserError> userErrors;

  public ProductUpdateMediaPayload() {
  }

  
  public List<Media> getMedia() {
    return media;
  }

  public void setMedia(List<Media> media) {
    this.media = media;
  }

  
  public List<MediaUserError> getMediaUserErrors() {
    return mediaUserErrors;
  }

  public void setMediaUserErrors(List<MediaUserError> mediaUserErrors) {
    this.mediaUserErrors = mediaUserErrors;
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductUpdateMediaPayload{media='" + media + "', mediaUserErrors='" + mediaUserErrors + "', product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductUpdateMediaPayload that = (ProductUpdateMediaPayload) o;
    return Objects.equals(media, that.media) &&
        Objects.equals(mediaUserErrors, that.mediaUserErrors) &&
        Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(media, mediaUserErrors, product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<Media> media;

    
    private List<MediaUserError> mediaUserErrors;

    
    private Product product;

    
    private List<UserError> userErrors;

    public ProductUpdateMediaPayload build() {
      ProductUpdateMediaPayload result = new ProductUpdateMediaPayload();
      result.media = this.media;
      result.mediaUserErrors = this.mediaUserErrors;
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder media(List<Media> media) {
      this.media = media;
      return this;
    }

    
    public Builder mediaUserErrors(List<MediaUserError> mediaUserErrors) {
      this.mediaUserErrors = mediaUserErrors;
      return this;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
