package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class PageCreateInput {
  
  private String handle;

  
  private String body;

  
  private Boolean isPublished;

  
  private OffsetDateTime publishDate;

  
  private String templateSuffix;

  
  private List<MetafieldInput> metafields;

  
  private String title;

  public PageCreateInput() {
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

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "PageCreateInput{handle='" + handle + "', body='" + body + "', isPublished='" + isPublished + "', publishDate='" + publishDate + "', templateSuffix='" + templateSuffix + "', metafields='" + metafields + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PageCreateInput that = (PageCreateInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(body, that.body) &&
        Objects.equals(isPublished, that.isPublished) &&
        Objects.equals(publishDate, that.publishDate) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, body, isPublished, publishDate, templateSuffix, metafields, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String handle;

    
    private String body;

    
    private Boolean isPublished;

    
    private OffsetDateTime publishDate;

    
    private String templateSuffix;

    
    private List<MetafieldInput> metafields;

    
    private String title;

    public PageCreateInput build() {
      PageCreateInput result = new PageCreateInput();
      result.handle = this.handle;
      result.body = this.body;
      result.isPublished = this.isPublished;
      result.publishDate = this.publishDate;
      result.templateSuffix = this.templateSuffix;
      result.metafields = this.metafields;
      result.title = this.title;
      return result;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder body(String body) {
      this.body = body;
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

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
