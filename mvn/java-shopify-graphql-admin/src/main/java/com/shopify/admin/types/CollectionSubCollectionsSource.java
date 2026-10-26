package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A collection source whose membership comes from one or more referenced collections (sub-collections).
 *
 * Sub-collection sources are always non-shareable. Sharing a sub-collection source across owners is not
 * supported because the collection references are owner-bound.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSubCollectionsSource implements com.shopify.admin.types.CollectionSource, com.shopify.admin.types.Node {
  /**
   * The app that created this source, if applicable. In the case of shareable
   * sources, this app manages this source's conditions and selections exclusively.
   */
  private App app;

  /**
   * The referenced sub-collections that supply products to this source.
   */
  private List<Collection> collections;

  /**
   * An optional description of the source.
   */
  private String description;

  /**
   * The unique identifier for this source.
   */
  private String id;

  /**
   * The title of the source.
   */
  private String title;

  public CollectionSubCollectionsSource() {
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
   * The referenced sub-collections that supply products to this source.
   */
  public List<Collection> getCollections() {
    return collections;
  }

  public void setCollections(List<Collection> collections) {
    this.collections = collections;
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
   * The unique identifier for this source.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
    return "CollectionSubCollectionsSource{app='" + app + "', collections='" + collections + "', description='" + description + "', id='" + id + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSubCollectionsSource that = (CollectionSubCollectionsSource) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, collections, description, id, title);
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
     * The referenced sub-collections that supply products to this source.
     */
    private List<Collection> collections;

    /**
     * An optional description of the source.
     */
    private String description;

    /**
     * The unique identifier for this source.
     */
    private String id;

    /**
     * The title of the source.
     */
    private String title;

    public CollectionSubCollectionsSource build() {
      CollectionSubCollectionsSource result = new CollectionSubCollectionsSource();
      result.app = this.app;
      result.collections = this.collections;
      result.description = this.description;
      result.id = this.id;
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
     * The referenced sub-collections that supply products to this source.
     */
    public Builder collections(List<Collection> collections) {
      this.collections = collections;
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
     * The unique identifier for this source.
     */
    public Builder id(String id) {
      this.id = id;
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
