package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A page on the Online Store.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Page implements MetafieldReference, MetafieldReferencer, com.shopify.admin.types.HasEvents, com.shopify.admin.types.HasMetafieldDefinitions, com.shopify.admin.types.HasMetafields, com.shopify.admin.types.HasPublishedTranslations, com.shopify.admin.types.Navigable, com.shopify.admin.types.Node {
  /**
   * The text content of the page, complete with HTML markup.
   */
  private String body;

  /**
   * The first 150 characters of the page body. If the page body contains more than
   * 150 characters, additional characters are truncated by ellipses.
   */
  private String bodySummary;

  /**
   * The date and time (ISO 8601 format) of the page creation.
   */
  private OffsetDateTime createdAt;

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  private String defaultCursor;

  /**
   * The paginated list of events associated with the host subject.
   */
  private EventConnection events;

  /**
   * A unique, human-friendly string for the page.
   * In themes, the Liquid templating language refers to a page by its handle.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether or not the page is visible.
   */
  private boolean isPublished;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The date and time (ISO 8601 format) when the page became or will become visible.
   * Returns null when the page isn't visible.
   */
  private OffsetDateTime publishedAt;

  /**
   * The suffix of the template that's used to render the page.
   */
  private String templateSuffix;

  /**
   * Title of the page.
   */
  private String title;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The date and time (ISO 8601 format) of the latest page update.
   */
  private OffsetDateTime updatedAt;

  public Page() {
  }

  /**
   * The text content of the page, complete with HTML markup.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  /**
   * The first 150 characters of the page body. If the page body contains more than
   * 150 characters, additional characters are truncated by ellipses.
   */
  public String getBodySummary() {
    return bodySummary;
  }

  public void setBodySummary(String bodySummary) {
    this.bodySummary = bodySummary;
  }

  /**
   * The date and time (ISO 8601 format) of the page creation.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  /**
   * The paginated list of events associated with the host subject.
   */
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  /**
   * A unique, human-friendly string for the page.
   * In themes, the Liquid templating language refers to a page by its handle.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
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
   * Whether or not the page is visible.
   */
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The date and time (ISO 8601 format) when the page became or will become visible.
   * Returns null when the page isn't visible.
   */
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  /**
   * The suffix of the template that's used to render the page.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  /**
   * Title of the page.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * The date and time (ISO 8601 format) of the latest page update.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Page{body='" + body + "', bodySummary='" + bodySummary + "', createdAt='" + createdAt + "', defaultCursor='" + defaultCursor + "', events='" + events + "', handle='" + handle + "', id='" + id + "', isPublished='" + isPublished + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', publishedAt='" + publishedAt + "', templateSuffix='" + templateSuffix + "', title='" + title + "', translations='" + translations + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Page that = (Page) o;
    return Objects.equals(body, that.body) &&
        Objects.equals(bodySummary, that.bodySummary) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(events, that.events) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        isPublished == that.isPublished &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(publishedAt, that.publishedAt) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(title, that.title) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, bodySummary, createdAt, defaultCursor, events, handle, id, isPublished, metafield, metafieldDefinitions, metafields, publishedAt, templateSuffix, title, translations, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The text content of the page, complete with HTML markup.
     */
    private String body;

    /**
     * The first 150 characters of the page body. If the page body contains more than
     * 150 characters, additional characters are truncated by ellipses.
     */
    private String bodySummary;

    /**
     * The date and time (ISO 8601 format) of the page creation.
     */
    private OffsetDateTime createdAt;

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    private String defaultCursor;

    /**
     * The paginated list of events associated with the host subject.
     */
    private EventConnection events;

    /**
     * A unique, human-friendly string for the page.
     * In themes, the Liquid templating language refers to a page by its handle.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether or not the page is visible.
     */
    private boolean isPublished;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The date and time (ISO 8601 format) when the page became or will become visible.
     * Returns null when the page isn't visible.
     */
    private OffsetDateTime publishedAt;

    /**
     * The suffix of the template that's used to render the page.
     */
    private String templateSuffix;

    /**
     * Title of the page.
     */
    private String title;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The date and time (ISO 8601 format) of the latest page update.
     */
    private OffsetDateTime updatedAt;

    public Page build() {
      Page result = new Page();
      result.body = this.body;
      result.bodySummary = this.bodySummary;
      result.createdAt = this.createdAt;
      result.defaultCursor = this.defaultCursor;
      result.events = this.events;
      result.handle = this.handle;
      result.id = this.id;
      result.isPublished = this.isPublished;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.publishedAt = this.publishedAt;
      result.templateSuffix = this.templateSuffix;
      result.title = this.title;
      result.translations = this.translations;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The text content of the page, complete with HTML markup.
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * The first 150 characters of the page body. If the page body contains more than
     * 150 characters, additional characters are truncated by ellipses.
     */
    public Builder bodySummary(String bodySummary) {
      this.bodySummary = bodySummary;
      return this;
    }

    /**
     * The date and time (ISO 8601 format) of the page creation.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    /**
     * The paginated list of events associated with the host subject.
     */
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    /**
     * A unique, human-friendly string for the page.
     * In themes, the Liquid templating language refers to a page by its handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
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
     * Whether or not the page is visible.
     */
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The date and time (ISO 8601 format) when the page became or will become visible.
     * Returns null when the page isn't visible.
     */
    public Builder publishedAt(OffsetDateTime publishedAt) {
      this.publishedAt = publishedAt;
      return this;
    }

    /**
     * The suffix of the template that's used to render the page.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    /**
     * Title of the page.
     */
    public Builder title(String title) {
      this.title = title;
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
     * The date and time (ISO 8601 format) of the latest page update.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
