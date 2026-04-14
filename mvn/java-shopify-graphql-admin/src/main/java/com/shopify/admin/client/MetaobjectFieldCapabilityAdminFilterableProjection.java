package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectFieldCapabilityAdminFilterableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectFieldCapabilityAdminFilterableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectFieldCapabilityAdminFilterable"));
  }

  public MetaobjectFieldCapabilityAdminFilterableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectFieldCapabilityAdminFilterableProjection<PARENT, ROOT> eligible() {
    getFields().put("eligible", null);
    return this;
  }

  public MetaobjectFieldCapabilityAdminFilterableProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
