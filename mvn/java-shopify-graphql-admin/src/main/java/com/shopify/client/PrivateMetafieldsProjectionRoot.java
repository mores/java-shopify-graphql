package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivateMetafieldsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivateMetafieldsProjectionRoot() {
    super(null, null, java.util.Optional.of("PrivateMetafieldConnection"));
  }

  public PrivateMetafieldsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivateMetafieldEdgeProjection<PrivateMetafieldsProjectionRoot<PARENT, ROOT>, PrivateMetafieldsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    PrivateMetafieldEdgeProjection<PrivateMetafieldsProjectionRoot<PARENT, ROOT>, PrivateMetafieldsProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PrivateMetafieldProjection<PrivateMetafieldsProjectionRoot<PARENT, ROOT>, PrivateMetafieldsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    PrivateMetafieldProjection<PrivateMetafieldsProjectionRoot<PARENT, ROOT>, PrivateMetafieldsProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<PrivateMetafieldsProjectionRoot<PARENT, ROOT>, PrivateMetafieldsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<PrivateMetafieldsProjectionRoot<PARENT, ROOT>, PrivateMetafieldsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
