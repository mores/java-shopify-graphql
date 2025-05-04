package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class AbandonedCheckoutProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonedCheckoutProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckout"));
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> billingAddress(
      ) {
     MailingAddressProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public AttributeProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public CustomerProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lineItems").add(reverseArg);
    return projection;
  }

  public MailingAddressProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> shippingAddress(
      ) {
     MailingAddressProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("shippingAddress", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> subtotalPriceSet() {
     MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalPriceSet", projection);
     return projection;
  }

  public TaxLineProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> totalDiscountSet() {
     MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> totalDutiesSet() {
     MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDutiesSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> totalLineItemsPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalLineItemsPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> totalPriceSet() {
     MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> totalTaxSet() {
     MoneyBagProjection<AbandonedCheckoutProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxSet", projection);
     return projection;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> abandonedCheckoutUrl() {
    getFields().put("abandonedCheckoutUrl", null);
    return this;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> discountCodes() {
    getFields().put("discountCodes", null);
    return this;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> lineItemsQuantity() {
    getFields().put("lineItemsQuantity", null);
    return this;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> taxesIncluded() {
    getFields().put("taxesIncluded", null);
    return this;
  }

  public AbandonedCheckoutProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
