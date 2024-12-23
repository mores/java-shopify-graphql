package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectImportSubmitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectImportSubmitProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectImportSubmitPayload"));
  }

  public UrlRedirectImportSubmitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<UrlRedirectImportSubmitProjectionRoot<PARENT, ROOT>, UrlRedirectImportSubmitProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<UrlRedirectImportSubmitProjectionRoot<PARENT, ROOT>, UrlRedirectImportSubmitProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UrlRedirectImportUserErrorProjection<UrlRedirectImportSubmitProjectionRoot<PARENT, ROOT>, UrlRedirectImportSubmitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UrlRedirectImportUserErrorProjection<UrlRedirectImportSubmitProjectionRoot<PARENT, ROOT>, UrlRedirectImportSubmitProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectImportUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
