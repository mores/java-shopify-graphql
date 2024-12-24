package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class ProductPublication {
  
  private Channel channel;

  
  private boolean isPublished;

  
  private Product product;

  
  private OffsetDateTime publishDate;

  public ProductPublication() {
  }

  
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public OffsetDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
  }

  @Override
  public String toString() {
    return "ProductPublication{channel='" + channel + "', isPublished='" + isPublished + "', product='" + product + "', publishDate='" + publishDate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductPublication that = (ProductPublication) o;
    return Objects.equals(channel, that.channel) &&
        isPublished == that.isPublished &&
        Objects.equals(product, that.product) &&
        Objects.equals(publishDate, that.publishDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, isPublished, product, publishDate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Channel channel;

    
    private boolean isPublished;

    
    private Product product;

    
    private OffsetDateTime publishDate;

    public ProductPublication build() {
      ProductPublication result = new ProductPublication();
      result.channel = this.channel;
      result.isPublished = this.isPublished;
      result.product = this.product;
      result.publishDate = this.publishDate;
      return result;
    }

    
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder publishDate(OffsetDateTime publishDate) {
      this.publishDate = publishDate;
      return this;
    }
  }
}
