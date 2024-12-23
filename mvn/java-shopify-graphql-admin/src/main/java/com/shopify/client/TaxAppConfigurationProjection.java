package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxAppConfigurationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxAppConfigurationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxAppConfiguration"));
  }

  public TaxAppConfigurationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxPartnerStateProjection<TaxAppConfigurationProjection<PARENT, ROOT>, ROOT> state() {
     TaxPartnerStateProjection<TaxAppConfigurationProjection<PARENT, ROOT>, ROOT> projection = new TaxPartnerStateProjection<>(this, getRoot());
     getFields().put("state", projection);
     return projection;
  }
}
