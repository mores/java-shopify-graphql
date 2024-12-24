package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OnlineStoreTheme implements com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  
  private OffsetDateTime createdAt;

  
  private OnlineStoreThemeFileConnection files;

  
  private String id;

  
  private String name;

  
  private String prefix;

  
  private boolean processing;

  
  private boolean processingFailed;

  
  private ThemeRole role;

  
  private Integer themeStoreId;

  
  private List<Translation> translations;

  
  private OffsetDateTime updatedAt;

  public OnlineStoreTheme() {
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public OnlineStoreThemeFileConnection getFiles() {
    return files;
  }

  public void setFiles(OnlineStoreThemeFileConnection files) {
    this.files = files;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  
  public boolean getProcessing() {
    return processing;
  }

  public void setProcessing(boolean processing) {
    this.processing = processing;
  }

  
  public boolean getProcessingFailed() {
    return processingFailed;
  }

  public void setProcessingFailed(boolean processingFailed) {
    this.processingFailed = processingFailed;
  }

  
  public ThemeRole getRole() {
    return role;
  }

  public void setRole(ThemeRole role) {
    this.role = role;
  }

  
  public Integer getThemeStoreId() {
    return themeStoreId;
  }

  public void setThemeStoreId(Integer themeStoreId) {
    this.themeStoreId = themeStoreId;
  }

  
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "OnlineStoreTheme{createdAt='" + createdAt + "', files='" + files + "', id='" + id + "', name='" + name + "', prefix='" + prefix + "', processing='" + processing + "', processingFailed='" + processingFailed + "', role='" + role + "', themeStoreId='" + themeStoreId + "', translations='" + translations + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreTheme that = (OnlineStoreTheme) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(files, that.files) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(prefix, that.prefix) &&
        processing == that.processing &&
        processingFailed == that.processingFailed &&
        Objects.equals(role, that.role) &&
        Objects.equals(themeStoreId, that.themeStoreId) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, files, id, name, prefix, processing, processingFailed, role, themeStoreId, translations, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime createdAt;

    
    private OnlineStoreThemeFileConnection files;

    
    private String id;

    
    private String name;

    
    private String prefix;

    
    private boolean processing;

    
    private boolean processingFailed;

    
    private ThemeRole role;

    
    private Integer themeStoreId;

    
    private List<Translation> translations;

    
    private OffsetDateTime updatedAt;

    public OnlineStoreTheme build() {
      OnlineStoreTheme result = new OnlineStoreTheme();
      result.createdAt = this.createdAt;
      result.files = this.files;
      result.id = this.id;
      result.name = this.name;
      result.prefix = this.prefix;
      result.processing = this.processing;
      result.processingFailed = this.processingFailed;
      result.role = this.role;
      result.themeStoreId = this.themeStoreId;
      result.translations = this.translations;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder files(OnlineStoreThemeFileConnection files) {
      this.files = files;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }

    
    public Builder processing(boolean processing) {
      this.processing = processing;
      return this;
    }

    
    public Builder processingFailed(boolean processingFailed) {
      this.processingFailed = processingFailed;
      return this;
    }

    
    public Builder role(ThemeRole role) {
      this.role = role;
      return this;
    }

    
    public Builder themeStoreId(Integer themeStoreId) {
      this.themeStoreId = themeStoreId;
      return this;
    }

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
