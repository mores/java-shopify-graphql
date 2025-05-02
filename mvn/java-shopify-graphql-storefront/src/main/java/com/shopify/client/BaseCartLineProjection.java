package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class BaseCartLineProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BaseCartLineProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BaseCartLine"));
  }

  public BaseCartLineProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> attribute() {
     AttributeProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attribute", projection);
     return projection;
  }

  public AttributeProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> attribute(String key) {
    AttributeProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());    
    getFields().put("attribute", projection);
    getInputArguments().computeIfAbsent("attribute", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("attribute").add(keyArg);
    return projection;
  }

  public AttributeProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> attributes() {
     AttributeProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attributes", projection);
     return projection;
  }

  public CartLineCostProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> cost() {
     CartLineCostProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> projection = new CartLineCostProjection<>(this, getRoot());
     getFields().put("cost", projection);
     return projection;
  }

  public CartDiscountAllocationProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     CartDiscountAllocationProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public CartLineEstimatedCostProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> estimatedCost(
      ) {
     CartLineEstimatedCostProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> projection = new CartLineEstimatedCostProjection<>(this, getRoot());
     getFields().put("estimatedCost", projection);
     return projection;
  }

  public MerchandiseProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> merchandise() {
     MerchandiseProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> projection = new MerchandiseProjection<>(this, getRoot());
     getFields().put("merchandise", projection);
     return projection;
  }

  public SellingPlanAllocationProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> sellingPlanAllocation(
      ) {
     SellingPlanAllocationProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationProjection<>(this, getRoot());
     getFields().put("sellingPlanAllocation", projection);
     return projection;
  }

  public BaseCartLineProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BaseCartLineProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public CartLineFragmentProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> onCartLine() {
    CartLineFragmentProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> fragment = new CartLineFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ComponentizableCartLineFragmentProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> onComponentizableCartLine(
      ) {
    ComponentizableCartLineFragmentProjection<BaseCartLineProjection<PARENT, ROOT>, ROOT> fragment = new ComponentizableCartLineFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
