package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create a collection source.
 */
public class CollectionCreateConditionsSourceInput {
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
  private CollectionCreateSourceInclusionInput inclusion;

  /**
   * The exclusion rules for the source.
   */
  private CollectionCreateSourceExclusionInput exclusion;

  /**
   * What granularity this source operates at. Defaults to PRODUCTS.
   */
  private CollectionSourceTargetType targetType = CollectionSourceTargetType.PRODUCTS;

  public CollectionCreateConditionsSourceInput() {
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
  public CollectionCreateSourceInclusionInput getInclusion() {
    return inclusion;
  }

  public void setInclusion(CollectionCreateSourceInclusionInput inclusion) {
    this.inclusion = inclusion;
  }

  /**
   * The exclusion rules for the source.
   */
  public CollectionCreateSourceExclusionInput getExclusion() {
    return exclusion;
  }

  public void setExclusion(CollectionCreateSourceExclusionInput exclusion) {
    this.exclusion = exclusion;
  }

  /**
   * What granularity this source operates at. Defaults to PRODUCTS.
   */
  public CollectionSourceTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(CollectionSourceTargetType targetType) {
    this.targetType = targetType;
  }

  @Override
  public String toString() {
    return "CollectionCreateConditionsSourceInput{title='" + title + "', description='" + description + "', inclusion='" + inclusion + "', exclusion='" + exclusion + "', targetType='" + targetType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionCreateConditionsSourceInput that = (CollectionCreateConditionsSourceInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(description, that.description) &&
        Objects.equals(inclusion, that.inclusion) &&
        Objects.equals(exclusion, that.exclusion) &&
        Objects.equals(targetType, that.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, inclusion, exclusion, targetType);
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
     * The inclusion rules for the source.
     */
    private CollectionCreateSourceInclusionInput inclusion;

    /**
     * The exclusion rules for the source.
     */
    private CollectionCreateSourceExclusionInput exclusion;

    /**
     * What granularity this source operates at. Defaults to PRODUCTS.
     */
    private CollectionSourceTargetType targetType = CollectionSourceTargetType.PRODUCTS;

    public CollectionCreateConditionsSourceInput build() {
      CollectionCreateConditionsSourceInput result = new CollectionCreateConditionsSourceInput();
      result.title = this.title;
      result.description = this.description;
      result.inclusion = this.inclusion;
      result.exclusion = this.exclusion;
      result.targetType = this.targetType;
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
     * The inclusion rules for the source.
     */
    public Builder inclusion(CollectionCreateSourceInclusionInput inclusion) {
      this.inclusion = inclusion;
      return this;
    }

    /**
     * The exclusion rules for the source.
     */
    public Builder exclusion(CollectionCreateSourceExclusionInput exclusion) {
      this.exclusion = exclusion;
      return this;
    }

    /**
     * What granularity this source operates at. Defaults to PRODUCTS.
     */
    public Builder targetType(CollectionSourceTargetType targetType) {
      this.targetType = targetType;
      return this;
    }
  }
}
