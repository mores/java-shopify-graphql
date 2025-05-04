package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectAccessProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectAccessProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectAccess"));
  }

  public MetaobjectAccessProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectAdminAccessProjection<MetaobjectAccessProjection<PARENT, ROOT>, ROOT> admin() {
     MetaobjectAdminAccessProjection<MetaobjectAccessProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectAdminAccessProjection<>(this, getRoot());
     getFields().put("admin", projection);
     return projection;
  }

  public MetaobjectStorefrontAccessProjection<MetaobjectAccessProjection<PARENT, ROOT>, ROOT> storefront(
      ) {
     MetaobjectStorefrontAccessProjection<MetaobjectAccessProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectStorefrontAccessProjection<>(this, getRoot());
     getFields().put("storefront", projection);
     return projection;
  }
}
