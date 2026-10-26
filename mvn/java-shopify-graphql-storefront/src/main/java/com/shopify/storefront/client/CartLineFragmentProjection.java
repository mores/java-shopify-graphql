package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CartLineFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CartLineFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartLine"));
  }

  public CartLineFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> attribute() {
     AttributeProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attribute", projection);
     return projection;
  }

  public AttributeProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> attribute(String key) {
    AttributeProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());    
    getFields().put("attribute", projection);
    getInputArguments().computeIfAbsent("attribute", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("attribute").add(keyArg);
    return projection;
  }

  public AttributeProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> attributeWithVariableReferences(
      String keyReference) {
    AttributeProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());    
    getFields().put("attribute", projection);
    getInputArguments().computeIfAbsent("attribute", k -> new ArrayList<>());              
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("attribute").add(keyArg);
    return projection;
  }

  public AttributeProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> attributes() {
     AttributeProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attributes", projection);
     return projection;
  }

  public CartLineCostProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> cost() {
     CartLineCostProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartLineCostProjection<>(this, getRoot());
     getFields().put("cost", projection);
     return projection;
  }

  public CartDiscountAllocationProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     CartDiscountAllocationProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public CartDiscountAllocationProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> discountAllocations(
      Boolean lineLevelOnly) {
    CartDiscountAllocationProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountAllocationProjection<>(this, getRoot());    
    getFields().put("discountAllocations", projection);
    getInputArguments().computeIfAbsent("discountAllocations", k -> new ArrayList<>());                      
    InputArgument lineLevelOnlyArg = new InputArgument("lineLevelOnly", lineLevelOnly, false, null);
    getInputArguments().get("discountAllocations").add(lineLevelOnlyArg);
    return projection;
  }

  public CartDiscountAllocationProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> discountAllocationsWithVariableReferences(
      String lineLevelOnlyReference) {
    CartDiscountAllocationProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountAllocationProjection<>(this, getRoot());    
    getFields().put("discountAllocations", projection);
    getInputArguments().computeIfAbsent("discountAllocations", k -> new ArrayList<>());              
    InputArgument lineLevelOnlyArg = new InputArgument("lineLevelOnly", lineLevelOnlyReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("discountAllocations").add(lineLevelOnlyArg);
    return projection;
  }

  public CartLineEstimatedCostProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> estimatedCost(
      ) {
     CartLineEstimatedCostProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartLineEstimatedCostProjection<>(this, getRoot());
     getFields().put("estimatedCost", projection);
     return projection;
  }

  public CartLineInstructionsProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> instructions(
      ) {
     CartLineInstructionsProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartLineInstructionsProjection<>(this, getRoot());
     getFields().put("instructions", projection);
     return projection;
  }

  public MerchandiseProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> merchandise() {
     MerchandiseProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MerchandiseProjection<>(this, getRoot());
     getFields().put("merchandise", projection);
     return projection;
  }

  public CartLineParentRelationshipProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> parentRelationship(
      ) {
     CartLineParentRelationshipProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartLineParentRelationshipProjection<>(this, getRoot());
     getFields().put("parentRelationship", projection);
     return projection;
  }

  public SellingPlanAllocationProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanAllocation(
      ) {
     SellingPlanAllocationProjection<CartLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationProjection<>(this, getRoot());
     getFields().put("sellingPlanAllocation", projection);
     return projection;
  }

  public CartLineFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CartLineFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public CartLineFragmentProjection<PARENT, ROOT> viewKey() {
    getFields().put("viewKey", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CartLine {");
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
