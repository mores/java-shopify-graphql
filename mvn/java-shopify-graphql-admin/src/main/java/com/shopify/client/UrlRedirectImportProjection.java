package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectImportProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectImportProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirectImport"));
  }

  public UrlRedirectImportProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectImportPreviewProjection<UrlRedirectImportProjection<PARENT, ROOT>, ROOT> previewRedirects(
      ) {
     UrlRedirectImportPreviewProjection<UrlRedirectImportProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectImportPreviewProjection<>(this, getRoot());
     getFields().put("previewRedirects", projection);
     return projection;
  }

  public UrlRedirectImportProjection<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }

  public UrlRedirectImportProjection<PARENT, ROOT> createdCount() {
    getFields().put("createdCount", null);
    return this;
  }

  public UrlRedirectImportProjection<PARENT, ROOT> failedCount() {
    getFields().put("failedCount", null);
    return this;
  }

  public UrlRedirectImportProjection<PARENT, ROOT> finished() {
    getFields().put("finished", null);
    return this;
  }

  public UrlRedirectImportProjection<PARENT, ROOT> finishedAt() {
    getFields().put("finishedAt", null);
    return this;
  }

  public UrlRedirectImportProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public UrlRedirectImportProjection<PARENT, ROOT> updatedCount() {
    getFields().put("updatedCount", null);
    return this;
  }
}
