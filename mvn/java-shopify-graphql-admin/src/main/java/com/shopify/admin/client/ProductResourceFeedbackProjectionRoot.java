package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductResourceFeedbackProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductResourceFeedbackProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductResourceFeedback"));
  }

  public ProductResourceFeedbackProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourceFeedbackStateProjection<ProductResourceFeedbackProjectionRoot<PARENT, ROOT>, ProductResourceFeedbackProjectionRoot<PARENT, ROOT>> state(
      ) {
    ResourceFeedbackStateProjection<ProductResourceFeedbackProjectionRoot<PARENT, ROOT>, ProductResourceFeedbackProjectionRoot<PARENT, ROOT>> projection = new ResourceFeedbackStateProjection<>(this, this);    
    getFields().put("state", projection);
    return projection;
  }

  public ProductResourceFeedbackProjectionRoot<PARENT, ROOT> feedbackGeneratedAt() {
    getFields().put("feedbackGeneratedAt", null);
    return this;
  }

  public ProductResourceFeedbackProjectionRoot<PARENT, ROOT> messages() {
    getFields().put("messages", null);
    return this;
  }

  public ProductResourceFeedbackProjectionRoot<PARENT, ROOT> productId() {
    getFields().put("productId", null);
    return this;
  }

  public ProductResourceFeedbackProjectionRoot<PARENT, ROOT> productUpdatedAt() {
    getFields().put("productUpdatedAt", null);
    return this;
  }
}
