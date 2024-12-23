package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PageUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PageUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PageUpdatePayload"));
  }

  public PageUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PageProjection<PageUpdateProjectionRoot<PARENT, ROOT>, PageUpdateProjectionRoot<PARENT, ROOT>> page(
      ) {
    PageProjection<PageUpdateProjectionRoot<PARENT, ROOT>, PageUpdateProjectionRoot<PARENT, ROOT>> projection = new PageProjection<>(this, this);    
    getFields().put("page", projection);
    return projection;
  }

  public PageUpdateUserErrorProjection<PageUpdateProjectionRoot<PARENT, ROOT>, PageUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PageUpdateUserErrorProjection<PageUpdateProjectionRoot<PARENT, ROOT>, PageUpdateProjectionRoot<PARENT, ROOT>> projection = new PageUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
