package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CartProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Cart"));
  }

  public CartProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppliedGiftCardProjection<CartProjection<PARENT, ROOT>, ROOT> appliedGiftCards() {
     AppliedGiftCardProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new AppliedGiftCardProjection<>(this, getRoot());
     getFields().put("appliedGiftCards", projection);
     return projection;
  }

  public AttributeProjection<CartProjection<PARENT, ROOT>, ROOT> attribute() {
     AttributeProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attribute", projection);
     return projection;
  }

  public AttributeProjection<CartProjection<PARENT, ROOT>, ROOT> attribute(String key) {
    AttributeProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());    
    getFields().put("attribute", projection);
    getInputArguments().computeIfAbsent("attribute", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("attribute").add(keyArg);
    return projection;
  }

  public AttributeProjection<CartProjection<PARENT, ROOT>, ROOT> attributes() {
     AttributeProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("attributes", projection);
     return projection;
  }

  public CartBuyerIdentityProjection<CartProjection<PARENT, ROOT>, ROOT> buyerIdentity() {
     CartBuyerIdentityProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new CartBuyerIdentityProjection<>(this, getRoot());
     getFields().put("buyerIdentity", projection);
     return projection;
  }

  public CartCostProjection<CartProjection<PARENT, ROOT>, ROOT> cost() {
     CartCostProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new CartCostProjection<>(this, getRoot());
     getFields().put("cost", projection);
     return projection;
  }

  public CartDeliveryProjection<CartProjection<PARENT, ROOT>, ROOT> delivery() {
     CartDeliveryProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryProjection<>(this, getRoot());
     getFields().put("delivery", projection);
     return projection;
  }

  public CartDeliveryGroupConnectionProjection<CartProjection<PARENT, ROOT>, ROOT> deliveryGroups(
      ) {
     CartDeliveryGroupConnectionProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryGroupConnectionProjection<>(this, getRoot());
     getFields().put("deliveryGroups", projection);
     return projection;
  }

  public CartDeliveryGroupConnectionProjection<CartProjection<PARENT, ROOT>, ROOT> deliveryGroups(
      Integer first, String after, Integer last, String before, Boolean reverse,
      Boolean withCarrierRates) {
    CartDeliveryGroupConnectionProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryGroupConnectionProjection<>(this, getRoot());    
    getFields().put("deliveryGroups", projection);
    getInputArguments().computeIfAbsent("deliveryGroups", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("deliveryGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("deliveryGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("deliveryGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("deliveryGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("deliveryGroups").add(reverseArg);
    InputArgument withCarrierRatesArg = new InputArgument("withCarrierRates", withCarrierRates);
    getInputArguments().get("deliveryGroups").add(withCarrierRatesArg);
    return projection;
  }

  public CartDiscountAllocationProjection<CartProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     CartDiscountAllocationProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public CartDiscountCodeProjection<CartProjection<PARENT, ROOT>, ROOT> discountCodes() {
     CartDiscountCodeProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountCodeProjection<>(this, getRoot());
     getFields().put("discountCodes", projection);
     return projection;
  }

  public CartEstimatedCostProjection<CartProjection<PARENT, ROOT>, ROOT> estimatedCost() {
     CartEstimatedCostProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new CartEstimatedCostProjection<>(this, getRoot());
     getFields().put("estimatedCost", projection);
     return projection;
  }

  public BaseCartLineConnectionProjection<CartProjection<PARENT, ROOT>, ROOT> lines() {
     BaseCartLineConnectionProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new BaseCartLineConnectionProjection<>(this, getRoot());
     getFields().put("lines", projection);
     return projection;
  }

  public BaseCartLineConnectionProjection<CartProjection<PARENT, ROOT>, ROOT> lines(Integer first,
      String after, Integer last, String before, Boolean reverse) {
    BaseCartLineConnectionProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new BaseCartLineConnectionProjection<>(this, getRoot());    
    getFields().put("lines", projection);
    getInputArguments().computeIfAbsent("lines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lines").add(reverseArg);
    return projection;
  }

  public MetafieldProjection<CartProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CartProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<CartProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<CartProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<CartProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public CartProjection<PARENT, ROOT> checkoutUrl() {
    getFields().put("checkoutUrl", null);
    return this;
  }

  public CartProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CartProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CartProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CartProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  public CartProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
