package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class AbandonedCheckoutFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AbandonedCheckoutFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckout"));
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> billingAddress(
      ) {
     MailingAddressProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public AttributeProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public CustomerProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutLineItemConnectionProjection<>(this, getRoot());    
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

  public MailingAddressProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> shippingAddress(
      ) {
     MailingAddressProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("shippingAddress", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> subtotalPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalPriceSet", projection);
     return projection;
  }

  public TaxLineProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> totalDutiesSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDutiesSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> totalLineItemsPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalLineItemsPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> totalPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> totalTaxSet() {
     MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxSet", projection);
     return projection;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> abandonedCheckoutUrl() {
    getFields().put("abandonedCheckoutUrl", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> discountCodes() {
    getFields().put("discountCodes", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> lineItemsQuantity() {
    getFields().put("lineItemsQuantity", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> taxesIncluded() {
    getFields().put("taxesIncluded", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AbandonedCheckout {");
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
