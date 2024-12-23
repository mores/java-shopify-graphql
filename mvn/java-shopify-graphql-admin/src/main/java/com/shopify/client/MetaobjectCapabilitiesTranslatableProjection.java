package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCapabilitiesTranslatableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCapabilitiesTranslatableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectCapabilitiesTranslatable"));
  }

  public MetaobjectCapabilitiesTranslatableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilitiesTranslatableProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
