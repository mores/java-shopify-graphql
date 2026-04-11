package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for duplicating a collection.
 */
public class CollectionDuplicateInput {
  /**
   * The ID of the collection to be duplicated.
   */
  private String collectionId;

  /**
   * The new title of the collection.
   */
  private String newTitle;

  /**
   * Whether to duplicate the collection's publications (channel availability).
   * When `true` (default), the duplicated collection will be published to the same
   * channels as the original. When `false`, the duplicated collection will be
   * unpublished on all channels.
   */
  private Boolean copyPublications = true;

  public CollectionDuplicateInput() {
  }

  /**
   * The ID of the collection to be duplicated.
   */
  public String getCollectionId() {
    return collectionId;
  }

  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }

  /**
   * The new title of the collection.
   */
  public String getNewTitle() {
    return newTitle;
  }

  public void setNewTitle(String newTitle) {
    this.newTitle = newTitle;
  }

  /**
   * Whether to duplicate the collection's publications (channel availability).
   * When `true` (default), the duplicated collection will be published to the same
   * channels as the original. When `false`, the duplicated collection will be
   * unpublished on all channels.
   */
  public Boolean getCopyPublications() {
    return copyPublications;
  }

  public void setCopyPublications(Boolean copyPublications) {
    this.copyPublications = copyPublications;
  }

  @Override
  public String toString() {
    return "CollectionDuplicateInput{collectionId='" + collectionId + "', newTitle='" + newTitle + "', copyPublications='" + copyPublications + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionDuplicateInput that = (CollectionDuplicateInput) o;
    return Objects.equals(collectionId, that.collectionId) &&
        Objects.equals(newTitle, that.newTitle) &&
        Objects.equals(copyPublications, that.copyPublications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, newTitle, copyPublications);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the collection to be duplicated.
     */
    private String collectionId;

    /**
     * The new title of the collection.
     */
    private String newTitle;

    /**
     * Whether to duplicate the collection's publications (channel availability).
     * When `true` (default), the duplicated collection will be published to the same
     * channels as the original. When `false`, the duplicated collection will be
     * unpublished on all channels.
     */
    private Boolean copyPublications = true;

    public CollectionDuplicateInput build() {
      CollectionDuplicateInput result = new CollectionDuplicateInput();
      result.collectionId = this.collectionId;
      result.newTitle = this.newTitle;
      result.copyPublications = this.copyPublications;
      return result;
    }

    /**
     * The ID of the collection to be duplicated.
     */
    public Builder collectionId(String collectionId) {
      this.collectionId = collectionId;
      return this;
    }

    /**
     * The new title of the collection.
     */
    public Builder newTitle(String newTitle) {
      this.newTitle = newTitle;
      return this;
    }

    /**
     * Whether to duplicate the collection's publications (channel availability).
     * When `true` (default), the duplicated collection will be published to the same
     * channels as the original. When `false`, the duplicated collection will be
     * unpublished on all channels.
     */
    public Builder copyPublications(Boolean copyPublications) {
      this.copyPublications = copyPublications;
      return this;
    }
  }
}
