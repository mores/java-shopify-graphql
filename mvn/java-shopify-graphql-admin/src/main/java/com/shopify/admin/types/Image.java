package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents an image resource.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Image implements com.shopify.admin.types.HasMetafields {
  /**
   * A word or phrase to share the nature or contents of an image.
   */
  private String altText;

  /**
   * The original height of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
   */
  private Integer height;

  /**
   * A unique ID for the image.
   */
  private String id;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The location of the original image as a URL.
   *   
   * If there are any existing transformations in the original source URL, they will remain and not be stripped.
   */
  private String originalSrc;

  /**
   * The location of the image as a URL.
   */
  private String src;

  /**
   * The location of the transformed image as a URL.
   *   
   * All transformation arguments are considered "best-effort". If they can be applied to an image, they will be.
   * Otherwise any transformations which an image type doesn't support will be ignored.
   */
  private String transformedSrc;

  /**
   * The location of the image as a URL.
   *   
   * If no transform options are specified, then the original image will be preserved including any pre-applied transforms.
   *   
   * All transformation options are considered "best-effort". Any transformation
   * that the original image type doesn't support will be ignored.
   *   
   * If you need multiple variations of the same image, then you can use [GraphQL
   * aliases](https://graphql.org/learn/queries/#aliases).
   */
  private String url;

  /**
   * The original width of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
   */
  private Integer width;

  public Image() {
  }

  /**
   * A word or phrase to share the nature or contents of an image.
   */
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * The original height of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
   */
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * A unique ID for the image.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The location of the original image as a URL.
   *   
   * If there are any existing transformations in the original source URL, they will remain and not be stripped.
   */
  public String getOriginalSrc() {
    return originalSrc;
  }

  public void setOriginalSrc(String originalSrc) {
    this.originalSrc = originalSrc;
  }

  /**
   * The location of the image as a URL.
   */
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  /**
   * The location of the transformed image as a URL.
   *   
   * All transformation arguments are considered "best-effort". If they can be applied to an image, they will be.
   * Otherwise any transformations which an image type doesn't support will be ignored.
   */
  public String getTransformedSrc() {
    return transformedSrc;
  }

  public void setTransformedSrc(String transformedSrc) {
    this.transformedSrc = transformedSrc;
  }

  /**
   * The location of the image as a URL.
   *   
   * If no transform options are specified, then the original image will be preserved including any pre-applied transforms.
   *   
   * All transformation options are considered "best-effort". Any transformation
   * that the original image type doesn't support will be ignored.
   *   
   * If you need multiple variations of the same image, then you can use [GraphQL
   * aliases](https://graphql.org/learn/queries/#aliases).
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The original width of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
   */
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "Image{altText='" + altText + "', height='" + height + "', id='" + id + "', metafield='" + metafield + "', metafields='" + metafields + "', originalSrc='" + originalSrc + "', src='" + src + "', transformedSrc='" + transformedSrc + "', url='" + url + "', width='" + width + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Image that = (Image) o;
    return Objects.equals(altText, that.altText) &&
        Objects.equals(height, that.height) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(originalSrc, that.originalSrc) &&
        Objects.equals(src, that.src) &&
        Objects.equals(transformedSrc, that.transformedSrc) &&
        Objects.equals(url, that.url) &&
        Objects.equals(width, that.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altText, height, id, metafield, metafields, originalSrc, src, transformedSrc, url, width);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A word or phrase to share the nature or contents of an image.
     */
    private String altText;

    /**
     * The original height of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
     */
    private Integer height;

    /**
     * A unique ID for the image.
     */
    private String id;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The location of the original image as a URL.
     *   
     * If there are any existing transformations in the original source URL, they will remain and not be stripped.
     */
    private String originalSrc;

    /**
     * The location of the image as a URL.
     */
    private String src;

    /**
     * The location of the transformed image as a URL.
     *   
     * All transformation arguments are considered "best-effort". If they can be applied to an image, they will be.
     * Otherwise any transformations which an image type doesn't support will be ignored.
     */
    private String transformedSrc;

    /**
     * The location of the image as a URL.
     *   
     * If no transform options are specified, then the original image will be preserved including any pre-applied transforms.
     *   
     * All transformation options are considered "best-effort". Any transformation
     * that the original image type doesn't support will be ignored.
     *   
     * If you need multiple variations of the same image, then you can use [GraphQL
     * aliases](https://graphql.org/learn/queries/#aliases).
     */
    private String url;

    /**
     * The original width of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
     */
    private Integer width;

    public Image build() {
      Image result = new Image();
      result.altText = this.altText;
      result.height = this.height;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.originalSrc = this.originalSrc;
      result.src = this.src;
      result.transformedSrc = this.transformedSrc;
      result.url = this.url;
      result.width = this.width;
      return result;
    }

    /**
     * A word or phrase to share the nature or contents of an image.
     */
    public Builder altText(String altText) {
      this.altText = altText;
      return this;
    }

    /**
     * The original height of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
     */
    public Builder height(Integer height) {
      this.height = height;
      return this;
    }

    /**
     * A unique ID for the image.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The location of the original image as a URL.
     *   
     * If there are any existing transformations in the original source URL, they will remain and not be stripped.
     */
    public Builder originalSrc(String originalSrc) {
      this.originalSrc = originalSrc;
      return this;
    }

    /**
     * The location of the image as a URL.
     */
    public Builder src(String src) {
      this.src = src;
      return this;
    }

    /**
     * The location of the transformed image as a URL.
     *   
     * All transformation arguments are considered "best-effort". If they can be applied to an image, they will be.
     * Otherwise any transformations which an image type doesn't support will be ignored.
     */
    public Builder transformedSrc(String transformedSrc) {
      this.transformedSrc = transformedSrc;
      return this;
    }

    /**
     * The location of the image as a URL.
     *   
     * If no transform options are specified, then the original image will be preserved including any pre-applied transforms.
     *   
     * All transformation options are considered "best-effort". Any transformation
     * that the original image type doesn't support will be ignored.
     *   
     * If you need multiple variations of the same image, then you can use [GraphQL
     * aliases](https://graphql.org/learn/queries/#aliases).
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * The original width of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
     */
    public Builder width(Integer width) {
      this.width = width;
      return this;
    }
  }
}
