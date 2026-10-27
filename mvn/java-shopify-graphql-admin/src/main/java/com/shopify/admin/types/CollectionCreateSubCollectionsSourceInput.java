package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create a sub-collection source — a source whose
 * membership comes from one or more referenced collections.
 */
public class CollectionCreateSubCollectionsSourceInput {
  /**
   * The title of the source.
   */
  private String title;

  /**
   * An optional description of the source.
   */
  private String description;

  /**
   * The global IDs of the sub-collections whose products supply this source.
   */
  private List<String> collectionIds;

  public CollectionCreateSubCollectionsSourceInput() {
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

  /**
   * The global IDs of the sub-collections whose products supply this source.
   */
  public List<String> getCollectionIds() {
    return collectionIds;
  }

  public void setCollectionIds(List<String> collectionIds) {
    this.collectionIds = collectionIds;
  }

  @Override
  public String toString() {
    return "CollectionCreateSubCollectionsSourceInput{title='" + title + "', description='" + description + "', collectionIds='" + collectionIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionCreateSubCollectionsSourceInput that = (CollectionCreateSubCollectionsSourceInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(description, that.description) &&
        Objects.equals(collectionIds, that.collectionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, collectionIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The title of the source.
     */
    private String title;

    /**
     * An optional description of the source.
     */
    private String description;

    /**
     * The global IDs of the sub-collections whose products supply this source.
     */
    private List<String> collectionIds;

    public CollectionCreateSubCollectionsSourceInput build() {
      CollectionCreateSubCollectionsSourceInput result = new CollectionCreateSubCollectionsSourceInput();
      result.title = this.title;
      result.description = this.description;
      result.collectionIds = this.collectionIds;
      return result;
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

    /**
     * The global IDs of the sub-collections whose products supply this source.
     */
    public Builder collectionIds(List<String> collectionIds) {
      this.collectionIds = collectionIds;
      return this;
    }
  }
}
