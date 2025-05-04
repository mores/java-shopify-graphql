package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkProductResourceFeedbackCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkProductResourceFeedbackCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("BulkProductResourceFeedbackCreatePayload"));
  }

  public BulkProductResourceFeedbackCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductResourceFeedbackProjection<BulkProductResourceFeedbackCreateProjectionRoot<PARENT, ROOT>, BulkProductResourceFeedbackCreateProjectionRoot<PARENT, ROOT>> feedback(
      ) {
    ProductResourceFeedbackProjection<BulkProductResourceFeedbackCreateProjectionRoot<PARENT, ROOT>, BulkProductResourceFeedbackCreateProjectionRoot<PARENT, ROOT>> projection = new ProductResourceFeedbackProjection<>(this, this);    
    getFields().put("feedback", projection);
    return projection;
  }

  public BulkProductResourceFeedbackCreateUserErrorProjection<BulkProductResourceFeedbackCreateProjectionRoot<PARENT, ROOT>, BulkProductResourceFeedbackCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BulkProductResourceFeedbackCreateUserErrorProjection<BulkProductResourceFeedbackCreateProjectionRoot<PARENT, ROOT>, BulkProductResourceFeedbackCreateProjectionRoot<PARENT, ROOT>> projection = new BulkProductResourceFeedbackCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
