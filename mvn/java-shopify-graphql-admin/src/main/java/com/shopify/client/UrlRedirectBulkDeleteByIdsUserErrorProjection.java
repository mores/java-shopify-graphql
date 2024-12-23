package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectBulkDeleteByIdsUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectBulkDeleteByIdsUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirectBulkDeleteByIdsUserError"));
  }

  public UrlRedirectBulkDeleteByIdsUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectBulkDeleteByIdsUserErrorCodeProjection<UrlRedirectBulkDeleteByIdsUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     UrlRedirectBulkDeleteByIdsUserErrorCodeProjection<UrlRedirectBulkDeleteByIdsUserErrorProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectBulkDeleteByIdsUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public UrlRedirectBulkDeleteByIdsUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public UrlRedirectBulkDeleteByIdsUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
