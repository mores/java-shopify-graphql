package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to update an article.
 */
public class ArticleUpdateInput {
  /**
   * The ID of the blog containing the article.
   */
  private String blogId;

  /**
   * A unique, human-friendly string for the article that's automatically generated from the article's title.
   * The handle is used in the article's URL.
   */
  private String handle;

  /**
   * The text of the article's body, complete with HTML markup.
   */
  private String body;

  /**
   * A summary of the article, which can include HTML markup.
   * The summary is used by the online store theme to display the article on other
   * pages, such as the home page or the main blog page.
   */
  private String summary;

  /**
   * Whether or not the article should be visible.
   */
  private Boolean isPublished;

  /**
   * The date and time (ISO 8601 format) when the article should become visible.
   */
  private OffsetDateTime publishDate;

  /**
   * The suffix of the template that's used to render the page.
   * If the value is an empty string or `null`, then the default article template is used.
   */
  private String templateSuffix;

  /**
   * The input fields to create or update a metafield.
   */
  private List<MetafieldInput> metafields;

  /**
   * A comma-separated list of tags.
   * Tags are additional short descriptors formatted as a string of comma-separated values.
   */
  private List<String> tags;

  /**
   * The image associated with the article.
   */
  private ArticleImageInput image;

  /**
   * The title of the article.
   */
  private String title;

  /**
   * The name of the author of the article.
   */
  private AuthorInput author;

  /**
   * Whether a redirect is required after a new handle has been provided.
   * If `true`, then the old handle is redirected to the new one automatically.
   */
  private Boolean redirectNewHandle = false;

  public ArticleUpdateInput() {
  }

  /**
   * The ID of the blog containing the article.
   */
  public String getBlogId() {
    return blogId;
  }

  public void setBlogId(String blogId) {
    this.blogId = blogId;
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
   * The text of the article's body, complete with HTML markup.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
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
   * Whether or not the article should be visible.
   */
  public Boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  /**
   * The date and time (ISO 8601 format) when the article should become visible.
   */
  public OffsetDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
  }

  /**
   * The suffix of the template that's used to render the page.
   * If the value is an empty string or `null`, then the default article template is used.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  /**
   * The input fields to create or update a metafield.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
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
   * The image associated with the article.
   */
  public ArticleImageInput getImage() {
    return image;
  }

  public void setImage(ArticleImageInput image) {
    this.image = image;
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
   * The name of the author of the article.
   */
  public AuthorInput getAuthor() {
    return author;
  }

  public void setAuthor(AuthorInput author) {
    this.author = author;
  }

  /**
   * Whether a redirect is required after a new handle has been provided.
   * If `true`, then the old handle is redirected to the new one automatically.
   */
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
  }

  @Override
  public String toString() {
    return "ArticleUpdateInput{blogId='" + blogId + "', handle='" + handle + "', body='" + body + "', summary='" + summary + "', isPublished='" + isPublished + "', publishDate='" + publishDate + "', templateSuffix='" + templateSuffix + "', metafields='" + metafields + "', tags='" + tags + "', image='" + image + "', title='" + title + "', author='" + author + "', redirectNewHandle='" + redirectNewHandle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArticleUpdateInput that = (ArticleUpdateInput) o;
    return Objects.equals(blogId, that.blogId) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(body, that.body) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(isPublished, that.isPublished) &&
        Objects.equals(publishDate, that.publishDate) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(image, that.image) &&
        Objects.equals(title, that.title) &&
        Objects.equals(author, that.author) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blogId, handle, body, summary, isPublished, publishDate, templateSuffix, metafields, tags, image, title, author, redirectNewHandle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the blog containing the article.
     */
    private String blogId;

    /**
     * A unique, human-friendly string for the article that's automatically generated from the article's title.
     * The handle is used in the article's URL.
     */
    private String handle;

    /**
     * The text of the article's body, complete with HTML markup.
     */
    private String body;

    /**
     * A summary of the article, which can include HTML markup.
     * The summary is used by the online store theme to display the article on other
     * pages, such as the home page or the main blog page.
     */
    private String summary;

    /**
     * Whether or not the article should be visible.
     */
    private Boolean isPublished;

    /**
     * The date and time (ISO 8601 format) when the article should become visible.
     */
    private OffsetDateTime publishDate;

    /**
     * The suffix of the template that's used to render the page.
     * If the value is an empty string or `null`, then the default article template is used.
     */
    private String templateSuffix;

    /**
     * The input fields to create or update a metafield.
     */
    private List<MetafieldInput> metafields;

    /**
     * A comma-separated list of tags.
     * Tags are additional short descriptors formatted as a string of comma-separated values.
     */
    private List<String> tags;

    /**
     * The image associated with the article.
     */
    private ArticleImageInput image;

    /**
     * The title of the article.
     */
    private String title;

    /**
     * The name of the author of the article.
     */
    private AuthorInput author;

    /**
     * Whether a redirect is required after a new handle has been provided.
     * If `true`, then the old handle is redirected to the new one automatically.
     */
    private Boolean redirectNewHandle = false;

    public ArticleUpdateInput build() {
      ArticleUpdateInput result = new ArticleUpdateInput();
      result.blogId = this.blogId;
      result.handle = this.handle;
      result.body = this.body;
      result.summary = this.summary;
      result.isPublished = this.isPublished;
      result.publishDate = this.publishDate;
      result.templateSuffix = this.templateSuffix;
      result.metafields = this.metafields;
      result.tags = this.tags;
      result.image = this.image;
      result.title = this.title;
      result.author = this.author;
      result.redirectNewHandle = this.redirectNewHandle;
      return result;
    }

    /**
     * The ID of the blog containing the article.
     */
    public Builder blogId(String blogId) {
      this.blogId = blogId;
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
     * The text of the article's body, complete with HTML markup.
     */
    public Builder body(String body) {
      this.body = body;
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
     * Whether or not the article should be visible.
     */
    public Builder isPublished(Boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    /**
     * The date and time (ISO 8601 format) when the article should become visible.
     */
    public Builder publishDate(OffsetDateTime publishDate) {
      this.publishDate = publishDate;
      return this;
    }

    /**
     * The suffix of the template that's used to render the page.
     * If the value is an empty string or `null`, then the default article template is used.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    /**
     * The input fields to create or update a metafield.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
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
     * The image associated with the article.
     */
    public Builder image(ArticleImageInput image) {
      this.image = image;
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
     * The name of the author of the article.
     */
    public Builder author(AuthorInput author) {
      this.author = author;
      return this;
    }

    /**
     * Whether a redirect is required after a new handle has been provided.
     * If `true`, then the old handle is redirected to the new one automatically.
     */
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }
  }
}
