package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for adding a source to a collection — provide exactly one field
 * that represents the type of source to create.
 */
public class CollectionCreateSourceTargetInput {
  /**
   * Net new conditions-based source (target_type products or variants) to create — must belong to one collection.
   */
  private CollectionCreateConditionsSourceInput source;

  /**
   * Net new sub-collection source (target_type collections) whose membership comes from one or more referenced collections.
   */
  private CollectionCreateSubCollectionsSourceInput subCollections;

  /**
   * An existing shareable source to link to the collection.
   */
  private CollectionShareableSourceInput shareableSource;

  public CollectionCreateSourceTargetInput() {
  }

  /**
   * Net new conditions-based source (target_type products or variants) to create — must belong to one collection.
   */
  public CollectionCreateConditionsSourceInput getSource() {
    return source;
  }

  public void setSource(CollectionCreateConditionsSourceInput source) {
    this.source = source;
  }

  /**
   * Net new sub-collection source (target_type collections) whose membership comes from one or more referenced collections.
   */
  public CollectionCreateSubCollectionsSourceInput getSubCollections() {
    return subCollections;
  }

  public void setSubCollections(CollectionCreateSubCollectionsSourceInput subCollections) {
    this.subCollections = subCollections;
  }

  /**
   * An existing shareable source to link to the collection.
   */
  public CollectionShareableSourceInput getShareableSource() {
    return shareableSource;
  }

  public void setShareableSource(CollectionShareableSourceInput shareableSource) {
    this.shareableSource = shareableSource;
  }

  @Override
  public String toString() {
    return "CollectionCreateSourceTargetInput{source='" + source + "', subCollections='" + subCollections + "', shareableSource='" + shareableSource + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionCreateSourceTargetInput that = (CollectionCreateSourceTargetInput) o;
    return Objects.equals(source, that.source) &&
        Objects.equals(subCollections, that.subCollections) &&
        Objects.equals(shareableSource, that.shareableSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, subCollections, shareableSource);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Net new conditions-based source (target_type products or variants) to create — must belong to one collection.
     */
    private CollectionCreateConditionsSourceInput source;

    /**
     * Net new sub-collection source (target_type collections) whose membership comes from one or more referenced collections.
     */
    private CollectionCreateSubCollectionsSourceInput subCollections;

    /**
     * An existing shareable source to link to the collection.
     */
    private CollectionShareableSourceInput shareableSource;

    public CollectionCreateSourceTargetInput build() {
      CollectionCreateSourceTargetInput result = new CollectionCreateSourceTargetInput();
      result.source = this.source;
      result.subCollections = this.subCollections;
      result.shareableSource = this.shareableSource;
      return result;
    }

    /**
     * Net new conditions-based source (target_type products or variants) to create — must belong to one collection.
     */
    public Builder source(CollectionCreateConditionsSourceInput source) {
      this.source = source;
      return this;
    }

    /**
     * Net new sub-collection source (target_type collections) whose membership comes from one or more referenced collections.
     */
    public Builder subCollections(CollectionCreateSubCollectionsSourceInput subCollections) {
      this.subCollections = subCollections;
      return this;
    }

    /**
     * An existing shareable source to link to the collection.
     */
    public Builder shareableSource(CollectionShareableSourceInput shareableSource) {
      this.shareableSource = shareableSource;
      return this;
    }
  }
}
