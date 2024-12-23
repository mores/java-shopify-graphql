package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PageCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PageCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("PageCreatePayload"));
  }

  public PageCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PageProjection<PageCreateProjectionRoot<PARENT, ROOT>, PageCreateProjectionRoot<PARENT, ROOT>> page(
      ) {
    PageProjection<PageCreateProjectionRoot<PARENT, ROOT>, PageCreateProjectionRoot<PARENT, ROOT>> projection = new PageProjection<>(this, this);    
    getFields().put("page", projection);
    return projection;
  }

  public PageCreateUserErrorProjection<PageCreateProjectionRoot<PARENT, ROOT>, PageCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PageCreateUserErrorProjection<PageCreateProjectionRoot<PARENT, ROOT>, PageCreateProjectionRoot<PARENT, ROOT>> projection = new PageCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
