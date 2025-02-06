package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A segment and its corresponding saved search. 
 * For example, you can use `SegmentMigration` to retrieve the segment ID that corresponds to a saved search ID.
 */
public class SegmentMigration {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The ID of the saved search.
   */
  private String savedSearchId;

  /**
   * The ID of the segment.
   */
  private String segmentId;

  public SegmentMigration() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the saved search.
   */
  public String getSavedSearchId() {
    return savedSearchId;
  }

  public void setSavedSearchId(String savedSearchId) {
    this.savedSearchId = savedSearchId;
  }

  /**
   * The ID of the segment.
   */
  public String getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }

  @Override
  public String toString() {
    return "SegmentMigration{id='" + id + "', savedSearchId='" + savedSearchId + "', segmentId='" + segmentId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentMigration that = (SegmentMigration) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(savedSearchId, that.savedSearchId) &&
        Objects.equals(segmentId, that.segmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, savedSearchId, segmentId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The ID of the saved search.
     */
    private String savedSearchId;

    /**
     * The ID of the segment.
     */
    private String segmentId;

    public SegmentMigration build() {
      SegmentMigration result = new SegmentMigration();
      result.id = this.id;
      result.savedSearchId = this.savedSearchId;
      result.segmentId = this.segmentId;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the saved search.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      return this;
    }

    /**
     * The ID of the segment.
     */
    public Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      return this;
    }
  }
}
