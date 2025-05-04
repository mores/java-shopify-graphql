package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectBulkDeleteByIdsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectBulkDeleteByIdsProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectBulkDeleteByIdsPayload"));
  }

  public UrlRedirectBulkDeleteByIdsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<UrlRedirectBulkDeleteByIdsProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteByIdsProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<UrlRedirectBulkDeleteByIdsProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteByIdsProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UrlRedirectBulkDeleteByIdsUserErrorProjection<UrlRedirectBulkDeleteByIdsProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteByIdsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UrlRedirectBulkDeleteByIdsUserErrorProjection<UrlRedirectBulkDeleteByIdsProjectionRoot<PARENT, ROOT>, UrlRedirectBulkDeleteByIdsProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectBulkDeleteByIdsUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
