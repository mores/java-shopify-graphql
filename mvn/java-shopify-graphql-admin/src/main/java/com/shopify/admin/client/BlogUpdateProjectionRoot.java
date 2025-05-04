package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BlogUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("BlogUpdatePayload"));
  }

  public BlogUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BlogProjection<BlogUpdateProjectionRoot<PARENT, ROOT>, BlogUpdateProjectionRoot<PARENT, ROOT>> blog(
      ) {
    BlogProjection<BlogUpdateProjectionRoot<PARENT, ROOT>, BlogUpdateProjectionRoot<PARENT, ROOT>> projection = new BlogProjection<>(this, this);    
    getFields().put("blog", projection);
    return projection;
  }

  public BlogUpdateUserErrorProjection<BlogUpdateProjectionRoot<PARENT, ROOT>, BlogUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BlogUpdateUserErrorProjection<BlogUpdateProjectionRoot<PARENT, ROOT>, BlogUpdateProjectionRoot<PARENT, ROOT>> projection = new BlogUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
