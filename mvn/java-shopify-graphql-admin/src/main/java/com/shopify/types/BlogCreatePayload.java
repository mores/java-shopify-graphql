package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class BlogCreatePayload {
  
  private Blog blog;

  
  private List<BlogCreateUserError> userErrors;

  public BlogCreatePayload() {
  }

  
  public Blog getBlog() {
    return blog;
  }

  public void setBlog(Blog blog) {
    this.blog = blog;
  }

  
  public List<BlogCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BlogCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "BlogCreatePayload{blog='" + blog + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BlogCreatePayload that = (BlogCreatePayload) o;
    return Objects.equals(blog, that.blog) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blog, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Blog blog;

    
    private List<BlogCreateUserError> userErrors;

    public BlogCreatePayload build() {
      BlogCreatePayload result = new BlogCreatePayload();
      result.blog = this.blog;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder blog(Blog blog) {
      this.blog = blog;
      return this;
    }

    
    public Builder userErrors(List<BlogCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
