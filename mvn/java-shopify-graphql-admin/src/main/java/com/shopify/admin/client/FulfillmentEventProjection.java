package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentEventProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentEventProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentEvent"));
  }

  public FulfillmentEventProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentEventStatusProjection<FulfillmentEventProjection<PARENT, ROOT>, ROOT> status() {
     FulfillmentEventStatusProjection<FulfillmentEventProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentEventStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public FulfillmentEventProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> estimatedDeliveryAt() {
    getFields().put("estimatedDeliveryAt", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> happenedAt() {
    getFields().put("happenedAt", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> latitude() {
    getFields().put("latitude", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> longitude() {
    getFields().put("longitude", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public FulfillmentEventProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
