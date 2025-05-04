package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create a collection.
 */
public class CollectionInput {
  /**
   * The description of the collection, in HTML format.
   */
  private String descriptionHtml;

  /**
   * A unique human-friendly string for the collection. Automatically generated from the collection's title.
   */
  private String handle;

  /**
   * Specifies the collection to update or create a new collection if absent. Required for updating a collection.
   */
  private String id;

  /**
   * The image associated with the collection.
   */
  private ImageInput image;

  /**
   * Initial list of collection products. Only valid with `collectionCreate` and without rules.
   */
  private List<String> products;

  /**
   * The rules used to assign products to the collection.
   */
  private CollectionRuleSetInput ruleSet;

  /**
   * The theme template used when viewing the collection in a store.
   */
  private String templateSuffix;

  /**
   * The order in which the collection's products are sorted.
   */
  private CollectionSortOrder sortOrder;

  /**
   * The title of the collection. Required for creating a new collection.
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
   * Indicates whether a redirect is required after a new handle has been provided.
   * If true, then the old handle is redirected to the new one automatically.
   */
  private Boolean redirectNewHandle = false;

  public CollectionInput() {
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
   * Specifies the collection to update or create a new collection if absent. Required for updating a collection.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * Initial list of collection products. Only valid with `collectionCreate` and without rules.
   */
  public List<String> getProducts() {
    return products;
  }

  public void setProducts(List<String> products) {
    this.products = products;
  }

  /**
   * The rules used to assign products to the collection.
   */
  public CollectionRuleSetInput getRuleSet() {
    return ruleSet;
  }

  public void setRuleSet(CollectionRuleSetInput ruleSet) {
    this.ruleSet = ruleSet;
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
   * The title of the collection. Required for creating a new collection.
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
   * Indicates whether a redirect is required after a new handle has been provided.
   * If true, then the old handle is redirected to the new one automatically.
   */
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
  }

  @Override
  public String toString() {
    return "CollectionInput{descriptionHtml='" + descriptionHtml + "', handle='" + handle + "', id='" + id + "', image='" + image + "', products='" + products + "', ruleSet='" + ruleSet + "', templateSuffix='" + templateSuffix + "', sortOrder='" + sortOrder + "', title='" + title + "', metafields='" + metafields + "', seo='" + seo + "', redirectNewHandle='" + redirectNewHandle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionInput that = (CollectionInput) o;
    return Objects.equals(descriptionHtml, that.descriptionHtml) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(products, that.products) &&
        Objects.equals(ruleSet, that.ruleSet) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(sortOrder, that.sortOrder) &&
        Objects.equals(title, that.title) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionHtml, handle, id, image, products, ruleSet, templateSuffix, sortOrder, title, metafields, seo, redirectNewHandle);
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
     * Specifies the collection to update or create a new collection if absent. Required for updating a collection.
     */
    private String id;

    /**
     * The image associated with the collection.
     */
    private ImageInput image;

    /**
     * Initial list of collection products. Only valid with `collectionCreate` and without rules.
     */
    private List<String> products;

    /**
     * The rules used to assign products to the collection.
     */
    private CollectionRuleSetInput ruleSet;

    /**
     * The theme template used when viewing the collection in a store.
     */
    private String templateSuffix;

    /**
     * The order in which the collection's products are sorted.
     */
    private CollectionSortOrder sortOrder;

    /**
     * The title of the collection. Required for creating a new collection.
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
     * Indicates whether a redirect is required after a new handle has been provided.
     * If true, then the old handle is redirected to the new one automatically.
     */
    private Boolean redirectNewHandle = false;

    public CollectionInput build() {
      CollectionInput result = new CollectionInput();
      result.descriptionHtml = this.descriptionHtml;
      result.handle = this.handle;
      result.id = this.id;
      result.image = this.image;
      result.products = this.products;
      result.ruleSet = this.ruleSet;
      result.templateSuffix = this.templateSuffix;
      result.sortOrder = this.sortOrder;
      result.title = this.title;
      result.metafields = this.metafields;
      result.seo = this.seo;
      result.redirectNewHandle = this.redirectNewHandle;
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
     * Specifies the collection to update or create a new collection if absent. Required for updating a collection.
     */
    public Builder id(String id) {
      this.id = id;
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
     * Initial list of collection products. Only valid with `collectionCreate` and without rules.
     */
    public Builder products(List<String> products) {
      this.products = products;
      return this;
    }

    /**
     * The rules used to assign products to the collection.
     */
    public Builder ruleSet(CollectionRuleSetInput ruleSet) {
      this.ruleSet = ruleSet;
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
     * The title of the collection. Required for creating a new collection.
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
     * Indicates whether a redirect is required after a new handle has been provided.
     * If true, then the old handle is redirected to the new one automatically.
     */
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }
  }
}
