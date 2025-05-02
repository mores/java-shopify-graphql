package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A comment on an article.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Comment implements com.shopify.storefront.types.Node {
  /**
   * The comment’s author.
   */
  private CommentAuthor author;

  /**
   * Stripped content of the comment, single line with HTML tags removed.
   */
  private String content;

  /**
   * The content of the comment, complete with HTML formatting.
   */
  private String contentHtml;

  /**
   * A globally-unique ID.
   */
  private String id;

  public Comment() {
  }

  /**
   * The comment’s author.
   */
  public CommentAuthor getAuthor() {
    return author;
  }

  public void setAuthor(CommentAuthor author) {
    this.author = author;
  }

  /**
   * Stripped content of the comment, single line with HTML tags removed.
   */
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  /**
   * The content of the comment, complete with HTML formatting.
   */
  public String getContentHtml() {
    return contentHtml;
  }

  public void setContentHtml(String contentHtml) {
    this.contentHtml = contentHtml;
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

  @Override
  public String toString() {
    return "Comment{author='" + author + "', content='" + content + "', contentHtml='" + contentHtml + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Comment that = (Comment) o;
    return Objects.equals(author, that.author) &&
        Objects.equals(content, that.content) &&
        Objects.equals(contentHtml, that.contentHtml) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, content, contentHtml, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The comment’s author.
     */
    private CommentAuthor author;

    /**
     * Stripped content of the comment, single line with HTML tags removed.
     */
    private String content;

    /**
     * The content of the comment, complete with HTML formatting.
     */
    private String contentHtml;

    /**
     * A globally-unique ID.
     */
    private String id;

    public Comment build() {
      Comment result = new Comment();
      result.author = this.author;
      result.content = this.content;
      result.contentHtml = this.contentHtml;
      result.id = this.id;
      return result;
    }

    /**
     * The comment’s author.
     */
    public Builder author(CommentAuthor author) {
      this.author = author;
      return this;
    }

    /**
     * Stripped content of the comment, single line with HTML tags removed.
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * The content of the comment, complete with HTML formatting.
     */
    public Builder contentHtml(String contentHtml) {
      this.contentHtml = contentHtml;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
