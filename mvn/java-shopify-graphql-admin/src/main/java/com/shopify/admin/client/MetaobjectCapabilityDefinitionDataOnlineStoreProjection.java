package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCapabilityDefinitionDataOnlineStoreProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCapabilityDefinitionDataOnlineStoreProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectCapabilityDefinitionDataOnlineStore"));
  }

  public MetaobjectCapabilityDefinitionDataOnlineStoreProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityDefinitionDataOnlineStoreProjection<PARENT, ROOT> canCreateRedirects(
      ) {
    getFields().put("canCreateRedirects", null);
    return this;
  }

  public MetaobjectCapabilityDefinitionDataOnlineStoreProjection<PARENT, ROOT> urlHandle() {
    getFields().put("urlHandle", null);
    return this;
  }
}
