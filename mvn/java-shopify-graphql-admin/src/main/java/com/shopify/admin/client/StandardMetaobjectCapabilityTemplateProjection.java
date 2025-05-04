package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardMetaobjectCapabilityTemplateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardMetaobjectCapabilityTemplateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StandardMetaobjectCapabilityTemplate"));
  }

  public StandardMetaobjectCapabilityTemplateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityTypeProjection<StandardMetaobjectCapabilityTemplateProjection<PARENT, ROOT>, ROOT> capabilityType(
      ) {
     MetaobjectCapabilityTypeProjection<StandardMetaobjectCapabilityTemplateProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilityTypeProjection<>(this, getRoot());
     getFields().put("capabilityType", projection);
     return projection;
  }
}
