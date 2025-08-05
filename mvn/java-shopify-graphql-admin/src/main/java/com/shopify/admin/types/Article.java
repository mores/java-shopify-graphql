package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * An article in the blogging system.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Article implements MetafieldReferencer, com.shopify.admin.types.HasEvents, com.shopify.admin.types.HasMetafieldDefinitions, com.shopify.admin.types.HasMetafields, com.shopify.admin.types.HasPublishedTranslations, com.shopify.admin.types.Navigable, com.shopify.admin.types.Node {
  /**
   * The name of the author of the article.
   */
  private ArticleAuthor author;

  /**
   * The blog containing the article.
   */
  private Blog blog;

  /**
   * The text of the article's body, complete with HTML markup.
   */
  private String body;

  /**
   * List of the article's comments.
   */
  private CommentConnection comments;

  /**
   * Count of comments. Limited to a maximum of 10000 by default.
   */
  private Count commentsCount;

  /**
   * The date and time (ISO 8601 format) when the article was created.
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
   * A unique, human-friendly string for the article that's automatically generated from the article's title.
   * The handle is used in the article's URL.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The image associated with the article.
   */
  private Image image;

  /**
   * Whether or not the article is visible.
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
   * The date and time (ISO 8601 format) when the article became or will become visible.
   * Returns null when the article isn't visible.
   */
  private OffsetDateTime publishedAt;

  /**
   * A summary of the article, which can include HTML markup.
   * The summary is used by the online store theme to display the article on other
   * pages, such as the home page or the main blog page.
   */
  private String summary;

  /**
   * A comma-separated list of tags.
   * Tags are additional short descriptors formatted as a string of comma-separated values.
   */
  private List<String> tags;

  /**
   * The name of the template an article is using if it's using an alternate template.
   * If an article is using the default `article.liquid` template, then the value returned is `null`.
   */
  private String templateSuffix;

  /**
   * The title of the article.
   */
  private String title;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The date and time (ISO 8601 format) when the article was last updated.
   */
  private OffsetDateTime updatedAt;

  public Article() {
  }

  /**
   * The name of the author of the article.
   */
  public ArticleAuthor getAuthor() {
    return author;
  }

  public void setAuthor(ArticleAuthor author) {
    this.author = author;
  }

  /**
   * The blog containing the article.
   */
  public Blog getBlog() {
    return blog;
  }

  public void setBlog(Blog blog) {
    this.blog = blog;
  }

  /**
   * The text of the article's body, complete with HTML markup.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  /**
   * List of the article's comments.
   */
  public CommentConnection getComments() {
    return comments;
  }

  public void setComments(CommentConnection comments) {
    this.comments = comments;
  }

  /**
   * Count of comments. Limited to a maximum of 10000 by default.
   */
  public Count getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Count commentsCount) {
    this.commentsCount = commentsCount;
  }

  /**
   * The date and time (ISO 8601 format) when the article was created.
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
   * A unique, human-friendly string for the article that's automatically generated from the article's title.
   * The handle is used in the article's URL.
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
   * The image associated with the article.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * Whether or not the article is visible.
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
   * The date and time (ISO 8601 format) when the article became or will become visible.
   * Returns null when the article isn't visible.
   */
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  /**
   * A summary of the article, which can include HTML markup.
   * The summary is used by the online store theme to display the article on other
   * pages, such as the home page or the main blog page.
   */
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * A comma-separated list of tags.
   * Tags are additional short descriptors formatted as a string of comma-separated values.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The name of the template an article is using if it's using an alternate template.
   * If an article is using the default `article.liquid` template, then the value returned is `null`.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  /**
   * The title of the article.
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
   * The date and time (ISO 8601 format) when the article was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Article{author='" + author + "', blog='" + blog + "', body='" + body + "', comments='" + comments + "', commentsCount='" + commentsCount + "', createdAt='" + createdAt + "', defaultCursor='" + defaultCursor + "', events='" + events + "', handle='" + handle + "', id='" + id + "', image='" + image + "', isPublished='" + isPublished + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', publishedAt='" + publishedAt + "', summary='" + summary + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', title='" + title + "', translations='" + translations + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Article that = (Article) o;
    return Objects.equals(author, that.author) &&
        Objects.equals(blog, that.blog) &&
        Objects.equals(body, that.body) &&
        Objects.equals(comments, that.comments) &&
        Objects.equals(commentsCount, that.commentsCount) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(events, that.events) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        isPublished == that.isPublished &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(publishedAt, that.publishedAt) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(title, that.title) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, blog, body, comments, commentsCount, createdAt, defaultCursor, events, handle, id, image, isPublished, metafield, metafieldDefinitions, metafields, publishedAt, summary, tags, templateSuffix, title, translations, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the author of the article.
     */
    private ArticleAuthor author;

    /**
     * The blog containing the article.
     */
    private Blog blog;

    /**
     * The text of the article's body, complete with HTML markup.
     */
    private String body;

    /**
     * List of the article's comments.
     */
    private CommentConnection comments;

    /**
     * Count of comments. Limited to a maximum of 10000 by default.
     */
    private Count commentsCount;

    /**
     * The date and time (ISO 8601 format) when the article was created.
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
     * A unique, human-friendly string for the article that's automatically generated from the article's title.
     * The handle is used in the article's URL.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The image associated with the article.
     */
    private Image image;

    /**
     * Whether or not the article is visible.
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
     * The date and time (ISO 8601 format) when the article became or will become visible.
     * Returns null when the article isn't visible.
     */
    private OffsetDateTime publishedAt;

    /**
     * A summary of the article, which can include HTML markup.
     * The summary is used by the online store theme to display the article on other
     * pages, such as the home page or the main blog page.
     */
    private String summary;

    /**
     * A comma-separated list of tags.
     * Tags are additional short descriptors formatted as a string of comma-separated values.
     */
    private List<String> tags;

    /**
     * The name of the template an article is using if it's using an alternate template.
     * If an article is using the default `article.liquid` template, then the value returned is `null`.
     */
    private String templateSuffix;

    /**
     * The title of the article.
     */
    private String title;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The date and time (ISO 8601 format) when the article was last updated.
     */
    private OffsetDateTime updatedAt;

    public Article build() {
      Article result = new Article();
      result.author = this.author;
      result.blog = this.blog;
      result.body = this.body;
      result.comments = this.comments;
      result.commentsCount = this.commentsCount;
      result.createdAt = this.createdAt;
      result.defaultCursor = this.defaultCursor;
      result.events = this.events;
      result.handle = this.handle;
      result.id = this.id;
      result.image = this.image;
      result.isPublished = this.isPublished;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.publishedAt = this.publishedAt;
      result.summary = this.summary;
      result.tags = this.tags;
      result.templateSuffix = this.templateSuffix;
      result.title = this.title;
      result.translations = this.translations;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The name of the author of the article.
     */
    public Builder author(ArticleAuthor author) {
      this.author = author;
      return this;
    }

    /**
     * The blog containing the article.
     */
    public Builder blog(Blog blog) {
      this.blog = blog;
      return this;
    }

    /**
     * The text of the article's body, complete with HTML markup.
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * List of the article's comments.
     */
    public Builder comments(CommentConnection comments) {
      this.comments = comments;
      return this;
    }

    /**
     * Count of comments. Limited to a maximum of 10000 by default.
     */
    public Builder commentsCount(Count commentsCount) {
      this.commentsCount = commentsCount;
      return this;
    }

    /**
     * The date and time (ISO 8601 format) when the article was created.
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
     * A unique, human-friendly string for the article that's automatically generated from the article's title.
     * The handle is used in the article's URL.
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
     * The image associated with the article.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * Whether or not the article is visible.
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
     * The date and time (ISO 8601 format) when the article became or will become visible.
     * Returns null when the article isn't visible.
     */
    public Builder publishedAt(OffsetDateTime publishedAt) {
      this.publishedAt = publishedAt;
      return this;
    }

    /**
     * A summary of the article, which can include HTML markup.
     * The summary is used by the online store theme to display the article on other
     * pages, such as the home page or the main blog page.
     */
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    /**
     * A comma-separated list of tags.
     * Tags are additional short descriptors formatted as a string of comma-separated values.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * The name of the template an article is using if it's using an alternate template.
     * If an article is using the default `article.liquid` template, then the value returned is `null`.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    /**
     * The title of the article.
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
     * The date and time (ISO 8601 format) when the article was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
