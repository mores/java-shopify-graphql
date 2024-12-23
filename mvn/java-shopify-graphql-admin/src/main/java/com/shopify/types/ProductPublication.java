package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents the channels where a product is published.
 */
public class ProductPublication {
  /**
   * The channel where the product was or is published.
   */
  private Channel channel;

  /**
   * Whether the publication is published or not.
   */
  private boolean isPublished;

  /**
   * The product that was or is going to be published on the channel.
   */
  private Product product;

  /**
   * The date that the product was or is going to be published on the channel.
   */
  private OffsetDateTime publishDate;

  public ProductPublication() {
  }

  /**
   * The channel where the product was or is published.
   */
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  /**
   * Whether the publication is published or not.
   */
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  /**
   * The product that was or is going to be published on the channel.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The date that the product was or is going to be published on the channel.
   */
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
    /**
     * The channel where the product was or is published.
     */
    private Channel channel;

    /**
     * Whether the publication is published or not.
     */
    private boolean isPublished;

    /**
     * The product that was or is going to be published on the channel.
     */
    private Product product;

    /**
     * The date that the product was or is going to be published on the channel.
     */
    private OffsetDateTime publishDate;

    public ProductPublication build() {
      ProductPublication result = new ProductPublication();
      result.channel = this.channel;
      result.isPublished = this.isPublished;
      result.product = this.product;
      result.publishDate = this.publishDate;
      return result;
    }

    /**
     * The channel where the product was or is published.
     */
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * Whether the publication is published or not.
     */
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    /**
     * The product that was or is going to be published on the channel.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The date that the product was or is going to be published on the channel.
     */
    public Builder publishDate(OffsetDateTime publishDate) {
      this.publishDate = publishDate;
      return this;
    }
  }
}
