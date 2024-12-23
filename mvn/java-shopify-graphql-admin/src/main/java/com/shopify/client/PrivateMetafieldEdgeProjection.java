package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivateMetafieldEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivateMetafieldEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PrivateMetafieldEdge"));
  }

  public PrivateMetafieldEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivateMetafieldProjection<PrivateMetafieldEdgeProjection<PARENT, ROOT>, ROOT> node() {
     PrivateMetafieldProjection<PrivateMetafieldEdgeProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PrivateMetafieldEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
