package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldCapabilitiesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldCapabilitiesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldCapabilities"));
  }

  public MetafieldCapabilitiesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldCapabilityAdminFilterableProjection<MetafieldCapabilitiesProjection<PARENT, ROOT>, ROOT> adminFilterable(
      ) {
     MetafieldCapabilityAdminFilterableProjection<MetafieldCapabilitiesProjection<PARENT, ROOT>, ROOT> projection = new MetafieldCapabilityAdminFilterableProjection<>(this, getRoot());
     getFields().put("adminFilterable", projection);
     return projection;
  }

  public MetafieldCapabilitySmartCollectionConditionProjection<MetafieldCapabilitiesProjection<PARENT, ROOT>, ROOT> smartCollectionCondition(
      ) {
     MetafieldCapabilitySmartCollectionConditionProjection<MetafieldCapabilitiesProjection<PARENT, ROOT>, ROOT> projection = new MetafieldCapabilitySmartCollectionConditionProjection<>(this, getRoot());
     getFields().put("smartCollectionCondition", projection);
     return projection;
  }
}
