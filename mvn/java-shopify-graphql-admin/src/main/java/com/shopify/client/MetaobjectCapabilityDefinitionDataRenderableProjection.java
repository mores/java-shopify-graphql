package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCapabilityDefinitionDataRenderableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCapabilityDefinitionDataRenderableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectCapabilityDefinitionDataRenderable"));
  }

  public MetaobjectCapabilityDefinitionDataRenderableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityDefinitionDataRenderableProjection<PARENT, ROOT> metaDescriptionKey() {
    getFields().put("metaDescriptionKey", null);
    return this;
  }

  public MetaobjectCapabilityDefinitionDataRenderableProjection<PARENT, ROOT> metaTitleKey() {
    getFields().put("metaTitleKey", null);
    return this;
  }
}
