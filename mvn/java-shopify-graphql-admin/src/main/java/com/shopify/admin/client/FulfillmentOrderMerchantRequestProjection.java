package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderMerchantRequestProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderMerchantRequestProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderMerchantRequest"));
  }

  public FulfillmentOrderMerchantRequestProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderMerchantRequestProjection<PARENT, ROOT>, ROOT> fulfillmentOrder(
      ) {
     FulfillmentOrderProjection<FulfillmentOrderMerchantRequestProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderProjection<>(this, getRoot());
     getFields().put("fulfillmentOrder", projection);
     return projection;
  }

  public FulfillmentOrderMerchantRequestKindProjection<FulfillmentOrderMerchantRequestProjection<PARENT, ROOT>, ROOT> kind(
      ) {
     FulfillmentOrderMerchantRequestKindProjection<FulfillmentOrderMerchantRequestProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMerchantRequestKindProjection<>(this, getRoot());
     getFields().put("kind", projection);
     return projection;
  }

  public FulfillmentOrderMerchantRequestProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentOrderMerchantRequestProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public FulfillmentOrderMerchantRequestProjection<PARENT, ROOT> requestOptions() {
    getFields().put("requestOptions", null);
    return this;
  }

  public FulfillmentOrderMerchantRequestProjection<PARENT, ROOT> responseData() {
    getFields().put("responseData", null);
    return this;
  }

  public FulfillmentOrderMerchantRequestProjection<PARENT, ROOT> sentAt() {
    getFields().put("sentAt", null);
    return this;
  }
}
