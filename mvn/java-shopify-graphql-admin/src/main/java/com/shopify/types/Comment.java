package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A comment on an article.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Comment implements com.shopify.types.HasEvents, com.shopify.types.Node {
  /**
   * The article associated with the comment.
   */
  private Article article;

  /**
   * The comment’s author.
   */
  private CommentAuthor author;

  /**
   * The content of the comment.
   */
  private String body;

  /**
   * The content of the comment, complete with HTML formatting.
   */
  private String bodyHtml;

  /**
   * The date and time when the comment was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The paginated list of events associated with the host subject.
   */
  private EventConnection events;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The IP address of the commenter.
   */
  private String ip;

  /**
   * Whether or not the comment is published.
   */
  private boolean isPublished;

  /**
   * The date and time when the comment was published.
   */
  private OffsetDateTime publishedAt;

  /**
   * The status of the comment.
   */
  private CommentStatus status;

  /**
   * The date and time when the comment was last updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The user agent of the commenter.
   */
  private String userAgent;

  public Comment() {
  }

  /**
   * The article associated with the comment.
   */
  public Article getArticle() {
    return article;
  }

  public void setArticle(Article article) {
    this.article = article;
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
   * The content of the comment.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  /**
   * The content of the comment, complete with HTML formatting.
   */
  public String getBodyHtml() {
    return bodyHtml;
  }

  public void setBodyHtml(String bodyHtml) {
    this.bodyHtml = bodyHtml;
  }

  /**
   * The date and time when the comment was created.
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
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The IP address of the commenter.
   */
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   * Whether or not the comment is published.
   */
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  /**
   * The date and time when the comment was published.
   */
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  /**
   * The status of the comment.
   */
  public CommentStatus getStatus() {
    return status;
  }

  public void setStatus(CommentStatus status) {
    this.status = status;
  }

  /**
   * The date and time when the comment was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The user agent of the commenter.
   */
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  @Override
  public String toString() {
    return "Comment{article='" + article + "', author='" + author + "', body='" + body + "', bodyHtml='" + bodyHtml + "', createdAt='" + createdAt + "', events='" + events + "', id='" + id + "', ip='" + ip + "', isPublished='" + isPublished + "', publishedAt='" + publishedAt + "', status='" + status + "', updatedAt='" + updatedAt + "', userAgent='" + userAgent + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Comment that = (Comment) o;
    return Objects.equals(article, that.article) &&
        Objects.equals(author, that.author) &&
        Objects.equals(body, that.body) &&
        Objects.equals(bodyHtml, that.bodyHtml) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(events, that.events) &&
        Objects.equals(id, that.id) &&
        Objects.equals(ip, that.ip) &&
        isPublished == that.isPublished &&
        Objects.equals(publishedAt, that.publishedAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(userAgent, that.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(article, author, body, bodyHtml, createdAt, events, id, ip, isPublished, publishedAt, status, updatedAt, userAgent);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The article associated with the comment.
     */
    private Article article;

    /**
     * The comment’s author.
     */
    private CommentAuthor author;

    /**
     * The content of the comment.
     */
    private String body;

    /**
     * The content of the comment, complete with HTML formatting.
     */
    private String bodyHtml;

    /**
     * The date and time when the comment was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The paginated list of events associated with the host subject.
     */
    private EventConnection events;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The IP address of the commenter.
     */
    private String ip;

    /**
     * Whether or not the comment is published.
     */
    private boolean isPublished;

    /**
     * The date and time when the comment was published.
     */
    private OffsetDateTime publishedAt;

    /**
     * The status of the comment.
     */
    private CommentStatus status;

    /**
     * The date and time when the comment was last updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The user agent of the commenter.
     */
    private String userAgent;

    public Comment build() {
      Comment result = new Comment();
      result.article = this.article;
      result.author = this.author;
      result.body = this.body;
      result.bodyHtml = this.bodyHtml;
      result.createdAt = this.createdAt;
      result.events = this.events;
      result.id = this.id;
      result.ip = this.ip;
      result.isPublished = this.isPublished;
      result.publishedAt = this.publishedAt;
      result.status = this.status;
      result.updatedAt = this.updatedAt;
      result.userAgent = this.userAgent;
      return result;
    }

    /**
     * The article associated with the comment.
     */
    public Builder article(Article article) {
      this.article = article;
      return this;
    }

    /**
     * The comment’s author.
     */
    public Builder author(CommentAuthor author) {
      this.author = author;
      return this;
    }

    /**
     * The content of the comment.
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * The content of the comment, complete with HTML formatting.
     */
    public Builder bodyHtml(String bodyHtml) {
      this.bodyHtml = bodyHtml;
      return this;
    }

    /**
     * The date and time when the comment was created.
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
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The IP address of the commenter.
     */
    public Builder ip(String ip) {
      this.ip = ip;
      return this;
    }

    /**
     * Whether or not the comment is published.
     */
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    /**
     * The date and time when the comment was published.
     */
    public Builder publishedAt(OffsetDateTime publishedAt) {
      this.publishedAt = publishedAt;
      return this;
    }

    /**
     * The status of the comment.
     */
    public Builder status(CommentStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The date and time when the comment was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The user agent of the commenter.
     */
    public Builder userAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }
  }
}
