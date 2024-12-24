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
public class Blog implements MetafieldReferencer, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  
  private ArticleConnection articles;

  
  private Count articlesCount;

  
  private CommentPolicy commentPolicy;

  
  private OffsetDateTime createdAt;

  
  private EventConnection events;

  
  private BlogFeed feed;

  
  private String handle;

  
  private String id;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private List<String> tags;

  
  private String templateSuffix;

  
  private String title;

  
  private List<Translation> translations;

  
  private OffsetDateTime updatedAt;

  public Blog() {
  }

  
  public ArticleConnection getArticles() {
    return articles;
  }

  public void setArticles(ArticleConnection articles) {
    this.articles = articles;
  }

  
  public Count getArticlesCount() {
    return articlesCount;
  }

  public void setArticlesCount(Count articlesCount) {
    this.articlesCount = articlesCount;
  }

  
  public CommentPolicy getCommentPolicy() {
    return commentPolicy;
  }

  public void setCommentPolicy(CommentPolicy commentPolicy) {
    this.commentPolicy = commentPolicy;
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

  
  public BlogFeed getFeed() {
    return feed;
  }

  public void setFeed(BlogFeed feed) {
    this.feed = feed;
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
    return "Blog{articles='" + articles + "', articlesCount='" + articlesCount + "', commentPolicy='" + commentPolicy + "', createdAt='" + createdAt + "', events='" + events + "', feed='" + feed + "', handle='" + handle + "', id='" + id + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', title='" + title + "', translations='" + translations + "', updatedAt='" + updatedAt + "'}";
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
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(title, that.title) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles, articlesCount, commentPolicy, createdAt, events, feed, handle, id, metafield, metafieldDefinitions, metafields, privateMetafield, privateMetafields, tags, templateSuffix, title, translations, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ArticleConnection articles;

    
    private Count articlesCount;

    
    private CommentPolicy commentPolicy;

    
    private OffsetDateTime createdAt;

    
    private EventConnection events;

    
    private BlogFeed feed;

    
    private String handle;

    
    private String id;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private List<String> tags;

    
    private String templateSuffix;

    
    private String title;

    
    private List<Translation> translations;

    
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
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.tags = this.tags;
      result.templateSuffix = this.templateSuffix;
      result.title = this.title;
      result.translations = this.translations;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder articles(ArticleConnection articles) {
      this.articles = articles;
      return this;
    }

    
    public Builder articlesCount(Count articlesCount) {
      this.articlesCount = articlesCount;
      return this;
    }

    
    public Builder commentPolicy(CommentPolicy commentPolicy) {
      this.commentPolicy = commentPolicy;
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

    
    public Builder feed(BlogFeed feed) {
      this.feed = feed;
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
