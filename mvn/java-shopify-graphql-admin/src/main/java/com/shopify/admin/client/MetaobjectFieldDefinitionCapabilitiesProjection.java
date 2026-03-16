package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectFieldDefinitionCapabilitiesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectFieldDefinitionCapabilitiesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectFieldDefinitionCapabilities"));
  }

  public MetaobjectFieldDefinitionCapabilitiesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectFieldCapabilityAdminFilterableProjection<MetaobjectFieldDefinitionCapabilitiesProjection<PARENT, ROOT>, ROOT> adminFilterable(
      ) {
     MetaobjectFieldCapabilityAdminFilterableProjection<MetaobjectFieldDefinitionCapabilitiesProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldCapabilityAdminFilterableProjection<>(this, getRoot());
     getFields().put("adminFilterable", projection);
     return projection;
  }
}
