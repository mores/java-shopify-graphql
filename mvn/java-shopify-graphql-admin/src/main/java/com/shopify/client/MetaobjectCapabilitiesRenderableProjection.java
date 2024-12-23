package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCapabilitiesRenderableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCapabilitiesRenderableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectCapabilitiesRenderable"));
  }

  public MetaobjectCapabilitiesRenderableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityDefinitionDataRenderableProjection<MetaobjectCapabilitiesRenderableProjection<PARENT, ROOT>, ROOT> data(
      ) {
     MetaobjectCapabilityDefinitionDataRenderableProjection<MetaobjectCapabilitiesRenderableProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilityDefinitionDataRenderableProjection<>(this, getRoot());
     getFields().put("data", projection);
     return projection;
  }

  public MetaobjectCapabilitiesRenderableProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
