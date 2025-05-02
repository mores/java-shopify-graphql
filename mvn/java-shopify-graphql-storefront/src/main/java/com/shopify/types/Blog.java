package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An online store blog.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Blog implements MenuItemResource, MetafieldParentResource, com.shopify.types.HasMetafields, com.shopify.types.Node, com.shopify.types.OnlineStorePublishable {
  /**
   * Find an article by its handle.
   */
  private Article articleByHandle;

  /**
   * List of the blog's articles.
   */
  private ArticleConnection articles;

  /**
   * The authors who have contributed to the blog.
   */
  private List<ArticleAuthor> authors;

  /**
   * A human-friendly unique string for the Blog automatically generated from its title.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

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
   * The blog's SEO information.
   */
  private SEO seo;

  /**
   * The blogs’s title.
   */
  private String title;

  public Blog() {
  }

  /**
   * Find an article by its handle.
   */
  public Article getArticleByHandle() {
    return articleByHandle;
  }

  public void setArticleByHandle(Article articleByHandle) {
    this.articleByHandle = articleByHandle;
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
   * The authors who have contributed to the blog.
   */
  public List<ArticleAuthor> getAuthors() {
    return authors;
  }

  public void setAuthors(List<ArticleAuthor> authors) {
    this.authors = authors;
  }

  /**
   * A human-friendly unique string for the Blog automatically generated from its title.
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
   * The blog's SEO information.
   */
  public SEO getSeo() {
    return seo;
  }

  public void setSeo(SEO seo) {
    this.seo = seo;
  }

  /**
   * The blogs’s title.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Blog{articleByHandle='" + articleByHandle + "', articles='" + articles + "', authors='" + authors + "', handle='" + handle + "', id='" + id + "', metafield='" + metafield + "', metafields='" + metafields + "', onlineStoreUrl='" + onlineStoreUrl + "', seo='" + seo + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Blog that = (Blog) o;
    return Objects.equals(articleByHandle, that.articleByHandle) &&
        Objects.equals(articles, that.articles) &&
        Objects.equals(authors, that.authors) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(onlineStoreUrl, that.onlineStoreUrl) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleByHandle, articles, authors, handle, id, metafield, metafields, onlineStoreUrl, seo, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Find an article by its handle.
     */
    private Article articleByHandle;

    /**
     * List of the blog's articles.
     */
    private ArticleConnection articles;

    /**
     * The authors who have contributed to the blog.
     */
    private List<ArticleAuthor> authors;

    /**
     * A human-friendly unique string for the Blog automatically generated from its title.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

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
     * The blog's SEO information.
     */
    private SEO seo;

    /**
     * The blogs’s title.
     */
    private String title;

    public Blog build() {
      Blog result = new Blog();
      result.articleByHandle = this.articleByHandle;
      result.articles = this.articles;
      result.authors = this.authors;
      result.handle = this.handle;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.onlineStoreUrl = this.onlineStoreUrl;
      result.seo = this.seo;
      result.title = this.title;
      return result;
    }

    /**
     * Find an article by its handle.
     */
    public Builder articleByHandle(Article articleByHandle) {
      this.articleByHandle = articleByHandle;
      return this;
    }

    /**
     * List of the blog's articles.
     */
    public Builder articles(ArticleConnection articles) {
      this.articles = articles;
      return this;
    }

    /**
     * The authors who have contributed to the blog.
     */
    public Builder authors(List<ArticleAuthor> authors) {
      this.authors = authors;
      return this;
    }

    /**
     * A human-friendly unique string for the Blog automatically generated from its title.
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
     * The blog's SEO information.
     */
    public Builder seo(SEO seo) {
      this.seo = seo;
      return this;
    }

    /**
     * The blogs’s title.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
