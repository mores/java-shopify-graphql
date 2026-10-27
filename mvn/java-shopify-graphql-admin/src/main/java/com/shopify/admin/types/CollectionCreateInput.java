package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create a collection.
 */
public class CollectionCreateInput {
  /**
   * The description of the collection, in HTML format.
   */
  private String descriptionHtml;

  /**
   * A unique human-friendly string for the collection. Automatically generated from the collection's title.
   */
  private String handle;

  /**
   * The image associated with the collection.
   */
  private ImageInput image;

  /**
   * The theme template used when viewing the collection in a store.
   */
  private String templateSuffix;

  /**
   * The order in which the collection's products are sorted.
   */
  private CollectionSortOrder sortOrder;

  /**
   * The title of the collection.
   */
  private String title;

  /**
   * The metafields to associate with the collection.
   */
  private List<MetafieldInput> metafields;

  /**
   * SEO information for the collection.
   */
  private SEOInput seo;

  /**
   * The sources to create for the collection.
   */
  private List<CollectionCreateSourceTargetInput> sources;

  public CollectionCreateInput() {
  }

  /**
   * The description of the collection, in HTML format.
   */
  public String getDescriptionHtml() {
    return descriptionHtml;
  }

  public void setDescriptionHtml(String descriptionHtml) {
    this.descriptionHtml = descriptionHtml;
  }

  /**
   * A unique human-friendly string for the collection. Automatically generated from the collection's title.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The image associated with the collection.
   */
  public ImageInput getImage() {
    return image;
  }

  public void setImage(ImageInput image) {
    this.image = image;
  }

  /**
   * The theme template used when viewing the collection in a store.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  /**
   * The order in which the collection's products are sorted.
   */
  public CollectionSortOrder getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(CollectionSortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }

  /**
   * The title of the collection.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The metafields to associate with the collection.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * SEO information for the collection.
   */
  public SEOInput getSeo() {
    return seo;
  }

  public void setSeo(SEOInput seo) {
    this.seo = seo;
  }

  /**
   * The sources to create for the collection.
   */
  public List<CollectionCreateSourceTargetInput> getSources() {
    return sources;
  }

  public void setSources(List<CollectionCreateSourceTargetInput> sources) {
    this.sources = sources;
  }

  @Override
  public String toString() {
    return "CollectionCreateInput{descriptionHtml='" + descriptionHtml + "', handle='" + handle + "', image='" + image + "', templateSuffix='" + templateSuffix + "', sortOrder='" + sortOrder + "', title='" + title + "', metafields='" + metafields + "', seo='" + seo + "', sources='" + sources + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionCreateInput that = (CollectionCreateInput) o;
    return Objects.equals(descriptionHtml, that.descriptionHtml) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(image, that.image) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(sortOrder, that.sortOrder) &&
        Objects.equals(title, that.title) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(sources, that.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionHtml, handle, image, templateSuffix, sortOrder, title, metafields, seo, sources);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The description of the collection, in HTML format.
     */
    private String descriptionHtml;

    /**
     * A unique human-friendly string for the collection. Automatically generated from the collection's title.
     */
    private String handle;

    /**
     * The image associated with the collection.
     */
    private ImageInput image;

    /**
     * The theme template used when viewing the collection in a store.
     */
    private String templateSuffix;

    /**
     * The order in which the collection's products are sorted.
     */
    private CollectionSortOrder sortOrder;

    /**
     * The title of the collection.
     */
    private String title;

    /**
     * The metafields to associate with the collection.
     */
    private List<MetafieldInput> metafields;

    /**
     * SEO information for the collection.
     */
    private SEOInput seo;

    /**
     * The sources to create for the collection.
     */
    private List<CollectionCreateSourceTargetInput> sources;

    public CollectionCreateInput build() {
      CollectionCreateInput result = new CollectionCreateInput();
      result.descriptionHtml = this.descriptionHtml;
      result.handle = this.handle;
      result.image = this.image;
      result.templateSuffix = this.templateSuffix;
      result.sortOrder = this.sortOrder;
      result.title = this.title;
      result.metafields = this.metafields;
      result.seo = this.seo;
      result.sources = this.sources;
      return result;
    }

    /**
     * The description of the collection, in HTML format.
     */
    public Builder descriptionHtml(String descriptionHtml) {
      this.descriptionHtml = descriptionHtml;
      return this;
    }

    /**
     * A unique human-friendly string for the collection. Automatically generated from the collection's title.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The image associated with the collection.
     */
    public Builder image(ImageInput image) {
      this.image = image;
      return this;
    }

    /**
     * The theme template used when viewing the collection in a store.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    /**
     * The order in which the collection's products are sorted.
     */
    public Builder sortOrder(CollectionSortOrder sortOrder) {
      this.sortOrder = sortOrder;
      return this;
    }

    /**
     * The title of the collection.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The metafields to associate with the collection.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * SEO information for the collection.
     */
    public Builder seo(SEOInput seo) {
      this.seo = seo;
      return this;
    }

    /**
     * The sources to create for the collection.
     */
    public Builder sources(List<CollectionCreateSourceTargetInput> sources) {
      this.sources = sources;
      return this;
    }
  }
}
