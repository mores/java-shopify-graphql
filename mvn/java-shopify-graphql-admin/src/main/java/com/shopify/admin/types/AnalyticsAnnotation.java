package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * An annotation for a notable event on a shop's analytics timeline.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AnalyticsAnnotation implements com.shopify.admin.types.Node {
  /**
   * The date and time when the annotation was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The app that created the annotation. Returns `null` if the annotation wasn't created by an app.
   */
  private App createdByApp;

  /**
   * A plain-text description that provides additional context about the
   * annotation. The maximum length is 150 characters for app-created annotations.
   */
  private String description;

  /**
   * The date and time when the annotation ended. Returns `null` if the annotation is open-ended.
   */
  private OffsetDateTime endedAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Identifies who or what created this annotation.
   */
  private AnalyticsAnnotationSource source;

  /**
   * The date and time when the annotation started.
   */
  private OffsetDateTime startedAt;

  /**
   * The title of the annotation. The maximum length is 75 characters for app-created annotations.
   */
  private String title;

  /**
   * The type of event represented by the annotation. Refer to the list of [supported types](https://shopify.dev/docs/api/shopifyql/latest/syntax/annotate#annotation-categories-and-types).
   */
  private String type;

  /**
   * The date and time when the annotation was last updated.
   */
  private OffsetDateTime updatedAt;

  public AnalyticsAnnotation() {
  }

  /**
   * The date and time when the annotation was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The app that created the annotation. Returns `null` if the annotation wasn't created by an app.
   */
  public App getCreatedByApp() {
    return createdByApp;
  }

  public void setCreatedByApp(App createdByApp) {
    this.createdByApp = createdByApp;
  }

  /**
   * A plain-text description that provides additional context about the
   * annotation. The maximum length is 150 characters for app-created annotations.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The date and time when the annotation ended. Returns `null` if the annotation is open-ended.
   */
  public OffsetDateTime getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
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
   * Identifies who or what created this annotation.
   */
  public AnalyticsAnnotationSource getSource() {
    return source;
  }

  public void setSource(AnalyticsAnnotationSource source) {
    this.source = source;
  }

  /**
   * The date and time when the annotation started.
   */
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  /**
   * The title of the annotation. The maximum length is 75 characters for app-created annotations.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The type of event represented by the annotation. Refer to the list of [supported types](https://shopify.dev/docs/api/shopifyql/latest/syntax/annotate#annotation-categories-and-types).
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The date and time when the annotation was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "AnalyticsAnnotation{createdAt='" + createdAt + "', createdByApp='" + createdByApp + "', description='" + description + "', endedAt='" + endedAt + "', id='" + id + "', source='" + source + "', startedAt='" + startedAt + "', title='" + title + "', type='" + type + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnalyticsAnnotation that = (AnalyticsAnnotation) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(createdByApp, that.createdByApp) &&
        Objects.equals(description, that.description) &&
        Objects.equals(endedAt, that.endedAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(source, that.source) &&
        Objects.equals(startedAt, that.startedAt) &&
        Objects.equals(title, that.title) &&
        Objects.equals(type, that.type) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdByApp, description, endedAt, id, source, startedAt, title, type, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the annotation was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The app that created the annotation. Returns `null` if the annotation wasn't created by an app.
     */
    private App createdByApp;

    /**
     * A plain-text description that provides additional context about the
     * annotation. The maximum length is 150 characters for app-created annotations.
     */
    private String description;

    /**
     * The date and time when the annotation ended. Returns `null` if the annotation is open-ended.
     */
    private OffsetDateTime endedAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Identifies who or what created this annotation.
     */
    private AnalyticsAnnotationSource source;

    /**
     * The date and time when the annotation started.
     */
    private OffsetDateTime startedAt;

    /**
     * The title of the annotation. The maximum length is 75 characters for app-created annotations.
     */
    private String title;

    /**
     * The type of event represented by the annotation. Refer to the list of [supported types](https://shopify.dev/docs/api/shopifyql/latest/syntax/annotate#annotation-categories-and-types).
     */
    private String type;

    /**
     * The date and time when the annotation was last updated.
     */
    private OffsetDateTime updatedAt;

    public AnalyticsAnnotation build() {
      AnalyticsAnnotation result = new AnalyticsAnnotation();
      result.createdAt = this.createdAt;
      result.createdByApp = this.createdByApp;
      result.description = this.description;
      result.endedAt = this.endedAt;
      result.id = this.id;
      result.source = this.source;
      result.startedAt = this.startedAt;
      result.title = this.title;
      result.type = this.type;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The date and time when the annotation was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The app that created the annotation. Returns `null` if the annotation wasn't created by an app.
     */
    public Builder createdByApp(App createdByApp) {
      this.createdByApp = createdByApp;
      return this;
    }

    /**
     * A plain-text description that provides additional context about the
     * annotation. The maximum length is 150 characters for app-created annotations.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The date and time when the annotation ended. Returns `null` if the annotation is open-ended.
     */
    public Builder endedAt(OffsetDateTime endedAt) {
      this.endedAt = endedAt;
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
     * Identifies who or what created this annotation.
     */
    public Builder source(AnalyticsAnnotationSource source) {
      this.source = source;
      return this;
    }

    /**
     * The date and time when the annotation started.
     */
    public Builder startedAt(OffsetDateTime startedAt) {
      this.startedAt = startedAt;
      return this;
    }

    /**
     * The title of the annotation. The maximum length is 75 characters for app-created annotations.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The type of event represented by the annotation. Refer to the list of [supported types](https://shopify.dev/docs/api/shopifyql/latest/syntax/annotate#annotation-categories-and-types).
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * The date and time when the annotation was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
