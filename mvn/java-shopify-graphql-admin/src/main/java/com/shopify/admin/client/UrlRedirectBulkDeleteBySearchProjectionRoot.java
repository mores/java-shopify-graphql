package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectBulkDeleteBySearchProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectBulkDeleteBySearchProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectBulkDeleteBySearchPayload"));
  }

  public UrlRedirectBulkDeleteBySearchProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<UrlRedirectBulkDeleteBySearchProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteBySearchProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<UrlRedirectBulkDeleteBySearchProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteBySearchProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UrlRedirectBulkDeleteBySearchUserErrorProjection<UrlRedirectBulkDeleteBySearchProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteBySearchProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UrlRedirectBulkDeleteBySearchUserErrorProjection<UrlRedirectBulkDeleteBySearchProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteBySearchProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectBulkDeleteBySearchUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
