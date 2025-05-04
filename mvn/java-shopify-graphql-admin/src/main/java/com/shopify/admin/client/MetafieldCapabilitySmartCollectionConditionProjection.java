package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldCapabilitySmartCollectionConditionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldCapabilitySmartCollectionConditionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldCapabilitySmartCollectionCondition"));
  }

  public MetafieldCapabilitySmartCollectionConditionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldCapabilitySmartCollectionConditionProjection<PARENT, ROOT> eligible() {
    getFields().put("eligible", null);
    return this;
  }

  public MetafieldCapabilitySmartCollectionConditionProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
