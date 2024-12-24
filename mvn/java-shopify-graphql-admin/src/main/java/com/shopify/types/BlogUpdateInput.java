package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class BlogUpdateInput {
  
  private String handle;

  
  private String templateSuffix;

  
  private List<MetafieldInput> metafields;

  
  private CommentPolicy commentPolicy;

  
  private String title;

  
  private Boolean redirectNewHandle = false;

  
  private Boolean redirectArticles = false;

  public BlogUpdateInput() {
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
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

  
  public CommentPolicy getCommentPolicy() {
    return commentPolicy;
  }

  public void setCommentPolicy(CommentPolicy commentPolicy) {
    this.commentPolicy = commentPolicy;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
  }

  
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
    
    private String handle;

    
    private String templateSuffix;

    
    private List<MetafieldInput> metafields;

    
    private CommentPolicy commentPolicy;

    
    private String title;

    
    private Boolean redirectNewHandle = false;

    
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

    
    public Builder handle(String handle) {
      this.handle = handle;
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

    
    public Builder commentPolicy(CommentPolicy commentPolicy) {
      this.commentPolicy = commentPolicy;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }

    
    public Builder redirectArticles(Boolean redirectArticles) {
      this.redirectArticles = redirectArticles;
      return this;
    }
  }
}
