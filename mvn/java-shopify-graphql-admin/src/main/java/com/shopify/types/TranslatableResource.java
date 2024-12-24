package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class TranslatableResource {
  
  private TranslatableResourceConnection nestedTranslatableResources;

  
  private String resourceId;

  
  private List<TranslatableContent> translatableContent;

  
  private List<Translation> translations;

  public TranslatableResource() {
  }

  
  public TranslatableResourceConnection getNestedTranslatableResources() {
    return nestedTranslatableResources;
  }

  public void setNestedTranslatableResources(
      TranslatableResourceConnection nestedTranslatableResources) {
    this.nestedTranslatableResources = nestedTranslatableResources;
  }

  
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  
  public List<TranslatableContent> getTranslatableContent() {
    return translatableContent;
  }

  public void setTranslatableContent(List<TranslatableContent> translatableContent) {
    this.translatableContent = translatableContent;
  }

  
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
    
    private TranslatableResourceConnection nestedTranslatableResources;

    
    private String resourceId;

    
    private List<TranslatableContent> translatableContent;

    
    private List<Translation> translations;

    public TranslatableResource build() {
      TranslatableResource result = new TranslatableResource();
      result.nestedTranslatableResources = this.nestedTranslatableResources;
      result.resourceId = this.resourceId;
      result.translatableContent = this.translatableContent;
      result.translations = this.translations;
      return result;
    }

    
    public Builder nestedTranslatableResources(
        TranslatableResourceConnection nestedTranslatableResources) {
      this.nestedTranslatableResources = nestedTranslatableResources;
      return this;
    }

    
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    
    public Builder translatableContent(List<TranslatableContent> translatableContent) {
      this.translatableContent = translatableContent;
      return this;
    }

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
