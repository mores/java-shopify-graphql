package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to update a blog.
 */
public class BlogUpdateInput {
  /**
   * A unique, human-friendly string for the blog. If no handle is specified, a
   * handle will be generated automatically from the blog title.
   * The handle is customizable and is used by the Liquid templating language to refer to the blog.
   */
  private String handle;

  /**
   * The name of the template a blog is using if it's using an alternate template.
   * Returns `null` if a blog is using the default blog.liquid template.
   */
  private String templateSuffix;

  /**
   * Attaches additional metadata to a store's resources.
   */
  private List<MetafieldInput> metafields;

  /**
   * Indicates whether readers can post comments to the blog and whether comments are moderated.
   */
  private CommentPolicy commentPolicy;

  /**
   * The title of the blog.
   */
  private String title;

  /**
   * Whether a redirect is required after a new handle has been provided.
   * If `true`, then the old handle is redirected to the new one automatically.
   */
  private Boolean redirectNewHandle = false;

  /**
   * Whether to redirect blog posts automatically.
   */
  private Boolean redirectArticles = false;

  public BlogUpdateInput() {
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
   * Attaches additional metadata to a store's resources.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * Indicates whether readers can post comments to the blog and whether comments are moderated.
   */
  public CommentPolicy getCommentPolicy() {
    return commentPolicy;
  }

  public void setCommentPolicy(CommentPolicy commentPolicy) {
    this.commentPolicy = commentPolicy;
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
   * Whether a redirect is required after a new handle has been provided.
   * If `true`, then the old handle is redirected to the new one automatically.
   */
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
  }

  /**
   * Whether to redirect blog posts automatically.
   */
  public Boolean getRedirectArticles() {
    return redirectArticles;
  }

  public void setRedirectArticles(Boolean redirectArticles) {
    this.redirectArticles = redirectArticles;
  }

  @Override
  public String toString() {
    return "BlogUpdateInput{handle='" + handle + "', templateSuffix='" + templateSuffix + "', metafields='" + metafields + "', commentPolicy='" + commentPolicy + "', title='" + title + "', redirectNewHandle='" + redirectNewHandle + "', redirectArticles='" + redirectArticles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BlogUpdateInput that = (BlogUpdateInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(commentPolicy, that.commentPolicy) &&
        Objects.equals(title, that.title) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle) &&
        Objects.equals(redirectArticles, that.redirectArticles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, templateSuffix, metafields, commentPolicy, title, redirectNewHandle, redirectArticles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A unique, human-friendly string for the blog. If no handle is specified, a
     * handle will be generated automatically from the blog title.
     * The handle is customizable and is used by the Liquid templating language to refer to the blog.
     */
    private String handle;

    /**
     * The name of the template a blog is using if it's using an alternate template.
     * Returns `null` if a blog is using the default blog.liquid template.
     */
    private String templateSuffix;

    /**
     * Attaches additional metadata to a store's resources.
     */
    private List<MetafieldInput> metafields;

    /**
     * Indicates whether readers can post comments to the blog and whether comments are moderated.
     */
    private CommentPolicy commentPolicy;

    /**
     * The title of the blog.
     */
    private String title;

    /**
     * Whether a redirect is required after a new handle has been provided.
     * If `true`, then the old handle is redirected to the new one automatically.
     */
    private Boolean redirectNewHandle = false;

    /**
     * Whether to redirect blog posts automatically.
     */
    private Boolean redirectArticles = false;

    public BlogUpdateInput build() {
      BlogUpdateInput result = new BlogUpdateInput();
      result.handle = this.handle;
      result.templateSuffix = this.templateSuffix;
      result.metafields = this.metafields;
      result.commentPolicy = this.commentPolicy;
      result.title = this.title;
      result.redirectNewHandle = this.redirectNewHandle;
      result.redirectArticles = this.redirectArticles;
      return result;
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
     * The name of the template a blog is using if it's using an alternate template.
     * Returns `null` if a blog is using the default blog.liquid template.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    /**
     * Attaches additional metadata to a store's resources.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * Indicates whether readers can post comments to the blog and whether comments are moderated.
     */
    public Builder commentPolicy(CommentPolicy commentPolicy) {
      this.commentPolicy = commentPolicy;
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
     * Whether a redirect is required after a new handle has been provided.
     * If `true`, then the old handle is redirected to the new one automatically.
     */
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }

    /**
     * Whether to redirect blog posts automatically.
     */
    public Builder redirectArticles(Boolean redirectArticles) {
      this.redirectArticles = redirectArticles;
      return this;
    }
  }
}
