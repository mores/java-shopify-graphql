package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartLineParentRelationshipProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartLineParentRelationshipProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartLineParentRelationship"));
  }

  public CartLineParentRelationshipProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartLineProjection<CartLineParentRelationshipProjection<PARENT, ROOT>, ROOT> _parent() {
     CartLineProjection<CartLineParentRelationshipProjection<PARENT, ROOT>, ROOT> projection = new CartLineProjection<>(this, getRoot());
     getFields().put("parent", projection);
     return projection;
  }
}
