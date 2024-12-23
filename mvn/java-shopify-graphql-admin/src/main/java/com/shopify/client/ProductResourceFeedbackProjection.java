package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductResourceFeedbackProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductResourceFeedbackProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductResourceFeedback"));
  }

  public ProductResourceFeedbackProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourceFeedbackStateProjection<ProductResourceFeedbackProjection<PARENT, ROOT>, ROOT> state(
      ) {
     ResourceFeedbackStateProjection<ProductResourceFeedbackProjection<PARENT, ROOT>, ROOT> projection = new ResourceFeedbackStateProjection<>(this, getRoot());
     getFields().put("state", projection);
     return projection;
  }

  public ProductResourceFeedbackProjection<PARENT, ROOT> feedbackGeneratedAt() {
    getFields().put("feedbackGeneratedAt", null);
    return this;
  }

  public ProductResourceFeedbackProjection<PARENT, ROOT> messages() {
    getFields().put("messages", null);
    return this;
  }

  public ProductResourceFeedbackProjection<PARENT, ROOT> productId() {
    getFields().put("productId", null);
    return this;
  }

  public ProductResourceFeedbackProjection<PARENT, ROOT> productUpdatedAt() {
    getFields().put("productUpdatedAt", null);
    return this;
  }
}
