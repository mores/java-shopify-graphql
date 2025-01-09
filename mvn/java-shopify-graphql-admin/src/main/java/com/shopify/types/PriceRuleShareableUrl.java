package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Shareable URL for the discount code associated with the price rule.
 */
public class PriceRuleShareableUrl {
  /**
   * The image URL of the item (product or collection) to which the discount applies.
   */
  private Image targetItemImage;

  /**
   * The type of page that's associated with the URL.
   */
  private PriceRuleShareableUrlTargetType targetType;

  /**
   * The title of the page that's associated with the URL.
   */
  private String title;

  /**
   * The URL for the discount code.
   */
  private String url;

  public PriceRuleShareableUrl() {
  }

  /**
   * The image URL of the item (product or collection) to which the discount applies.
   */
  public Image getTargetItemImage() {
    return targetItemImage;
  }

  public void setTargetItemImage(Image targetItemImage) {
    this.targetItemImage = targetItemImage;
  }

  /**
   * The type of page that's associated with the URL.
   */
  public PriceRuleShareableUrlTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(PriceRuleShareableUrlTargetType targetType) {
    this.targetType = targetType;
  }

  /**
   * The title of the page that's associated with the URL.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The URL for the discount code.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "PriceRuleShareableUrl{targetItemImage='" + targetItemImage + "', targetType='" + targetType + "', title='" + title + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleShareableUrl that = (PriceRuleShareableUrl) o;
    return Objects.equals(targetItemImage, that.targetItemImage) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(title, that.title) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetItemImage, targetType, title, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The image URL of the item (product or collection) to which the discount applies.
     */
    private Image targetItemImage;

    /**
     * The type of page that's associated with the URL.
     */
    private PriceRuleShareableUrlTargetType targetType;

    /**
     * The title of the page that's associated with the URL.
     */
    private String title;

    /**
     * The URL for the discount code.
     */
    private String url;

    public PriceRuleShareableUrl build() {
      PriceRuleShareableUrl result = new PriceRuleShareableUrl();
      result.targetItemImage = this.targetItemImage;
      result.targetType = this.targetType;
      result.title = this.title;
      result.url = this.url;
      return result;
    }

    /**
     * The image URL of the item (product or collection) to which the discount applies.
     */
    public Builder targetItemImage(Image targetItemImage) {
      this.targetItemImage = targetItemImage;
      return this;
    }

    /**
     * The type of page that's associated with the URL.
     */
    public Builder targetType(PriceRuleShareableUrlTargetType targetType) {
      this.targetType = targetType;
      return this;
    }

    /**
     * The title of the page that's associated with the URL.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The URL for the discount code.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
