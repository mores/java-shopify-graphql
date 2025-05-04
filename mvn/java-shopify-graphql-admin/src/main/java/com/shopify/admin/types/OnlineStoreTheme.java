package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A theme for display on the storefront.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OnlineStoreTheme implements com.shopify.admin.types.HasPublishedTranslations, com.shopify.admin.types.Node {
  /**
   * The date and time when the theme was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The files in the theme.
   */
  private OnlineStoreThemeFileConnection files;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the theme, set by the merchant.
   */
  private String name;

  /**
   * The prefix of the theme.
   */
  private String prefix;

  /**
   * Whether the theme is processing.
   */
  private boolean processing;

  /**
   * Whether the theme processing failed.
   */
  private boolean processingFailed;

  /**
   * The role of the theme.
   */
  private ThemeRole role;

  /**
   * The theme store ID.
   */
  private Integer themeStoreId;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The date and time when the theme was last updated.
   */
  private OffsetDateTime updatedAt;

  public OnlineStoreTheme() {
  }

  /**
   * The date and time when the theme was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The files in the theme.
   */
  public OnlineStoreThemeFileConnection getFiles() {
    return files;
  }

  public void setFiles(OnlineStoreThemeFileConnection files) {
    this.files = files;
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
   * The name of the theme, set by the merchant.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The prefix of the theme.
   */
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  /**
   * Whether the theme is processing.
   */
  public boolean getProcessing() {
    return processing;
  }

  public void setProcessing(boolean processing) {
    this.processing = processing;
  }

  /**
   * Whether the theme processing failed.
   */
  public boolean getProcessingFailed() {
    return processingFailed;
  }

  public void setProcessingFailed(boolean processingFailed) {
    this.processingFailed = processingFailed;
  }

  /**
   * The role of the theme.
   */
  public ThemeRole getRole() {
    return role;
  }

  public void setRole(ThemeRole role) {
    this.role = role;
  }

  /**
   * The theme store ID.
   */
  public Integer getThemeStoreId() {
    return themeStoreId;
  }

  public void setThemeStoreId(Integer themeStoreId) {
    this.themeStoreId = themeStoreId;
  }

  /**
   * The published translations associated with the resource.
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  /**
   * The date and time when the theme was last updated.
   */
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
    /**
     * The date and time when the theme was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The files in the theme.
     */
    private OnlineStoreThemeFileConnection files;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the theme, set by the merchant.
     */
    private String name;

    /**
     * The prefix of the theme.
     */
    private String prefix;

    /**
     * Whether the theme is processing.
     */
    private boolean processing;

    /**
     * Whether the theme processing failed.
     */
    private boolean processingFailed;

    /**
     * The role of the theme.
     */
    private ThemeRole role;

    /**
     * The theme store ID.
     */
    private Integer themeStoreId;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The date and time when the theme was last updated.
     */
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

    /**
     * The date and time when the theme was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The files in the theme.
     */
    public Builder files(OnlineStoreThemeFileConnection files) {
      this.files = files;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the theme, set by the merchant.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The prefix of the theme.
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }

    /**
     * Whether the theme is processing.
     */
    public Builder processing(boolean processing) {
      this.processing = processing;
      return this;
    }

    /**
     * Whether the theme processing failed.
     */
    public Builder processingFailed(boolean processingFailed) {
      this.processingFailed = processingFailed;
      return this;
    }

    /**
     * The role of the theme.
     */
    public Builder role(ThemeRole role) {
      this.role = role;
      return this;
    }

    /**
     * The theme store ID.
     */
    public Builder themeStoreId(Integer themeStoreId) {
      this.themeStoreId = themeStoreId;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    /**
     * The date and time when the theme was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
