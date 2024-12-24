package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Article implements MetafieldReferencer, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.HasPublishedTranslations, com.shopify.types.Navigable, com.shopify.types.Node {
  /**
   * The name of the author of the article.
   */
  private ArticleAuthor author;

  
  private Blog blog;

  
  private String body;

  
  private CommentConnection comments;

  
  private Count commentsCount;

  
  private OffsetDateTime createdAt;

  
  private String defaultCursor;

  
  private EventConnection events;

  
  private String handle;

  
  private String id;

  
  private Image image;

  
  private boolean isPublished;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private OffsetDateTime publishedAt;

  
  private String summary;

  
  private List<String> tags;

  
  private String templateSuffix;

  
  private String title;

  
  private List<Translation> translations;

  
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

  
  public Blog getBlog() {
    return blog;
  }

  public void setBlog(Blog blog) {
    this.blog = blog;
  }

  
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  
  public CommentConnection getComments() {
    return comments;
  }

  public void setComments(CommentConnection comments) {
    this.comments = comments;
  }

  
  public Count getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Count commentsCount) {
    this.commentsCount = commentsCount;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Article{author='" + author + "', blog='" + blog + "', body='" + body + "', comments='" + comments + "', commentsCount='" + commentsCount + "', createdAt='" + createdAt + "', defaultCursor='" + defaultCursor + "', events='" + events + "', handle='" + handle + "', id='" + id + "', image='" + image + "', isPublished='" + isPublished + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', publishedAt='" + publishedAt + "', summary='" + summary + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', title='" + title + "', translations='" + translations + "', updatedAt='" + updatedAt + "'}";
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
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
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
    return Objects.hash(author, blog, body, comments, commentsCount, createdAt, defaultCursor, events, handle, id, image, isPublished, metafield, metafieldDefinitions, metafields, privateMetafield, privateMetafields, publishedAt, summary, tags, templateSuffix, title, translations, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the author of the article.
     */
    private ArticleAuthor author;

    
    private Blog blog;

    
    private String body;

    
    private CommentConnection comments;

    
    private Count commentsCount;

    
    private OffsetDateTime createdAt;

    
    private String defaultCursor;

    
    private EventConnection events;

    
    private String handle;

    
    private String id;

    
    private Image image;

    
    private boolean isPublished;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private OffsetDateTime publishedAt;

    
    private String summary;

    
    private List<String> tags;

    
    private String templateSuffix;

    
    private String title;

    
    private List<Translation> translations;

    
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
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
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

    
    public Builder blog(Blog blog) {
      this.blog = blog;
      return this;
    }

    
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    
    public Builder comments(CommentConnection comments) {
      this.comments = comments;
      return this;
    }

    
    public Builder commentsCount(Count commentsCount) {
      this.commentsCount = commentsCount;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder publishedAt(OffsetDateTime publishedAt) {
      this.publishedAt = publishedAt;
      return this;
    }

    
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
