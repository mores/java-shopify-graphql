package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Shopify stores come with a built-in blogging engine, allowing a shop to have one or more blogs.  Blogs are meant
 * to be used as a type of magazine or newsletter for the shop, with content that changes over time.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Blog implements MetafieldReferencer, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  /**
   * List of the blog's articles.
   */
  private ArticleConnection articles;

  /**
   * Count of articles.
   */
  private Count articlesCount;

  /**
   * Indicates whether readers can post comments to the blog and if comments are moderated or not.
   */
  private CommentPolicy commentPolicy;

  /**
   * The date and time when the blog was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The paginated list of events associated with the host subject.
   */
  private EventConnection events;

  /**
   * FeedBurner provider details. Any blogs that aren't already integrated with FeedBurner can't use the service.
   */
  private BlogFeed feed;

  /**
   * A unique, human-friendly string for the blog. If no handle is specified, a
   * handle will be generated automatically from the blog title.
   * The handle is customizable and is used by the Liquid templating language to refer to the blog.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

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
   * A list of tags associated with the 200 most recent blog articles.
   */
  private List<String> tags;

  /**
   * The name of the template a blog is using if it's using an alternate template.
   * Returns `null` if a blog is using the default blog.liquid template.
   */
  private String templateSuffix;

  /**
   * The title of the blog.
   */
  private String title;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The date and time when the blog was update.
   */
  private OffsetDateTime updatedAt;

  public Blog() {
  }

  /**
   * List of the blog's articles.
   */
  public ArticleConnection getArticles() {
    return articles;
  }

  public void setArticles(ArticleConnection articles) {
    this.articles = articles;
  }

  /**
   * Count of articles.
   */
  public Count getArticlesCount() {
    return articlesCount;
  }

  public void setArticlesCount(Count articlesCount) {
    this.articlesCount = articlesCount;
  }

  /**
   * Indicates whether readers can post comments to the blog and if comments are moderated or not.
   */
  public CommentPolicy getCommentPolicy() {
    return commentPolicy;
  }

  public void setCommentPolicy(CommentPolicy commentPolicy) {
    this.commentPolicy = commentPolicy;
  }

  /**
   * The date and time when the blog was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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
   * FeedBurner provider details. Any blogs that aren't already integrated with FeedBurner can't use the service.
   */
  public BlogFeed getFeed() {
    return feed;
  }

  public void setFeed(BlogFeed feed) {
    this.feed = feed;
  }

  /**
   * A unique, human-friendly string for the blog. If no handle is specified, a
   * handle will be generated automatically from the blog title.
   * The handle is customizable and is used by the Liquid templating language to refer to the blog.
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
   * A list of tags associated with the 200 most recent blog articles.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The name of the template a blog is using if it's using an alternate template.
   * Returns `null` if a blog is using the default blog.liquid template.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  /**
   * The title of the blog.
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
   * The date and time when the blog was update.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Blog{articles='" + articles + "', articlesCount='" + articlesCount + "', commentPolicy='" + commentPolicy + "', createdAt='" + createdAt + "', events='" + events + "', feed='" + feed + "', handle='" + handle + "', id='" + id + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', title='" + title + "', translations='" + translations + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Blog that = (Blog) o;
    return Objects.equals(articles, that.articles) &&
        Objects.equals(articlesCount, that.articlesCount) &&
        Objects.equals(commentPolicy, that.commentPolicy) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(events, that.events) &&
        Objects.equals(feed, that.feed) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(title, that.title) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles, articlesCount, commentPolicy, createdAt, events, feed, handle, id, metafield, metafieldDefinitions, metafields, tags, templateSuffix, title, translations, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * List of the blog's articles.
     */
    private ArticleConnection articles;

    /**
     * Count of articles.
     */
    private Count articlesCount;

    /**
     * Indicates whether readers can post comments to the blog and if comments are moderated or not.
     */
    private CommentPolicy commentPolicy;

    /**
     * The date and time when the blog was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The paginated list of events associated with the host subject.
     */
    private EventConnection events;

    /**
     * FeedBurner provider details. Any blogs that aren't already integrated with FeedBurner can't use the service.
     */
    private BlogFeed feed;

    /**
     * A unique, human-friendly string for the blog. If no handle is specified, a
     * handle will be generated automatically from the blog title.
     * The handle is customizable and is used by the Liquid templating language to refer to the blog.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

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
     * A list of tags associated with the 200 most recent blog articles.
     */
    private List<String> tags;

    /**
     * The name of the template a blog is using if it's using an alternate template.
     * Returns `null` if a blog is using the default blog.liquid template.
     */
    private String templateSuffix;

    /**
     * The title of the blog.
     */
    private String title;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The date and time when the blog was update.
     */
    private OffsetDateTime updatedAt;

    public Blog build() {
      Blog result = new Blog();
      result.articles = this.articles;
      result.articlesCount = this.articlesCount;
      result.commentPolicy = this.commentPolicy;
      result.createdAt = this.createdAt;
      result.events = this.events;
      result.feed = this.feed;
      result.handle = this.handle;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.tags = this.tags;
      result.templateSuffix = this.templateSuffix;
      result.title = this.title;
      result.translations = this.translations;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * List of the blog's articles.
     */
    public Builder articles(ArticleConnection articles) {
      this.articles = articles;
      return this;
    }

    /**
     * Count of articles.
     */
    public Builder articlesCount(Count articlesCount) {
      this.articlesCount = articlesCount;
      return this;
    }

    /**
     * Indicates whether readers can post comments to the blog and if comments are moderated or not.
     */
    public Builder commentPolicy(CommentPolicy commentPolicy) {
      this.commentPolicy = commentPolicy;
      return this;
    }

    /**
     * The date and time when the blog was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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
     * FeedBurner provider details. Any blogs that aren't already integrated with FeedBurner can't use the service.
     */
    public Builder feed(BlogFeed feed) {
      this.feed = feed;
      return this;
    }

    /**
     * A unique, human-friendly string for the blog. If no handle is specified, a
     * handle will be generated automatically from the blog title.
     * The handle is customizable and is used by the Liquid templating language to refer to the blog.
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
     * A list of tags associated with the 200 most recent blog articles.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * The name of the template a blog is using if it's using an alternate template.
     * Returns `null` if a blog is using the default blog.liquid template.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    /**
     * The title of the blog.
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
     * The date and time when the blog was update.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
