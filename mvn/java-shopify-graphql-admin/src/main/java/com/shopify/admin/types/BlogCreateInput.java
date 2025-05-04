package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create a blog.
 */
public class BlogCreateInput {
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

  public BlogCreateInput() {
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

  @Override
  public String toString() {
    return "BlogCreateInput{handle='" + handle + "', templateSuffix='" + templateSuffix + "', metafields='" + metafields + "', commentPolicy='" + commentPolicy + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BlogCreateInput that = (BlogCreateInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(commentPolicy, that.commentPolicy) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, templateSuffix, metafields, commentPolicy, title);
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

    public BlogCreateInput build() {
      BlogCreateInput result = new BlogCreateInput();
      result.handle = this.handle;
      result.templateSuffix = this.templateSuffix;
      result.metafields = this.metafields;
      result.commentPolicy = this.commentPolicy;
      result.title = this.title;
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
  }
}
