package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectBulkDeleteBySavedSearchUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectBulkDeleteBySavedSearchUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirectBulkDeleteBySavedSearchUserError"));
  }

  public UrlRedirectBulkDeleteBySavedSearchUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectBulkDeleteBySavedSearchUserErrorCodeProjection<UrlRedirectBulkDeleteBySavedSearchUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     UrlRedirectBulkDeleteBySavedSearchUserErrorCodeProjection<UrlRedirectBulkDeleteBySavedSearchUserErrorProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectBulkDeleteBySavedSearchUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public UrlRedirectBulkDeleteBySavedSearchUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public UrlRedirectBulkDeleteBySavedSearchUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
