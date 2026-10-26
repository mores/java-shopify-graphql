package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a shareable collection source.
 */
public class CollectionUpdateConditionsSourceInput {
  /**
   * The ID of the source to update.
   */
  private String id;

  /**
   * The title of the source.
   */
  private String title;

  /**
   * An optional description of the source.
   */
  private String description;

  /**
   * The inclusion rules for the source.
   */
  private CollectionUpdateSourceInclusionInput inclusion;

  /**
   * The exclusion rules for the source.
   */
  private CollectionUpdateSourceExclusionInput exclusion;

  public CollectionUpdateConditionsSourceInput() {
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
   * The inclusion rules for the source.
   */
  public CollectionUpdateSourceInclusionInput getInclusion() {
    return inclusion;
  }

  public void setInclusion(CollectionUpdateSourceInclusionInput inclusion) {
    this.inclusion = inclusion;
  }

  /**
   * The exclusion rules for the source.
   */
  public CollectionUpdateSourceExclusionInput getExclusion() {
    return exclusion;
  }

  public void setExclusion(CollectionUpdateSourceExclusionInput exclusion) {
    this.exclusion = exclusion;
  }

  @Override
  public String toString() {
    return "CollectionUpdateConditionsSourceInput{id='" + id + "', title='" + title + "', description='" + description + "', inclusion='" + inclusion + "', exclusion='" + exclusion + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionUpdateConditionsSourceInput that = (CollectionUpdateConditionsSourceInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(title, that.title) &&
        Objects.equals(description, that.description) &&
        Objects.equals(inclusion, that.inclusion) &&
        Objects.equals(exclusion, that.exclusion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, inclusion, exclusion);
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
     * The title of the source.
     */
    private String title;

    /**
     * An optional description of the source.
     */
    private String description;

    /**
     * The inclusion rules for the source.
     */
    private CollectionUpdateSourceInclusionInput inclusion;

    /**
     * The exclusion rules for the source.
     */
    private CollectionUpdateSourceExclusionInput exclusion;

    public CollectionUpdateConditionsSourceInput build() {
      CollectionUpdateConditionsSourceInput result = new CollectionUpdateConditionsSourceInput();
      result.id = this.id;
      result.title = this.title;
      result.description = this.description;
      result.inclusion = this.inclusion;
      result.exclusion = this.exclusion;
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
     * The inclusion rules for the source.
     */
    public Builder inclusion(CollectionUpdateSourceInclusionInput inclusion) {
      this.inclusion = inclusion;
      return this;
    }

    /**
     * The exclusion rules for the source.
     */
    public Builder exclusion(CollectionUpdateSourceExclusionInput exclusion) {
      this.exclusion = exclusion;
      return this;
    }
  }
}
