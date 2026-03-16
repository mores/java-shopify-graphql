package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ReverseFulfillmentOrderDispositionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ReverseFulfillmentOrderDispositionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseFulfillmentOrderDisposition"));
  }

  public ReverseFulfillmentOrderDispositionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<ReverseFulfillmentOrderDispositionFragmentProjection<PARENT, ROOT>, ROOT> location(
      ) {
     LocationProjection<ReverseFulfillmentOrderDispositionFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public ReverseFulfillmentOrderDispositionTypeProjection<ReverseFulfillmentOrderDispositionFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     ReverseFulfillmentOrderDispositionTypeProjection<ReverseFulfillmentOrderDispositionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderDispositionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public ReverseFulfillmentOrderDispositionFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ReverseFulfillmentOrderDispositionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReverseFulfillmentOrderDispositionFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ReverseFulfillmentOrderDisposition {");
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
