package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a sub-collection source — a source whose
 * membership comes from one or more referenced collections.
 */
public class CollectionUpdateSubCollectionsSourceInput {
  /**
   * The ID of the source to update.
   */
  private String id;

  /**
   * The global IDs of the sub-collections whose products supply this source. When
   * provided, it replaces the source's current referenced collections.
   */
  private List<String> collectionIds;

  /**
   * The title of the source.
   */
  private String title;

  /**
   * An optional description of the source.
   */
  private String description;

  public CollectionUpdateSubCollectionsSourceInput() {
  }

  /**
   * The ID of the source to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The global IDs of the sub-collections whose products supply this source. When
   * provided, it replaces the source's current referenced collections.
   */
  public List<String> getCollectionIds() {
    return collectionIds;
  }

  public void setCollectionIds(List<String> collectionIds) {
    this.collectionIds = collectionIds;
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

  /**
   * An optional description of the source.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "CollectionUpdateSubCollectionsSourceInput{id='" + id + "', collectionIds='" + collectionIds + "', title='" + title + "', description='" + description + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionUpdateSubCollectionsSourceInput that = (CollectionUpdateSubCollectionsSourceInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(collectionIds, that.collectionIds) &&
        Objects.equals(title, that.title) &&
        Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, collectionIds, title, description);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the source to update.
     */
    private String id;

    /**
     * The global IDs of the sub-collections whose products supply this source. When
     * provided, it replaces the source's current referenced collections.
     */
    private List<String> collectionIds;

    /**
     * The title of the source.
     */
    private String title;

    /**
     * An optional description of the source.
     */
    private String description;

    public CollectionUpdateSubCollectionsSourceInput build() {
      CollectionUpdateSubCollectionsSourceInput result = new CollectionUpdateSubCollectionsSourceInput();
      result.id = this.id;
      result.collectionIds = this.collectionIds;
      result.title = this.title;
      result.description = this.description;
      return result;
    }

    /**
     * The ID of the source to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The global IDs of the sub-collections whose products supply this source. When
     * provided, it replaces the source's current referenced collections.
     */
    public Builder collectionIds(List<String> collectionIds) {
      this.collectionIds = collectionIds;
      return this;
    }

    /**
     * The title of the source.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * An optional description of the source.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }
}
