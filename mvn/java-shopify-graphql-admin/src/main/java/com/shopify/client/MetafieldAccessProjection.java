package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldAccessProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldAccessProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldAccess"));
  }

  public MetafieldAccessProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldAdminAccessProjection<MetafieldAccessProjection<PARENT, ROOT>, ROOT> admin() {
     MetafieldAdminAccessProjection<MetafieldAccessProjection<PARENT, ROOT>, ROOT> projection = new MetafieldAdminAccessProjection<>(this, getRoot());
     getFields().put("admin", projection);
     return projection;
  }

  public MetafieldCustomerAccountAccessProjection<MetafieldAccessProjection<PARENT, ROOT>, ROOT> customerAccount(
      ) {
     MetafieldCustomerAccountAccessProjection<MetafieldAccessProjection<PARENT, ROOT>, ROOT> projection = new MetafieldCustomerAccountAccessProjection<>(this, getRoot());
     getFields().put("customerAccount", projection);
     return projection;
  }

  public MetafieldAccessGrantProjection<MetafieldAccessProjection<PARENT, ROOT>, ROOT> grants() {
     MetafieldAccessGrantProjection<MetafieldAccessProjection<PARENT, ROOT>, ROOT> projection = new MetafieldAccessGrantProjection<>(this, getRoot());
     getFields().put("grants", projection);
     return projection;
  }

  public MetafieldStorefrontAccessProjection<MetafieldAccessProjection<PARENT, ROOT>, ROOT> storefront(
      ) {
     MetafieldStorefrontAccessProjection<MetafieldAccessProjection<PARENT, ROOT>, ROOT> projection = new MetafieldStorefrontAccessProjection<>(this, getRoot());
     getFields().put("storefront", projection);
     return projection;
  }
}
