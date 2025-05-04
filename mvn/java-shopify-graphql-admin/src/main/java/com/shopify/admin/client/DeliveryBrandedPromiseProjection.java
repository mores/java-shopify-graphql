package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryBrandedPromiseProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryBrandedPromiseProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryBrandedPromise"));
  }

  public DeliveryBrandedPromiseProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryBrandedPromiseProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public DeliveryBrandedPromiseProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
