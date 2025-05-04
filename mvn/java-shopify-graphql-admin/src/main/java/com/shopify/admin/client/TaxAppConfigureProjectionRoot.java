package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxAppConfigureProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxAppConfigureProjectionRoot() {
    super(null, null, java.util.Optional.of("TaxAppConfigurePayload"));
  }

  public TaxAppConfigureProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxAppConfigurationProjection<TaxAppConfigureProjectionRoot<PARENT, ROOT>, TaxAppConfigureProjectionRoot<PARENT, ROOT>> taxAppConfiguration(
      ) {
    TaxAppConfigurationProjection<TaxAppConfigureProjectionRoot<PARENT, ROOT>, TaxAppConfigureProjectionRoot<PARENT, ROOT>> projection = new TaxAppConfigurationProjection<>(this, this);    
    getFields().put("taxAppConfiguration", projection);
    return projection;
  }

  public TaxAppConfigureUserErrorProjection<TaxAppConfigureProjectionRoot<PARENT, ROOT>, TaxAppConfigureProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    TaxAppConfigureUserErrorProjection<TaxAppConfigureProjectionRoot<PARENT, ROOT>, TaxAppConfigureProjectionRoot<PARENT, ROOT>> projection = new TaxAppConfigureUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
