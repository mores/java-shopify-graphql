package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.util.ArrayList;

public class CartDeliveryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDelivery"));
  }

  public CartDeliveryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartSelectableAddressProjection<CartDeliveryProjection<PARENT, ROOT>, ROOT> addresses() {
     CartSelectableAddressProjection<CartDeliveryProjection<PARENT, ROOT>, ROOT> projection = new CartSelectableAddressProjection<>(this, getRoot());
     getFields().put("addresses", projection);
     return projection;
  }

  public CartSelectableAddressProjection<CartDeliveryProjection<PARENT, ROOT>, ROOT> addresses(
      Boolean selected) {
    CartSelectableAddressProjection<CartDeliveryProjection<PARENT, ROOT>, ROOT> projection = new CartSelectableAddressProjection<>(this, getRoot());    
    getFields().put("addresses", projection);
    getInputArguments().computeIfAbsent("addresses", k -> new ArrayList<>());                      
    InputArgument selectedArg = new InputArgument("selected", selected);
    getInputArguments().get("addresses").add(selectedArg);
    return projection;
  }
}
