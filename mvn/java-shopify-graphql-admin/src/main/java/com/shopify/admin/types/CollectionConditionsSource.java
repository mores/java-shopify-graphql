package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A collection source that uses conditions and selections to determine which products are included.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionConditionsSource implements com.shopify.admin.types.CollectionSource, com.shopify.admin.types.Node {
  /**
   * The app that created this source, if applicable. In the case of shareable
   * sources, this app manages this source's conditions and selections exclusively.
   */
  private App app;

  /**
   * An optional description of the source.
   */
  private String description;

  /**
   * The rules and selections for excluding products from the collection.
   */
  private CollectionSourceExclusion exclusion;

  /**
   * The unique identifier for this source.
   */
  private String id;

  /**
   * The rules and selections for including products in the collection.
   */
  private CollectionSourceInclusion inclusion;

  /**
   * The products that are members of this source: products matched by the source's inclusion
   * conditions and manual selections, with the source's exclusion conditions, excluded
   * collections, and manual exclusions removed.
   */
  private ProductConnection products;

  /**
   * Whether this source can be shared across multiple collections.
   */
  private boolean shareable;

  /**
   * Whether conditions match products or individual variants.
   */
  private CollectionSourceTargetType targetType;

  /**
   * The title of the source.
   */
  private String title;

  public CollectionConditionsSource() {
  }

  /**
   * The app that created this source, if applicable. In the case of shareable
   * sources, this app manages this source's conditions and selections exclusively.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * An optional description of the source.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The rules and selections for excluding products from the collection.
   */
  public CollectionSourceExclusion getExclusion() {
    return exclusion;
  }

  public void setExclusion(CollectionSourceExclusion exclusion) {
    this.exclusion = exclusion;
  }

  /**
   * The unique identifier for this source.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The rules and selections for including products in the collection.
   */
  public CollectionSourceInclusion getInclusion() {
    return inclusion;
  }

  public void setInclusion(CollectionSourceInclusion inclusion) {
    this.inclusion = inclusion;
  }

  /**
   * The products that are members of this source: products matched by the source's inclusion
   * conditions and manual selections, with the source's exclusion conditions, excluded
   * collections, and manual exclusions removed.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  /**
   * Whether this source can be shared across multiple collections.
   */
  public boolean getShareable() {
    return shareable;
  }

  public void setShareable(boolean shareable) {
    this.shareable = shareable;
  }

  /**
   * Whether conditions match products or individual variants.
   */
  public CollectionSourceTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(CollectionSourceTargetType targetType) {
    this.targetType = targetType;
  }

  /**
   * The title of the source.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "CollectionConditionsSource{app='" + app + "', description='" + description + "', exclusion='" + exclusion + "', id='" + id + "', inclusion='" + inclusion + "', products='" + products + "', shareable='" + shareable + "', targetType='" + targetType + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionConditionsSource that = (CollectionConditionsSource) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(description, that.description) &&
        Objects.equals(exclusion, that.exclusion) &&
        Objects.equals(id, that.id) &&
        Objects.equals(inclusion, that.inclusion) &&
        Objects.equals(products, that.products) &&
        shareable == that.shareable &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, description, exclusion, id, inclusion, products, shareable, targetType, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The app that created this source, if applicable. In the case of shareable
     * sources, this app manages this source's conditions and selections exclusively.
     */
    private App app;

    /**
     * An optional description of the source.
     */
    private String description;

    /**
     * The rules and selections for excluding products from the collection.
     */
    private CollectionSourceExclusion exclusion;

    /**
     * The unique identifier for this source.
     */
    private String id;

    /**
     * The rules and selections for including products in the collection.
     */
    private CollectionSourceInclusion inclusion;

    /**
     * The products that are members of this source: products matched by the source's inclusion
     * conditions and manual selections, with the source's exclusion conditions, excluded
     * collections, and manual exclusions removed.
     */
    private ProductConnection products;

    /**
     * Whether this source can be shared across multiple collections.
     */
    private boolean shareable;

    /**
     * Whether conditions match products or individual variants.
     */
    private CollectionSourceTargetType targetType;

    /**
     * The title of the source.
     */
    private String title;

    public CollectionConditionsSource build() {
      CollectionConditionsSource result = new CollectionConditionsSource();
      result.app = this.app;
      result.description = this.description;
      result.exclusion = this.exclusion;
      result.id = this.id;
      result.inclusion = this.inclusion;
      result.products = this.products;
      result.shareable = this.shareable;
      result.targetType = this.targetType;
      result.title = this.title;
      return result;
    }

    /**
     * The app that created this source, if applicable. In the case of shareable
     * sources, this app manages this source's conditions and selections exclusively.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * An optional description of the source.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The rules and selections for excluding products from the collection.
     */
    public Builder exclusion(CollectionSourceExclusion exclusion) {
      this.exclusion = exclusion;
      return this;
    }

    /**
     * The unique identifier for this source.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The rules and selections for including products in the collection.
     */
    public Builder inclusion(CollectionSourceInclusion inclusion) {
      this.inclusion = inclusion;
      return this;
    }

    /**
     * The products that are members of this source: products matched by the source's inclusion
     * conditions and manual selections, with the source's exclusion conditions, excluded
     * collections, and manual exclusions removed.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    /**
     * Whether this source can be shared across multiple collections.
     */
    public Builder shareable(boolean shareable) {
      this.shareable = shareable;
      return this;
    }

    /**
     * Whether conditions match products or individual variants.
     */
    public Builder targetType(CollectionSourceTargetType targetType) {
      this.targetType = targetType;
      return this;
    }

    /**
     * The title of the source.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
