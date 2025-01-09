package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldCapabilityUniqueValuesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldCapabilityUniqueValuesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldCapabilityUniqueValues"));
  }

  public MetafieldCapabilityUniqueValuesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldCapabilityUniqueValuesProjection<PARENT, ROOT> eligible() {
    getFields().put("eligible", null);
    return this;
  }

  public MetafieldCapabilityUniqueValuesProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
