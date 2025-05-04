package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectBulkDeleteBySavedSearchProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectBulkDeleteBySavedSearchProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectBulkDeleteBySavedSearchPayload"));
  }

  public UrlRedirectBulkDeleteBySavedSearchProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<UrlRedirectBulkDeleteBySavedSearchProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteBySavedSearchProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<UrlRedirectBulkDeleteBySavedSearchProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteBySavedSearchProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UrlRedirectBulkDeleteBySavedSearchUserErrorProjection<UrlRedirectBulkDeleteBySavedSearchProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteBySavedSearchProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UrlRedirectBulkDeleteBySavedSearchUserErrorProjection<UrlRedirectBulkDeleteBySavedSearchProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteBySavedSearchProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectBulkDeleteBySavedSearchUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
