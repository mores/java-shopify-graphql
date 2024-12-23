package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.DiscountSortKeys;
import com.shopify.types.DraftOrderSortKeys;
import com.shopify.types.GiftCardSortKeys;
import com.shopify.types.OrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CustomerMergePreviewDefaultFieldsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergePreviewDefaultFieldsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMergePreviewDefaultFields"));
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> addresses(
      ) {
     MailingAddressConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressConnectionProjection<>(this, getRoot());
     getFields().put("addresses", projection);
     return projection;
  }

  public MailingAddressConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> addresses(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MailingAddressConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressConnectionProjection<>(this, getRoot());    
    getFields().put("addresses", projection);
    getInputArguments().computeIfAbsent("addresses", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("addresses").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("addresses").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("addresses").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("addresses").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("addresses").add(reverseArg);
    return projection;
  }

  public MailingAddressProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> defaultAddress(
      ) {
     MailingAddressProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("defaultAddress", projection);
     return projection;
  }

  public DiscountNodeConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> discountNodes(
      ) {
     DiscountNodeConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeConnectionProjection<>(this, getRoot());
     getFields().put("discountNodes", projection);
     return projection;
  }

  public DiscountNodeConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> discountNodes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountSortKeys sortKey) {
    DiscountNodeConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeConnectionProjection<>(this, getRoot());    
    getFields().put("discountNodes", projection);
    getInputArguments().computeIfAbsent("discountNodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountNodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountNodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountNodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountNodes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountNodes").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("discountNodes").add(sortKeyArg);
    return projection;
  }

  public DraftOrderConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> draftOrders(
      ) {
     DraftOrderConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());
     getFields().put("draftOrders", projection);
     return projection;
  }

  public DraftOrderConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> draftOrders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DraftOrderSortKeys sortKey) {
    DraftOrderConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());    
    getFields().put("draftOrders", projection);
    getInputArguments().computeIfAbsent("draftOrders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("draftOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("draftOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("draftOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("draftOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("draftOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("draftOrders").add(sortKeyArg);
    return projection;
  }

  public CustomerEmailAddressProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> email(
      ) {
     CustomerEmailAddressProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new CustomerEmailAddressProjection<>(this, getRoot());
     getFields().put("email", projection);
     return projection;
  }

  public GiftCardConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> giftCards(
      ) {
     GiftCardConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new GiftCardConnectionProjection<>(this, getRoot());
     getFields().put("giftCards", projection);
     return projection;
  }

  public GiftCardConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> giftCards(
      Integer first, String after, Integer last, String before, Boolean reverse,
      GiftCardSortKeys sortKey) {
    GiftCardConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new GiftCardConnectionProjection<>(this, getRoot());    
    getFields().put("giftCards", projection);
    getInputArguments().computeIfAbsent("giftCards", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("giftCards").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("giftCards").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("giftCards").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("giftCards").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("giftCards").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("giftCards").add(sortKeyArg);
    return projection;
  }

  public OrderConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> orders(
      ) {
     OrderConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey) {
    OrderConnectionProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("orders").add(sortKeyArg);
    return projection;
  }

  public CustomerPhoneNumberProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> phoneNumber(
      ) {
     CustomerPhoneNumberProjection<CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT>, ROOT> projection = new CustomerPhoneNumberProjection<>(this, getRoot());
     getFields().put("phoneNumber", projection);
     return projection;
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> discountNodeCount() {
    getFields().put("discountNodeCount", null);
    return this;
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> draftOrderCount() {
    getFields().put("draftOrderCount", null);
    return this;
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> giftCardCount() {
    getFields().put("giftCardCount", null);
    return this;
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> metafieldCount() {
    getFields().put("metafieldCount", null);
    return this;
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> orderCount() {
    getFields().put("orderCount", null);
    return this;
  }

  public CustomerMergePreviewDefaultFieldsProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }
}
