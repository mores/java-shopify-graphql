package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderBulkAddTagsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderBulkAddTagsProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderBulkAddTagsPayload"));
  }

  public DraftOrderBulkAddTagsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DraftOrderBulkAddTagsProjectionRoot<PARENT, ROOT>, DraftOrderBulkAddTagsProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DraftOrderBulkAddTagsProjectionRoot<PARENT, ROOT>, DraftOrderBulkAddTagsProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UserErrorProjection<DraftOrderBulkAddTagsProjectionRoot<PARENT, ROOT>, DraftOrderBulkAddTagsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderBulkAddTagsProjectionRoot<PARENT, ROOT>, DraftOrderBulkAddTagsProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
