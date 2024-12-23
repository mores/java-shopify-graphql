package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A resource that has translatable fields.
 */
public class TranslatableResource {
  /**
   * Nested translatable resources under the current resource.
   */
  private TranslatableResourceConnection nestedTranslatableResources;

  /**
   * GID of the resource.
   */
  private String resourceId;

  /**
   * Translatable content.
   */
  private List<TranslatableContent> translatableContent;

  /**
   * Translatable content translations (includes unpublished locales).
   */
  private List<Translation> translations;

  public TranslatableResource() {
  }

  /**
   * Nested translatable resources under the current resource.
   */
  public TranslatableResourceConnection getNestedTranslatableResources() {
    return nestedTranslatableResources;
  }

  public void setNestedTranslatableResources(
      TranslatableResourceConnection nestedTranslatableResources) {
    this.nestedTranslatableResources = nestedTranslatableResources;
  }

  /**
   * GID of the resource.
   */
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * Translatable content.
   */
  public List<TranslatableContent> getTranslatableContent() {
    return translatableContent;
  }

  public void setTranslatableContent(List<TranslatableContent> translatableContent) {
    this.translatableContent = translatableContent;
  }

  /**
   * Translatable content translations (includes unpublished locales).
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "TranslatableResource{nestedTranslatableResources='" + nestedTranslatableResources + "', resourceId='" + resourceId + "', translatableContent='" + translatableContent + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TranslatableResource that = (TranslatableResource) o;
    return Objects.equals(nestedTranslatableResources, that.nestedTranslatableResources) &&
        Objects.equals(resourceId, that.resourceId) &&
        Objects.equals(translatableContent, that.translatableContent) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nestedTranslatableResources, resourceId, translatableContent, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Nested translatable resources under the current resource.
     */
    private TranslatableResourceConnection nestedTranslatableResources;

    /**
     * GID of the resource.
     */
    private String resourceId;

    /**
     * Translatable content.
     */
    private List<TranslatableContent> translatableContent;

    /**
     * Translatable content translations (includes unpublished locales).
     */
    private List<Translation> translations;

    public TranslatableResource build() {
      TranslatableResource result = new TranslatableResource();
      result.nestedTranslatableResources = this.nestedTranslatableResources;
      result.resourceId = this.resourceId;
      result.translatableContent = this.translatableContent;
      result.translations = this.translations;
      return result;
    }

    /**
     * Nested translatable resources under the current resource.
     */
    public Builder nestedTranslatableResources(
        TranslatableResourceConnection nestedTranslatableResources) {
      this.nestedTranslatableResources = nestedTranslatableResources;
      return this;
    }

    /**
     * GID of the resource.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * Translatable content.
     */
    public Builder translatableContent(List<TranslatableContent> translatableContent) {
      this.translatableContent = translatableContent;
      return this;
    }

    /**
     * Translatable content translations (includes unpublished locales).
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
