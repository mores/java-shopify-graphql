package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldEdge"));
  }

  public MetafieldEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldProjection<MetafieldEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MetafieldProjection<MetafieldEdgeProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MetafieldEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
