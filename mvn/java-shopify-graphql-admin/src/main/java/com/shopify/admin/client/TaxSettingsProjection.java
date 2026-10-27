package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxSettingsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxSettingsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxSettings"));
  }

  public TaxSettingsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxSettingsProjection<PARENT, ROOT> taxId() {
    getFields().put("taxId", null);
    return this;
  }
}
