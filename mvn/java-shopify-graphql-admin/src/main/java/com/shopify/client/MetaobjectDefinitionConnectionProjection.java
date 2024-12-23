package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectDefinitionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectDefinitionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectDefinitionConnection"));
  }

  public MetaobjectDefinitionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectDefinitionEdgeProjection<MetaobjectDefinitionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MetaobjectDefinitionEdgeProjection<MetaobjectDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MetaobjectDefinitionProjection<MetaobjectDefinitionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MetaobjectDefinitionProjection<MetaobjectDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MetaobjectDefinitionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<MetaobjectDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
