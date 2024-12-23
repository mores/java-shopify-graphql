package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class AbandonedCheckoutLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AbandonedCheckoutLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckoutLineItem"));
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public DiscountAllocationConnectionProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     DiscountAllocationConnectionProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationConnectionProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public DiscountAllocationConnectionProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountAllocations(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DiscountAllocationConnectionProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationConnectionProjection<>(this, getRoot());    
    getFields().put("discountAllocations", projection);
    getInputArguments().computeIfAbsent("discountAllocations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountAllocations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountAllocations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountAllocations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountAllocations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountAllocations").add(reverseArg);
    return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedTotalPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedTotalPriceWithCodeDiscount(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalPriceWithCodeDiscount", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedUnitPriceWithCodeDiscount(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceWithCodeDiscount", projection);
     return projection;
  }

  public ImageProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalTotalPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public ProductProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> product(
      ) {
     ProductProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductVariantProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AbandonedCheckoutLineItem {");
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
