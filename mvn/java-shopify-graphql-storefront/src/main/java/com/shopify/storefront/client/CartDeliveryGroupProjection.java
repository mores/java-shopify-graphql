package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CartDeliveryGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDeliveryGroup"));
  }

  public CartDeliveryGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BaseCartLineConnectionProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> cartLines(
      ) {
     BaseCartLineConnectionProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> projection = new BaseCartLineConnectionProjection<>(this, getRoot());
     getFields().put("cartLines", projection);
     return projection;
  }

  public BaseCartLineConnectionProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> cartLines(
      String after, String before, Integer first, Integer last, Boolean reverse) {
    BaseCartLineConnectionProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> projection = new BaseCartLineConnectionProjection<>(this, getRoot());    
    getFields().put("cartLines", projection);
    getInputArguments().computeIfAbsent("cartLines", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("cartLines").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("cartLines").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("cartLines").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("cartLines").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("cartLines").add(reverseArg);
    return projection;
  }

  public MailingAddressProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> deliveryAddress(
      ) {
     MailingAddressProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("deliveryAddress", projection);
     return projection;
  }

  public CartDeliveryOptionProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> deliveryOptions(
      ) {
     CartDeliveryOptionProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryOptionProjection<>(this, getRoot());
     getFields().put("deliveryOptions", projection);
     return projection;
  }

  public CartDeliveryGroupTypeProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> groupType(
      ) {
     CartDeliveryGroupTypeProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryGroupTypeProjection<>(this, getRoot());
     getFields().put("groupType", projection);
     return projection;
  }

  public CartDeliveryOptionProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> selectedDeliveryOption(
      ) {
     CartDeliveryOptionProjection<CartDeliveryGroupProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryOptionProjection<>(this, getRoot());
     getFields().put("selectedDeliveryOption", projection);
     return projection;
  }

  public CartDeliveryGroupProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
