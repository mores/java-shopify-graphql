package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class ComponentizableCartLineFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ComponentizableCartLineFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ComponentizableCartLine"));
  }

  public ComponentizableCartLineFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> attribute(
      ) {
     AttributeProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attribute", projection);
     return projection;
  }

  public AttributeProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> attribute(
      String key) {
    AttributeProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());    
    getFields().put("attribute", projection);
    getInputArguments().computeIfAbsent("attribute", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("attribute").add(keyArg);
    return projection;
  }

  public AttributeProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> attributes(
      ) {
     AttributeProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attributes", projection);
     return projection;
  }

  public CartLineCostProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> cost(
      ) {
     CartLineCostProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartLineCostProjection<>(this, getRoot());
     getFields().put("cost", projection);
     return projection;
  }

  public CartDiscountAllocationProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     CartDiscountAllocationProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public CartLineEstimatedCostProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> estimatedCost(
      ) {
     CartLineEstimatedCostProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartLineEstimatedCostProjection<>(this, getRoot());
     getFields().put("estimatedCost", projection);
     return projection;
  }

  public CartLineProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> lineComponents(
      ) {
     CartLineProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartLineProjection<>(this, getRoot());
     getFields().put("lineComponents", projection);
     return projection;
  }

  public MerchandiseProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> merchandise(
      ) {
     MerchandiseProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MerchandiseProjection<>(this, getRoot());
     getFields().put("merchandise", projection);
     return projection;
  }

  public SellingPlanAllocationProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanAllocation(
      ) {
     SellingPlanAllocationProjection<ComponentizableCartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationProjection<>(this, getRoot());
     getFields().put("sellingPlanAllocation", projection);
     return projection;
  }

  public ComponentizableCartLineFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ComponentizableCartLineFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ComponentizableCartLine {");
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
