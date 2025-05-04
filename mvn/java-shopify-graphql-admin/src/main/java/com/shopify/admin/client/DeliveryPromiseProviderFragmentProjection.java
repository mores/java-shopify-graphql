package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DeliveryPromiseProviderFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DeliveryPromiseProviderFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromiseProvider"));
  }

  public DeliveryPromiseProviderFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<DeliveryPromiseProviderFragmentProjection<PARENT, ROOT>, ROOT> location(
      ) {
     LocationProjection<DeliveryPromiseProviderFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public DeliveryPromiseProviderFragmentProjection<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public DeliveryPromiseProviderFragmentProjection<PARENT, ROOT> fulfillmentDelay() {
    getFields().put("fulfillmentDelay", null);
    return this;
  }

  public DeliveryPromiseProviderFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryPromiseProviderFragmentProjection<PARENT, ROOT> timeZone() {
    getFields().put("timeZone", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DeliveryPromiseProvider {");
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
