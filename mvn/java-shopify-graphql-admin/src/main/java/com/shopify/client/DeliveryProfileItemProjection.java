package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DeliveryProfileItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfileItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryProfileItem"));
  }

  public DeliveryProfileItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<DeliveryProfileItemProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<DeliveryProfileItemProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<DeliveryProfileItemProjection<PARENT, ROOT>, ROOT> variants(
      ) {
     ProductVariantConnectionProjection<DeliveryProfileItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("variants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<DeliveryProfileItemProjection<PARENT, ROOT>, ROOT> variants(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantConnectionProjection<DeliveryProfileItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("variants", projection);
    getInputArguments().computeIfAbsent("variants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("variants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("variants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("variants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("variants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("variants").add(reverseArg);
    return projection;
  }

  public DeliveryProfileItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
