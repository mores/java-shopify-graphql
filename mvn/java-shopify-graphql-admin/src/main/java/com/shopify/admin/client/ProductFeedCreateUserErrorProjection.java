package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductFeedCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductFeedCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductFeedCreateUserError"));
  }

  public ProductFeedCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductFeedCreateUserErrorCodeProjection<ProductFeedCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ProductFeedCreateUserErrorCodeProjection<ProductFeedCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductFeedCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ProductFeedCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
