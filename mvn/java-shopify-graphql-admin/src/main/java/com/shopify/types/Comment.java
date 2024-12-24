package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Comment implements com.shopify.types.HasEvents, com.shopify.types.Node {
  
  private Article article;

  /**
   * The comment’s author.
   */
  private CommentAuthor author;

  
  private String body;

  
  private String bodyHtml;

  
  private OffsetDateTime createdAt;

  
  private EventConnection events;

  
  private String id;

  
  private String ip;

  
  private boolean isPublished;

  
  private OffsetDateTime publishedAt;

  
  private CommentStatus status;

  
  private OffsetDateTime updatedAt;

  
  private String userAgent;

  public Comment() {
  }

  
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

  
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  
  public String getBodyHtml() {
    return bodyHtml;
  }

  public void setBodyHtml(String bodyHtml) {
    this.bodyHtml = bodyHtml;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  
  public CommentStatus getStatus() {
    return status;
  }

  public void setStatus(CommentStatus status) {
    this.status = status;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
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
    
    private Article article;

    /**
     * The comment’s author.
     */
    private CommentAuthor author;

    
    private String body;

    
    private String bodyHtml;

    
    private OffsetDateTime createdAt;

    
    private EventConnection events;

    
    private String id;

    
    private String ip;

    
    private boolean isPublished;

    
    private OffsetDateTime publishedAt;

    
    private CommentStatus status;

    
    private OffsetDateTime updatedAt;

    
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

    
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    
    public Builder bodyHtml(String bodyHtml) {
      this.bodyHtml = bodyHtml;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder ip(String ip) {
      this.ip = ip;
      return this;
    }

    
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    
    public Builder publishedAt(OffsetDateTime publishedAt) {
      this.publishedAt = publishedAt;
      return this;
    }

    
    public Builder status(CommentStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder userAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }
  }
}
