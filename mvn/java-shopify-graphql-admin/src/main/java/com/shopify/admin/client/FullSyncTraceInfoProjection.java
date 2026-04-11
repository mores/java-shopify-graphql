package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FullSyncTraceInfoProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FullSyncTraceInfoProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FullSyncTraceInfo"));
  }

  public FullSyncTraceInfoProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<FullSyncTraceInfoProjection<PARENT, ROOT>, ROOT> country() {
     CountryCodeProjection<FullSyncTraceInfoProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("country", projection);
     return projection;
  }

  public LanguageCodeProjection<FullSyncTraceInfoProjection<PARENT, ROOT>, ROOT> language() {
     LanguageCodeProjection<FullSyncTraceInfoProjection<PARENT, ROOT>, ROOT> projection = new LanguageCodeProjection<>(this, getRoot());
     getFields().put("language", projection);
     return projection;
  }

  public FullSyncTraceInfoProjection<PARENT, ROOT> operationId() {
    getFields().put("operationId", null);
    return this;
  }
}
