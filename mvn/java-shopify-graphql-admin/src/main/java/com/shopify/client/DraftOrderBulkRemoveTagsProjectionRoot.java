package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderBulkRemoveTagsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderBulkRemoveTagsProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderBulkRemoveTagsPayload"));
  }

  public DraftOrderBulkRemoveTagsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DraftOrderBulkRemoveTagsProjectionRoot<PARENT, ROOT>, DraftOrderBulkRemoveTagsProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DraftOrderBulkRemoveTagsProjectionRoot<PARENT, ROOT>, DraftOrderBulkRemoveTagsProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UserErrorProjection<DraftOrderBulkRemoveTagsProjectionRoot<PARENT, ROOT>, DraftOrderBulkRemoveTagsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderBulkRemoveTagsProjectionRoot<PARENT, ROOT>, DraftOrderBulkRemoveTagsProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
