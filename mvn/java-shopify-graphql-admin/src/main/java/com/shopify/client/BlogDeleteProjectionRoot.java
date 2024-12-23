package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BlogDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("BlogDeletePayload"));
  }

  public BlogDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BlogDeleteUserErrorProjection<BlogDeleteProjectionRoot<PARENT, ROOT>, BlogDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BlogDeleteUserErrorProjection<BlogDeleteProjectionRoot<PARENT, ROOT>, BlogDeleteProjectionRoot<PARENT, ROOT>> projection = new BlogDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public BlogDeleteProjectionRoot<PARENT, ROOT> deletedBlogId() {
    getFields().put("deletedBlogId", null);
    return this;
  }
}
