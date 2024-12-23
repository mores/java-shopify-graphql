package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class FulfillmentEventFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public FulfillmentEventFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentEvent"));
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentEventStatusProjection<FulfillmentEventFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     FulfillmentEventStatusProjection<FulfillmentEventFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentEventStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> estimatedDeliveryAt() {
    getFields().put("estimatedDeliveryAt", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> happenedAt() {
    getFields().put("happenedAt", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> latitude() {
    getFields().put("latitude", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> longitude() {
    getFields().put("longitude", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public FulfillmentEventFragmentProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on FulfillmentEvent {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
