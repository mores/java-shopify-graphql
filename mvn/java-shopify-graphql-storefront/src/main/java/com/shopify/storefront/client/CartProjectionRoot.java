package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CartProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartProjectionRoot() {
    super(null, null, java.util.Optional.of("Cart"));
  }

  public CartProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppliedGiftCardProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> appliedGiftCards(
      ) {
    AppliedGiftCardProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new AppliedGiftCardProjection<>(this, this);    
    getFields().put("appliedGiftCards", projection);
    return projection;
  }

  public AttributeProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> attribute(
      ) {
    AttributeProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new AttributeProjection<>(this, this);    
    getFields().put("attribute", projection);
    return projection;
  }

  public AttributeProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> attribute(
      String key) {
    AttributeProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new AttributeProjection<>(this, this);    
    getFields().put("attribute", projection);
    getInputArguments().computeIfAbsent("attribute", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("attribute").add(keyArg);
    return projection;
  }

  public AttributeProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> attributeWithVariableReferences(
      String keyReference) {
    AttributeProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new AttributeProjection<>(this, this);    
    getFields().put("attribute", projection);
    getInputArguments().computeIfAbsent("attribute", k -> new ArrayList<>());              
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("attribute").add(keyArg);
    return projection;
  }

  public AttributeProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> attributes(
      ) {
    AttributeProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new AttributeProjection<>(this, this);    
    getFields().put("attributes", projection);
    return projection;
  }

  public CartBuyerIdentityProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> buyerIdentity(
      ) {
    CartBuyerIdentityProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartBuyerIdentityProjection<>(this, this);    
    getFields().put("buyerIdentity", projection);
    return projection;
  }

  public CartCostProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> cost(
      ) {
    CartCostProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartCostProjection<>(this, this);    
    getFields().put("cost", projection);
    return projection;
  }

  public CartDeliveryProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> delivery(
      ) {
    CartDeliveryProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartDeliveryProjection<>(this, this);    
    getFields().put("delivery", projection);
    return projection;
  }

  public CartDeliveryGroupConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> deliveryGroups(
      ) {
    CartDeliveryGroupConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartDeliveryGroupConnectionProjection<>(this, this);    
    getFields().put("deliveryGroups", projection);
    return projection;
  }

  public CartDeliveryGroupConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> deliveryGroups(
      Integer first, String after, Integer last, String before, Boolean reverse,
      Boolean withCarrierRates) {
    CartDeliveryGroupConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartDeliveryGroupConnectionProjection<>(this, this);    
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

  public CartDeliveryGroupConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> deliveryGroupsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String withCarrierRatesReference) {
    CartDeliveryGroupConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartDeliveryGroupConnectionProjection<>(this, this);    
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

  public CartDiscountAllocationProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> discountAllocations(
      ) {
    CartDiscountAllocationProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartDiscountAllocationProjection<>(this, this);    
    getFields().put("discountAllocations", projection);
    return projection;
  }

  public BaseCartDiscountApplicationProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> discountApplications(
      ) {
    BaseCartDiscountApplicationProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new BaseCartDiscountApplicationProjection<>(this, this);    
    getFields().put("discountApplications", projection);
    return projection;
  }

  public CartDiscountCodeProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> discountCodes(
      ) {
    CartDiscountCodeProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartDiscountCodeProjection<>(this, this);    
    getFields().put("discountCodes", projection);
    return projection;
  }

  public CartEstimatedCostProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> estimatedCost(
      ) {
    CartEstimatedCostProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartEstimatedCostProjection<>(this, this);    
    getFields().put("estimatedCost", projection);
    return projection;
  }

  public BaseCartLineConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> lines(
      ) {
    BaseCartLineConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new BaseCartLineConnectionProjection<>(this, this);    
    getFields().put("lines", projection);
    return projection;
  }

  public BaseCartLineConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    BaseCartLineConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new BaseCartLineConnectionProjection<>(this, this);    
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

  public BaseCartLineConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> linesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    BaseCartLineConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new BaseCartLineConnectionProjection<>(this, this);    
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

  public MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers, false, null);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String identifiersReference) {
    MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument identifiersArg = new InputArgument("identifiers", identifiersReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("HasMetafieldsIdentifier")))));
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public CartProjectionRoot<PARENT, ROOT> checkoutUrl() {
    getFields().put("checkoutUrl", null);
    return this;
  }

  public CartProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CartProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CartProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CartProjectionRoot<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  public CartProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
