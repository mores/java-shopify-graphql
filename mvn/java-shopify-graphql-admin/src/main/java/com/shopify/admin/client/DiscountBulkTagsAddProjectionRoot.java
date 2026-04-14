package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountBulkTagsAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountBulkTagsAddProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountBulkTagsAddPayload"));
  }

  public DiscountBulkTagsAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DiscountBulkTagsAddProjectionRoot<PARENT, ROOT>, DiscountBulkTagsAddProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DiscountBulkTagsAddProjectionRoot<PARENT, ROOT>, DiscountBulkTagsAddProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountBulkTagsAddProjectionRoot<PARENT, ROOT>, DiscountBulkTagsAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountBulkTagsAddProjectionRoot<PARENT, ROOT>, DiscountBulkTagsAddProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
