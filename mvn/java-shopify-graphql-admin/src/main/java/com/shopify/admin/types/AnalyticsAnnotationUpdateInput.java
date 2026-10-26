package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for updating an [analytics annotation](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsAnnotation).
 * Only the fields you provide are changed.
 */
public class AnalyticsAnnotationUpdateInput {
  /**
   * The date and time when the annotation started.
   */
  private OffsetDateTime startedAt;

  /**
   * The date and time when the annotation ended. Set to `null` for open-ended annotations.
   */
  private OffsetDateTime endedAt;

  /**
   * A supported type for an app-created annotation. Refer to the list of [supported types](https://shopify.dev/docs/api/shopifyql/latest/syntax/annotate#annotation-categories-and-types).
   */
  private String type;

  /**
   * The title of the annotation, displayed on the chart marker. The maximum length is 75 characters.
   */
  private String title;

  /**
   * A plain-text description that provides additional context. The maximum length
   * is 150 characters. Set to `null` to remove the description.
   */
  private String description;

  public AnalyticsAnnotationUpdateInput() {
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
   * The date and time when the annotation ended. Set to `null` for open-ended annotations.
   */
  public OffsetDateTime getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
  }

  /**
   * A supported type for an app-created annotation. Refer to the list of [supported types](https://shopify.dev/docs/api/shopifyql/latest/syntax/annotate#annotation-categories-and-types).
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The title of the annotation, displayed on the chart marker. The maximum length is 75 characters.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * A plain-text description that provides additional context. The maximum length
   * is 150 characters. Set to `null` to remove the description.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "AnalyticsAnnotationUpdateInput{startedAt='" + startedAt + "', endedAt='" + endedAt + "', type='" + type + "', title='" + title + "', description='" + description + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnalyticsAnnotationUpdateInput that = (AnalyticsAnnotationUpdateInput) o;
    return Objects.equals(startedAt, that.startedAt) &&
        Objects.equals(endedAt, that.endedAt) &&
        Objects.equals(type, that.type) &&
        Objects.equals(title, that.title) &&
        Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedAt, endedAt, type, title, description);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the annotation started.
     */
    private OffsetDateTime startedAt;

    /**
     * The date and time when the annotation ended. Set to `null` for open-ended annotations.
     */
    private OffsetDateTime endedAt;

    /**
     * A supported type for an app-created annotation. Refer to the list of [supported types](https://shopify.dev/docs/api/shopifyql/latest/syntax/annotate#annotation-categories-and-types).
     */
    private String type;

    /**
     * The title of the annotation, displayed on the chart marker. The maximum length is 75 characters.
     */
    private String title;

    /**
     * A plain-text description that provides additional context. The maximum length
     * is 150 characters. Set to `null` to remove the description.
     */
    private String description;

    public AnalyticsAnnotationUpdateInput build() {
      AnalyticsAnnotationUpdateInput result = new AnalyticsAnnotationUpdateInput();
      result.startedAt = this.startedAt;
      result.endedAt = this.endedAt;
      result.type = this.type;
      result.title = this.title;
      result.description = this.description;
      return result;
    }

    /**
     * The date and time when the annotation started.
     */
    public Builder startedAt(OffsetDateTime startedAt) {
      this.startedAt = startedAt;
      return this;
    }

    /**
     * The date and time when the annotation ended. Set to `null` for open-ended annotations.
     */
    public Builder endedAt(OffsetDateTime endedAt) {
      this.endedAt = endedAt;
      return this;
    }

    /**
     * A supported type for an app-created annotation. Refer to the list of [supported types](https://shopify.dev/docs/api/shopifyql/latest/syntax/annotate#annotation-categories-and-types).
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * The title of the annotation, displayed on the chart marker. The maximum length is 75 characters.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * A plain-text description that provides additional context. The maximum length
     * is 150 characters. Set to `null` to remove the description.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }
}
