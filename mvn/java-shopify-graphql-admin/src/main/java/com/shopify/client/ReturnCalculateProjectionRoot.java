package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnCalculateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnCalculateProjectionRoot() {
    super(null, null, java.util.Optional.of("CalculatedReturn"));
  }

  public ReturnCalculateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedExchangeLineItemProjection<ReturnCalculateProjectionRoot<PARENT, ROOT>, ReturnCalculateProjectionRoot<PARENT, ROOT>> exchangeLineItems(
      ) {
    CalculatedExchangeLineItemProjection<ReturnCalculateProjectionRoot<PARENT, ROOT>, ReturnCalculateProjectionRoot<PARENT, ROOT>> projection = new CalculatedExchangeLineItemProjection<>(this, this);    
    getFields().put("exchangeLineItems", projection);
    return projection;
  }

  public CalculatedReturnLineItemProjection<ReturnCalculateProjectionRoot<PARENT, ROOT>, ReturnCalculateProjectionRoot<PARENT, ROOT>> returnLineItems(
      ) {
    CalculatedReturnLineItemProjection<ReturnCalculateProjectionRoot<PARENT, ROOT>, ReturnCalculateProjectionRoot<PARENT, ROOT>> projection = new CalculatedReturnLineItemProjection<>(this, this);    
    getFields().put("returnLineItems", projection);
    return projection;
  }

  public CalculatedReturnShippingFeeProjection<ReturnCalculateProjectionRoot<PARENT, ROOT>, ReturnCalculateProjectionRoot<PARENT, ROOT>> returnShippingFee(
      ) {
    CalculatedReturnShippingFeeProjection<ReturnCalculateProjectionRoot<PARENT, ROOT>, ReturnCalculateProjectionRoot<PARENT, ROOT>> projection = new CalculatedReturnShippingFeeProjection<>(this, this);    
    getFields().put("returnShippingFee", projection);
    return projection;
  }

  public ReturnCalculateProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
