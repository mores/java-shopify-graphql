package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class ArticleUpdateInput {
  
  private String blogId;

  
  private String handle;

  
  private String body;

  
  private String summary;

  
  private Boolean isPublished;

  
  private OffsetDateTime publishDate;

  
  private String templateSuffix;

  
  private List<MetafieldInput> metafields;

  
  private List<String> tags;

  
  private ArticleImageInput image;

  
  private String title;

  /**
   * The name of the author of the article.
   */
  private AuthorInput author;

  
  private Boolean redirectNewHandle = false;

  public ArticleUpdateInput() {
  }

  
  public String getBlogId() {
    return blogId;
  }

  public void setBlogId(String blogId) {
    this.blogId = blogId;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  
  public Boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  
  public OffsetDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
  }

  
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public ArticleImageInput getImage() {
    return image;
  }

  public void setImage(ArticleImageInput image) {
    this.image = image;
  }

  
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
    
    private String blogId;

    
    private String handle;

    
    private String body;

    
    private String summary;

    
    private Boolean isPublished;

    
    private OffsetDateTime publishDate;

    
    private String templateSuffix;

    
    private List<MetafieldInput> metafields;

    
    private List<String> tags;

    
    private ArticleImageInput image;

    
    private String title;

    /**
     * The name of the author of the article.
     */
    private AuthorInput author;

    
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

    
    public Builder blogId(String blogId) {
      this.blogId = blogId;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    
    public Builder isPublished(Boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    
    public Builder publishDate(OffsetDateTime publishDate) {
      this.publishDate = publishDate;
      return this;
    }

    
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder image(ArticleImageInput image) {
      this.image = image;
      return this;
    }

    
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

    
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }
  }
}
