package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectImportPreviewProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectImportPreviewProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirectImportPreview"));
  }

  public UrlRedirectImportPreviewProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectImportPreviewProjection<PARENT, ROOT> path() {
    getFields().put("path", null);
    return this;
  }

  public UrlRedirectImportPreviewProjection<PARENT, ROOT> target() {
    getFields().put("target", null);
    return this;
  }
}
