package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderBulkDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderBulkDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderBulkDeletePayload"));
  }

  public DraftOrderBulkDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DraftOrderBulkDeleteProjectionRoot<PARENT, ROOT>, DraftOrderBulkDeleteProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DraftOrderBulkDeleteProjectionRoot<PARENT, ROOT>, DraftOrderBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UserErrorProjection<DraftOrderBulkDeleteProjectionRoot<PARENT, ROOT>, DraftOrderBulkDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderBulkDeleteProjectionRoot<PARENT, ROOT>, DraftOrderBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
