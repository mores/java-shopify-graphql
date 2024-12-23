package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldCapabilityAdminFilterableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldCapabilityAdminFilterableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldCapabilityAdminFilterable"));
  }

  public MetafieldCapabilityAdminFilterableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionAdminFilterStatusProjection<MetafieldCapabilityAdminFilterableProjection<PARENT, ROOT>, ROOT> status(
      ) {
     MetafieldDefinitionAdminFilterStatusProjection<MetafieldCapabilityAdminFilterableProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionAdminFilterStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MetafieldCapabilityAdminFilterableProjection<PARENT, ROOT> eligible() {
    getFields().put("eligible", null);
    return this;
  }

  public MetafieldCapabilityAdminFilterableProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
