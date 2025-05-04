package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PageDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PageDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("PageDeletePayload"));
  }

  public PageDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PageDeleteUserErrorProjection<PageDeleteProjectionRoot<PARENT, ROOT>, PageDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PageDeleteUserErrorProjection<PageDeleteProjectionRoot<PARENT, ROOT>, PageDeleteProjectionRoot<PARENT, ROOT>> projection = new PageDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PageDeleteProjectionRoot<PARENT, ROOT> deletedPageId() {
    getFields().put("deletedPageId", null);
    return this;
  }
}
