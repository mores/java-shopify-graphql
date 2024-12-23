package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectBulkDeleteAllProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectBulkDeleteAllProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectBulkDeleteAllPayload"));
  }

  public UrlRedirectBulkDeleteAllProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<UrlRedirectBulkDeleteAllProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteAllProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<UrlRedirectBulkDeleteAllProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteAllProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UserErrorProjection<UrlRedirectBulkDeleteAllProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteAllProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<UrlRedirectBulkDeleteAllProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteAllProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
