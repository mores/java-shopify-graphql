package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCapabilitiesOnlineStoreProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCapabilitiesOnlineStoreProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectCapabilitiesOnlineStore"));
  }

  public MetaobjectCapabilitiesOnlineStoreProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityDefinitionDataOnlineStoreProjection<MetaobjectCapabilitiesOnlineStoreProjection<PARENT, ROOT>, ROOT> data(
      ) {
     MetaobjectCapabilityDefinitionDataOnlineStoreProjection<MetaobjectCapabilitiesOnlineStoreProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilityDefinitionDataOnlineStoreProjection<>(this, getRoot());
     getFields().put("data", projection);
     return projection;
  }

  public MetaobjectCapabilitiesOnlineStoreProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
