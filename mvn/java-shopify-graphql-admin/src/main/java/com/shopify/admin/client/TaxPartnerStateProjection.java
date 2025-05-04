package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxPartnerStateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxPartnerStateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxPartnerState"));
  }

  public TaxPartnerStateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
