package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditConfigurationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditConfigurationProjectionRoot() {
    super(null, null, java.util.Optional.of("StoreCreditConfiguration"));
  }

  public StoreCreditConfigurationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditConfigurationProjectionRoot<PARENT, ROOT> storeCreditEnabled() {
    getFields().put("storeCreditEnabled", null);
    return this;
  }
}
