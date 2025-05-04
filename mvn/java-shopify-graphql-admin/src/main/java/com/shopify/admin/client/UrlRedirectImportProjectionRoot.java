package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectImportProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectImportProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectImport"));
  }

  public UrlRedirectImportProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectImportPreviewProjection<UrlRedirectImportProjectionRoot<PARENT, ROOT>, UrlRedirectImportProjectionRoot<PARENT, ROOT>> previewRedirects(
      ) {
    UrlRedirectImportPreviewProjection<UrlRedirectImportProjectionRoot<PARENT, ROOT>, UrlRedirectImportProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectImportPreviewProjection<>(this, this);    
    getFields().put("previewRedirects", projection);
    return projection;
  }

  public UrlRedirectImportProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }

  public UrlRedirectImportProjectionRoot<PARENT, ROOT> createdCount() {
    getFields().put("createdCount", null);
    return this;
  }

  public UrlRedirectImportProjectionRoot<PARENT, ROOT> failedCount() {
    getFields().put("failedCount", null);
    return this;
  }

  public UrlRedirectImportProjectionRoot<PARENT, ROOT> finished() {
    getFields().put("finished", null);
    return this;
  }

  public UrlRedirectImportProjectionRoot<PARENT, ROOT> finishedAt() {
    getFields().put("finishedAt", null);
    return this;
  }

  public UrlRedirectImportProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public UrlRedirectImportProjectionRoot<PARENT, ROOT> updatedCount() {
    getFields().put("updatedCount", null);
    return this;
  }
}
