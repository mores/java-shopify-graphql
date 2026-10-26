package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CartFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CartFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Cart"));
  }

  public CartFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppliedGiftCardProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> appliedGiftCards() {
     AppliedGiftCardProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppliedGiftCardProjection<>(this, getRoot());
     getFields().put("appliedGiftCards", projection);
     return projection;
  }

  public AttributeProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> attribute() {
     AttributeProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attribute", projection);
     return projection;
  }

  public AttributeProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> attribute(String key) {
    AttributeProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());    
    getFields().put("attribute", projection);
    getInputArguments().computeIfAbsent("attribute", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("attribute").add(keyArg);
    return projection;
  }

  public AttributeProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> attributeWithVariableReferences(
      String keyReference) {
    AttributeProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());    
    getFields().put("attribute", projection);
    getInputArguments().computeIfAbsent("attribute", k -> new ArrayList<>());              
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("attribute").add(keyArg);
    return projection;
  }

  public AttributeProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> attributes() {
     AttributeProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attributes", projection);
     return projection;
  }

  public CartBuyerIdentityProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> buyerIdentity() {
     CartBuyerIdentityProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartBuyerIdentityProjection<>(this, getRoot());
     getFields().put("buyerIdentity", projection);
     return projection;
  }

  public CartCostProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> cost() {
     CartCostProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartCostProjection<>(this, getRoot());
     getFields().put("cost", projection);
     return projection;
  }

  public CartDeliveryProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> delivery() {
     CartDeliveryProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryProjection<>(this, getRoot());
     getFields().put("delivery", projection);
     return projection;
  }

  public CartDeliveryGroupConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> deliveryGroups(
      ) {
     CartDeliveryGroupConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryGroupConnectionProjection<>(this, getRoot());
     getFields().put("deliveryGroups", projection);
     return projection;
  }

  public CartDeliveryGroupConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> deliveryGroups(
      Integer first, String after, Integer last, String before, Boolean reverse,
      Boolean withCarrierRates) {
    CartDeliveryGroupConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryGroupConnectionProjection<>(this, getRoot());    
    getFields().put("deliveryGroups", projection);
    getInputArguments().computeIfAbsent("deliveryGroups", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("deliveryGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("deliveryGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("deliveryGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("deliveryGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("deliveryGroups").add(reverseArg);
    InputArgument withCarrierRatesArg = new InputArgument("withCarrierRates", withCarrierRates, false, null);
    getInputArguments().get("deliveryGroups").add(withCarrierRatesArg);
    return projection;
  }

  public CartDeliveryGroupConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> deliveryGroupsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String withCarrierRatesReference) {
    CartDeliveryGroupConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryGroupConnectionProjection<>(this, getRoot());    
    getFields().put("deliveryGroups", projection);
    getInputArguments().computeIfAbsent("deliveryGroups", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("deliveryGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("deliveryGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("deliveryGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("deliveryGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("deliveryGroups").add(reverseArg);
    InputArgument withCarrierRatesArg = new InputArgument("withCarrierRates", withCarrierRatesReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("deliveryGroups").add(withCarrierRatesArg);
    return projection;
  }

  public CartDiscountAllocationProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     CartDiscountAllocationProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public BaseCartDiscountApplicationProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> discountApplications(
      ) {
     BaseCartDiscountApplicationProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new BaseCartDiscountApplicationProjection<>(this, getRoot());
     getFields().put("discountApplications", projection);
     return projection;
  }

  public CartDiscountCodeProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> discountCodes() {
     CartDiscountCodeProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountCodeProjection<>(this, getRoot());
     getFields().put("discountCodes", projection);
     return projection;
  }

  public CartEstimatedCostProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> estimatedCost() {
     CartEstimatedCostProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartEstimatedCostProjection<>(this, getRoot());
     getFields().put("estimatedCost", projection);
     return projection;
  }

  public BaseCartLineConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> lines() {
     BaseCartLineConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new BaseCartLineConnectionProjection<>(this, getRoot());
     getFields().put("lines", projection);
     return projection;
  }

  public BaseCartLineConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    BaseCartLineConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new BaseCartLineConnectionProjection<>(this, getRoot());    
    getFields().put("lines", projection);
    getInputArguments().computeIfAbsent("lines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("lines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("lines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("lines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("lines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("lines").add(reverseArg);
    return projection;
  }

  public BaseCartLineConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> linesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    BaseCartLineConnectionProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new BaseCartLineConnectionProjection<>(this, getRoot());    
    getFields().put("lines", projection);
    getInputArguments().computeIfAbsent("lines", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("lines").add(reverseArg);
    return projection;
  }

  public MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers, false, null);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> metafieldsWithVariableReferences(
      String identifiersReference) {
    MetafieldProjection<CartFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument identifiersArg = new InputArgument("identifiers", identifiersReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("HasMetafieldsIdentifier")))));
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public CartFragmentProjection<PARENT, ROOT> checkoutUrl() {
    getFields().put("checkoutUrl", null);
    return this;
  }

  public CartFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CartFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CartFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CartFragmentProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  public CartFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Cart {");
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
