package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EntitlementsTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EntitlementsTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("EntitlementsType"));
  }

  public EntitlementsTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public B2BTypeProjection<EntitlementsTypeProjection<PARENT, ROOT>, ROOT> b2b() {
     B2BTypeProjection<EntitlementsTypeProjection<PARENT, ROOT>, ROOT> projection = new B2BTypeProjection<>(this, getRoot());
     getFields().put("b2b", projection);
     return projection;
  }

  public MarketsTypeProjection<EntitlementsTypeProjection<PARENT, ROOT>, ROOT> markets() {
     MarketsTypeProjection<EntitlementsTypeProjection<PARENT, ROOT>, ROOT> projection = new MarketsTypeProjection<>(this, getRoot());
     getFields().put("markets", projection);
     return projection;
  }
}
