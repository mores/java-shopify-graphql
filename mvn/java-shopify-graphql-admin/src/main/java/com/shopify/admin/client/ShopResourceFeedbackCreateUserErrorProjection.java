package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopResourceFeedbackCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopResourceFeedbackCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopResourceFeedbackCreateUserError"));
  }

  public ShopResourceFeedbackCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopResourceFeedbackCreateUserErrorCodeProjection<ShopResourceFeedbackCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ShopResourceFeedbackCreateUserErrorCodeProjection<ShopResourceFeedbackCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ShopResourceFeedbackCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ShopResourceFeedbackCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ShopResourceFeedbackCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
