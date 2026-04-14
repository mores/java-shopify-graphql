package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditConfigurationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditConfigurationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditConfiguration"));
  }

  public StoreCreditConfigurationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditConfigurationProjection<PARENT, ROOT> storeCreditEnabled() {
    getFields().put("storeCreditEnabled", null);
    return this;
  }
}
