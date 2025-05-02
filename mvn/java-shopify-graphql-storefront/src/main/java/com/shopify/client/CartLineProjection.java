package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class CartLineProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartLineProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartLine"));
  }

  public CartLineProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<CartLineProjection<PARENT, ROOT>, ROOT> attribute() {
     AttributeProjection<CartLineProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attribute", projection);
     return projection;
  }

  public AttributeProjection<CartLineProjection<PARENT, ROOT>, ROOT> attribute(String key) {
    AttributeProjection<CartLineProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());    
    getFields().put("attribute", projection);
    getInputArguments().computeIfAbsent("attribute", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("attribute").add(keyArg);
    return projection;
  }

  public AttributeProjection<CartLineProjection<PARENT, ROOT>, ROOT> attributes() {
     AttributeProjection<CartLineProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attributes", projection);
     return projection;
  }

  public CartLineCostProjection<CartLineProjection<PARENT, ROOT>, ROOT> cost() {
     CartLineCostProjection<CartLineProjection<PARENT, ROOT>, ROOT> projection = new CartLineCostProjection<>(this, getRoot());
     getFields().put("cost", projection);
     return projection;
  }

  public CartDiscountAllocationProjection<CartLineProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     CartDiscountAllocationProjection<CartLineProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public CartLineEstimatedCostProjection<CartLineProjection<PARENT, ROOT>, ROOT> estimatedCost() {
     CartLineEstimatedCostProjection<CartLineProjection<PARENT, ROOT>, ROOT> projection = new CartLineEstimatedCostProjection<>(this, getRoot());
     getFields().put("estimatedCost", projection);
     return projection;
  }

  public MerchandiseProjection<CartLineProjection<PARENT, ROOT>, ROOT> merchandise() {
     MerchandiseProjection<CartLineProjection<PARENT, ROOT>, ROOT> projection = new MerchandiseProjection<>(this, getRoot());
     getFields().put("merchandise", projection);
     return projection;
  }

  public SellingPlanAllocationProjection<CartLineProjection<PARENT, ROOT>, ROOT> sellingPlanAllocation(
      ) {
     SellingPlanAllocationProjection<CartLineProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationProjection<>(this, getRoot());
     getFields().put("sellingPlanAllocation", projection);
     return projection;
  }

  public CartLineProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CartLineProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
