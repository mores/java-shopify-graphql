package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountBulkTagsRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountBulkTagsRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountBulkTagsRemovePayload"));
  }

  public DiscountBulkTagsRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DiscountBulkTagsRemoveProjectionRoot<PARENT, ROOT>, DiscountBulkTagsRemoveProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DiscountBulkTagsRemoveProjectionRoot<PARENT, ROOT>, DiscountBulkTagsRemoveProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountBulkTagsRemoveProjectionRoot<PARENT, ROOT>, DiscountBulkTagsRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountBulkTagsRemoveProjectionRoot<PARENT, ROOT>, DiscountBulkTagsRemoveProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
