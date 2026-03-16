package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderPlatformDiscountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderPlatformDiscountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderPlatformDiscount"));
  }

  public DraftOrderPlatformDiscountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderPlatformDiscountAllocationProjection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> allocations(
      ) {
     DraftOrderPlatformDiscountAllocationProjection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderPlatformDiscountAllocationProjection<>(this, getRoot());
     getFields().put("allocations", projection);
     return projection;
  }

  public DiscountClassProjection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     DiscountClassProjection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public DiscountClassProjection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> discountClasses(
      ) {
     DiscountClassProjection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClasses", projection);
     return projection;
  }

  public DiscountNodeProjection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> discountNode(
      ) {
     DiscountNodeProjection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeProjection<>(this, getRoot());
     getFields().put("discountNode", projection);
     return projection;
  }

  public MoneyV2Projection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyV2Projection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> totalAmountPriceSet(
      ) {
     MoneyBagProjection<DraftOrderPlatformDiscountProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAmountPriceSet", projection);
     return projection;
  }

  public DraftOrderPlatformDiscountProjection<PARENT, ROOT> automaticDiscount() {
    getFields().put("automaticDiscount", null);
    return this;
  }

  public DraftOrderPlatformDiscountProjection<PARENT, ROOT> bxgyDiscount() {
    getFields().put("bxgyDiscount", null);
    return this;
  }

  public DraftOrderPlatformDiscountProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public DraftOrderPlatformDiscountProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DraftOrderPlatformDiscountProjection<PARENT, ROOT> presentationLevel() {
    getFields().put("presentationLevel", null);
    return this;
  }

  public DraftOrderPlatformDiscountProjection<PARENT, ROOT> shortSummary() {
    getFields().put("shortSummary", null);
    return this;
  }

  public DraftOrderPlatformDiscountProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  public DraftOrderPlatformDiscountProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
