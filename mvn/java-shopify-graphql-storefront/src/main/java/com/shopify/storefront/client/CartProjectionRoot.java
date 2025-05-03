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
    InputArgument keyArg = new InputArgument("key", key);
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
      String after, String before, Integer first, Integer last, Boolean reverse,
      Boolean withCarrierRates) {
    CartDeliveryGroupConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartDeliveryGroupConnectionProjection<>(this, this);    
    getFields().put("deliveryGroups", projection);
    getInputArguments().computeIfAbsent("deliveryGroups", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("deliveryGroups").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("deliveryGroups").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("deliveryGroups").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("deliveryGroups").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("deliveryGroups").add(reverseArg);
    InputArgument withCarrierRatesArg = new InputArgument("withCarrierRates", withCarrierRates);
    getInputArguments().get("deliveryGroups").add(withCarrierRatesArg);
    return projection;
  }

  public CartDiscountAllocationProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> discountAllocations(
      ) {
    CartDiscountAllocationProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new CartDiscountAllocationProjection<>(this, this);    
    getFields().put("discountAllocations", projection);
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
      String after, String before, Integer first, Integer last, Boolean reverse) {
    BaseCartLineConnectionProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new BaseCartLineConnectionProjection<>(this, this);    
    getFields().put("lines", projection);
    getInputArguments().computeIfAbsent("lines", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lines").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lines").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lines").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lines").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
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
      String key, String namespace) {
    MetafieldProjection<CartProjectionRoot<PARENT, ROOT>, CartProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
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
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
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
