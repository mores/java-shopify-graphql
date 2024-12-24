package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class BlogCreateInput {
  
  private String handle;

  
  private String templateSuffix;

  
  private List<MetafieldInput> metafields;

  
  private CommentPolicy commentPolicy;

  
  private String title;

  public BlogCreateInput() {
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
    
    private String handle;

    
    private String templateSuffix;

    
    private List<MetafieldInput> metafields;

    
    private CommentPolicy commentPolicy;

    
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
  }
}
