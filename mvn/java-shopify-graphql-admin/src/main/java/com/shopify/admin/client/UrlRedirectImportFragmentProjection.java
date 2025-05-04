package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class UrlRedirectImportFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public UrlRedirectImportFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirectImport"));
  }

  public UrlRedirectImportFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectImportPreviewProjection<UrlRedirectImportFragmentProjection<PARENT, ROOT>, ROOT> previewRedirects(
      ) {
     UrlRedirectImportPreviewProjection<UrlRedirectImportFragmentProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectImportPreviewProjection<>(this, getRoot());
     getFields().put("previewRedirects", projection);
     return projection;
  }

  public UrlRedirectImportFragmentProjection<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }

  public UrlRedirectImportFragmentProjection<PARENT, ROOT> createdCount() {
    getFields().put("createdCount", null);
    return this;
  }

  public UrlRedirectImportFragmentProjection<PARENT, ROOT> failedCount() {
    getFields().put("failedCount", null);
    return this;
  }

  public UrlRedirectImportFragmentProjection<PARENT, ROOT> finished() {
    getFields().put("finished", null);
    return this;
  }

  public UrlRedirectImportFragmentProjection<PARENT, ROOT> finishedAt() {
    getFields().put("finishedAt", null);
    return this;
  }

  public UrlRedirectImportFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public UrlRedirectImportFragmentProjection<PARENT, ROOT> updatedCount() {
    getFields().put("updatedCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on UrlRedirectImport {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
