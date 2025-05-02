package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * An article in an online store blog.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Article implements MenuItemResource, MetafieldParentResource, SearchResultItem, com.shopify.types.HasMetafields, com.shopify.types.Node, com.shopify.types.OnlineStorePublishable, com.shopify.types.Trackable {
  /**
   * The article's author.
   */
  private ArticleAuthor author;

  /**
   * The article's author.
   */
  private ArticleAuthor authorV2;

  /**
   * The blog that the article belongs to.
   */
  private Blog blog;

  /**
   * List of comments posted on the article.
   */
  private CommentConnection comments;

  /**
   * Stripped content of the article, single line with HTML tags removed.
   */
  private String content;

  /**
   * The content of the article, complete with HTML formatting.
   */
  private String contentHtml;

  /**
   * Stripped excerpt of the article, single line with HTML tags removed.
   */
  private String excerpt;

  /**
   * The excerpt of the article, complete with HTML formatting.
   */
  private String excerptHtml;

  /**
   * A human-friendly unique string for the Article automatically generated from its title.
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
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  private List<Metafield> metafields;

  /**
   * The URL used for viewing the resource on the shop's Online Store. Returns
   * `null` if the resource is currently not published to the Online Store sales channel.
   */
  private String onlineStoreUrl;

  /**
   * The date and time when the article was published.
   */
  private OffsetDateTime publishedAt;

  /**
   * The article’s SEO information.
   */
  private SEO seo;

  /**
   * A categorization that a article can be tagged with.
   */
  private List<String> tags;

  /**
   * The article’s name.
   */
  private String title;

  /**
   * URL parameters to be added to a page URL to track the origin of on-site search
   * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
   * Returns a result when accessed through the
   * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
   * queries, otherwise returns null.
   */
  private String trackingParameters;

  public Article() {
  }

  /**
   * The article's author.
   */
  public ArticleAuthor getAuthor() {
    return author;
  }

  public void setAuthor(ArticleAuthor author) {
    this.author = author;
  }

  /**
   * The article's author.
   */
  public ArticleAuthor getAuthorV2() {
    return authorV2;
  }

  public void setAuthorV2(ArticleAuthor authorV2) {
    this.authorV2 = authorV2;
  }

  /**
   * The blog that the article belongs to.
   */
  public Blog getBlog() {
    return blog;
  }

  public void setBlog(Blog blog) {
    this.blog = blog;
  }

  /**
   * List of comments posted on the article.
   */
  public CommentConnection getComments() {
    return comments;
  }

  public void setComments(CommentConnection comments) {
    this.comments = comments;
  }

  /**
   * Stripped content of the article, single line with HTML tags removed.
   */
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  /**
   * The content of the article, complete with HTML formatting.
   */
  public String getContentHtml() {
    return contentHtml;
  }

  public void setContentHtml(String contentHtml) {
    this.contentHtml = contentHtml;
  }

  /**
   * Stripped excerpt of the article, single line with HTML tags removed.
   */
  public String getExcerpt() {
    return excerpt;
  }

  public void setExcerpt(String excerpt) {
    this.excerpt = excerpt;
  }

  /**
   * The excerpt of the article, complete with HTML formatting.
   */
  public String getExcerptHtml() {
    return excerptHtml;
  }

  public void setExcerptHtml(String excerptHtml) {
    this.excerptHtml = excerptHtml;
  }

  /**
   * A human-friendly unique string for the Article automatically generated from its title.
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
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * The URL used for viewing the resource on the shop's Online Store. Returns
   * `null` if the resource is currently not published to the Online Store sales channel.
   */
  public String getOnlineStoreUrl() {
    return onlineStoreUrl;
  }

  public void setOnlineStoreUrl(String onlineStoreUrl) {
    this.onlineStoreUrl = onlineStoreUrl;
  }

  /**
   * The date and time when the article was published.
   */
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  /**
   * The article’s SEO information.
   */
  public SEO getSeo() {
    return seo;
  }

  public void setSeo(SEO seo) {
    this.seo = seo;
  }

  /**
   * A categorization that a article can be tagged with.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The article’s name.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * URL parameters to be added to a page URL to track the origin of on-site search
   * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
   * Returns a result when accessed through the
   * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
   * queries, otherwise returns null.
   */
  public String getTrackingParameters() {
    return trackingParameters;
  }

  public void setTrackingParameters(String trackingParameters) {
    this.trackingParameters = trackingParameters;
  }

  @Override
  public String toString() {
    return "Article{author='" + author + "', authorV2='" + authorV2 + "', blog='" + blog + "', comments='" + comments + "', content='" + content + "', contentHtml='" + contentHtml + "', excerpt='" + excerpt + "', excerptHtml='" + excerptHtml + "', handle='" + handle + "', id='" + id + "', image='" + image + "', metafield='" + metafield + "', metafields='" + metafields + "', onlineStoreUrl='" + onlineStoreUrl + "', publishedAt='" + publishedAt + "', seo='" + seo + "', tags='" + tags + "', title='" + title + "', trackingParameters='" + trackingParameters + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Article that = (Article) o;
    return Objects.equals(author, that.author) &&
        Objects.equals(authorV2, that.authorV2) &&
        Objects.equals(blog, that.blog) &&
        Objects.equals(comments, that.comments) &&
        Objects.equals(content, that.content) &&
        Objects.equals(contentHtml, that.contentHtml) &&
        Objects.equals(excerpt, that.excerpt) &&
        Objects.equals(excerptHtml, that.excerptHtml) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(onlineStoreUrl, that.onlineStoreUrl) &&
        Objects.equals(publishedAt, that.publishedAt) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(title, that.title) &&
        Objects.equals(trackingParameters, that.trackingParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, authorV2, blog, comments, content, contentHtml, excerpt, excerptHtml, handle, id, image, metafield, metafields, onlineStoreUrl, publishedAt, seo, tags, title, trackingParameters);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The article's author.
     */
    private ArticleAuthor author;

    /**
     * The article's author.
     */
    private ArticleAuthor authorV2;

    /**
     * The blog that the article belongs to.
     */
    private Blog blog;

    /**
     * List of comments posted on the article.
     */
    private CommentConnection comments;

    /**
     * Stripped content of the article, single line with HTML tags removed.
     */
    private String content;

    /**
     * The content of the article, complete with HTML formatting.
     */
    private String contentHtml;

    /**
     * Stripped excerpt of the article, single line with HTML tags removed.
     */
    private String excerpt;

    /**
     * The excerpt of the article, complete with HTML formatting.
     */
    private String excerptHtml;

    /**
     * A human-friendly unique string for the Article automatically generated from its title.
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
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    private List<Metafield> metafields;

    /**
     * The URL used for viewing the resource on the shop's Online Store. Returns
     * `null` if the resource is currently not published to the Online Store sales channel.
     */
    private String onlineStoreUrl;

    /**
     * The date and time when the article was published.
     */
    private OffsetDateTime publishedAt;

    /**
     * The article’s SEO information.
     */
    private SEO seo;

    /**
     * A categorization that a article can be tagged with.
     */
    private List<String> tags;

    /**
     * The article’s name.
     */
    private String title;

    /**
     * URL parameters to be added to a page URL to track the origin of on-site search
     * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
     * Returns a result when accessed through the
     * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
     * queries, otherwise returns null.
     */
    private String trackingParameters;

    public Article build() {
      Article result = new Article();
      result.author = this.author;
      result.authorV2 = this.authorV2;
      result.blog = this.blog;
      result.comments = this.comments;
      result.content = this.content;
      result.contentHtml = this.contentHtml;
      result.excerpt = this.excerpt;
      result.excerptHtml = this.excerptHtml;
      result.handle = this.handle;
      result.id = this.id;
      result.image = this.image;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.onlineStoreUrl = this.onlineStoreUrl;
      result.publishedAt = this.publishedAt;
      result.seo = this.seo;
      result.tags = this.tags;
      result.title = this.title;
      result.trackingParameters = this.trackingParameters;
      return result;
    }

    /**
     * The article's author.
     */
    public Builder author(ArticleAuthor author) {
      this.author = author;
      return this;
    }

    /**
     * The article's author.
     */
    public Builder authorV2(ArticleAuthor authorV2) {
      this.authorV2 = authorV2;
      return this;
    }

    /**
     * The blog that the article belongs to.
     */
    public Builder blog(Blog blog) {
      this.blog = blog;
      return this;
    }

    /**
     * List of comments posted on the article.
     */
    public Builder comments(CommentConnection comments) {
      this.comments = comments;
      return this;
    }

    /**
     * Stripped content of the article, single line with HTML tags removed.
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * The content of the article, complete with HTML formatting.
     */
    public Builder contentHtml(String contentHtml) {
      this.contentHtml = contentHtml;
      return this;
    }

    /**
     * Stripped excerpt of the article, single line with HTML tags removed.
     */
    public Builder excerpt(String excerpt) {
      this.excerpt = excerpt;
      return this;
    }

    /**
     * The excerpt of the article, complete with HTML formatting.
     */
    public Builder excerptHtml(String excerptHtml) {
      this.excerptHtml = excerptHtml;
      return this;
    }

    /**
     * A human-friendly unique string for the Article automatically generated from its title.
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
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The URL used for viewing the resource on the shop's Online Store. Returns
     * `null` if the resource is currently not published to the Online Store sales channel.
     */
    public Builder onlineStoreUrl(String onlineStoreUrl) {
      this.onlineStoreUrl = onlineStoreUrl;
      return this;
    }

    /**
     * The date and time when the article was published.
     */
    public Builder publishedAt(OffsetDateTime publishedAt) {
      this.publishedAt = publishedAt;
      return this;
    }

    /**
     * The article’s SEO information.
     */
    public Builder seo(SEO seo) {
      this.seo = seo;
      return this;
    }

    /**
     * A categorization that a article can be tagged with.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * The article’s name.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * URL parameters to be added to a page URL to track the origin of on-site search
     * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
     * Returns a result when accessed through the
     * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
     * queries, otherwise returns null.
     */
    public Builder trackingParameters(String trackingParameters) {
      this.trackingParameters = trackingParameters;
      return this;
    }
  }
}
