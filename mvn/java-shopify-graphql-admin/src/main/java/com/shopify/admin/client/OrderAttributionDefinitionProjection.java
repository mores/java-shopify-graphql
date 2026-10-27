package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAttributionDefinitionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAttributionDefinitionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAttributionDefinition"));
  }

  public OrderAttributionDefinitionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAttributionDefinitionProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public OrderAttributionDefinitionProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public OrderAttributionDefinitionProjection<PARENT, ROOT> icon() {
    getFields().put("icon", null);
    return this;
  }

  public OrderAttributionDefinitionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
