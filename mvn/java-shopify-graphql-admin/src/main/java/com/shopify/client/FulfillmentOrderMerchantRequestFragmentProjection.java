package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class FulfillmentOrderMerchantRequestFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public FulfillmentOrderMerchantRequestFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderMerchantRequest"));
  }

  public FulfillmentOrderMerchantRequestFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderMerchantRequestFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentOrder(
      ) {
     FulfillmentOrderProjection<FulfillmentOrderMerchantRequestFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderProjection<>(this, getRoot());
     getFields().put("fulfillmentOrder", projection);
     return projection;
  }

  public FulfillmentOrderMerchantRequestKindProjection<FulfillmentOrderMerchantRequestFragmentProjection<PARENT, ROOT>, ROOT> kind(
      ) {
     FulfillmentOrderMerchantRequestKindProjection<FulfillmentOrderMerchantRequestFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMerchantRequestKindProjection<>(this, getRoot());
     getFields().put("kind", projection);
     return projection;
  }

  public FulfillmentOrderMerchantRequestFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentOrderMerchantRequestFragmentProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public FulfillmentOrderMerchantRequestFragmentProjection<PARENT, ROOT> requestOptions() {
    getFields().put("requestOptions", null);
    return this;
  }

  public FulfillmentOrderMerchantRequestFragmentProjection<PARENT, ROOT> responseData() {
    getFields().put("responseData", null);
    return this;
  }

  public FulfillmentOrderMerchantRequestFragmentProjection<PARENT, ROOT> sentAt() {
    getFields().put("sentAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on FulfillmentOrderMerchantRequest {");
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
