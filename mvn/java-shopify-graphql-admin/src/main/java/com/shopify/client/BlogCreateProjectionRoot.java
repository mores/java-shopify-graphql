package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BlogCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("BlogCreatePayload"));
  }

  public BlogCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BlogProjection<BlogCreateProjectionRoot<PARENT, ROOT>, BlogCreateProjectionRoot<PARENT, ROOT>> blog(
      ) {
    BlogProjection<BlogCreateProjectionRoot<PARENT, ROOT>, BlogCreateProjectionRoot<PARENT, ROOT>> projection = new BlogProjection<>(this, this);    
    getFields().put("blog", projection);
    return projection;
  }

  public BlogCreateUserErrorProjection<BlogCreateProjectionRoot<PARENT, ROOT>, BlogCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BlogCreateUserErrorProjection<BlogCreateProjectionRoot<PARENT, ROOT>, BlogCreateProjectionRoot<PARENT, ROOT>> projection = new BlogCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
