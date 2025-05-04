package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectBulkDeleteBySearchUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectBulkDeleteBySearchUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirectBulkDeleteBySearchUserError"));
  }

  public UrlRedirectBulkDeleteBySearchUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectBulkDeleteBySearchUserErrorCodeProjection<UrlRedirectBulkDeleteBySearchUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     UrlRedirectBulkDeleteBySearchUserErrorCodeProjection<UrlRedirectBulkDeleteBySearchUserErrorProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectBulkDeleteBySearchUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public UrlRedirectBulkDeleteBySearchUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public UrlRedirectBulkDeleteBySearchUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
