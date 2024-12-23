package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopResourceFeedbackCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopResourceFeedbackCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopResourceFeedbackCreatePayload"));
  }

  public ShopResourceFeedbackCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppFeedbackProjection<ShopResourceFeedbackCreateProjectionRoot<PARENT, ROOT>, ShopResourceFeedbackCreateProjectionRoot<PARENT, ROOT>> feedback(
      ) {
    AppFeedbackProjection<ShopResourceFeedbackCreateProjectionRoot<PARENT, ROOT>, ShopResourceFeedbackCreateProjectionRoot<PARENT, ROOT>> projection = new AppFeedbackProjection<>(this, this);    
    getFields().put("feedback", projection);
    return projection;
  }

  public ShopResourceFeedbackCreateUserErrorProjection<ShopResourceFeedbackCreateProjectionRoot<PARENT, ROOT>, ShopResourceFeedbackCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ShopResourceFeedbackCreateUserErrorProjection<ShopResourceFeedbackCreateProjectionRoot<PARENT, ROOT>, ShopResourceFeedbackCreateProjectionRoot<PARENT, ROOT>> projection = new ShopResourceFeedbackCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
