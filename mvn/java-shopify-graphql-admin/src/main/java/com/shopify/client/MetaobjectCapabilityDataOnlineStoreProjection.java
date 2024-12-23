package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCapabilityDataOnlineStoreProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCapabilityDataOnlineStoreProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectCapabilityDataOnlineStore"));
  }

  public MetaobjectCapabilityDataOnlineStoreProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityDataOnlineStoreProjection<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }
}
